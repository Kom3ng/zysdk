package org.abstruck.zysdk.api;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.abstruck.zysdk.data.resp.ApiDiscoveryResponse;

import java.io.IOException;
import java.util.Objects;

public class ApiUrls {
    private static final String API_DISCOVERY = "https://hagateway.zykj.org/api/discovery/sxz";
    private String API_HOST = null;
    private final String LOGIN;
    private final String GET_INFO_ASYNC;
    private final String GET_MY_INFO_ASYNC;
    private final String GET_Q_WEATHER_ASYNC;
    private final String GET_SYSTEM_SETTINGS_FOR_STUDENT_ASYNC;
    private final String GET_ALL_SETTINGS;
    private final String GET_MY_MESSAGE_LIST_ASYNC;
    private final String SET_MESSAGE_READ_ASYNC;
    private final String GET_NOTICE_ASYNC;
    private final String GET_MY_UNREAD_MESSAGE_COUNT_ASYNC;
    private final String GET_ALL_COMMON_WEB_SITE_ASYNC;
    private final String GET_ALL_WHITE_URL_ASYNC;
    private final String GET_MY_TOPICS;
    private final String COURSES_SUBSCRIBED;
    private final String GENERATOR_TOKEN_ASYNC;
    private final String GET_DN_URL;
    private final String CAN_I_OPEN_CAMERA_ASYNC;
    private final String RECORD_PICTURES_ASYNC;
    private final String CHECK_UPDATE_ASYNC;
    private final String GET_MY_TAGS;
    private final String MULTI_REMOVE_MISTAKE_ITEMS_ASYNC;
    private final String GET_MISTAKE_QST_ITEM_DETAIL_INFO_ASYNC;
    private final String SEARCH_MISTAKE_QST_ITEMS_ASYNC;
    private final String GET_MY_MISTAKE_BOOKS_ASYNC;
    private final String GET_CATALOGS;
    private final String GET_QUORA_STUDENT_TOPICS_ASYNC;
    private final String GET_SESSIONS;
    private final String DELETE_CATALOG;
    private final String ADD_CATALOG;
    private final String SEARCH_QUORA;
    private final String CREATE_SESSION;



    private ApiUrls(){
        initApiHost();

        LOGIN = byPath("/api/TokenAuth/Login");
        GET_INFO_ASYNC = byPath("/api/services/app/User/GetInfoAsync");
        GET_MY_INFO_ASYNC = byPath("/api/services/app/StudentUser/GetMyInfoAsync");
        GET_Q_WEATHER_ASYNC = byPath("/api/services/app/Weather/GetQWeatherAsync");
        GET_SYSTEM_SETTINGS_FOR_STUDENT_ASYNC = byPath("/api/services/app/Setting/GetSystemSettingsForStudentAsync");
        GET_ALL_SETTINGS = byPath("/api/services/app/Setting/GetAllSettings");
        GET_MY_MESSAGE_LIST_ASYNC = byPath("/api/services/app/Message/GetMyMessageListAsync");
        SET_MESSAGE_READ_ASYNC = byPath("/api/services/app/Message/SetMessageReadAsync");
        GET_NOTICE_ASYNC = byPath("/api/services/app/Notice/GetNoticeAsync");
        GET_MY_UNREAD_MESSAGE_COUNT_ASYNC = byPath("/api/services/app/Message/GetMyUnreadMessageCountAsync");
        GET_ALL_COMMON_WEB_SITE_ASYNC = byPath("/api/services/app/WebWhiteList/GetAllCommonWebSiteAsync");
        GET_ALL_WHITE_URL_ASYNC = byPath("/api/services/app/WebWhiteList/GetAllWhiteUrlAsync");
        GET_MY_TOPICS = byPath("/api/services/app/User/GetMyTopics");
        COURSES_SUBSCRIBED = byPath("/api/services/app/StudentUser/CoursesSubscribed");
        GENERATOR_TOKEN_ASYNC = byPath("/api/services/app/ObjectStorage/GeneratorTokenAsync");
        GET_DN_URL = byPath("/api/dn/GetDnUrl");
        CAN_I_OPEN_CAMERA_ASYNC = byPath("/api/services/app/StoreAppControl/CanIOpenCameraAsync");
        RECORD_PICTURES_ASYNC = byPath("/api/services/app/StoreAppControl/RecordPicturesAsync");
        CHECK_UPDATE_ASYNC = byPath("/api/services/app/AppStore/CheckUpdateAsync");
        GET_MY_TAGS = byPath("/api/services/app/MistakeBook/GetMyTags");
        MULTI_REMOVE_MISTAKE_ITEMS_ASYNC = byPath("/api/services/app/MistakeBook/MultiRemoveMistakeItemsAsync");
        GET_MISTAKE_QST_ITEM_DETAIL_INFO_ASYNC = byPath("/api/services/app/MistakeBook/GetMistakeQstItemDetailInfoAsync");
        SEARCH_MISTAKE_QST_ITEMS_ASYNC = byPath("/api/services/app/MistakeBook/SearchMistakeQstItemsAsync");
        GET_MY_MISTAKE_BOOKS_ASYNC = byPath("/api/services/app/MistakeBook/GetMyMistakeBooksAsync");
        GET_CATALOGS = byPath("/api/services/app/Quora/GetCatalogs");
        GET_QUORA_STUDENT_TOPICS_ASYNC = byPath("/api/services/app/Quora/GetQuoraStudentTopicsAsync");
        GET_SESSIONS = byPath("/api/services/app/Quora/GetSessions");
        DELETE_CATALOG = byPath("/api/services/app/Quora/DeleteCatalog");
        ADD_CATALOG = byPath("/api/services/app/Quora/AddCatalog");
        SEARCH_QUORA = byPath("/api/services/app/Quora/SearchQuora");
        CREATE_SESSION = byPath("/api/services/app/Quora/CreateSession");
    }

    public static ApiUrls defaultApiUrls(){
        return new ApiUrls();
    }

    private String byPath(String path){
        return API_HOST + path;
    }

    private void initApiHost() {
        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(getAPI_DISCOVERY())
                .get()
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            ApiDiscoveryResponse apiDiscoveryResponse = new Gson().fromJson(Objects.requireNonNull(response.body()).string(), ApiDiscoveryResponse.class);
             API_HOST = apiDiscoveryResponse.server();
        } catch (IOException | NullPointerException e) {
            throw new RuntimeException("exception when init api urls: "+e);
        }
    }


    public String getAPI_DISCOVERY() {
        return API_DISCOVERY;
    }

    public String getLOGIN() {
        return LOGIN;
    }

    public String getGET_INFO_ASYNC() {
        return GET_INFO_ASYNC;
    }

    public String getGET_MY_INFO_ASYNC() {
        return GET_MY_INFO_ASYNC;
    }

    public String getGET_Q_WEATHER_ASYNC() {
        return GET_Q_WEATHER_ASYNC;
    }

    public String getGET_SYSTEM_SETTINGS_FOR_STUDENT_ASYNC() {
        return GET_SYSTEM_SETTINGS_FOR_STUDENT_ASYNC;
    }

    public String getGET_ALL_SETTINGS() {
        return GET_ALL_SETTINGS;
    }

    public String getGET_MY_MESSAGE_LIST_ASYNC() {
        return GET_MY_MESSAGE_LIST_ASYNC;
    }

    public String getSET_MESSAGE_READ_ASYNC() {
        return SET_MESSAGE_READ_ASYNC;
    }

    public String getGET_NOTICE_ASYNC() {
        return GET_NOTICE_ASYNC;
    }

    public String getGET_MY_UNREAD_MESSAGE_COUNT_ASYNC() {
        return GET_MY_UNREAD_MESSAGE_COUNT_ASYNC;
    }

    public String getGET_ALL_COMMON_WEB_SITE_ASYNC() {
        return GET_ALL_COMMON_WEB_SITE_ASYNC;
    }

    public String getGET_ALL_WHITE_URL_ASYNC() {
        return GET_ALL_WHITE_URL_ASYNC;
    }

    public String getGET_MY_TOPICS() {
        return GET_MY_TOPICS;
    }

    public String getCOURSES_SUBSCRIBED() {
        return COURSES_SUBSCRIBED;
    }

    public String getGENERATOR_TOKEN_ASYNC() {
        return GENERATOR_TOKEN_ASYNC;
    }

    public String getGET_DN_URL() {
        return GET_DN_URL;
    }

    public String getCAN_I_OPEN_CAMERA_ASYNC() {
        return CAN_I_OPEN_CAMERA_ASYNC;
    }

    public String getRECORD_PICTURES_ASYNC() {
        return RECORD_PICTURES_ASYNC;
    }

    public String getCHECK_UPDATE_ASYNC() {
        return CHECK_UPDATE_ASYNC;
    }

    public String getGET_MY_TAGS() {
        return GET_MY_TAGS;
    }

    public String getMULTI_REMOVE_MISTAKE_ITEMS_ASYNC() {
        return MULTI_REMOVE_MISTAKE_ITEMS_ASYNC;
    }

    public String getGET_MISTAKE_QST_ITEM_DETAIL_INFO_ASYNC() {
        return GET_MISTAKE_QST_ITEM_DETAIL_INFO_ASYNC;
    }

    public String getSEARCH_MISTAKE_QST_ITEMS_ASYNC() {
        return SEARCH_MISTAKE_QST_ITEMS_ASYNC;
    }

    public String getGET_MY_MISTAKE_BOOKS_ASYNC() {
        return GET_MY_MISTAKE_BOOKS_ASYNC;
    }

    public String getGET_CATALOGS() {
        return GET_CATALOGS;
    }

    public String getGET_QUORA_STUDENT_TOPICS_ASYNC() {
        return GET_QUORA_STUDENT_TOPICS_ASYNC;
    }

    public String getGET_SESSIONS() {
        return GET_SESSIONS;
    }

    public String getDELETE_CATALOG() {
        return DELETE_CATALOG;
    }

    public String getADD_CATALOG() {
        return ADD_CATALOG;
    }

    public String getSEARCH_QUORA() {
        return SEARCH_QUORA;
    }

    public String getCREATE_SESSION() {
        return CREATE_SESSION;
    }
}
