package org.abstruck.zysdk.data.resp;

public record OssInfo(
        String strategy,
        // TODO appId有待分析 大概率是string或integer
        Object addId,
        String bucket,
        String endpoint,
        String region,
        String accessKeyId,
        String accessKeySecret,
        String securityToken,
        String expiration
) {
}
