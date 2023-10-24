package org.abstruck.zysdk.api.impl;

import okhttp3.OkHttpClient;
import org.abstruck.zysdk.api.*;

public class ApiImpl implements Api {
    private OkHttpClient httpClient;
    private ManageApi manageApi;
    private MistakeBookApi mistakeBookApi;
    private QuoraApi quoraApi;
    public ApiImpl(OkHttpClient httpClient){
        this.httpClient = httpClient;
        this.manageApi = new ManageApiImpl(httpClient);
        this.mistakeBookApi = new MistakeBookApiImpl(httpClient);
        this.quoraApi = new QuoraApiImpl(httpClient);
    }
    @Override
    public ManageApi manage() {
        return manageApi;
    }

    @Override
    public MistakeBookApi mistakeBook() {
        return mistakeBookApi;
    }

    @Override
    public QuoraApi quora() {
        return quoraApi;
    }

}
