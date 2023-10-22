package org.abstruck.zysdk.data.resp;

public record CommonResponse<T>(
        T result,
        String targetUrl,
        Boolean success,
        Error error,
        Boolean unAuthorizedRequest,
        Boolean __adp) {
    public record Error(
            Integer code,
            String message,
            Object details,
            Object validationErrors){

    }
}
