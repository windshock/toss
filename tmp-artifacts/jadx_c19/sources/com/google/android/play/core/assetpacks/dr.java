package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class dr extends InputStream {
    private final Enumeration a;
    private InputStream b;

    public dr(Enumeration enumeration) throws IOException {
        this.a = enumeration;
        a();
    }

    final void a() throws IOException {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
        }
        if (this.a.hasMoreElements()) {
            this.b = new FileInputStream((File) this.a.nextElement());
        } else {
            this.b = null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
            this.b = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.b;
            if (inputStream == null) {
                return -1;
            }
            int i2 = inputStream.read();
            if (i2 != -1) {
                return i2;
            }
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.b == null) {
            return -1;
        }
        if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 == 0) {
            return 0;
        }
        do {
            int i4 = this.b.read(bArr, i2, i3);
            if (i4 > 0) {
                return i4;
            }
            a();
        } while (this.b != null);
        return -1;
    }
}
