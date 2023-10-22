package org.abstruck.zysdk;

import okhttp3.OkHttpClient;
import org.abstruck.zysdk.api.Api;
import org.abstruck.zysdk.api.ApiUrls;
import org.abstruck.zysdk.api.impl.ApiImpl;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class ZySdk {
    private OkHttpClient httpClient;
    private ApiUrls apiUrls;
    private ApiImpl api;

    private ZySdk(OkHttpClient httpClient,ApiUrls apiUrls){
        this.httpClient = httpClient;
        this.apiUrls = apiUrls;
        this.api = new ApiImpl(httpClient,apiUrls);
    }

    @NotNull
    @Contract(" -> new")
    public static ZySdk init(){
        return init(new OkHttpClient(),ApiUrls.defaultApiUrls());
    }
    @NotNull
    @Contract("_ -> new")
    public static ZySdk init(OkHttpClient okHttpClient){
        return init(okHttpClient,ApiUrls.defaultApiUrls());
    }
    @NotNull
    @Contract(value = "_, _ -> new", pure = true)
    public static ZySdk init(OkHttpClient okHttpClient, ApiUrls apiUrls){
        return new ZySdk(okHttpClient,apiUrls);
    }
    public Api getApi(){
        return api;
    }
}
