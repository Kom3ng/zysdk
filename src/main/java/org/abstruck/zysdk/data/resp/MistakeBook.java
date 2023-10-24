package org.abstruck.zysdk.data.resp;

public record MistakeBook(
        Integer topicId,
        Topic topic,
        Integer studentUserId,
        Integer newQstCount,
        Integer totalQstCount,
        Integer id
) {
    public record Topic(
            Integer id,
            String name,
            String content,
            Integer sort,
            Boolean isActive
    ){}
}
