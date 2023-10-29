package org.abstruck.zysdk.data.resp;

import com.google.gson.annotations.SerializedName;

public record TaskCount(
        @SerializedName("Testing")
        Integer testing,
        @SerializedName("WaitExamCorrect")
        Integer waitExamCorrect,
        @SerializedName("ExamCorrecting")
        Integer examCorrecting,
        @SerializedName("Revising")
        Integer revising,
        @SerializedName("WaitRevisingCorrect")
        Integer waitRevisingCorrect,
        @SerializedName("RevisingCorrecting")
        Integer revisingCorrecting,
        @SerializedName("End")
        Integer end
) {
}
