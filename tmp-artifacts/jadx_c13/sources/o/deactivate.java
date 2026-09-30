package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class deactivate {
    private int IAuthTabCallback;
    private byte[] onExtraCallback;
    private int onNavigationEvent;

    public deactivate(int i) {
        this.onExtraCallback = new byte[i];
        this.onNavigationEvent = 0;
        this.IAuthTabCallback = -1;
    }

    public deactivate() {
        this(32);
    }

    public int onNavigationEvent() {
        return this.onNavigationEvent;
    }

    private void onNavigationEvent(long j, int i) {
        if (j < 0 || j > (1 << i)) {
            throw new IllegalArgumentException(j + " out of range for " + i + " bit value");
        }
    }

    private void onWarmupCompleted(int i) {
        byte[] bArr = this.onExtraCallback;
        int length = bArr.length;
        int i2 = this.onNavigationEvent;
        if (length - i2 >= i) {
            return;
        }
        int length2 = bArr.length << 1;
        int i3 = i + i2;
        if (length2 < i3) {
            length2 = i3;
        }
        byte[] bArr2 = new byte[length2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.onExtraCallback = bArr2;
    }

    public void onExtraCallbackWithResult(int i) {
        if (i > this.onNavigationEvent) {
            throw new IllegalArgumentException("cannot jump past end of data");
        }
        this.onNavigationEvent = i;
    }

    public void onExtraCallback() {
        this.IAuthTabCallback = this.onNavigationEvent;
    }

    public void onExtraCallbackWithResult() {
        int i = this.IAuthTabCallback;
        if (i < 0) {
            throw new IllegalStateException("no previous state");
        }
        this.onNavigationEvent = i;
        this.IAuthTabCallback = -1;
    }

    public void onNavigationEvent(int i) {
        onNavigationEvent(i, 8);
        onWarmupCompleted(1);
        byte[] bArr = this.onExtraCallback;
        int i2 = this.onNavigationEvent;
        this.onNavigationEvent = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void IAuthTabCallback(int i) {
        onNavigationEvent(i, 16);
        onWarmupCompleted(2);
        byte[] bArr = this.onExtraCallback;
        int i2 = this.onNavigationEvent;
        bArr[i2] = (byte) (i >>> 8);
        this.onNavigationEvent = i2 + 2;
        bArr[i2 + 1] = (byte) i;
    }

    public void onExtraCallbackWithResult(int i, int i2) {
        onNavigationEvent(i, 16);
        if (i2 > this.onNavigationEvent - 2) {
            throw new IllegalArgumentException("cannot write past end of data");
        }
        byte[] bArr = this.onExtraCallback;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    public void onWarmupCompleted(long j) {
        onNavigationEvent(j, 32);
        onWarmupCompleted(4);
        byte[] bArr = this.onExtraCallback;
        int i = this.onNavigationEvent;
        bArr[i] = (byte) ((j >>> 24) & 255);
        bArr[i + 1] = (byte) ((j >>> 16) & 255);
        bArr[i + 2] = (byte) ((j >>> 8) & 255);
        this.onNavigationEvent = i + 4;
        bArr[i + 3] = (byte) (j & 255);
    }

    public void onExtraCallback(byte[] bArr, int i, int i2) {
        onWarmupCompleted(i2);
        System.arraycopy(bArr, i, this.onExtraCallback, this.onNavigationEvent, i2);
        this.onNavigationEvent += i2;
    }

    public void onNavigationEvent(byte[] bArr) {
        onExtraCallback(bArr, 0, bArr.length);
    }

    public void onExtraCallback(byte[] bArr) {
        if (bArr.length > 255) {
            throw new IllegalArgumentException("Invalid counted string");
        }
        onWarmupCompleted(bArr.length + 1);
        byte[] bArr2 = this.onExtraCallback;
        int i = this.onNavigationEvent;
        this.onNavigationEvent = i + 1;
        bArr2[i] = (byte) (255 & bArr.length);
        onExtraCallback(bArr, 0, bArr.length);
    }

    public byte[] IAuthTabCallback() {
        int i = this.onNavigationEvent;
        byte[] bArr = new byte[i];
        System.arraycopy(this.onExtraCallback, 0, bArr, 0, i);
        return bArr;
    }

    static byte[] onExtraCallback(int i) {
        return new byte[]{(byte) (i >>> 8), (byte) i};
    }
}
