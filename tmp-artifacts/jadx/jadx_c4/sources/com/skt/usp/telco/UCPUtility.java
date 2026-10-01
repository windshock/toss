package com.skt.usp.telco;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.skt.usp.tools.network.usp.USPManager;
import com.skt.usp.utils.UCPLog;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class UCPUtility {
    private static final String a = "com.skp.seio";
    private static final String b = "market://details?id=";

    public static String getStagingYnUSP(Context context) {
        return USPManager.getInstance(context).getStagingYn();
    }

    public static boolean setServerType(Context context, boolean z) {
        UCPLog.info(">> setServerType()");
        UCPLog.debug("++ isStaging : [%s]", Boolean.valueOf(z));
        try {
            if (context == null) {
                throw new IllegalArgumentException("invalid context");
            }
            USPManager.getInstance(context).setStagingYn(z ? "Y" : "N");
            return true;
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            return false;
        }
    }

    public static boolean installSEIOAgentByStore(Context context) {
        try {
            return a(context, "com.skp.seio");
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            return false;
        }
    }

    private static boolean a(Context context, String str) {
        String str2 = b + str;
        if (str2 == null || str2.length() <= 0) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
        intent.addFlags(268435456);
        context.startActivity(intent);
        return false;
    }

    public static boolean isInstalledSeioAgent(Context context) {
        String strB = b(context, "com.skp.seio");
        if (strB != null && strB.trim().length() > 0) {
            return true;
        }
        UCPLog.debug("-- return strInstallVersionName is [%s]..!!", strB);
        return false;
    }

    public static String getPackageName(Context context) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("context is null");
            }
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            return null;
        }
    }

    private static String b(Context context, String str) {
        try {
            String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            UCPLog.debug("-- return() strRetVal : " + str2);
            return str2;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return "";
        }
    }

    public static int getApplicationVersionCode(Context context, String str) {
        try {
            int i = context.getPackageManager().getPackageInfo(str, 0).versionCode;
            UCPLog.debug("-- return() strRetVal : " + i);
            return i;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return 0;
        }
    }

    public static String getApplicationVersionName(Context context, String str) {
        try {
            String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            UCPLog.debug("-- return() strRetVal : " + str2);
            return str2;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return null;
        }
    }

    private static int a(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
