package org.abstruck.zysdk.util;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.util.HashMap;
import java.util.Map;

public class ApiRequestBuilder {
    private Request.Builder builder;
    private Map<String,String> headers;
    private Map<String,String> queryParams;
    private Gson gson;
    public ApiRequestBuilder(){
        builder = new Request.Builder();
        headers = new HashMap<>();
        queryParams = new HashMap<>();
        gson = new Gson();
    }

    public ApiRequestBuilder url(String url){
        builder.url(url);
        return this;
    }

    public ApiRequestBuilder authorize(String token){
        headers.put("Authorizatio","Bearer "+token);
        return this;
    }

    public ApiRequestBuilder queryParam(String key,String value){
        queryParams.put(key,value);
        return this;
    }

    public ApiRequestBuilder get(){
        builder.get();
        return this;
    }
    public ApiRequestBuilder post(RequestBody body){
        builder.post(body);
        return this;
    }
    public ApiRequestBuilder post(String data){
        return post(RequestBody.create(data, MediaType.get("application/json")));
    }
    public ApiRequestBuilder post(Object data){
        return post(gson.toJson(data));
    }

}
