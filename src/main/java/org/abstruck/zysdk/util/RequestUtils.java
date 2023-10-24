package org.abstruck.zysdk.util;

import okhttp3.OkHttpClient;

public class RequestUtils {
    private OkHttpClient httpClient;
    public RequestUtils(OkHttpClient httpClient){
        this.httpClient = httpClient;
    }

    public ApiRequestBuilder requestBuilder(){
        return new ApiRequestBuilder();
    }
}
