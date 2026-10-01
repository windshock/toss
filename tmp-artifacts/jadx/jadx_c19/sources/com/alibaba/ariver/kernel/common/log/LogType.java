package com.alibaba.ariver.kernel.common.log;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum LogType {
    CONNECTION(RtspHeaders.CONNECTION),
    API("API"),
    EVENT("Event"),
    PAGE("Page"),
    WORKER("Worker"),
    APP("Application"),
    CUSTOM("Custom"),
    ErrorNo("ErrorNo"),
    Caprimulgus("Caprimulgus"),
    NAVIGATION_BAR("NavigationBar"),
    APPXLIFECYCLE("AppxLifeCycle"),
    TRACEPAIR("TracePair");

    private String mLogType;

    LogType(String str) {
        this.mLogType = str;
    }

    public String getTypeSting() {
        return this.mLogType;
    }
}
