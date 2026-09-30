package o;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda34 extends OutputStream {
    private final OutputStream IAuthTabCallback;
    private int onExtraCallback;
    private byte[] onExtraCallbackWithResult;
    private Savers_androidKtExternalSyntheticLambda6 onWarmupCompleted;

    public SaversKtExternalSyntheticLambda34(@NonNull OutputStream outputStream, @NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        this(outputStream, savers_androidKtExternalSyntheticLambda6, 65536);
    }

    SaversKtExternalSyntheticLambda34(@NonNull OutputStream outputStream, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6, int i2) {
        this.IAuthTabCallback = outputStream;
        this.onWarmupCompleted = savers_androidKtExternalSyntheticLambda6;
        this.onExtraCallbackWithResult = (byte[]) savers_androidKtExternalSyntheticLambda6.onExtraCallback(i2, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        byte[] bArr = this.onExtraCallbackWithResult;
        int i3 = this.onExtraCallback;
        this.onExtraCallback = i3 + 1;
        bArr[i3] = (byte) i2;
        onExtraCallbackWithResult();
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.onExtraCallback;
            if (i7 == 0 && i5 >= this.onExtraCallbackWithResult.length) {
                this.IAuthTabCallback.write(bArr, i6, i5);
                return;
            }
            int iMin = Math.min(i5, this.onExtraCallbackWithResult.length - i7);
            System.arraycopy(bArr, i6, this.onExtraCallbackWithResult, this.onExtraCallback, iMin);
            this.onExtraCallback += iMin;
            i4 += iMin;
            onExtraCallbackWithResult();
        } while (i4 < i3);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        onExtraCallback();
        this.IAuthTabCallback.flush();
    }

    private void onExtraCallback() throws IOException {
        int i2 = this.onExtraCallback;
        if (i2 > 0) {
            this.IAuthTabCallback.write(this.onExtraCallbackWithResult, 0, i2);
            this.onExtraCallback = 0;
        }
    }

    private void onExtraCallbackWithResult() throws IOException {
        if (this.onExtraCallback == this.onExtraCallbackWithResult.length) {
            onExtraCallback();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.IAuthTabCallback.close();
            onNavigationEvent();
        } catch (Throwable th) {
            this.IAuthTabCallback.close();
            throw th;
        }
    }

    private void onNavigationEvent() {
        byte[] bArr = this.onExtraCallbackWithResult;
        if (bArr != null) {
            this.onWarmupCompleted.onNavigationEvent((Savers_androidKtExternalSyntheticLambda6) bArr);
            this.onExtraCallbackWithResult = null;
        }
    }
}
