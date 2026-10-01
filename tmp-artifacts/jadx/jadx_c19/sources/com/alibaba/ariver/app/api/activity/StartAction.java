package com.alibaba.ariver.app.api.activity;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum StartAction {
    SHOW_LOADING,
    SHOW_ERROR,
    DIRECT_START;

    public boolean needWaitIpc() {
        return this == SHOW_LOADING;
    }
}
