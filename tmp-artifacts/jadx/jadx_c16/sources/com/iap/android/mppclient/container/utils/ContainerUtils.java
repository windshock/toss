package com.iap.android.mppclient.container.utils;

import android.app.Activity;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ContainerUtils {
    private static final String TAG = "ContainerUtils";

    public static boolean isACContainerExist() throws ClassNotFoundException {
        try {
            Class.forName("com.iap.android.mppclient.container.ACContainer");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean isActivityRunning(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        return !activity.isDestroyed();
    }
}
