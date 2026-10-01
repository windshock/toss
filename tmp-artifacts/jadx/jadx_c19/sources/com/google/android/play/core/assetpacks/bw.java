package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class bw extends FilterInputStream {
    private final ds a;
    private byte[] b;
    private long c;
    private boolean d;
    private boolean e;

    bw(InputStream inputStream) {
        super(inputStream);
        this.a = new ds();
        this.b = new byte[4096];
        this.d = false;
        this.e = false;
    }

    private final int e(byte[] bArr, int i2, int i3) throws IOException {
        return Math.max(0, super.read(bArr, i2, i3));
    }

    private final boolean f(int i2) throws IOException {
        int iE = e(this.b, 0, i2);
        if (iE != i2) {
            int i3 = i2 - iE;
            if (e(this.b, iE, i3) != i3) {
                this.a.b(this.b, 0, iE);
                return false;
            }
        }
        this.a.b(this.b, 0, i2);
        return true;
    }

    final long a() {
        return this.c;
    }

    final es b() throws IOException {
        byte[] bArr;
        if (this.c > 0) {
            do {
                bArr = this.b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.d || this.e) {
            return new bq(null, -1L, -1, false, false, null);
        }
        if (!f(30)) {
            this.d = true;
            return this.a.c();
        }
        es esVarC = this.a.c();
        if (esVarC.d()) {
            this.e = true;
            return esVarC;
        }
        if (esVarC.b() == 4294967295L) {
            throw new ck("Files bigger than 4GiB are not supported.");
        }
        int iA = this.a.a() - 30;
        int length = this.b.length;
        long j = iA;
        if (j > length) {
            do {
                length += length;
            } while (length < j);
            this.b = Arrays.copyOf(this.b, length);
        }
        if (!f(iA)) {
            this.d = true;
            return this.a.c();
        }
        es esVarC2 = this.a.c();
        this.c = esVarC2.b();
        return esVarC2;
    }

    final boolean c() {
        return this.e;
    }

    final boolean d() {
        return this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j = this.c;
        if (j <= 0 || this.d) {
            return -1;
        }
        int iE = e(bArr, i2, (int) Math.min(j, i3));
        this.c -= iE;
        if (iE != 0) {
            return iE;
        }
        this.d = true;
        return 0;
    }
}
