package org.abstruck.zysdk.api.impl;

import com.google.gson.reflect.TypeToken;
import okhttp3.OkHttpClient;
import org.abstruck.zysdk.api.Api;
import org.abstruck.zysdk.api.ApiUrls;
import org.abstruck.zysdk.api.ManageApi;
import org.abstruck.zysdk.data.req.CreateSessionRequest;
import org.abstruck.zysdk.data.req.GetMessageRequest;
import org.abstruck.zysdk.data.req.LoginRequest;
import org.abstruck.zysdk.data.req.RecordPicturesRequest;
import org.abstruck.zysdk.data.resp.*;
import org.abstruck.zysdk.util.ApiRequestBuilder;

public class ManageApiImpl implements ManageApi {
    private OkHttpClient httpClient;
    public ManageApiImpl(OkHttpClient httpClient){
        this.httpClient = httpClient;
    }
    @Override
    public TokenInfo login(LoginRequest loginRequest) {
        return new ApiRequestBuilder()
                .url(ApiUrls.LOGIN)
                .post(loginRequest)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(TokenInfo.class);

    }

    @Override
    public UserInfo getUserInfo(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_INFO_ASYNC)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(UserInfo.class);
    }

    @Override
    public StudentInfo getStudentInfo(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_MY_INFO_ASYNC)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(StudentInfo.class);
    }

    @Override
    public WeatherReport getQWeatherReport(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_Q_WEATHER_ASYNC)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(WeatherReport.class);
    }

    @Override
    public StudentSetting getStudentSetting(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_ALL_SETTINGS)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(StudentSetting.class);
    }

    @Override
    public AllSettings getAllSettings(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_ALL_SETTINGS)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(AllSettings.class);
    }

    @Override
    public MessageList getMessageList(String token, GetMessageRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_MY_MESSAGE_LIST_ASYNC)
                .post(request)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(MessageList.class);
    }

    @Override
    public Notice getNotice(String token, Integer id) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_NOTICE_ASYNC)
                .authorize(token)
                .get()
                .queryParam("id",id.toString())
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Notice.class);
    }

    @Override
    public UnreadMessageInfo[] getUnreadMessageCount(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_MY_UNREAD_MESSAGE_COUNT_ASYNC)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(UnreadMessageInfo[].class);
    }

    @Override
    public Object[] getAllCommonUrls(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_ALL_COMMON_WEB_SITE_ASYNC)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Object[].class);
    }

    @Override
    public String getAllWhiteUrls(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_ALL_WHITE_URL_ASYNC)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(String.class);
    }

    @Override
    public Topic[] getMyTopics(String token) {
        return new Topic[0];
    }

    @Override
    public Course[] getSubscribedCourses(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.COURSES_SUBSCRIBED)
                .post("")
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Course[].class);
    }

    @Override
    public OssInfo generateOssToken(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GENERATOR_TOKEN_ASYNC)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(OssInfo.class);
    }

    @Override
    public String getDnUrl(String token) {
        return new ApiRequestBuilder()
                .url(ApiUrls.GET_DN_URL)
                .get()
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(String.class);
    }

    @Override
    public Boolean canIOpenCamera(String token, String packageName) {
        return new ApiRequestBuilder()
                .url(ApiUrls.CAN_I_OPEN_CAMERA_ASYNC)
                .authorize(token)
                .get()
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Boolean.class);
    }

    @Override
    public Void recordPicture(String token, RecordPicturesRequest request) {
        return new ApiRequestBuilder()
                .url(ApiUrls.RECORD_PICTURES_ASYNC)
                .post(request)
                .authorize(token)
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(Void.class);
    }

    @Override
    public VersionInfo checkUpdate(String packageName, Integer appType) {
        return new ApiRequestBuilder()
                .url(ApiUrls.CHECK_UPDATE_ASYNC)
                .get()
                .queryParam("packageName",packageName)
                .queryParam("appType",appType.toString())
                .buildToExecutor(httpClient)
                .apiExecuteWithResult(VersionInfo.class);
    }
}
