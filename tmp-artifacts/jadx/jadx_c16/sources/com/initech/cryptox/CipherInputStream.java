package com.initech.cryptox;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class CipherInputStream extends javax.crypto.CipherInputStream {
    private static int RAW_BUFFER_SIZE = 1024;
    private int bEnd;
    private int bStart;
    private int blockSize;
    private byte[] buffer;
    protected Cipher cipher;
    private boolean finalCalled;
    private byte[] rawBuffer;

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public CipherInputStream(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.finalCalled = false;
        this.blockSize = 0;
        this.rawBuffer = null;
        this.bStart = 0;
        this.bEnd = 0;
        this.buffer = null;
        this.cipher = cipher;
        this.buffer = new byte[cipher.getOutputSize(RAW_BUFFER_SIZE)];
        this.rawBuffer = new byte[RAW_BUFFER_SIZE];
        this.bStart = 0;
        this.bEnd = 0;
    }

    protected CipherInputStream(InputStream inputStream) {
        this(inputStream, new NullCipher());
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.bStart == this.bEnd && readBlock() < 0) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i = this.bStart;
        this.bStart = i + 1;
        return bArr[i] & 255;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.bStart >= this.bEnd && readBlock() == -1) {
            return -1;
        }
        int i3 = this.bEnd;
        int i4 = this.bStart;
        int i5 = i3 - i4;
        if (i2 >= i5) {
            i2 = i5;
        }
        if (i2 != 0 && bArr != null) {
            System.arraycopy(this.buffer, i4, bArr, i, i2);
        }
        this.bStart += i2;
        return i2;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        int i;
        if (j < 0) {
            return 0L;
        }
        byte[] bArr = new byte[RAW_BUFFER_SIZE];
        long j2 = 0;
        while (j > 0) {
            if (j > RAW_BUFFER_SIZE) {
                i = read(bArr);
            } else {
                i = read(bArr, 0, (int) j);
            }
            if (i != -1) {
                break;
            }
            long j3 = i;
            j2 += j3;
            j -= j3;
        }
        return j2;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.bEnd - this.bStart;
    }

    @Override // javax.crypto.CipherInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.finalCalled) {
            this.finalCalled = true;
            int outputSize = this.cipher.getOutputSize(0);
            byte[] bArr = this.buffer;
            if (bArr != null) {
                if (outputSize > bArr.length) {
                    this.buffer = new byte[outputSize];
                }
                try {
                    this.cipher.doFinal(this.buffer, 0);
                } catch (Exception e) {
                    throw new IOException(e.toString());
                }
            } else {
                try {
                    this.cipher.doFinal();
                } catch (Exception e2) {
                    throw new IOException(e2.toString());
                }
            }
        }
        super.close();
    }

    private int readBlock() throws IOException {
        int iAvailable = super.available();
        byte[] bArr = this.rawBuffer;
        if (iAvailable > bArr.length) {
            iAvailable = bArr.length;
        } else if (iAvailable == 0) {
            iAvailable = 1;
        }
        int i = super.read(bArr, 0, iAvailable);
        if (i == -1) {
            if (this.finalCalled) {
                return i;
            }
            this.finalCalled = true;
            int outputSize = this.cipher.getOutputSize(0);
            if (outputSize > this.buffer.length) {
                this.buffer = new byte[outputSize];
            }
            try {
                int iDoFinal = this.cipher.doFinal(this.buffer, 0);
                if (iDoFinal == 0) {
                    return -1;
                }
                this.bEnd = iDoFinal;
                this.bStart = 0;
                return iDoFinal;
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2.toString());
            }
        }
        try {
            int iUpdate = this.cipher.update(this.rawBuffer, 0, i, this.buffer, 0);
            if (iUpdate == 0) {
                return readBlock();
            }
            this.bStart = 0;
            this.bEnd = iUpdate;
            return iUpdate;
        } catch (javax.crypto.ShortBufferException e3) {
            throw new IOException(e3.getMessage());
        }
    }
}
