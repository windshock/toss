package o;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SaversKtExternalSyntheticLambda16 implements Closeable {
    private final InputStream IAuthTabCallback;
    private final Charset onExtraCallback;
    private int onExtraCallbackWithResult;
    private byte[] onNavigationEvent;
    private int onWarmupCompleted;

    public SaversKtExternalSyntheticLambda16(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public SaversKtExternalSyntheticLambda16(InputStream inputStream, int i2, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(SaversKtExternalSyntheticLambda13.onExtraCallback)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.IAuthTabCallback = inputStream;
        this.onExtraCallback = charset;
        this.onNavigationEvent = new byte[i2];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.IAuthTabCallback) {
            if (this.onNavigationEvent != null) {
                this.onNavigationEvent = null;
                this.IAuthTabCallback.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String onExtraCallback() throws IOException {
        int i2;
        byte[] bArr;
        int i3;
        synchronized (this.IAuthTabCallback) {
            if (this.onNavigationEvent == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.onWarmupCompleted >= this.onExtraCallbackWithResult) {
                onWarmupCompleted();
            }
            for (int i4 = this.onWarmupCompleted; i4 != this.onExtraCallbackWithResult; i4++) {
                byte[] bArr2 = this.onNavigationEvent;
                if (bArr2[i4] == 10) {
                    int i5 = this.onWarmupCompleted;
                    if (i4 != i5) {
                        i3 = i4 - 1;
                        if (bArr2[i3] != 13) {
                            i3 = i4;
                        }
                    }
                    String str = new String(bArr2, i5, i3 - i5, this.onExtraCallback.name());
                    this.onWarmupCompleted = i4 + 1;
                    return str;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.onExtraCallbackWithResult - this.onWarmupCompleted) + 80) { // from class: o.SaversKtExternalSyntheticLambda16.3
                @Override // java.io.ByteArrayOutputStream
                public String toString() {
                    int i6 = ((ByteArrayOutputStream) this).count;
                    if (i6 > 0) {
                        int i7 = i6 - 1;
                        if (((ByteArrayOutputStream) this).buf[i7] == 13) {
                            i6 = i7;
                        }
                    }
                    try {
                        return new String(((ByteArrayOutputStream) this).buf, 0, i6, SaversKtExternalSyntheticLambda16.this.onExtraCallback.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
            };
            loop1: while (true) {
                byte[] bArr3 = this.onNavigationEvent;
                int i6 = this.onWarmupCompleted;
                byteArrayOutputStream.write(bArr3, i6, this.onExtraCallbackWithResult - i6);
                this.onExtraCallbackWithResult = -1;
                onWarmupCompleted();
                i2 = this.onWarmupCompleted;
                while (i2 != this.onExtraCallbackWithResult) {
                    bArr = this.onNavigationEvent;
                    if (bArr[i2] == 10) {
                        break loop1;
                    }
                    i2++;
                }
            }
            int i7 = this.onWarmupCompleted;
            if (i2 != i7) {
                byteArrayOutputStream.write(bArr, i7, i2 - i7);
            }
            this.onWarmupCompleted = i2 + 1;
            return byteArrayOutputStream.toString();
        }
    }

    public boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult == -1;
    }

    private void onWarmupCompleted() throws IOException {
        InputStream inputStream = this.IAuthTabCallback;
        byte[] bArr = this.onNavigationEvent;
        int i2 = inputStream.read(bArr, 0, bArr.length);
        if (i2 == -1) {
            throw new EOFException();
        }
        this.onWarmupCompleted = 0;
        this.onExtraCallbackWithResult = i2;
    }
}
