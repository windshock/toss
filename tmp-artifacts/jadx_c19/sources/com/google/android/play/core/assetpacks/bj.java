package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class bj extends InputStream {
    private final InputStream a;
    private long b;

    bj(InputStream inputStream, long j) {
        this.a = inputStream;
        this.b = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.a.close();
        this.b = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j = this.b;
        if (j <= 0) {
            return -1;
        }
        this.b = j - 1;
        return this.a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j = this.b;
        if (j <= 0) {
            return -1;
        }
        int i4 = this.a.read(bArr, i2, (int) Math.min(i3, j));
        if (i4 != -1) {
            this.b -= i4;
        }
        return i4;
    }
}
