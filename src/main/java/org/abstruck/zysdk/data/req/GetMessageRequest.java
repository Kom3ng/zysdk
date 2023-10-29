package org.abstruck.zysdk.data.req;

import com.google.gson.annotations.SerializedName;

//{"SessionId":"514200","Skip":0,"Take":1000}
public record GetMessageRequest(
        @SerializedName("SessionId")
        String sessionId,
        @SerializedName("Skip")
        Integer skip,
        @SerializedName("Take")
        Integer take
) {
}
