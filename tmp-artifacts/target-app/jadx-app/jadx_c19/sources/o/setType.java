package o;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setType extends FilterInputStream {
    private int onExtraCallbackWithResult;
    private final long onNavigationEvent;

    public static InputStream onExtraCallbackWithResult(@NonNull InputStream inputStream, long j) {
        return new setType(inputStream, j);
    }

    private setType(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.onNavigationEvent = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int iMax;
        synchronized (this) {
            iMax = (int) Math.max(this.onNavigationEvent - this.onExtraCallbackWithResult, ((FilterInputStream) this).in.available());
        }
        return iMax;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i2;
        synchronized (this) {
            i2 = super.read();
            IAuthTabCallback(i2 >= 0 ? 1 : -1);
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int iIAuthTabCallback;
        synchronized (this) {
            iIAuthTabCallback = IAuthTabCallback(super.read(bArr, i2, i3));
        }
        return iIAuthTabCallback;
    }

    private int IAuthTabCallback(int i2) throws IOException {
        if (i2 >= 0) {
            this.onExtraCallbackWithResult += i2;
            return i2;
        }
        if (this.onNavigationEvent - this.onExtraCallbackWithResult <= 0) {
            return i2;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.onNavigationEvent + ", but read: " + this.onExtraCallbackWithResult);
    }
}
