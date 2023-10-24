package org.abstruck.zysdk.data.req;

public record GetMessageRequest(
        Integer maxResultCount,
        Integer skipCount,
        Integer type
) {
}
