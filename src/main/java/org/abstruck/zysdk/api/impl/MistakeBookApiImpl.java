package org.abstruck.zysdk.api.impl;

import okhttp3.OkHttpClient;
import org.abstruck.zysdk.api.ApiUrls;
import org.abstruck.zysdk.api.MistakeBookApi;
import org.abstruck.zysdk.data.req.*;
import org.abstruck.zysdk.data.resp.MistakeBook;
import org.abstruck.zysdk.data.resp.QstInfo;
import org.abstruck.zysdk.data.resp.Qsts;
import org.abstruck.zysdk.data.resp.Tag;
import org.abstruck.zysdk.util.ApiRequestBuilder;
import org.jetbrains.annotations.NotNull;

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
    public QstInfo getMistakeQstItemDetailInfo(String token, @NotNull Integer itemId) {
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
    public QstInfo getCustomMistakeQstItemDetailInfo(String token, @NotNull Integer itemId) {
        return new ApiRequestBuilder()
                .appName(appName)
                .appVersion(appVersion)
                .url(ApiUrls.GET_CUSTOM_MISTAKE_QST_ITEM_DETAIL_INFO)
                .authorize(token)
                .queryParam("itemId",itemId.toString())
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(QstInfo.class);
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

    @Override
    public Integer createOrUpdateTag(String token, CreateOrUpdateTagRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.CREATE_OR_UPDATE_TAG)
                .authorize(token)
                .post(request)
                .appName(appName)
                .appVersion(appVersion)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Integer.class);
    }

    @Override
    public Void setNote(String token, SetNoteRequest request) {
        return new ApiRequestBuilder()
                .authorize(token)
                .url(ApiUrls.SET_NOTE)
                .post(request)
                .appVersion(appVersion)
                .appName(appName)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Void.class);
    }

    @Override
    public Void multiSetTads(String token, MultiSetTagsRequest request) {
        return new ApiRequestBuilder()
                .authorize(token)
                .appName(appName)
                .appVersion(appVersion)
                .post(request)
                .url(ApiUrls.MULTI_SET_TAGS)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Void.class);
    }

    @Override
    public Void addPictureNote(String token, AddPictureNoteRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.ADD_PICTURE_NOTE)
                .authorize(token)
                .appName(appName)
                .appVersion(appVersion)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Void.class);
    }

    @Override
    public Integer addInMistakeBook(String token, AddInMistakeBookRequest request) {
        return new ApiRequestBuilder()
                .post(request)
                .authorize(token)
                .url(ApiUrls.ADD_IN_MISTAKE_BOOK)
                .appName(appName)
                .appVersion(appVersion)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Integer.class);
    }

    @Override
    public Void removeFromMistakeBook(String token, Integer examId, Integer questionId, Boolean isRelatedGroup) {
        return new ApiRequestBuilder()
                .url(ApiUrls.REMOVE_FROM_MISTAKE_BOOK)
                .delete()
                .authorize(token)
                .appName(appName)
                .appVersion(appVersion)
                .header("examId",examId)
                .header("questionId",questionId)
                .header("isRelatedGroup",isRelatedGroup)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Void.class);
    }

    @Override
    public Integer addCustomMistakeQstItem(String token, AddCustomMistakeQstItem request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.ADD_CUSTOM_MISTAKE_QST_ITEM)
                .post(request)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Integer.class);
    }
}
