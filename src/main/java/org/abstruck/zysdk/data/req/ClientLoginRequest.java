package org.abstruck.zysdk.data.req;

public record ClientLoginRequest(
        String userName,
        String password,
        Integer clientCode,
        Boolean im,
        String deviceNumber,
        String school,
        String role
) {
}
