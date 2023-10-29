package org.abstruck.zysdk.data.req;

public record AddCustomMistakeQstItem(
    Integer diff,
    String[] extraAnswers,
    String[] extraStems,
    String stemShoot,
    Integer[] tagIdList,
    String title,
    Integer topicId
) {
}
