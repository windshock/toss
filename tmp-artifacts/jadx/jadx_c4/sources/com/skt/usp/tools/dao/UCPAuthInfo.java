package com.skt.usp.tools.dao;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class UCPAuthInfo extends AbstractDao {
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

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("UCPAuthInfo [");
        String str3 = "";
        if (this.tid != null) {
            str = "tid=" + this.tid + ", ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("authResult=");
        sb.append(this.authResult);
        sb.append(", ");
        if (this.authResult_msg != null) {
            str2 = "authResult_msg=" + this.authResult_msg + ", ";
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.authResult_code != null) {
            str3 = "authResult_code=" + this.authResult_code;
        }
        sb.append(str3);
        sb.append("]");
        return sb.toString();
    }
}
