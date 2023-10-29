package org.abstruck.zysdk.api.impl;

import okhttp3.OkHttpClient;
import org.abstruck.zysdk.api.ApiUrls;
import org.abstruck.zysdk.api.QuoraApi;
import org.abstruck.zysdk.data.req.*;
import org.abstruck.zysdk.data.resp.Catalog;
import org.abstruck.zysdk.data.resp.Message;
import org.abstruck.zysdk.data.resp.QuoraTopic;
import org.abstruck.zysdk.data.resp.Session;
import org.abstruck.zysdk.util.ApiRequestBuilder;
import org.jetbrains.annotations.NotNull;

public class QuoraApiImpl implements QuoraApi {
    private final OkHttpClient httpClient;
    public static final String appName = "com.zykj.student.dialogue";
    public static final String packageName = "com.zykj.student.dialogue";
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
    public Void deleteCatalog(String token, @NotNull Integer id) {
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

    @Override
    public Session getSessionById(String token, Integer id) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_SESSION_BY_ID)
                .queryParam("id",id)
                .get()
                .authorize(token)
                .appName(appName)
                .appVersion(appVersion)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Session.class);
    }

    @Override
    public Message[] getMessages(String token, GetMessageRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_MESSAGES)
                .post(request)
                .authorize(token)
                .appName(appName)
                .appVersion(appVersion)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Message[].class);
    }

    @Override
    public Void resetReadState(String token, Integer id) {
        return new ApiRequestBuilder()
                .queryParam("id",id)
                .authorize(token)
                .url(ApiUrls.RESET_READ_STATE)
                .appName(appName)
                .appVersion(appVersion)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Void.class);
    }

    @Override
    public Void updateCatalog(String token, AddCatalogRequest request) {
        return new ApiRequestBuilder()
                .post(request)
                .authorize(token)
                .url(ApiUrls.UPDATE_CATALOG)
                .appName(appName)
                .appVersion(appVersion)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Void.class);
    }

    @Override
    public Session[] getCollectSessions(String token, GetCollectSessionsRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_COLLECT_SESSIONS)
                .authorize(token)
                .post(request)
                .appName(appName)
                .appVersion(appVersion)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Session[].class);
    }

    @Override
    public Void setQuoraCollect(String token, SetQuoraCollectRequest request) {
        return new ApiRequestBuilder()
                .post(request)
                .authorize(token)
                .appName(appName)
                .appVersion(appVersion)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Void.class);
    }
}
