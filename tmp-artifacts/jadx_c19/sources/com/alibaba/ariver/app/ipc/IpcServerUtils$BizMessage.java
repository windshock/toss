package com.alibaba.ariver.app.ipc;

import android.os.Message;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class IpcServerUtils$BizMessage {
    public String biz;
    public Message msg;

    IpcServerUtils$BizMessage(String str, Message message) {
        this.biz = str;
        this.msg = message;
    }
}
