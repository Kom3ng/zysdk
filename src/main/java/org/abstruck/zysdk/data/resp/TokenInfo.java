package org.abstruck.zysdk.data.resp;


public record TokenInfo(
        Integer clientCode,
        String accessToken,
        String rongCloudToken,
        Integer expireInSeconds,
        Integer userId,
        Integer roleType,
        String mobile,
        Boolean needChangePwd,
        String refreshToken,
        Integer refreshExpireInSeconds,
        Boolean needSmsVerification

) {
}
