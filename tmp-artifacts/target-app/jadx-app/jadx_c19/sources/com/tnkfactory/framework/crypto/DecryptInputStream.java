package com.tnkfactory.framework.crypto;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class DecryptInputStream extends FilterInputStream {
    public Cryptor a;

    public DecryptInputStream(InputStream inputStream, Cryptor cryptor) {
        super(inputStream);
        this.a = cryptor;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        return this.a.decrypt(super.read());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = super.read(bArr, i2, i3);
        if (i4 > 0) {
            this.a.decrypt(bArr, i2, i4);
        }
        return i4;
    }
}
