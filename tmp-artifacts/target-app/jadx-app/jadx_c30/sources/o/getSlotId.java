package o;

import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getSlotId extends createNativeAdLoader {
    private static getSlotId[] IAuthTabCallback = new getSlotId[GF2Field.MASK];
    private createNativeAdLoader[] onExtraCallback;
    private int[][] onExtraCallbackWithResult;
    private int[] onNavigationEvent;
    private final onBiddingTokenCollected onWarmupCompleted;

    public boolean equals(Object obj) {
        return this == obj;
    }

    protected onBiddingTokenCollected onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public int[] IAuthTabCallback(int i) {
        return IAuthTabCallback()[i];
    }

    public int[][] IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public int hashCode() {
        return onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.createNativeAdLoader
    public void onExtraCallback(createRewardAdLoader createrewardadloader) {
        super.onExtraCallback(createrewardadloader);
        if (this.onExtraCallback.length > 0) {
            for (int i = 0; i < this.onExtraCallback.length; i++) {
                int i2 = IAuthTabCallback(i)[1];
                if (i2 == 1) {
                    onExtraCallback(createrewardadloader.IAuthTabCallback(this.onExtraCallback[i]), IAuthTabCallback(i)[0]);
                } else {
                    if (i2 != 2) {
                        throw new Error("Unhandled resolve " + this);
                    }
                    onExtraCallbackWithResult(createrewardadloader.IAuthTabCallback(this.onExtraCallback[i]), IAuthTabCallback(i)[0]);
                }
            }
        }
    }

    public void onExtraCallbackWithResult(int i, int i2) {
        int iOnExtraCallback = onNavigationEvent().onExtraCallback();
        int length = onNavigationEvent().IAuthTabCallback().length;
        if (iOnExtraCallback <= 0) {
            throw new Error("Trying to rewrite " + this + " that has no rewrite");
        }
        int i3 = iOnExtraCallback + i2;
        int i4 = i3 + 1;
        if (i4 > length) {
            throw new Error("Trying to rewrite " + this + " with an int at position " + i2 + " but this won't fit in the rewrite array");
        }
        int[] iArr = this.onNavigationEvent;
        iArr[i3] = (65280 & i) >> 8;
        iArr[i4] = i & GF2Field.MASK;
    }

    public void onExtraCallback(int i, int i2) {
        int iOnExtraCallback = onNavigationEvent().onExtraCallback();
        int iOnNavigationEvent = onNavigationEvent().onNavigationEvent();
        if (iOnExtraCallback <= 0) {
            throw new Error("Trying to rewrite " + this + " that has no rewrite");
        }
        int i3 = iOnExtraCallback + i2;
        if (i3 > iOnNavigationEvent) {
            throw new Error("Trying to rewrite " + this + " with an byte at position " + i2 + " but this won't fit in the rewrite array");
        }
        this.onNavigationEvent[i3] = i & GF2Field.MASK;
    }

    public String toString() {
        return onNavigationEvent().onExtraCallbackWithResult();
    }
}
