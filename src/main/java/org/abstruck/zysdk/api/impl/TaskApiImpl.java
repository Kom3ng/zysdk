package org.abstruck.zysdk.api.impl;

import okhttp3.OkHttpClient;
import org.abstruck.zysdk.api.ApiUrls;
import org.abstruck.zysdk.api.TaskApi;
import org.abstruck.zysdk.data.req.AskForHelpRequest;
import org.abstruck.zysdk.data.req.GetStudentTaskListRequest;
import org.abstruck.zysdk.data.resp.QuestionView;
import org.abstruck.zysdk.data.resp.RevisingTask;
import org.abstruck.zysdk.data.resp.Task;
import org.abstruck.zysdk.data.resp.TaskCount;
import org.abstruck.zysdk.util.ApiRequestBuilderFactory;

public class TaskApiImpl implements TaskApi {
    public static final String appPackageName = "com.zykj.evaluation";
    private static final String appName = "com.zykj.evaluation";
    private final ApiRequestBuilderFactory factory;
    public TaskApiImpl(String appVersion, OkHttpClient httpClient){
        factory = new ApiRequestBuilderFactory.Builder()
                .appName(appName)
                .appVersion(appVersion)
                .httpClient(httpClient)
                .build();
    }
    @Override
    public TaskCount getMyTaskCount(String token) {
        return factory.create()
                .authorize(token)
                .url(ApiUrls.MY_TASK_COUNT)
                .get()
                .buildToExecutor()
                .apiExecuteWithResult(TaskCount.class);
    }

    @Override
    public Task[] getStudentTaskList(String token, GetStudentTaskListRequest request) {
        return factory.create()
                .authorize(token)
                .url(ApiUrls.GET_STUDENT_TASK_LIST)
                .post(request)
                .buildToExecutor()
                .apiExecuteWithResult(Task[].class);
    }

    @Override
    public RevisingTask getRevisingTask(String token, Integer id) {
        return factory.create()
                .url(ApiUrls.GET_REVISING_TASK)
                .queryParam("id",id)
                .get()
                .buildToExecutor()
                .apiExecuteWithResult(RevisingTask.class);
    }

    @Override
    public QuestionView getQuestionView(String token, Integer examId, Integer questionId) {
        return factory.create()
                .authorize(token)
                .url(ApiUrls.GET_QUESTION_VIEW)
                .queryParam("examId",examId)
                .queryParam("questionId",questionId)
                .get()
                .buildToExecutor()
                .apiExecuteWithResult(QuestionView.class);
    }

    @Override
    public Void askForHelp(String token, AskForHelpRequest request) {
        return factory.create()
                .url(ApiUrls.ASK_FOR_HELP)
                .authorize(token)
                .post(request)
                .buildToExecutor()
                .apiExecuteWithResult(Void.class);
    }
}
