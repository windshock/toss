package com.pgl.ssdk;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.File;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class w {
    private static String a;
    private static String b;

    public static String a() {
        if (TextUtils.isEmpty(b)) {
            b = b();
        }
        return b;
    }

    public static String a(Context context) {
        String str = a;
        if (str != null) {
            return str;
        }
        String string = Settings.Global.getString(context.getContentResolver(), "boot_count");
        a = string;
        return string;
    }

    private static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String b() {
        return (a("com.samsung.android.knox.SemPersonaManager") || a("com.samsung.android.knoxguard.KnoxGuardManager")) ? "samsung" : (a("androidhnext.Manifest") || a("androidhnext.R")) ? "honor" : (a("androidhwext.Manifest") || a("androidhwext.R")) ? "huawei" : (a("oppo.Manifest") || a("oppo.R") || a("oplus.Manifest") || a("oplus.R") || a("com.oneplus.Manifest") || a("com.oneplus.R")) ? "oppo" : (a("vivo.Manifest") || a("vivo.R")) ? "vivo" : (a("miui.Manifest") || a("miui.R") || a("miui.os.Build")) ? "xiaomi" : (a("lineageos.platform.Manifest") || a("lineageos.platform.R")) ? "lineage" : b("/system/framework/com.motorola.motosignature.jar") ? "moto" : (b("/system/framework/transsion-framework.jar") || b("/system/framework/transsion-services.jar")) ? "transsion" : "other";
    }

    private static boolean b(String str) {
        try {
            return new File(str).exists();
        } catch (Throwable unused) {
            return false;
        }
    }
}
