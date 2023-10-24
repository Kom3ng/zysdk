package org.abstruck.zysdk.data.req;

public record GetSessionsRequest(
        Integer catalogId,
        TimeFrame joinTime,
        Integer[] justWatch,
        String keyword,
        Integer orderBy,
        Integer skip,
        Integer take,
        Integer topicId,
        TimeFrame updateTime
) {
    public record TimeFrame(
            String start,
            String end
    ){}
}
