package org.abstruck.zysdk.util;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class ApiRequestBuilder {
    private final Request.Builder builder;
    private final Map<String,String> headers;
    private final Map<String,String> queryParams;
    private final Gson gson;
    private String url;
    private OkHttpClient httpClient;
    public ApiRequestBuilder(){
        builder = new Request.Builder();
        headers = new HashMap<>();
        queryParams = new HashMap<>();
        gson = new Gson();
    }
    public ApiRequestBuilder(OkHttpClient httpClient){
        builder = new Request.Builder();
        headers = new HashMap<>();
        queryParams = new HashMap<>();
        gson = new Gson();
        this.httpClient = httpClient;
    }

    public ApiRequestBuilder url(String url){
        this.url = url;
        return this;
    }

    public ApiRequestBuilder authorize(String token){
        return header("Authorization","Bearer "+token);
    }

    public ApiRequestBuilder header(String k,String v){
        headers.put(k,v);
        return this;
    }
    public ApiRequestBuilder header(String k, @NotNull Object v){
        return header(k,v.toString());
    }
    public ApiRequestBuilder queryParam(String key,String value){
        queryParams.put(key,value);
        return this;
    }
    public ApiRequestBuilder queryParam(String key, @NotNull Object value){
        return queryParam(key,value.toString());
    }

    public ApiRequestBuilder get(){
        builder.get();
        return this;
    }
    public ApiRequestBuilder post(RequestBody body){
        builder.post(body);
        return this;
    }
    public ApiRequestBuilder delete(){
        builder.method("DELETE",null);
        return this;
    }
    public ApiRequestBuilder delete(Object data){
        return delete(gson.toJson(data));
    }
    public ApiRequestBuilder delete(RequestBody body){
        builder.method("DELETE",body);
        return this;
    }
    public ApiRequestBuilder delete(String data){
        return delete(RequestBody.create(data, MediaType.get("application/json")));
    }
    public ApiRequestBuilder post(String data){
        return post(RequestBody.create(data, MediaType.get("application/json")));
    }
    public ApiRequestBuilder post(Object data){
        return post(gson.toJson(data));
    }
    public ApiRequestBuilder appName(String appName){
        return header("AppName",appName);
    }
    public ApiRequestBuilder appVersion(String appVersion){
        return header("AppVersion",appVersion);
    }

    public RequestExecutor buildToExecutor(OkHttpClient httpClient){
        return new RequestExecutor(httpClient,build());
    }
    public RequestExecutor buildToExecutor(){
        return new RequestExecutor(this.httpClient,build());
    }
    public Request build(){
        headers.forEach(builder::addHeader);
        if (!queryParams.isEmpty()){
            StringBuilder sb = new StringBuilder(url).append('?');
            queryParams.forEach((k,v) -> sb.append(k).append('=').append(v).append('&'));
            sb.deleteCharAt(sb.length()-1);
            url = sb.toString();
        }
        builder.url(url);
        return builder.build();
    }


}
