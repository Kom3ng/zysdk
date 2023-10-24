package org.abstruck.zysdk.data.req;

public record CreateSessionRequest(
        String content,
        String courseId,
        String snapshot,
        String summary
) {
}
