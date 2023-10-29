package org.abstruck.zysdk.data.req;

//{"isCollect":false,"sessionId":"89695"}
public record SetQuoraCollectRequest(
        Boolean isCollect,
        String sessionId
) {
}
