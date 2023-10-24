package org.abstruck.zysdk.data.req;

public record SearchMistakeQstItemRequest(
        Integer[] attainedLevel,
        Integer bookId,
        Integer[] diff,
        Integer[] errorReason,
        Boolean haveNoTag,
        Integer maxResultCount,
        Integer skipCount,
        String tagIdList
) {
}
