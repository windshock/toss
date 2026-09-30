package o;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setChildrenConstraints extends FilterInputStream {
    private int onExtraCallback;

    public setChildrenConstraints(@NonNull InputStream inputStream) {
        super(inputStream);
        this.onExtraCallback = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        synchronized (this) {
            super.mark(i2);
            this.onExtraCallback = i2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (onExtraCallbackWithResult(1L) == -1) {
            return -1;
        }
        int i2 = super.read();
        IAuthTabCallback(1L);
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i2, int i3) throws IOException {
        int iOnExtraCallbackWithResult = (int) onExtraCallbackWithResult(i3);
        if (iOnExtraCallbackWithResult == -1) {
            return -1;
        }
        int i4 = super.read(bArr, i2, iOnExtraCallbackWithResult);
        IAuthTabCallback(i4);
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        synchronized (this) {
            super.reset();
            this.onExtraCallback = Integer.MIN_VALUE;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jOnExtraCallbackWithResult = onExtraCallbackWithResult(j);
        if (jOnExtraCallbackWithResult == -1) {
            return 0L;
        }
        long jSkip = super.skip(jOnExtraCallbackWithResult);
        IAuthTabCallback(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i2 = this.onExtraCallback;
        if (i2 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i2, super.available());
    }

    private long onExtraCallbackWithResult(long j) {
        int i2 = this.onExtraCallback;
        if (i2 == 0) {
            return -1L;
        }
        if (i2 == Integer.MIN_VALUE) {
            return j;
        }
        long j2 = i2;
        return j > j2 ? j2 : j;
    }

    private void IAuthTabCallback(long j) {
        int i2 = this.onExtraCallback;
        if (i2 == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.onExtraCallback = (int) (i2 - j);
    }
}
