package org.abstruck.zysdk.exception;

import org.abstruck.zysdk.data.resp.CommonResponse;
import org.jetbrains.annotations.NotNull;

public class ApiException extends RuntimeException{
    private CommonResponse.Error error;
    public ApiException(CommonResponse.Error error){
        super(error == null ? "" : error.toString());
        this.setError(error);
    }

    public CommonResponse.Error getError() {
        return error;
    }

    public void setError(CommonResponse.Error error) {
        this.error = error;
    }
}
