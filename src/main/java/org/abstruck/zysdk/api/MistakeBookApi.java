package org.abstruck.zysdk.api;

import org.abstruck.zysdk.data.req.RemoveMistakeItemsRequest;
import org.abstruck.zysdk.data.req.SearchMistakeQstItemRequest;
import org.abstruck.zysdk.data.resp.MistakeBook;
import org.abstruck.zysdk.data.resp.QstInfo;
import org.abstruck.zysdk.data.resp.Qsts;
import org.abstruck.zysdk.data.resp.Tag;

public interface MistakeBookApi {
    Tag[] getMyTags(String token);
    Void removeMistakeItems(String token, RemoveMistakeItemsRequest request);
    QstInfo getMistakeQstItemDetailInfo(String token,Integer itemId);
    QstInfo getCustomMistakeQstItemDetailInfo(String token,Integer itemId);
    Qsts searchMistakeQstItem(String token, SearchMistakeQstItemRequest request);
    MistakeBook[] getMyMistakeBooks(String token);
}
