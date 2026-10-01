package o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TopLayoutDislike25 extends InputStream {
    private byte[] IAuthTabCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final bindIconData onWarmupCompleted;

    public TopLayoutDislike25(InputStream inputStream) throws IOException {
        this(inputStream, 16384, null);
    }

    public TopLayoutDislike25(InputStream inputStream, int i, byte[] bArr) throws IOException {
        bindIconData bindicondata = new bindIconData();
        this.onWarmupCompleted = bindicondata;
        if (i <= 0) {
            throw new IllegalArgumentException("Bad buffer size:" + i);
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("source is null");
        }
        this.IAuthTabCallback = new byte[i];
        this.onNavigationEvent = 0;
        this.onExtraCallbackWithResult = 0;
        try {
            bindIconData.onNavigationEvent(bindicondata, inputStream);
            if (bArr != null) {
                TopLayoutDislike28.onNavigationEvent(bindicondata, bArr);
            }
        } catch (TopLayoutDislike26 e) {
            throw new IOException("Brotli decoder initialization failed", e);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        bindIconData.onExtraCallbackWithResult(this.onWarmupCompleted);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.onExtraCallbackWithResult >= this.onNavigationEvent) {
            byte[] bArr = this.IAuthTabCallback;
            int i = read(bArr, 0, bArr.length);
            this.onNavigationEvent = i;
            this.onExtraCallbackWithResult = 0;
            if (i == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.IAuthTabCallback;
        int i2 = this.onExtraCallbackWithResult;
        this.onExtraCallbackWithResult = i2 + 1;
        return bArr2[i2] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Bad offset: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Bad length: " + i2);
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            throw new IllegalArgumentException("Buffer overflow: " + i3 + " > " + bArr.length);
        }
        if (i2 == 0) {
            return 0;
        }
        int iMax = Math.max(this.onNavigationEvent - this.onExtraCallbackWithResult, 0);
        if (iMax != 0) {
            iMax = Math.min(iMax, i2);
            System.arraycopy(this.IAuthTabCallback, this.onExtraCallbackWithResult, bArr, i, iMax);
            this.onExtraCallbackWithResult += iMax;
            i += iMax;
            i2 -= iMax;
            if (i2 == 0) {
                return iMax;
            }
        }
        try {
            bindIconData bindicondata = this.onWarmupCompleted;
            bindicondata.setEngagementSignalsCallback = bArr;
            bindicondata.receiveFile = i;
            bindicondata.requestPostMessageChannelWithExtras = i2;
            bindicondata.warmup = 0;
            TopLayoutDislike28.onWarmupCompleted(bindicondata);
            int i4 = this.onWarmupCompleted.warmup;
            if (i4 == 0) {
                return -1;
            }
            return i4 + iMax;
        } catch (TopLayoutDislike26 e) {
            throw new IOException("Brotli stream decoding failed", e);
        }
    }
}
