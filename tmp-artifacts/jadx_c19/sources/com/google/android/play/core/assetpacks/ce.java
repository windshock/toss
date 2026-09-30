package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.model.AssetPackStatus;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ce extends dg {
    final int a;
    final long b;
    final String c;
    final String d;
    final int e;
    final int f;
    final int g;
    final long h;

    /* renamed from: i, reason: collision with root package name */
    final int f13i;
    final InputStream j;

    ce(int i2, String str, int i3, long j, String str2, String str3, int i4, int i5, int i6, long j2, @AssetPackStatus int i7, InputStream inputStream) {
        super(i2, str);
        this.a = i3;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = j2;
        this.f13i = i7;
        this.j = inputStream;
    }

    final boolean a() {
        return this.f + 1 == this.g;
    }
}
