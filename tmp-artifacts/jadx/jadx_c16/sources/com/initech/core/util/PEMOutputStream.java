package com.initech.core.util;

import com.initech.pki.util.Base64Util;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PEMOutputStream extends FilterOutputStream {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private int e;
    private int f;

    public PEMOutputStream(OutputStream outputStream) throws IOException {
        super(outputStream);
        this.c = new byte[4];
        this.d = new byte[3];
        this.e = 0;
        this.f = 0;
    }

    public PEMOutputStream(OutputStream outputStream, String str) throws IOException {
        super(outputStream);
        this.c = new byte[4];
        this.d = new byte[3];
        this.e = 0;
        this.f = 0;
        this.a = new String("-----BEGIN " + str + "-----\n").getBytes();
        this.b = new String("-----END " + str + "-----\n").getBytes();
        outputStream.write(this.a);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.e = 0;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int i = this.e;
        if (i > 0) {
            Base64Util.encodeBlock(this.d, i, this.c);
            ((FilterOutputStream) this).out.write(this.c, 0, 4);
        }
        ((FilterOutputStream) this).out.write(10);
        byte[] bArr = this.b;
        if (bArr != null) {
            ((FilterOutputStream) this).out.write(bArr);
            this.b = null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.d;
        int i2 = this.e;
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        this.e = i3;
        if (i3 >= bArr.length) {
            Base64Util.encodeBlock(bArr, 4, this.c);
            ((FilterOutputStream) this).out.write(this.c, 0, 4);
            int i4 = this.f + 4;
            this.f = i4;
            this.e = 0;
            if (i4 == 64) {
                ((FilterOutputStream) this).out.write(10);
                this.f = 0;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            write(bArr[i3]);
        }
    }
}
