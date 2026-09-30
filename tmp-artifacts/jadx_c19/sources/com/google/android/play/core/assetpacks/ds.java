package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ds {
    private byte[] a = new byte[4096];
    private int b;
    private long c;
    private long d;
    private int e;
    private int f;
    private int g;
    private boolean h;

    /* renamed from: i, reason: collision with root package name */
    private String f17i;

    public ds() {
        d();
    }

    private final int e(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.b;
        if (i5 >= i2) {
            return 0;
        }
        int iMin = Math.min(i4, i2 - i5);
        System.arraycopy(bArr, i3, this.a, this.b, iMin);
        int i6 = this.b + iMin;
        this.b = i6;
        if (i6 < i2) {
            return -1;
        }
        return iMin;
    }

    public final int a() {
        return this.f;
    }

    public final int b(byte[] bArr, int i2, int i3) {
        int iE = e(30, bArr, i2, i3);
        if (iE == -1) {
            return -1;
        }
        if (this.c == -1) {
            long jC = br.c(this.a, 0);
            this.c = jC;
            if (jC == 67324752) {
                this.h = false;
                this.d = br.c(this.a, 18);
                this.g = br.a(this.a, 8);
                this.e = br.a(this.a, 26);
                int iA = this.e + 30 + br.a(this.a, 28);
                this.f = iA;
                int length = this.a.length;
                if (length < iA) {
                    do {
                        length += length;
                    } while (length < iA);
                    this.a = Arrays.copyOf(this.a, length);
                }
            } else {
                this.h = true;
            }
        }
        int iE2 = e(this.f, bArr, i2 + iE, i3 - iE);
        if (iE2 == -1) {
            return -1;
        }
        if (!this.h && this.f17i == null) {
            this.f17i = new String(this.a, 30, this.e);
        }
        return iE + iE2;
    }

    public final es c() {
        int i2 = this.b;
        int i3 = this.f;
        if (i2 < i3) {
            return new bq(this.f17i, this.d, this.g, true, this.h, Arrays.copyOf(this.a, i2));
        }
        bq bqVar = new bq(this.f17i, this.d, this.g, false, this.h, Arrays.copyOf(this.a, i3));
        d();
        return bqVar;
    }

    public final void d() {
        this.b = 0;
        this.e = -1;
        this.c = -1L;
        this.h = false;
        this.f = 30;
        this.d = -1L;
        this.g = -1;
        this.f17i = null;
    }
}
