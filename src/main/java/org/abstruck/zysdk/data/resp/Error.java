package org.abstruck.zysdk.data.resp;

public record Error(
        Integer code,
        String message,
        Object details,
        Object validationErrors
) {
}
