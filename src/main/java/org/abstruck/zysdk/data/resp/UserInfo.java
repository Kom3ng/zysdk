package org.abstruck.zysdk.data.resp;

public record UserInfo(
        Integer id,
        String userName,
        String realName,
        String surname,
        String name,
        String mobile,
        String email,
        String photo,
        Integer[] roles

) {
}
