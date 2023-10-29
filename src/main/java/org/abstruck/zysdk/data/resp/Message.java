package org.abstruck.zysdk.data.resp;

public record Message(
        Integer sessionId,
        Integer userId,
        String userName,
        String snapShot,
        String content,
        Integer msgFlag,
        String sendTime,
        Boolean isPrimary,
        Integer applauds,
        Object applaud,
        String applaudTime,
        Object read,
        String readTime,
        Boolean disabled,
        Integer id
) {
}
