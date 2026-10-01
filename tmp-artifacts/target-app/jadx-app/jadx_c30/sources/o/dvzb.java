package o;

import java.io.OutputStream;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class dvzb extends OutputStream implements dv9 {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    protected abstract void onNavigationEvent(int i, int i2);

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        onNavigationEvent(bArr, i, i2);
    }

    @Override // o.dv9
    public void onExtraCallback(byte[] bArr) {
        onNavigationEvent(bArr, 0, bArr.length);
    }

    @Override // o.dv9
    public void onExtraCallbackWithResult(int i) {
        write(i);
        write(i >> 8);
        write(i >> 16);
        write(i >> 24);
    }

    @Override // o.dv9
    public void onExtraCallback(int i, int i2) {
        onNavigationEvent(i, i2);
        onNavigationEvent(i + 1, i2 >> 8);
        onNavigationEvent(i + 2, i2 >> 16);
        onNavigationEvent(i + 3, i2 >> 24);
    }

    @Override // o.dv9
    public void onNavigationEvent(long j) {
        write((byte) (j & 255));
        write((byte) ((j >> 8) & 255));
        write((byte) ((j >> 16) & 255));
        write((byte) ((j >> 24) & 255));
        write((byte) ((j >> 32) & 255));
        write((byte) ((j >> 40) & 255));
        write((byte) ((j >> 48) & 255));
        write((byte) ((j >> 56) & 255));
    }

    @Override // o.dv9
    public void IAuthTabCallback(double d) {
        onExtraCallbackWithResult(Double.doubleToRawLongBits(d));
    }

    @Override // o.dv9
    public void onNavigationEvent(String str) {
        IAuthTabCallback(0);
        onExtraCallback((onExtraCallbackWithResult() - r2) - 4, onNavigationEvent(str, false));
    }

    @Override // o.dv9
    public void onExtraCallbackWithResult(String str) {
        onNavigationEvent(str, true);
    }

    public int onNavigationEvent() {
        return IAuthTabCallback();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        onWarmupCompleted(i);
    }

    public void IAuthTabCallback(int i) {
        onExtraCallbackWithResult(i);
    }

    public String toString() {
        return getClass().getName() + " size: " + onNavigationEvent() + " pos: " + onExtraCallbackWithResult();
    }

    public void onExtraCallbackWithResult(long j) {
        onNavigationEvent(j);
    }

    private int onNavigationEvent(String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        int i = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(str, iCharCount);
            if (z && iCodePointAt == 0) {
                throw new ycxsya1(String.format("BSON cstring '%s' is not valid because it contains a null character at index %d", str, Integer.valueOf(iCharCount)));
            }
            if (iCodePointAt < 128) {
                write((byte) iCodePointAt);
                i++;
            } else if (iCodePointAt < 2048) {
                write((byte) ((iCodePointAt >> 6) + CertificateHolderAuthorization.CVCA));
                write((byte) ((iCodePointAt & 63) + 128));
                i += 2;
            } else if (iCodePointAt < 65536) {
                write((byte) ((iCodePointAt >> 12) + 224));
                write((byte) (((iCodePointAt >> 6) & 63) + 128));
                write((byte) ((iCodePointAt & 63) + 128));
                i += 3;
            } else {
                write((byte) ((iCodePointAt >> 18) + 240));
                write((byte) (((iCodePointAt >> 12) & 63) + 128));
                write((byte) (((iCodePointAt >> 6) & 63) + 128));
                write((byte) ((iCodePointAt & 63) + 128));
                i += 4;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        write(0);
        return i + 1;
    }
}
