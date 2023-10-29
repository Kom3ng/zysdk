package org.abstruck.zysdk.data.resp;

public record Task(
        Integer examTaskId,
        Integer topicId,
        String topicName,
        Integer examId,
        String examName,
        Integer examState,
        String creationTime,
        String startTime,
        String endTime,
        Integer taskState,
        Boolean correctWithSelf,
        Boolean correctOnline,
        Boolean isExempted,
        Boolean isNoStem,
        Integer answeringUrge,
        Integer revisingUrge,
        Boolean isCollect,
        Boolean answerSheet,
        Boolean answerPad,
        Integer correctOnlineState,
        Integer specificTrainingType,
        Integer size,
        Integer testPagerId,
        String address,
        String serialNum
) {
}
