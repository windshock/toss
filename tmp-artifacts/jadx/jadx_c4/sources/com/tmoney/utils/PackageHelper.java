package com.tmoney.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PackageHelper {
    public static boolean isExistApp(Context context, String str) {
        for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(8192)) {
            int i = applicationInfo.flags & 1;
            if (i == 0 || i == 1) {
                if (applicationInfo.packageName.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
