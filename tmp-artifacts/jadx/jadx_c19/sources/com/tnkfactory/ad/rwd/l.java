package com.tnkfactory.ad.rwd;

import android.content.Context;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.tnkfactory.ad.rwd.ReferrerUtil;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class l implements InstallReferrerStateListener {
    public final /* synthetic */ InstallReferrerClient a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ReferrerUtil.OnResultListener c;

    public l(InstallReferrerClient installReferrerClient, Context context, ReferrerUtil.OnResultListener onResultListener) {
        this.a = installReferrerClient;
        this.b = context;
        this.c = onResultListener;
    }

    public final void onInstallReferrerServiceDisconnected() {
        this.c.onResult(-1);
    }

    public final void onInstallReferrerSetupFinished(int i2) throws NumberFormatException {
        if (i2 != 0) {
            if (i2 == 1) {
                this.c.onResult(1);
                return;
            } else {
                if (i2 != 2) {
                    return;
                }
                this.c.onResult(2);
                return;
            }
        }
        try {
            ReferrerDetails installReferrer = this.a.getInstallReferrer();
            String installReferrer2 = installReferrer.getInstallReferrer();
            long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
            long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
            Settings settings = Settings.INSTANCE;
            settings.setReferrerClickTime(this.b, referrerClickTimestampSeconds);
            settings.setReferrerInstallTime(this.b, installBeginTimestampSeconds);
            for (String str : installReferrer2.split("&")) {
                if (str.startsWith("tnk_ref=")) {
                    Settings.INSTANCE.setReferrer(this.b, Integer.parseInt(str.replace("tnk_ref=", "")));
                } else if (str.startsWith("tnk_sid=")) {
                    Settings.INSTANCE.setSnsIdReferrer(this.b, str.replace("tnk_sid=", ""));
                }
            }
            this.c.onResult(0);
            this.a.endConnection();
        } catch (RemoteException unused) {
            this.c.onResult(-3);
        }
    }
}
