package org.abstruck.zysdk.api;

import org.abstruck.zysdk.data.req.*;
import org.abstruck.zysdk.data.resp.Catalog;
import org.abstruck.zysdk.data.resp.Message;
import org.abstruck.zysdk.data.resp.QuoraTopic;
import org.abstruck.zysdk.data.resp.Session;

public interface QuoraApi {
    Catalog[] getCatalogs(String token);
    QuoraTopic[] getQuoraTopics(String token);
    Session[] getSessions(String token, GetSessionsRequest request);
    Void deleteCatalog(String token,Integer id);
    Integer addCatalog(String token, AddCatalogRequest request);
    Object[] searchQuora(String token, SearchQuoraRequest request);
    Integer createSession(String token, CreateSessionRequest request);
    Session getSessionById(String token, Integer id);
    Message[] getMessages(String token, GetMessageRequest request);
    Void resetReadState(String token,Integer id);
    Void updateCatalog(String token,AddCatalogRequest request);
    Session[] getCollectSessions(String token,GetCollectSessionsRequest request);
    Void setQuoraCollect(String token,SetQuoraCollectRequest request);
}
