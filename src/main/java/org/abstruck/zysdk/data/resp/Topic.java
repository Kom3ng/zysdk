package org.abstruck.zysdk.data.resp;

public record Topic(
        Integer id,
        String name,
        String content,
        Integer sort,
        Boolean isActive
) {
}
