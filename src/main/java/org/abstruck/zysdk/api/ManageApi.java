package org.abstruck.zysdk.api;

import org.abstruck.zysdk.data.req.LoginRequest;
import org.abstruck.zysdk.data.resp.StudentInfo;
import org.abstruck.zysdk.data.resp.TokenInfo;
import org.abstruck.zysdk.data.resp.UserInfo;

public interface ManageApi {
    TokenInfo login(LoginRequest loginRequest);
    UserInfo userInfo(String token);
    StudentInfo studentInfo(String token);
}
