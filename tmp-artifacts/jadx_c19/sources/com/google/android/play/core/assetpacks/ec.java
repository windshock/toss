package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ec {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("PackageStateCache");
    private final Context b;
    private int c = -1;

    ec(Context context) {
        this.b = context;
    }

    public final int a() {
        int i2;
        synchronized (this) {
            if (this.c == -1) {
                try {
                    this.c = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    a.b("The current version of the app could not be retrieved", new Object[0]);
                }
                i2 = this.c;
            } else {
                i2 = this.c;
            }
        }
        return i2;
    }
}
