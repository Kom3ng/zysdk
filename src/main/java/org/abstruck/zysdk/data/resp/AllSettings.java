package org.abstruck.zysdk.data.resp;

public record AllSettings(
        String schoolName,
        String schoolShortName,
        String systemName,
        String stuNumLength,
        String backgroundImage,
        String icon,
        Integer[] stageIds,
        String xkwOrder,
        String dnOrder,
        String newDeviceSmsAuthentication,
        String studentSelectActivity,
        String studentSatisfaction,
        String qq,
        String emailAddress,
        String wechat,
        String telephone,
        String mobile
) {
}
