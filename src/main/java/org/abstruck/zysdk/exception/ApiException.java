package org.abstruck.zysdk.exception;

import lombok.Getter;
import org.abstruck.zysdk.data.resp.CommonResponse;

@Getter
public class ApiException extends RuntimeException{
    private CommonResponse.Error error;
    public ApiException(CommonResponse.Error error){
        super(error == null ? "" : error.toString());
        this.setError(error);
    }

    public void setError(CommonResponse.Error error) {
        this.error = error;
    }
}
