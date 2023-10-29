package org.abstruck.zysdk.data.req;

public record SetNoteRequest(
        Integer mistakeItemId,
        String note
) {
}
