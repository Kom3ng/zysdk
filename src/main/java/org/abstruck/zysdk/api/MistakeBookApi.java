package org.abstruck.zysdk.api;

import org.abstruck.zysdk.data.req.*;
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
    Integer createOrUpdateTag(String token, CreateOrUpdateTagRequest request);
    Void setNote(String token, SetNoteRequest request);
    Void multiSetTads(String token, MultiSetTagsRequest request);
    Void addPictureNote(String token, AddPictureNoteRequest request);
    Integer addInMistakeBook(String token, AddInMistakeBookRequest request);
    Void removeFromMistakeBook(String token,Integer examId,Integer questionId,Boolean isRelatedGroup);
    Integer addCustomMistakeQstItem(String token,AddCustomMistakeQstItem request);
}
