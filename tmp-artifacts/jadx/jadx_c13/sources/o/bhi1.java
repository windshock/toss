package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class bhi1 extends setPreFinish {
    private final TTAppOpenAdTransActivity IAuthTabCallback;

    public bhi1(@NotNull TTAppOpenAdTransActivity tTAppOpenAdTransActivity) {
        Intrinsics.checkNotNullParameter(tTAppOpenAdTransActivity, "");
        this.IAuthTabCallback = tTAppOpenAdTransActivity;
    }

    @Override // o.setPreFinish
    public boolean onWarmupCompleted() {
        return this.IAuthTabCallback.IAuthTabCallback_Parcel();
    }

    @Override // o.setPreFinish
    public int onExtraCallbackWithResult() {
        return this.IAuthTabCallback.ICustomTabsCallbackStub();
    }
}
