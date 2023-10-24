package org.abstruck.zysdk.data.req;

// TODO
public record RecordPicturesRequest(
        String appName,
        String packageName,
        String[] pictures
) {
}
