package org.abstruck.zysdk.data.req;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AskForHelpRequest {

    @SerializedName("askForHelp" )
    private Boolean askForHelp;
    @SerializedName("examTaskId" )
    private Integer examTaskId;
    @SerializedName("questionId" )
    private Integer questionId;
}
