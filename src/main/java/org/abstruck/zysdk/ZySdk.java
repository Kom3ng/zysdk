package org.abstruck.zysdk;

import okhttp3.OkHttpClient;
import org.abstruck.zysdk.api.Api;
import org.abstruck.zysdk.api.ApiUrls;
import org.abstruck.zysdk.api.impl.ApiImpl;
import org.abstruck.zysdk.util.Void;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class ZySdk {
    private OkHttpClient httpClient;
    private ApiImpl api;

    private ZySdk(OkHttpClient httpClient){
        this.httpClient = httpClient;
        this.api = new ApiImpl(httpClient);
    }

    @NotNull
    @Contract(value = "_ -> new", pure = true)
    public static ZySdk init(OkHttpClient okHttpClient){
        return new ZySdk(okHttpClient);
    }
    public static ZySdk init(){
        return init(new OkHttpClient());
    }
    public Api getApi(){
        return api;
    }
}
