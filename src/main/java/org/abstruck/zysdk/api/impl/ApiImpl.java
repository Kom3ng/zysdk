package org.abstruck.zysdk.api.impl;

import okhttp3.OkHttpClient;
import org.abstruck.zysdk.api.*;

public class ApiImpl implements Api {
    private final ManageApi manageApi;
    private final MistakeBookApi mistakeBookApi;
    private final QuoraApi quoraApi;
    public ApiImpl(OkHttpClient httpClient){
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
