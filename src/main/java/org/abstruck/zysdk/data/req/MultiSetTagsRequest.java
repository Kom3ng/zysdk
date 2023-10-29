package org.abstruck.zysdk.data.req;

public record MultiSetTagsRequest(
        Integer attainedLevel,
        Integer bookId,
        Integer diff,
        Integer errorReason,
        Integer[] itemIds,
        Integer[] tagIdList
) {
}
