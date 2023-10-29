package org.abstruck.zysdk.api;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.abstruck.zysdk.data.resp.ApiDiscoveryResponse;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Objects;

public class ApiUrls {
    private static final String API_DISCOVERY = "https://hagateway.zykj.org/api/discovery/sxz";
    private static String API_HOST = null;
    public static final String LOGIN;
    public static final String GET_INFO_ASYNC;
    public static final String GET_MY_INFO_ASYNC;
    public static final String GET_Q_WEATHER_ASYNC;
    public static final String GET_SYSTEM_SETTINGS_FOR_STUDENT_ASYNC;
    public static final String GET_ALL_SETTINGS;
    public static final String GET_MY_MESSAGE_LIST_ASYNC;
    public static final String SET_MESSAGE_READ_ASYNC;
    public static final String GET_NOTICE_ASYNC;
    public static final String GET_MY_UNREAD_MESSAGE_COUNT_ASYNC;
    public static final String GET_ALL_COMMON_WEB_SITE_ASYNC;
    public static final String GET_ALL_WHITE_URL_ASYNC;
    public static final String GET_MY_TOPICS;
    public static final String COURSES_SUBSCRIBED;
    public static final String GENERATOR_TOKEN_ASYNC;
    public static final String GET_DN_URL;
    public static final String CAN_I_OPEN_CAMERA_ASYNC;
    public static final String RECORD_PICTURES_ASYNC;
    public static final String CHECK_UPDATE_ASYNC;
    public static final String GET_MY_TAGS;
    public static final String MULTI_REMOVE_MISTAKE_ITEMS_ASYNC;
    public static final String GET_MISTAKE_QST_ITEM_DETAIL_INFO_ASYNC;
    public static final String SEARCH_MISTAKE_QST_ITEMS_ASYNC;
    public static final String GET_MY_MISTAKE_BOOKS_ASYNC;
    public static final String GET_CATALOGS;
    public static final String GET_QUORA_STUDENT_TOPICS_ASYNC;
    public static final String GET_SESSIONS;
    public static final String DELETE_CATALOG;
    public static final String ADD_CATALOG;
    public static final String SEARCH_QUORA;
    public static final String CREATE_SESSION;
    public static final String CREATE_OR_UPDATE_TAG;
    public static final String SET_NOTE;
    public static final String MULTI_SET_TAGS;
    public static final String GET_CUSTOM_MISTAKE_QST_ITEM_DETAIL_INFO;
    public static final String ADD_PICTURE_NOTE;
    public static final String ADD_IN_MISTAKE_BOOK;
    public static final String ADD_CUSTOM_MISTAKE_QST_ITEM;
    public static final String REMOVE_FROM_MISTAKE_BOOK;
    public static final String GET_SESSION_BY_ID;
    public static final String GET_MESSAGES;
    public static final String RESET_READ_STATE;
    public static final String UPDATE_CATALOG;
    public static final String GET_COLLECT_SESSIONS;
    public static final String SET_QUORA_COLLECT;
    public static final String MY_TASK_COUNT;
    public static final String GET_STUDENT_TASK_LIST;
    public static final String GET_REVISING_TASK;
    public static final String GET_QUESTION_VIEW;
    public static final String ASK_FOR_HELP;

    static {
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
        CREATE_OR_UPDATE_TAG = byPath("/api/services/app/MistakeBook/CreateOrUpdateTagAsync");
        SET_NOTE = byPath("/api/services/app/MistakeBook/SetNoteAsync");
        MULTI_SET_TAGS = byPath("/api/services/app/MistakeBook/MultiSetTagsAsync");
        GET_CUSTOM_MISTAKE_QST_ITEM_DETAIL_INFO = byPath("/api/services/app/MistakeBook/GetCustomMistakeQstItemDetailInfoAsync");
        ADD_PICTURE_NOTE = byPath("/api/services/app/MistakeBook/AddPictureNoteAsync");
        ADD_IN_MISTAKE_BOOK = byPath("/api/services/app/MistakeBook/AddInMistakeBookAsync");
        ADD_CUSTOM_MISTAKE_QST_ITEM = byPath("/api/services/app/MistakeBook/AddCustomMistakeQstItemAsync");
        REMOVE_FROM_MISTAKE_BOOK = byPath("/api/services/app/MistakeBook/RemoveFromMistakeBookAsync");
        GET_SESSION_BY_ID = byPath("/api/services/app/Quora/GetSessionById");
        GET_MESSAGES = byPath("/api/services/app/Quora/GetMessages");
        RESET_READ_STATE = byPath("/api/services/app/Quora/ResetReadState");
        UPDATE_CATALOG = byPath("/api/services/app/Quora/UpdateCatalog");
        GET_COLLECT_SESSIONS = byPath("/api/services/app/Quora/GetCollectSessions");
        SET_QUORA_COLLECT = byPath("/api/services/app/Quora/SetQuoraCollectAsync");
        MY_TASK_COUNT = byPath("/api/services/app/Task/MyTaskCountAsync");
        GET_STUDENT_TASK_LIST = byPath("/api/services/app/Task/GetStudentTaskListAsync");
        GET_REVISING_TASK = byPath("/api/services/app/Task/GetRevisingTaskAsync");
        GET_QUESTION_VIEW = byPath("/api/services/app/Task/GetQuestionViewAsync");
        ASK_FOR_HELP = byPath("/api/services/app/Task/AskForHelpAsync");
    }

    @NotNull
    @Contract(pure = true)
    private static String byPath(String path){
        return API_HOST + path;
    }

    private static void initApiHost() {
        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(API_DISCOVERY)
                .get()
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            ApiDiscoveryResponse apiDiscoveryResponse = new Gson().fromJson(Objects.requireNonNull(response.body()).string(), ApiDiscoveryResponse.class);
             API_HOST = apiDiscoveryResponse.server();
        } catch (IOException | NullPointerException e) {
            throw new RuntimeException("exception when init api urls: "+e);
        }
    }
}
