package org.bouncycastle.mime;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Strings;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class BoundaryLimitedInputStream extends InputStream {
    private final byte[] boundary;
    private final byte[] buf;
    private int bufOff;
    private int lastI;
    private final InputStream src;
    private int index = 0;
    private boolean ended = false;

    public BoundaryLimitedInputStream(InputStream inputStream, String str) {
        this.bufOff = 0;
        this.src = inputStream;
        this.boundary = Strings.toByteArray(str);
        this.buf = new byte[str.length() + 3];
        this.bufOff = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read() throws IOException {
        int i;
        int i2;
        int i3;
        if (this.ended) {
            return -1;
        }
        int i4 = this.index;
        int i5 = this.bufOff;
        if (i4 < i5) {
            byte[] bArr = this.buf;
            int i6 = i4 + 1;
            this.index = i6;
            i = bArr[i4] & 255;
            if (i6 < i5) {
                return i;
            }
            this.bufOff = 0;
            this.index = 0;
        } else {
            i = this.src.read();
        }
        this.lastI = i;
        if (i < 0) {
            return -1;
        }
        if (i == 13 || i == 10) {
            this.index = 0;
            if (i != 13) {
                i2 = this.src.read();
                if (i2 == 45) {
                    byte[] bArr2 = this.buf;
                    int i7 = this.bufOff;
                    this.bufOff = i7 + 1;
                    bArr2[i7] = 45;
                    i2 = this.src.read();
                }
                if (i2 != 45) {
                    byte[] bArr3 = this.buf;
                    int i8 = this.bufOff;
                    int i9 = i8 + 1;
                    this.bufOff = i9;
                    bArr3[i8] = 45;
                    while (true) {
                        if (this.bufOff - i9 == this.boundary.length || (i3 = this.src.read()) < 0) {
                            break;
                        }
                        byte[] bArr4 = this.buf;
                        int i10 = this.bufOff;
                        byte b = (byte) i3;
                        bArr4[i10] = b;
                        if (b != this.boundary[i10 - i9]) {
                            this.bufOff = i10 + 1;
                            break;
                        }
                        this.bufOff = i10 + 1;
                    }
                    if (this.bufOff - i9 == this.boundary.length) {
                        this.ended = true;
                        return -1;
                    }
                } else if (i2 >= 0) {
                    byte[] bArr5 = this.buf;
                    int i11 = this.bufOff;
                    this.bufOff = i11 + 1;
                    bArr5[i11] = (byte) i2;
                }
            } else {
                i2 = this.src.read();
                if (i2 == 10) {
                    byte[] bArr6 = this.buf;
                    int i12 = this.bufOff;
                    this.bufOff = i12 + 1;
                    bArr6[i12] = 10;
                    i2 = this.src.read();
                }
                if (i2 == 45) {
                }
                if (i2 != 45) {
                }
            }
        }
        return i;
    }
}
