package org.abstruck.zysdk.data.req;

public record RemoveMistakeItemsRequest(
        Integer bookId,
        Integer[] itemIds
) {
}
