package org.abstruck.zysdk.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.abstruck.zysdk.data.resp.CommonResponse;
import org.abstruck.zysdk.data.resp.Error;
import org.abstruck.zysdk.exception.ApiException;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;

public class RequestExecutor {
    private Request request;
    private OkHttpClient httpClient;
    private static Gson gson = new Gson();
    private Consumer<Exception> exceptionHandler;


    public RequestExecutor(OkHttpClient httpClient, Request request){
        this.request = request;
        this.httpClient = httpClient;
    }

    public RequestExecutor exceptionHandler(Consumer<Exception> eh){
        this.exceptionHandler = eh;
        return this;
    }
    public <R> R executeWithResult(ThrowableFunction<Response,R> executor){
        try (Response response = httpClient.newCall(request).execute()) {
            return executor.apply(response);
        } catch (Exception e){
            if (exceptionHandler != null) exceptionHandler.accept(e);
            return null;
        }
    }

    public RequestExecutor defaultExceptionHandler(){
        return exceptionHandler(e -> {throw new RuntimeException(e);});
    }

    public <R> R executeWithResult(Type type){
        return executeWithResult(r -> gson.fromJson(r.body().string(),type));
    }
    public <R> R apiExecuteWithResult(Class<R> clazz){
        defaultExceptionHandler();
        return executeWithResult(resp -> {
            JsonObject jsonObject = gson.fromJson(resp.body().string(), JsonObject.class);
            if (jsonObject.get("success").getAsBoolean()) {
                JsonObject result = jsonObject.get("result").getAsJsonObject();
                if (result != null){
                    return gson.fromJson(result.toString(),clazz);
                }
                return null;
            }
            throw new ApiException(gson.fromJson(jsonObject.get("error").getAsJsonObject().toString(), CommonResponse.Error.class));
        });
    }
}
