package org.abstruck.zysdk.data.req;

//{"examState":[0],"maxResultCount":20,"skipCount":0,"submitAllow":1,"taskState":[0,3]}
public record GetStudentTaskListRequest(
        Integer[] examState,
        Integer maxResultCount,
        Integer skipCount,
        Integer submitAllow,
        Integer[] taskState
) {
}
