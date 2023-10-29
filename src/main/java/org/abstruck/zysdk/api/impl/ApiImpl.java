package org.abstruck.zysdk.api.impl;

import okhttp3.OkHttpClient;
import org.abstruck.zysdk.api.*;

public class ApiImpl implements Api {
    private final ManageApi manageApi;
    private final MistakeBookApi mistakeBookApi;
    private final QuoraApi quoraApi;
    private final TaskApi taskApi;
    private final CloudNoteApi cloudNoteApi;
    private final SelfStudyApi selfStudyApi;
    public ApiImpl(OkHttpClient httpClient){
        this.manageApi = new ManageApiImpl(httpClient);
        final String mistakeBookVersion = manage().checkUpdate(MistakeBookApiImpl.packageName, 0).appVersionId().toString();
        final String quoraVersion = manage().checkUpdate(QuoraApiImpl.packageName,0).appVersionId().toString();
        final String taskVersion = manage().checkUpdate(TaskApiImpl.appPackageName,0).appVersionId().toString();
        this.mistakeBookApi = new MistakeBookApiImpl(httpClient,mistakeBookVersion);
        this.quoraApi = new QuoraApiImpl(httpClient,quoraVersion);
        this.taskApi = new TaskApiImpl(taskVersion, httpClient);
        this.cloudNoteApi = null;
        this.selfStudyApi = null;
    }
    @Override
    public ManageApi manage() {
        return manageApi;
    }

    @Override
    public MistakeBookApi mistakeBook() {
        return mistakeBookApi;
    }

    @Override
    public QuoraApi quora() {
        return quoraApi;
    }

    @Override
    public TaskApi task() {
        return taskApi;
    }

    @Override
    public SelfStudyApi selfStudy() {
        return selfStudyApi;
    }

    @Override
    public CloudNoteApi cloudNote() {
        return cloudNoteApi;
    }

}
