package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PangleAd {
    private int IAuthTabCallback;
    private int[] onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onWarmupCompleted;

    public PangleAd() {
        this(10);
    }

    public PangleAd(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        this.onExtraCallbackWithResult = 0;
        this.IAuthTabCallback = 0;
        this.onExtraCallback = new int[i];
    }

    public boolean onExtraCallback(int i) {
        if (this.onExtraCallbackWithResult == this.onExtraCallback.length) {
            IAuthTabCallback(1);
        }
        int[] iArr = this.onExtraCallback;
        int i2 = this.onExtraCallbackWithResult;
        this.onExtraCallbackWithResult = i2 + 1;
        iArr[i2] = i;
        this.onWarmupCompleted++;
        return true;
    }

    private void IAuthTabCallback(int i) {
        int i2 = this.onExtraCallbackWithResult;
        int i3 = this.IAuthTabCallback;
        int i4 = i2 - i3;
        int[] iArr = this.onExtraCallback;
        if (i3 >= i - (iArr.length - i2)) {
            if (i4 > 0) {
                System.arraycopy(iArr, i3, iArr, 0, i4);
            }
            this.IAuthTabCallback = 0;
            this.onExtraCallbackWithResult = i4;
            return;
        }
        int i5 = i4 / 2;
        if (i <= i5) {
            i = i5;
        }
        if (i < 12) {
            i = 12;
        }
        int[] iArr2 = new int[i + i4];
        if (i4 > 0) {
            System.arraycopy(iArr, i3, iArr2, 0, i4);
            this.IAuthTabCallback = 0;
            this.onExtraCallbackWithResult = i4;
        }
        this.onExtraCallback = iArr2;
    }
}
