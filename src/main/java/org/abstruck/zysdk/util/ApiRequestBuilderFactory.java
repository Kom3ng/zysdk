package org.abstruck.zysdk.util;

import okhttp3.OkHttpClient;

public class ApiRequestBuilderFactory {
    private String token;
    private String appName;
    private String appVersion;
    private OkHttpClient httpClient;
    private ApiRequestBuilderFactory(){
    }
    public ApiRequestBuilder create(){
        ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder();
        if (httpClient != null) apiRequestBuilder = new ApiRequestBuilder(httpClient);
        if (token != null) apiRequestBuilder.authorize(token);
        if (appName != null && appVersion !=null) {
            apiRequestBuilder.appName(appName);
            apiRequestBuilder.appVersion(appVersion);
        }
        return apiRequestBuilder;
    }
    public static class Builder{
        private final ApiRequestBuilderFactory f;

        public Builder(){
            f = new ApiRequestBuilderFactory();
        }
        public Builder appName(String name){
            f.appName = name;
            return this;
        }
        public Builder appVersion(String appVersion){
            f.appVersion = appVersion;
            return this;
        }

        public Builder token(String token){
            f.token = token;
            return this;
        }
        public Builder httpClient(OkHttpClient httpClient){
            f.httpClient = httpClient;
            return this;
        }

        public ApiRequestBuilderFactory build(){
            return f;
        }
    }
}
