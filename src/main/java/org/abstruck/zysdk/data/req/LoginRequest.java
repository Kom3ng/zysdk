package org.abstruck.zysdk.data.req;

public record LoginRequest(
        String userName,
        String password,
        Integer clientCode
) {
}
