package org.abstruck.zysdk.api;

import org.abstruck.zysdk.data.req.ClientLoginRequest;
import org.abstruck.zysdk.data.req.GetMessageListRequest;
import org.abstruck.zysdk.data.req.LoginRequest;
import org.abstruck.zysdk.data.req.RecordPicturesRequest;
import org.abstruck.zysdk.data.resp.*;

public interface ManageApi {
    TokenInfo login(LoginRequest loginRequest);
    TokenInfo login(ClientLoginRequest request);
    UserInfo getUserInfo(String token);
    StudentInfo getStudentInfo(String token);
    WeatherReport getQWeatherReport(String token);
    StudentSetting getStudentSetting(String token);
    AllSettings getAllSettings(String token);
    MessageList getMessageList(String token, GetMessageListRequest request);
    Notice getNotice(String token,Integer id);
    UnreadMessageInfo[] getUnreadMessageCount(String token);
    // TODO
    Object[] getAllCommonUrls(String token);
    String getAllWhiteUrls(String token);
    Topic[] getMyTopics(String token);
    Course[] getSubscribedCourses(String token);
    OssInfo generateOssToken(String token);
    String getDnUrl(String token);
    Boolean canIOpenCamera(String token,String packageName);
    Void recordPicture(String token, RecordPicturesRequest request);
    VersionInfo checkUpdate(String packageName,Integer appType);
}