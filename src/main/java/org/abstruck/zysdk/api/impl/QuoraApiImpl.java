package org.abstruck.zysdk.api.impl;

import okhttp3.OkHttpClient;
import org.abstruck.zysdk.api.ApiUrls;
import org.abstruck.zysdk.api.QuoraApi;
import org.abstruck.zysdk.data.req.AddCatalogRequest;
import org.abstruck.zysdk.data.req.CreateSessionRequest;
import org.abstruck.zysdk.data.req.GetSessionsRequest;
import org.abstruck.zysdk.data.req.SearchQuoraRequest;
import org.abstruck.zysdk.data.resp.Catalog;
import org.abstruck.zysdk.data.resp.QuoraTopic;
import org.abstruck.zysdk.data.resp.Session;
import org.abstruck.zysdk.util.ApiRequestBuilder;

public class QuoraApiImpl implements QuoraApi {
    private final OkHttpClient httpClient;
    public QuoraApiImpl(OkHttpClient httpClient){
        this.httpClient = httpClient;
    }
    @Override
    public Catalog[] getCatalogs(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_CATALOGS)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Catalog[].class);
    }

    @Override
    public QuoraTopic[] getQuoraTopics(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_QUORA_STUDENT_TOPICS_ASYNC)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(QuoraTopic[].class);
    }

    @Override
    public Session[] getSessions(String token, GetSessionsRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_SESSIONS)
                .post(request)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Session[].class);
    }

    @Override
    public Void deleteCatalog(String token, Integer id) {
        return null;
    }

    @Override
    public Integer addCatalog(String token, AddCatalogRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.ADD_CATALOG)
                .post(request)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Integer.class);
    }

    @Override
    public Object[] searchQuora(String token, SearchQuoraRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.SEARCH_QUORA)
                .authorize(token)
                .post(request)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Object[].class);
    }

    @Override
    public Integer createSession(String token, CreateSessionRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.CREATE_SESSION)
                .post(request)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Integer.class);
    }
}
