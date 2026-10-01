package com.google.android.play.core.assetpacks;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ck extends RuntimeException {
    final int a;

    ck(String str) {
        super(str);
        this.a = -1;
    }

    ck(String str, int i2) {
        super(str);
        this.a = i2;
    }

    ck(String str, Exception exc) {
        super(str, exc);
        this.a = -1;
    }

    ck(String str, Exception exc, int i2) {
        super(str, exc);
        this.a = i2;
    }
}
