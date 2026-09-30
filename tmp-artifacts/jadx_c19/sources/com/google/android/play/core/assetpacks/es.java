package com.google.android.play.core.assetpacks;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class es {
    es() {
    }

    abstract int a();

    abstract long b();

    abstract String c();

    abstract boolean d();

    abstract boolean e();

    abstract byte[] f();

    final boolean g() {
        if (c() == null) {
            return false;
        }
        return c().endsWith("/");
    }

    final boolean h() {
        return a() == 0;
    }
}
