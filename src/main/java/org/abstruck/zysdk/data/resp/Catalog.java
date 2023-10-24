package org.abstruck.zysdk.data.resp;

public record Catalog(
        Integer id,
        String name,
        Boolean hasNewMsgs,
        Integer newMsgCount,
        Boolean hasNewParimaryMsgs,
        Integer newParimarMsgCount,
        Integer sort


) {
}
