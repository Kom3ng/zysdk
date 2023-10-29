package org.abstruck.zysdk.data.req;

public record AddInMistakeBookRequest(
        Integer examId,
        String[] extraStems,
        Boolean isRelatedGroup,
        Integer questionId,
        String stemShoot,
        Integer[] tagIdList
) {
}
