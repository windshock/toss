package org.xbill.DNS;

import o.sz1;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Rcode {
    private static final sz1 onExtraCallback;

    static {
        sz1 sz1Var = new sz1("DNS Rcode", 2);
        onExtraCallback = sz1Var;
        sz1Var.onNavigationEvent(4095);
        sz1Var.onWarmupCompleted("RESERVED");
        sz1Var.onWarmupCompleted(true);
        sz1Var.IAuthTabCallback(0, "NOERROR");
        sz1Var.IAuthTabCallback(1, "FORMERR");
        sz1Var.IAuthTabCallback(2, "SERVFAIL");
        sz1Var.IAuthTabCallback(3, "NXDOMAIN");
        sz1Var.IAuthTabCallback(4, "NOTIMP");
        sz1Var.onExtraCallback(4, "NOTIMPL");
        sz1Var.IAuthTabCallback(5, "REFUSED");
        sz1Var.IAuthTabCallback(6, "YXDOMAIN");
        sz1Var.IAuthTabCallback(7, "YXRRSET");
        sz1Var.IAuthTabCallback(8, "NXRRSET");
        sz1Var.IAuthTabCallback(9, "NOTAUTH");
        sz1Var.IAuthTabCallback(10, "NOTZONE");
        sz1Var.IAuthTabCallback(16, "BADVERS");
        sz1Var.IAuthTabCallback(17, "BADKEY");
        sz1Var.IAuthTabCallback(18, "BADTIME");
        sz1Var.IAuthTabCallback(19, "BADMODE");
        sz1Var.IAuthTabCallback(20, "BADNAME");
        sz1Var.IAuthTabCallback(21, "BADALG");
        sz1Var.IAuthTabCallback(22, "BADTRUNC");
        sz1Var.IAuthTabCallback(23, "BADCOOKIE");
    }

    private Rcode() {
    }

    public static String onWarmupCompleted(int i) {
        return onExtraCallback.IAuthTabCallback(i);
    }

    public static String onNavigationEvent(int i) {
        if (i == 16) {
            return "BADSIG";
        }
        return onWarmupCompleted(i);
    }
}
