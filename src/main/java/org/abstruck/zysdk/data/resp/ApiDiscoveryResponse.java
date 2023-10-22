package org.abstruck.zysdk.data.resp;

public record ApiDiscoveryResponse(
        String name,
        String server,
        String lcid
) {
}
