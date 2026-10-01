package com.skt.usp.tools;

import android.content.Context;
import com.skt.usp.UCPApiConstants;
import com.skt.usp.utils.UCPLog;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class UCPLibraryFeatures {
    private static boolean a = true;
    private static boolean b = true;
    private static final String c = "2.30";
    private static boolean d = true;
    private static int e = -9998;
    private static int f = 7;

    public static boolean isRELEASE() {
        return a;
    }

    public static void setRELEASE(boolean z) {
        a = z;
        if (b) {
            a = true;
        }
    }

    public static boolean isREAL_SERVER() {
        return b;
    }

    public static void setREAL_SERVER(boolean z) {
        b = z;
        if (z) {
            a = true;
        }
    }

    public static String getUCPVersion() {
        return c;
    }

    public static boolean isMultiUiccAvailableYn() {
        return d;
    }

    public static void setMultiUiccAvailableYn(boolean z) {
        d = z;
    }

    public static void setUcpSubscriptionId(int i) {
        if (i <= 0) {
            e = UCPApiConstants.DEFAULT_SUB_ID;
        } else {
            e = i;
        }
    }

    public static int getUcpSubscriptionId() {
        return e;
    }

    public static void setUcpLogLevel(Context context, int i) {
        f = i;
        UCPLog.setContext(context);
    }

    public static int getUcpLogLevel() {
        return f;
    }
}
