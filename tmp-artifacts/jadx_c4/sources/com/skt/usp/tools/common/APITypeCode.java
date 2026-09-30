package com.skt.usp.tools.common;

import com.skt.usp.UCPApiConstants;
import com.skt.usp.ucp.auth.UCPAuth;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public enum APITypeCode {
    NONE("NONE", "NONE"),
    URMS_GET_PACKAGE_ALL_RIGHT("URMS", "GetPackageAllRight"),
    URMS_GET_PACKAGE_ALL_RIGHT_PREF("URMS", "GetPackageAllRightPref"),
    MGR_PUSH_APPLET_SET_ACCESS_RULE_ARAM("MGR_PUSH_APPLET", UCPApiConstants.ARAM_URL),
    UCP_API_REQ_EFREFRESH("MGR_PUSH_APPLET", UCPApiConstants.REQ_EFREFRESH_URL),
    UCP_AUTH_UCP_API_AVAILABLE_YN(UCPAuth.COMPONENT_ID, "ucpApiYn");

    private String a;
    private String b;
    private boolean c;

    APITypeCode(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = true;
    }

    APITypeCode(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public String getCompId() {
        return this.a;
    }

    public String getMethodName() {
        return this.b;
    }

    public boolean isAsync() {
        return this.c;
    }
}
