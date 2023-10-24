package org.abstruck.zysdk.data.resp;

public record MessageList(
        Integer totalCount,
        Message[] items

) {
    public record Message(
            String title,
            Integer type,
            Boolean isRead,
            Parameter parameter,
            SenderInfo senderInfo,
            Boolean isDeleted,
            String deleteUserId,
            String deletionTime,
            String lastModificationTime,
            String lastModifierUserId,
            String creationTime,
            Integer creatorUserId,
            Integer id
    ){
        public record Parameter(
                Integer id
        ){

        }
        public record SenderInfo(
                String fullName,
                Integer gender,
                String picture,
                Integer roleType
        ){

        }
    }
}
