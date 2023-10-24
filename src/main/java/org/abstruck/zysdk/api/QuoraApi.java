package org.abstruck.zysdk.api;

import org.abstruck.zysdk.data.req.AddCatalogRequest;
import org.abstruck.zysdk.data.req.CreateSessionRequest;
import org.abstruck.zysdk.data.req.GetSessionsRequest;
import org.abstruck.zysdk.data.req.SearchQuoraRequest;
import org.abstruck.zysdk.data.resp.Catalog;
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
}
