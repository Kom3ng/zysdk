package org.abstruck.zysdk.data.resp;

public record QstInfo(
        Integer questionId,
        Integer examId,
        Integer number,
        String name,
        QstFlow[] qstFlows,
        String qstPath,
        String attachments,
        AnswerInfo[] answerInfos,
        Integer revisingResult,
        Object[] microClassToQuestionList,
        Object[] microClassToStudentList,
        Object[] typicalErrorAnswers,
        Object[] typicalRightAnswers,
        Integer itemType,
        Boolean isShowAnswer,
        Boolean isShowMicroLesson,
        Integer itemId,
        Integer bookId,
        String[] extraStems,
        Integer diff,
        Integer attainedLevel,
        Integer errorReason,
        Tag[] mistakeTags,
        String note,
        String[] pictureNote
) {
    public record QstFlow(
            Integer type,
            Double score,
            Double missScore,
            Integer number,
            String uuid,
            Integer qstType,
            Object options,
            QstFlow[] subQuestions,
            Double getScore,
            Double originScore
    ){
    }
    public record AnswerInfo(
            String uuid,
            Integer number,
            Integer result,
            String[] examAnswers,
            String[] examComments,
            String examMicroLessonComment,
            String[] revisingAnswers,
            String[] revisingComments,
            String revisingMicroLessonComment
    ){
    }
}
