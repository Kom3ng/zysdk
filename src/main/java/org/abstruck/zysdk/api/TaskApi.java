package org.abstruck.zysdk.api;

import org.abstruck.zysdk.data.req.AskForHelpRequest;
import org.abstruck.zysdk.data.req.GetStudentTaskListRequest;
import org.abstruck.zysdk.data.resp.QuestionView;
import org.abstruck.zysdk.data.resp.RevisingTask;
import org.abstruck.zysdk.data.resp.Task;
import org.abstruck.zysdk.data.resp.TaskCount;

public interface TaskApi {
    TaskCount getMyTaskCount(String token);
    Task[] getStudentTaskList(String token, GetStudentTaskListRequest request);
    RevisingTask getRevisingTask(String token,Integer id);
    QuestionView getQuestionView(String token,Integer examId,Integer questionId);
    Void askForHelp(String token, AskForHelpRequest request);
}
