package androidx.glance.appwidget.protobuf;

import o.LazyLayoutPagerKtExternalSyntheticLambda1;
import o.LazyStaggeredGridItemProviderKtExternalSyntheticLambda1;
import o.LazyStaggeredGridMeasureKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RawMessageInfo implements LazyStaggeredGridItemProviderKtExternalSyntheticLambda1 {
    private final LazyStaggeredGridMeasureKtExternalSyntheticLambda1 IAuthTabCallback;
    private final Object[] onExtraCallback;
    private final String onNavigationEvent;
    private final int onWarmupCompleted;

    public RawMessageInfo(LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1, String str, Object[] objArr) {
        this.IAuthTabCallback = lazyStaggeredGridMeasureKtExternalSyntheticLambda1;
        this.onNavigationEvent = str;
        this.onExtraCallback = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.onWarmupCompleted = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.onWarmupCompleted = i2 | (cCharAt2 << i4);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i3++;
            }
        }
    }

    public String IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public Object[] onNavigationEvent() {
        return this.onExtraCallback;
    }

    @Override // o.LazyStaggeredGridItemProviderKtExternalSyntheticLambda1
    public LazyStaggeredGridMeasureKtExternalSyntheticLambda1 onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    @Override // o.LazyStaggeredGridItemProviderKtExternalSyntheticLambda1
    public LazyLayoutPagerKtExternalSyntheticLambda1 onExtraCallback() {
        int i2 = this.onWarmupCompleted;
        if ((i2 & 1) != 0) {
            return LazyLayoutPagerKtExternalSyntheticLambda1.PROTO2;
        }
        if ((i2 & 4) == 4) {
            return LazyLayoutPagerKtExternalSyntheticLambda1.EDITIONS;
        }
        return LazyLayoutPagerKtExternalSyntheticLambda1.PROTO3;
    }

    @Override // o.LazyStaggeredGridItemProviderKtExternalSyntheticLambda1
    public boolean onExtraCallbackWithResult() {
        return (this.onWarmupCompleted & 2) == 2;
    }
}
