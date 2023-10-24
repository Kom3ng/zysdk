package org.abstruck.zysdk.data.resp;

public record Course(
        Integer id,
        Teacher[] teacherUsers,
        Topic[] topics,
        Integer classRoomId,
        String title,
        Integer subscribers,
        Integer state,
        Integer createUserId,
        String createTime,
        Integer editUserId,
        String editTime

) {
    public record Teacher(
            Integer id,
            String fullName
    ){
    }

    public record Topic(
            String name,
            String content,
            Integer sort,
            Boolean isActive,
            Boolean system,
            Integer platformId,
            String lastModificationTime,
            String lastModifierUserId,
            String creationTime,
            Integer creatorUserId,
            Integer id
    ){
    }
}
