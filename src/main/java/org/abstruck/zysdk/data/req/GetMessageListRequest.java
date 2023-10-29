package org.abstruck.zysdk.data.req;

public record GetMessageListRequest(
        Integer maxResultCount,
        Integer skipCount,
        Integer type
) {
}
