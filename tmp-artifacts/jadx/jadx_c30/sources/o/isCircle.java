package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import o.showPrivacyActivity;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class isCircle extends dj18 {
    private int IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private int asBinder;
    private int asInterface;
    private final PAGNativeAd1 onExtraCallback;
    private long onNavigationEvent;
    private final byte[] onWarmupCompleted;
    private final byte[] onTransact = new byte[1];
    public final showPrivacyActivity.onNavigationEvent onExtraCallbackWithResult = new showPrivacyActivity.onNavigationEvent() { // from class: org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream$$ExternalSyntheticLambda0
        public final int getAsByte() {
            return this.f$0.onWarmupCompleted();
        }
    };

    public isCircle(InputStream inputStream, int i) {
        this.onExtraCallback = new PAGNativeAd1(inputStream);
        if (i <= 0) {
            throw new IllegalArgumentException("windowSize must be bigger than 0");
        }
        this.IAuthTabCallbackDefault = i;
        this.onWarmupCompleted = new byte[i * 3];
        this.asBinder = 0;
        this.asInterface = 0;
        this.onNavigationEvent = 0L;
    }

    public int available() {
        return this.asInterface - this.asBinder;
    }

    public void close() throws IOException {
        this.onExtraCallback.close();
    }

    public final boolean IAuthTabCallback() {
        return this.onNavigationEvent > 0;
    }

    public void onExtraCallbackWithResult(byte[] bArr) {
        if (this.asInterface != 0) {
            throw new IllegalStateException("The stream has already been read from, can't prefill anymore");
        }
        int iMin = Math.min(this.IAuthTabCallbackDefault, bArr.length);
        System.arraycopy(bArr, bArr.length - iMin, this.onWarmupCompleted, 0, iMin);
        this.asInterface += iMin;
        this.asBinder += iMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int read() throws IOException {
        if (read(this.onTransact, 0, 1) == -1) {
            return -1;
        }
        return this.onTransact[0] & 255;
    }

    public final int onWarmupCompleted(byte[] bArr, int i, int i2) {
        int iAvailable = available();
        if (i2 > iAvailable) {
            onNavigationEvent(i2 - iAvailable);
        }
        return onExtraCallbackWithResult(bArr, i, i2);
    }

    private int onExtraCallbackWithResult(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, available());
        if (iMin > 0) {
            System.arraycopy(this.onWarmupCompleted, this.asBinder, bArr, i, iMin);
            int i3 = this.asBinder + iMin;
            this.asBinder = i3;
            if (i3 > (this.IAuthTabCallbackDefault << 1)) {
                onNavigationEvent();
            }
        }
        this.IAuthTabCallbackStub += iMin;
        return iMin;
    }

    public final int onNavigationEvent(byte[] bArr, int i, int i2) throws IOException {
        int iAvailable = available();
        if (i2 > iAvailable) {
            IAuthTabCallback(i2 - iAvailable);
        }
        return onExtraCallbackWithResult(bArr, i, i2);
    }

    public final int onWarmupCompleted() throws IOException {
        int i = this.onExtraCallback.read();
        if (i == -1) {
            return -1;
        }
        onExtraCallbackWithResult(1);
        return i & GF2Field.MASK;
    }

    private void onNavigationEvent() {
        byte[] bArr = this.onWarmupCompleted;
        int i = this.IAuthTabCallbackDefault;
        System.arraycopy(bArr, i, bArr, 0, i << 1);
        int i2 = this.asInterface;
        int i3 = this.IAuthTabCallbackDefault;
        this.asInterface = i2 - i3;
        this.asBinder -= i3;
    }

    public final void IAuthTabCallback(int i, long j) {
        if (i <= 0 || i > this.asInterface) {
            throw new IllegalArgumentException("offset must be bigger than 0 but not bigger than the number of bytes available for back-references");
        }
        if (j < 0) {
            throw new IllegalArgumentException("length must not be negative");
        }
        this.IAuthTabCallback = i;
        this.onNavigationEvent = j;
    }

    public final void onExtraCallbackWithResult(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("length must not be negative");
        }
        this.onNavigationEvent = j;
    }

    private void onNavigationEvent(int i) {
        int iMin = Math.min((int) Math.min(i, this.onNavigationEvent), this.onWarmupCompleted.length - this.asInterface);
        if (iMin != 0) {
            int i2 = this.IAuthTabCallback;
            if (i2 == 1) {
                byte[] bArr = this.onWarmupCompleted;
                int i3 = this.asInterface;
                Arrays.fill(bArr, i3, i3 + iMin, bArr[i3 - 1]);
                this.asInterface += iMin;
            } else if (iMin < i2) {
                byte[] bArr2 = this.onWarmupCompleted;
                int i4 = this.asInterface;
                System.arraycopy(bArr2, i4 - i2, bArr2, i4, iMin);
                this.asInterface += iMin;
            } else {
                int i5 = iMin / i2;
                for (int i6 = 0; i6 < i5; i6++) {
                    byte[] bArr3 = this.onWarmupCompleted;
                    int i7 = this.asInterface;
                    int i8 = this.IAuthTabCallback;
                    System.arraycopy(bArr3, i7 - i8, bArr3, i7, i8);
                    this.asInterface += this.IAuthTabCallback;
                }
                int i9 = this.IAuthTabCallback;
                int i10 = iMin - (i5 * i9);
                if (i10 > 0) {
                    byte[] bArr4 = this.onWarmupCompleted;
                    int i11 = this.asInterface;
                    System.arraycopy(bArr4, i11 - i9, bArr4, i11, i10);
                    this.asInterface += i10;
                }
            }
        }
        this.onNavigationEvent -= iMin;
    }

    private void IAuthTabCallback(int i) throws IOException {
        int iMin = Math.min((int) Math.min(i, this.onNavigationEvent), this.onWarmupCompleted.length - this.asInterface);
        int iOnExtraCallback = iMin > 0 ? PAGNativeAdLoadListener.onExtraCallback(this.onExtraCallback, this.onWarmupCompleted, this.asInterface, iMin) : 0;
        onExtraCallbackWithResult(iOnExtraCallback);
        if (iMin != iOnExtraCallback) {
            throw new IOException("Premature end of stream reading literal");
        }
        this.asInterface += iMin;
        this.onNavigationEvent -= iMin;
    }
}
