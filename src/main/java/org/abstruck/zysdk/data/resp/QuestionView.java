package org.abstruck.zysdk.data.resp;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class QuestionView {

    @SerializedName("attachments" )
    private String attachments;
    @SerializedName("qstAnswers" )
    private Object qstAnswers;
    @SerializedName("analysis" )
    private Object analysis;
    @SerializedName("microClassToQuestionList" )
    private List<?> microClassToQuestionList;
    @SerializedName("microClassToStudentList" )
    private List<?> microClassToStudentList;
    @SerializedName("examDraft" )
    private Object examDraft;
    @SerializedName("revisingDraft" )
    private Object revisingDraft;
    @SerializedName("revisingResult" )
    private Integer revisingResult;
    @SerializedName("examAnswered" )
    private Boolean examAnswered;
    @SerializedName("revisingAnswerd" )
    private Boolean revisingAnswerd;
    @SerializedName("lastRoundRevisingRecords" )
    private List<?> lastRoundRevisingRecords;
    @SerializedName("typicalRightAnswers" )
    private Object typicalRightAnswers;
    @SerializedName("typicalErrorAnswers" )
    private Object typicalErrorAnswers;
    @SerializedName("isInMistakeBook" )
    private Boolean isInMistakeBook;
    @SerializedName("askForHelp" )
    private Boolean askForHelp;
    @SerializedName("number" )
    private Integer number;
    @SerializedName("path" )
    private String path;
    @SerializedName("itemType" )
    private Integer itemType;
    @SerializedName("qstFlows" )
    private List<QstFlows> qstFlows;
    @SerializedName("qstFlowsCount" )
    private Integer qstFlowsCount;
    @SerializedName("totalScore" )
    private Double totalScore;
    @SerializedName("totalAnswerScore" )
    private Double totalAnswerScore;
    @SerializedName("score" )
    private Double score;
    @SerializedName("originScore" )
    private Object originScore;
    @SerializedName("answerWithQuestion" )
    private Boolean answerWithQuestion;
    @SerializedName("answerList" )
    private List<AnswerList> answerList;
    @SerializedName("microClassList" )
    private Object microClassList;
    @SerializedName("id" )
    private Integer id;

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class QstFlows {
        @SerializedName("type" )
        private Integer type;
        @SerializedName("score" )
        private Double score;
        @SerializedName("missScore" )
        private Double missScore;
        @SerializedName("number" )
        private Integer number;
        @SerializedName("uuid" )
        private String uuid;
        @SerializedName("qstType" )
        private Integer qstType;
        @SerializedName("options" )
        private Object options;
        @SerializedName("subQuestions" )
        private List<SubQuestions> subQuestions;
        @SerializedName("getScore" )
        private Double getScore;
        @SerializedName("originScore" )
        private Object originScore;

        @NoArgsConstructor
        @AllArgsConstructor
        @Data
        public static class SubQuestions {
            @SerializedName("type" )
            private Integer type;
            @SerializedName("score" )
            private Double score;
            @SerializedName("missScore" )
            private Double missScore;
            @SerializedName("number" )
            private Integer number;
            @SerializedName("uuid" )
            private String uuid;
            @SerializedName("qstType" )
            private Integer qstType;
            @SerializedName("options" )
            private Object options;
            @SerializedName("subQuestions" )
            private Object subQuestions;
            @SerializedName("getScore" )
            private Double getScore;
            @SerializedName("originScore" )
            private Object originScore;
        }
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class AnswerList {
        @SerializedName("uuid" )
        private String uuid;
        @SerializedName("number" )
        private Integer number;
        @SerializedName("examAnswers" )
        private List<String> examAnswers;
        @SerializedName("examComments" )
        private List<String> examComments;
        @SerializedName("examMicroLessonComment" )
        private String examMicroLessonComment;
        @SerializedName("revisingAnswers" )
        private List<?> revisingAnswers;
        @SerializedName("revisingComments" )
        private List<?> revisingComments;
        @SerializedName("reviseMicroLessonComment" )
        private String reviseMicroLessonComment;
        @SerializedName("score" )
        private Double score;
        @SerializedName("originScore" )
        private Object originScore;
        @SerializedName("result" )
        private Integer result;
        @SerializedName("originResult" )
        private Object originResult;
        @SerializedName("displayAnswer" )
        private Integer displayAnswer;
        @SerializedName("whenShowAnswer" )
        private Integer whenShowAnswer;
        @SerializedName("whenShowMicroLesson" )
        private Integer whenShowMicroLesson;
        @SerializedName("examState" )
        private Integer examState;
        @SerializedName("taskState" )
        private Integer taskState;
    }
}
