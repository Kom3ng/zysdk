package org.abstruck.zysdk.util;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.util.HashMap;
import java.util.Map;

public class ApiRequestBuilder {
    private Request.Builder builder;
    private Map<String,String> headers;
    private Map<String,String> queryParams;
    private Gson gson;
    private String url;
    public ApiRequestBuilder(){
        builder = new Request.Builder();
        headers = new HashMap<>();
        queryParams = new HashMap<>();
        gson = new Gson();
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
    public ApiRequestBuilder queryParam(String key,String value){
        queryParams.put(key,value);
        return this;
    }
    public ApiRequestBuilder queryParam(String key,CharSequence value){
        return queryParam(key,value.toString());
    }

    public ApiRequestBuilder get(){
        builder.get();
        return this;
    }
    public ApiRequestBuilder post(RequestBody body){
        builder.post(body);
        header("Content-Type","application/json");
        return this;
    }
    public ApiRequestBuilder post(String data){
        return post(RequestBody.create(data, MediaType.get("application/json")));
    }
    public ApiRequestBuilder post(Object data){
        return post(gson.toJson(data));
    }

    public RequestExecutor buildToExecutor(OkHttpClient httpClient){
        return new RequestExecutor(httpClient,build());
    }
    public Request build(){
        headers.forEach((k,v) -> builder.addHeader(k,v));
        if (!queryParams.isEmpty()){
            StringBuilder sb = new StringBuilder(url).append('?');
            queryParams.forEach((k,v) -> sb.append(k).append('=').append(v));
            url = sb.toString();
        }
        builder.url(url);
        return builder.build();
    }
}
