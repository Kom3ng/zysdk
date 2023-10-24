package org.abstruck.zysdk.data.resp;

public record Session(
        Integer cleared,
        Boolean closed,
        Integer courseId,
        String createTime,
        Integer askUserId,
        Integer members,
        Integer messages,
        String snapshot,
        String summary,
        String updateTime,
        Integer updateUserId,
        Integer sessionRole,
        Integer unRead,
        Integer primaryUnRead,
        Integer sentMessages,
        Integer openCount,
        Integer state,
        Integer userId,
        Integer joinType,
        String joinTime,
        String askUserName,
        String askUserPhoto,
        Boolean disabled,
        @com.google.gson.annotations.SerializedName("class")
        String clazz,
        String topicName,
        Boolean isCollect,
        Boolean searched,
        Integer id
) {
}
