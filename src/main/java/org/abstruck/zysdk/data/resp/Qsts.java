package org.abstruck.zysdk.data.resp;

public record Qsts(
        Integer totalCount,
        QstItem[] items
) {
    public record QstItem(
            String source,
            String creationTime,
            String stemShoot,
            Boolean hasStem,
            Integer diff,
            Integer attainedLevel,
            Integer errorReason,
            String[] tagNames,
            Boolean isRelatedQstGroup,
            Integer number,
            String name,
            Integer id
    ){

    }
}
