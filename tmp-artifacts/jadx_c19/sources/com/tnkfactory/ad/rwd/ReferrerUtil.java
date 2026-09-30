package com.tnkfactory.ad.rwd;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ReferrerUtil {
    public static final int FEATURE_NOT_SUPPORTED = 2;
    public static final int NOT_ADD_DEPENDENCIES = -2;
    public static final int OK = 0;
    public static final int SERVICE_DISCONNECTED = -1;
    public static final int SERVICE_UNAVAILABLE = 1;
    public static final int VERIFY_FAILED_ERROR = -3;

    public interface OnResultListener {
        void onResult(int i2);
    }

    public static void startReferrer(Context context, OnResultListener onResultListener) {
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
            installReferrerClientBuild.startConnection(new l(installReferrerClientBuild, context, onResultListener));
        } catch (NoClassDefFoundError unused) {
            onResultListener.onResult(-2);
            throw new NoClassDefFoundError("Add the dependencies of the Google Play Install Referrer API.");
        } catch (SecurityException unused2) {
        }
    }
}
