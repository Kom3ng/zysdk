package org.abstruck.zysdk.data.resp;

public record VersionInfo(
        Integer id,
        Integer appVersionId,
        String packageName,
        Double score,
        String creationTime,
        Integer creatorUserId,
        String summary,
        String description,
        Integer downloads,
        String fileUrl,
        Boolean forceUpdate,
        String icon,
        String name,
        Integer size,
        Integer versionCode,
        String versionName,
        Integer appType,
        Boolean disabled,
        String lastModificationTime
) {
}
