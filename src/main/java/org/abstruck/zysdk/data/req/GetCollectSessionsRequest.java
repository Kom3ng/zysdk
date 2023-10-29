package org.abstruck.zysdk.data.req;

public record GetCollectSessionsRequest(
        TimeFrame collectTime,
        String keyword,
        Integer skip,
        Integer take,
        Integer topicId
) {
}
