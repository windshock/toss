package com.skp.smarttouch.sem.tools.dao;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class STAuthInfo extends AbstractDao {
    protected String tid = null;
    protected boolean authResult = true;
    protected String authResult_msg = null;
    protected String authResult_code = null;

    public void setTid(String str) {
        this.tid = str;
    }

    public String getTid() {
        return this.tid;
    }

    public boolean isAuthResult() {
        return this.authResult;
    }

    public void setAuthResult(boolean z) {
        this.authResult = z;
    }

    public String getAuthResult_msg() {
        return this.authResult_msg;
    }

    public void setAuthResult_msg(String str) {
        this.authResult_msg = str;
    }

    public String getAuthResult_code() {
        return this.authResult_code;
    }

    public void setAuthResult_code(String str) {
        this.authResult_code = str;
    }
}
