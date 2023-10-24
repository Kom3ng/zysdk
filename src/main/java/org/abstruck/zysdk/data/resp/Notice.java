package org.abstruck.zysdk.data.resp;

public record Notice(
        String title,
        String content,
        Integer type,
        Integer targetCount,
        Integer readCount
) {
}
