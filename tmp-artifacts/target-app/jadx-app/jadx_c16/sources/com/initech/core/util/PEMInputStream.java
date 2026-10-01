package com.initech.core.util;

import com.initech.core.INISAFECore;
import java.io.BufferedReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PEMInputStream extends FilterInputStream {
    private String a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private int e;
    private int f;
    private BufferedReader g;

    public PEMInputStream(InputStream inputStream) throws IOException {
        super(inputStream);
        this.c = new byte[4];
        this.d = new byte[3];
        this.e = -1;
        this.f = -1;
    }

    public PEMInputStream(InputStream inputStream, String str) throws IOException {
        String line;
        super(inputStream);
        this.c = new byte[4];
        this.d = new byte[3];
        this.e = -1;
        this.f = -1;
        this.a = new String("-----BEGIN " + str + "-----");
        this.b = new String("-----END " + str + "-----").getBytes();
        this.g = new BufferedReader(new InputStreamReader(((FilterInputStream) this).in, "ISO8859_1"));
        do {
            line = this.g.readLine();
            if (line == null) {
                INISAFECore.CoreLogger(1, "too short data");
                throw new IOException("too short data");
            }
        } while (!line.equals(this.a));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.e = 0;
        BufferedReader bufferedReader = this.g;
        if (bufferedReader != null) {
            bufferedReader.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        r9.e = com.initech.pki.util.Base64Util.decodeBlock(r9.c, r9.d);
        r0 = r9.d;
        r1 = r9.f;
        r9.f = r1 + 1;
        r0 = r0[r1];
     */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read() throws IOException {
        byte b;
        int i = this.f;
        if (i >= 0 && i <= 2 && i < this.e) {
            byte[] bArr = this.d;
            this.f = i + 1;
            b = bArr[i];
        } else if (this.e != 0) {
            this.e = 0;
            this.f = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= 4) {
                    break;
                }
                int i3 = this.g.read();
                INISAFECore.CoreLogger(4, "read: " + i3 + "=" + new String(new char[]{(char) i3}));
                if (i3 != -1) {
                    byte[] bArr2 = this.b;
                    if (bArr2 != null && i3 == bArr2[0]) {
                        if (i2 <= 0) {
                            this.g.skip(bArr2.length - 1);
                            return -1;
                        }
                        INISAFECore.CoreLogger(1, "Unexpected end of data encountered");
                        throw new IOException("Unexpected end of data encountered");
                    }
                    if (43 <= i3 && i3 <= 122) {
                        this.c[i2] = (byte) i3;
                        i2++;
                    }
                } else if (i2 > 0) {
                    INISAFECore.CoreLogger(1, "Unexpected end of data encountered");
                    throw new IOException("Unexpected end of data encountered");
                }
            }
        } else {
            return -1;
        }
        return b & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            int i4 = read();
            if (i4 == -1) {
                if (i3 == i) {
                    return -1;
                }
                return i3 - i;
            }
            bArr[i3] = (byte) i4;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && this.g.read() != -1) {
            j2++;
        }
        return j2;
    }
}
