package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class setCornerBottomLeftRadius extends dj18 {
    private int IAuthTabCallbackDefault;
    private int access100;
    private byte[] asBinder;
    private int[] asInterface;
    protected final PAGInterstitialRequest onExtraCallbackWithResult;
    private byte onTransact;
    private byte[] onWarmupCompleted;
    private final byte[] onNavigationEvent = new byte[1];
    private int onExtraCallback = -1;
    private int IAuthTabCallback = 9;
    private int IAuthTabCallbackStub = -1;

    protected abstract int IAuthTabCallback() throws IOException;

    protected abstract int onExtraCallback(int i, byte b) throws IOException;

    public setCornerBottomLeftRadius(InputStream inputStream, ByteOrder byteOrder) {
        this.onExtraCallbackWithResult = new PAGInterstitialRequest(inputStream, byteOrder);
    }

    public int onExtraCallbackWithResult(int i, byte b, int i2) {
        int i3 = this.access100;
        if (i3 >= i2) {
            return -1;
        }
        this.asInterface[i3] = i;
        this.onWarmupCompleted[i3] = b;
        this.access100 = i3 + 1;
        return i3;
    }

    public int onWarmupCompleted() throws IOException {
        int i = this.IAuthTabCallbackStub;
        if (i == -1) {
            throw new IOException("The first code can't be a reference to its preceding code");
        }
        return onExtraCallback(i, this.onTransact);
    }

    public void close() throws IOException {
        this.onExtraCallbackWithResult.close();
    }

    public int onExtraCallbackWithResult(int i, boolean z) throws IOException {
        int i2 = i;
        while (i2 >= 0) {
            byte[] bArr = this.asBinder;
            int i3 = this.IAuthTabCallbackDefault - 1;
            this.IAuthTabCallbackDefault = i3;
            bArr[i3] = this.onWarmupCompleted[i2];
            i2 = this.asInterface[i2];
        }
        int i4 = this.IAuthTabCallbackStub;
        if (i4 != -1 && !z) {
            onExtraCallback(i4, this.asBinder[this.IAuthTabCallbackDefault]);
        }
        this.IAuthTabCallbackStub = i;
        byte[] bArr2 = this.asBinder;
        int i5 = this.IAuthTabCallbackDefault;
        this.onTransact = bArr2[i5];
        return i5;
    }

    public int onExtraCallback() {
        return this.onExtraCallback;
    }

    public int onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public int onExtraCallback(int i) {
        return this.asInterface[i];
    }

    public int onTransact() {
        return this.asInterface.length;
    }

    public int IAuthTabCallbackDefault() {
        return this.access100;
    }

    public void asBinder() {
        this.IAuthTabCallback++;
    }

    public void onWarmupCompleted(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxCodeSize is " + i + ", must be bigger than 0");
        }
        int i2 = 1 << i;
        this.asInterface = new int[i2];
        this.onWarmupCompleted = new byte[i2];
        this.asBinder = new byte[i2];
        this.IAuthTabCallbackDefault = i2;
        for (int i3 = 0; i3 < 256; i3++) {
            this.asInterface[i3] = -1;
            this.onWarmupCompleted[i3] = (byte) i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int read() throws IOException {
        int i = read(this.onNavigationEvent);
        return i < 0 ? i : this.onNavigationEvent[0] & 255;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int iOnExtraCallback = onExtraCallback(bArr, i, i2);
        while (true) {
            int i3 = i2 - iOnExtraCallback;
            if (i3 > 0) {
                int iIAuthTabCallback = IAuthTabCallback();
                if (iIAuthTabCallback < 0) {
                    if (iOnExtraCallback <= 0) {
                        return iIAuthTabCallback;
                    }
                    onExtraCallbackWithResult(iOnExtraCallback);
                    return iOnExtraCallback;
                }
                iOnExtraCallback += onExtraCallback(bArr, i + iOnExtraCallback, i3);
            } else {
                onExtraCallbackWithResult(iOnExtraCallback);
                return iOnExtraCallback;
            }
        }
    }

    private int onExtraCallback(byte[] bArr, int i, int i2) {
        int length = this.asBinder.length - this.IAuthTabCallbackDefault;
        if (length <= 0) {
            return 0;
        }
        int iMin = Math.min(length, i2);
        System.arraycopy(this.asBinder, this.IAuthTabCallbackDefault, bArr, i, iMin);
        this.IAuthTabCallbackDefault += iMin;
        return iMin;
    }

    public int asInterface() throws IOException {
        int i = this.IAuthTabCallback;
        if (i > 31) {
            throw new IllegalArgumentException("Code size must not be bigger than 31");
        }
        return (int) this.onExtraCallbackWithResult.onExtraCallbackWithResult(i);
    }

    public void onNavigationEvent(int i) {
        this.onExtraCallback = 1 << (i - 1);
    }

    public void onNavigationEvent(int i, int i2) {
        this.asInterface[i] = i2;
    }

    public void IAuthTabCallback(int i) {
        this.access100 = i;
    }
}
