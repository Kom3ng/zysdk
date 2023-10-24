package org.abstruck.zysdk.util;

import okhttp3.OkHttpClient;

public class RequestUtils {
    public RequestUtils(OkHttpClient httpClient){
    }

    public ApiRequestBuilder requestBuilder(){
        return new ApiRequestBuilder();
    }
}
