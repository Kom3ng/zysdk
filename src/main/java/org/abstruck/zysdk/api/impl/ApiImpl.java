package org.abstruck.zysdk.api.impl;

import okhttp3.OkHttpClient;
import org.abstruck.zysdk.api.*;

public class ApiImpl implements Api {
    private ApiUrls apiUrls;
    private OkHttpClient httpClient;
    public ApiImpl(OkHttpClient httpClient, ApiUrls apiUrls){
        this.apiUrls = apiUrls;
        this.httpClient = httpClient;
    }
    public ApiImpl defualtApiImpl(){
        return new ApiImpl(new OkHttpClient(),ApiUrls.defaultApiUrls());
    }
    @Override
    public ManageApi manage() {
        return null;
    }

    @Override
    public MistakeBookApi mistakeBook() {
        return null;
    }

    @Override
    public QuoraApi quora() {
        return null;
    }

}
