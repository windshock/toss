package com.initech.core.crypto;

import com.initech.cryptox.Cipher;
import com.initech.cryptox.IllegalBlockSizeException;
import com.initech.cryptox.NullCipher;
import java.io.IOException;
import java.io.InputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherInputStream;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CoreCipherInputStream extends CipherInputStream {
    private Cipher a;
    private InputStream b;
    private byte[] c;
    private boolean d;
    private byte[] e;
    private int f;
    private int g;

    protected CoreCipherInputStream(InputStream inputStream) {
        super(inputStream);
        this.c = new byte[512];
        this.d = false;
        this.f = 0;
        this.g = 0;
        this.b = inputStream;
        this.a = new NullCipher();
    }

    public CoreCipherInputStream(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.c = new byte[512];
        this.d = false;
        this.f = 0;
        this.g = 0;
        this.b = inputStream;
        this.a = cipher;
    }

    private int a() throws BadPaddingException, IOException {
        if (this.d) {
            return -1;
        }
        int i = this.b.read(this.c);
        if (i != -1) {
            try {
                this.e = this.a.update(this.c, 0, i);
            } catch (IllegalStateException unused) {
                this.e = null;
            }
            this.f = 0;
            byte[] bArr = this.e;
            if (bArr == null) {
                this.g = 0;
            } else {
                this.g = bArr.length;
            }
            return this.g;
        }
        this.d = true;
        try {
            this.e = this.a.doFinal();
        } catch (IllegalBlockSizeException | com.initech.cryptox.BadPaddingException unused2) {
            this.e = null;
        }
        byte[] bArr2 = this.e;
        if (bArr2 == null) {
            return -1;
        }
        this.f = 0;
        int length = bArr2.length;
        this.g = length;
        return length;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.g - this.f;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.b.close();
        try {
            this.a.doFinal();
        } catch (com.initech.cryptox.BadPaddingException | IllegalBlockSizeException | ArrayIndexOutOfBoundsException unused) {
        }
        this.f = 0;
        this.g = 0;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f >= this.g) {
            int iA = 0;
            while (iA == 0) {
                try {
                    iA = a();
                } catch (BadPaddingException unused) {
                    return -1;
                }
            }
            if (iA == -1) {
                return -1;
            }
        }
        byte[] bArr = this.e;
        int i = this.f;
        this.f = i + 1;
        return bArr[i] & 255;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f >= this.g) {
            int iA = 0;
            while (iA == 0) {
                try {
                    iA = a();
                } catch (BadPaddingException unused) {
                    return -1;
                }
            }
            if (iA == -1) {
                return -1;
            }
        }
        if (i2 <= 0) {
            return 0;
        }
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i2 >= i5) {
            i2 = i5;
        }
        if (bArr != null) {
            System.arraycopy(this.e, i4, bArr, i, i2);
        }
        this.f += i2;
        return i2;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        int i = this.g;
        int i2 = this.f;
        long j2 = i - i2;
        if (j > j2) {
            j = j2;
        }
        if (j < 0) {
            return 0L;
        }
        this.f = (int) (i2 + j);
        return j;
    }
}
