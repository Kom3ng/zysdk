package org.abstruck.zysdk.data.resp;

public record StudentInfo(
        String number,
        Integer classId,
        String className,
        String enterSchoolYear,
        User user,
        Integer id
) {
    public record User(
            String userName,
            Integer roleType,
            String picture,
            String surname,
            String name,
            Integer gender,
            String brithDay,
            String emailAddress,
            String telephone,
            String mobile,
            Integer state,
            Integer id
    ){
    }
}
