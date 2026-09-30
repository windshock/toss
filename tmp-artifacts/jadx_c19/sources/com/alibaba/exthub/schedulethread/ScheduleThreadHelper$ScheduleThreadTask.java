package com.alibaba.exthub.schedulethread;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ScheduleThreadHelper$ScheduleThreadTask {
    public String apiName;
    public String appId;
    public ExecutorType executorType;
    public volatile boolean isWaitTask;
    public Runnable runnable;
    public long startTime = SystemClock.elapsedRealtime();

    public ScheduleThreadHelper$ScheduleThreadTask(String str, String str2, ExecutorType executorType, Runnable runnable) {
        this.appId = str;
        this.apiName = str2;
        this.executorType = executorType;
        this.runnable = runnable;
    }

    public long getWaitTime() {
        return SystemClock.elapsedRealtime() - this.startTime;
    }

    public String toString() {
        return "{appId='" + this.appId + "', apiName='" + this.apiName + "', executorType=" + this.executorType.name() + ", waitTime=" + getWaitTime() + '}';
    }

    public boolean equals(Object obj) {
        if (ScheduleThreadHelper.access$800()) {
            if (!(obj instanceof ScheduleThreadHelper$ScheduleThreadTask)) {
                return false;
            }
            ScheduleThreadHelper$ScheduleThreadTask scheduleThreadHelper$ScheduleThreadTask = (ScheduleThreadHelper$ScheduleThreadTask) obj;
            return TextUtils.equals(this.appId, scheduleThreadHelper$ScheduleThreadTask.appId) && TextUtils.equals(this.apiName, scheduleThreadHelper$ScheduleThreadTask.apiName) && this.executorType == scheduleThreadHelper$ScheduleThreadTask.executorType && this.startTime == scheduleThreadHelper$ScheduleThreadTask.startTime;
        }
        return super.equals(obj);
    }

    public ScheduleThreadHelper$ScheduleThreadTask createEventTraceTask() {
        ScheduleThreadHelper$ScheduleThreadTask scheduleThreadHelper$ScheduleThreadTask = new ScheduleThreadHelper$ScheduleThreadTask(this.appId, this.apiName, this.executorType, null);
        scheduleThreadHelper$ScheduleThreadTask.startTime = this.startTime;
        scheduleThreadHelper$ScheduleThreadTask.isWaitTask = false;
        return scheduleThreadHelper$ScheduleThreadTask;
    }
}
