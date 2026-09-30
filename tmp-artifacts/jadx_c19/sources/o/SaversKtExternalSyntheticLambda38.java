package o;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda38 extends FilterInputStream {
    private int IAuthTabCallback;
    private final byte onExtraCallback;
    private static final byte[] onNavigationEvent = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    private static final int onWarmupCompleted = 29;
    private static final int onExtraCallbackWithResult = 31;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public SaversKtExternalSyntheticLambda38(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 < -1 || i2 > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i2);
        }
        this.onExtraCallback = (byte) i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i2;
        int i3;
        int i4 = this.IAuthTabCallback;
        if (i4 < 2 || i4 > (i3 = onExtraCallbackWithResult)) {
            i2 = super.read();
        } else if (i4 == i3) {
            i2 = this.onExtraCallback;
        } else {
            i2 = onNavigationEvent[i4 - 2] & 255;
        }
        if (i2 != -1) {
            this.IAuthTabCallback++;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5 = this.IAuthTabCallback;
        int i6 = onExtraCallbackWithResult;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.onExtraCallback;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int iMin = Math.min(i6 - i5, i3);
            System.arraycopy(onNavigationEvent, this.IAuthTabCallback - 2, bArr, i2, iMin);
            i4 = iMin;
        }
        if (i4 > 0) {
            this.IAuthTabCallback += i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.IAuthTabCallback = (int) (this.IAuthTabCallback + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }
}
