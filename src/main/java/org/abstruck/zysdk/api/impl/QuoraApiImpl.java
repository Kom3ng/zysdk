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
    public static final String appName = "com.zykj.student.dialogue";
    private final String appVersion;
    public QuoraApiImpl(OkHttpClient httpClient,String appVersion){
        this.httpClient = httpClient;
        this.appVersion = appVersion;
    }
    @Override
    public Catalog[] getCatalogs(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_CATALOGS)
                .get()
                .appName(appName)
                .appVersion(appVersion)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Catalog[].class);
    }

    @Override
    public QuoraTopic[] getQuoraTopics(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_QUORA_STUDENT_TOPICS_ASYNC)
                .get()
                .appName(appName)
                .appVersion(appVersion)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(QuoraTopic[].class);
    }

    @Override
    public Session[] getSessions(String token, GetSessionsRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_SESSIONS)
                .post(request)
                .appName(appName)
                .appVersion(appVersion)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Session[].class);
    }

    @Override
    public Void deleteCatalog(String token, Integer id) {
        return new ApiRequestBuilder()
                .url(ApiUrls.DELETE_CATALOG)
                .appName(appName)
                .appVersion(appVersion)
                .get()
                .queryParam("id",id.toString())
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Void.class);
    }

    @Override
    public Integer addCatalog(String token, AddCatalogRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.ADD_CATALOG)
                .post(request)
                .appName(appName)
                .appVersion(appVersion)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Integer.class);
    }

    @Override
    public Object[] searchQuora(String token, SearchQuoraRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.SEARCH_QUORA)
                .authorize(token)
                .appName(appName)
                .appVersion(appVersion)
                .post(request)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Object[].class);
    }

    @Override
    public Integer createSession(String token, CreateSessionRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.CREATE_SESSION)
                .post(request)
                .appName(appName)
                .appVersion(appVersion)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Integer.class);
    }
}
