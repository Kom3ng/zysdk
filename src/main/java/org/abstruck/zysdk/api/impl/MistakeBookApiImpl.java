package org.abstruck.zysdk.api.impl;

import okhttp3.OkHttpClient;
import org.abstruck.zysdk.api.ApiUrls;
import org.abstruck.zysdk.api.MistakeBookApi;
import org.abstruck.zysdk.data.req.RemoveMistakeItemsRequest;
import org.abstruck.zysdk.data.req.SearchMistakeQstItemRequest;
import org.abstruck.zysdk.data.resp.MistakeBook;
import org.abstruck.zysdk.data.resp.QstInfo;
import org.abstruck.zysdk.data.resp.Qsts;
import org.abstruck.zysdk.data.resp.Tag;
import org.abstruck.zysdk.util.ApiRequestBuilder;

public class MistakeBookApiImpl implements MistakeBookApi {
    private final OkHttpClient httpClient;
    public static final String appName = "Mistake";
    public static final String packageName = "com.zykj.mistake";
    private final String appVersion;
    public MistakeBookApiImpl(OkHttpClient httpClient,String appVersion){
        this.httpClient = httpClient;
        this.appVersion = appVersion;
    }
    @Override
    public Tag[] getMyTags(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_MY_TAGS)
                .appName(appName)
                .appVersion(appVersion)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Tag[].class);
    }

    @Override
    public Void removeMistakeItems(String token, RemoveMistakeItemsRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.MULTI_REMOVE_MISTAKE_ITEMS_ASYNC)
                .post(request)
                .appName(appName)
                .appVersion(appVersion)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Void.class);
    }

    @Override
    public QstInfo getMistakeQstItemDetailInfo(String token, Integer itemId) {
        return new ApiRequestBuilder()
                .appName(appName)
                .appVersion(appVersion)
                .url(ApiUrls.GET_MISTAKE_QST_ITEM_DETAIL_INFO_ASYNC)
                .authorize(token)
                .queryParam("itemId",itemId.toString())
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(QstInfo.class);
    }

    @Override
    public QstInfo getCustomMistakeQstItemDetailInfo(String token, Integer itemId) {
        throw new RuntimeException("not impl");
    }

    @Override
    public Qsts searchMistakeQstItem(String token, SearchMistakeQstItemRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.SEARCH_MISTAKE_QST_ITEMS_ASYNC)
                .post(request)
                .appName(appName)
                .appVersion(appVersion)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Qsts.class);
    }

    @Override
    public MistakeBook[] getMyMistakeBooks(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_MY_MISTAKE_BOOKS_ASYNC)
                .authorize(token)
                .get()
                .appName(appName)
                .appVersion(appVersion)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(MistakeBook[].class);
    }
}
