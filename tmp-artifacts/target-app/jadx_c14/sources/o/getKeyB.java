package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getKeyB extends toRealPath {
    private final getInitializationType IAuthTabCallback;
    private final String asBinder;
    private final String onExtraCallback;
    private final onWarmupCompleted onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public interface onWarmupCompleted {
        void onExtraCallbackWithResult(@NotNull getInitializationType getinitializationtype);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getKeyB)) {
            return false;
        }
        getKeyB getkeyb = (getKeyB) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, getkeyb.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, getkeyb.IAuthTabCallback);
    }

    public int hashCode() {
        return (this.onExtraCallbackWithResult.hashCode() * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        return "TossMoneyBannerViewModel(navigator=" + this.onExtraCallbackWithResult + ", banner=" + this.IAuthTabCallback + ")";
    }

    public long onWarmupCompleted() {
        return this.IAuthTabCallback.hashCode();
    }

    public final String asInterface() {
        return this.asBinder;
    }

    public final String onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public final String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final String onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final boolean onTransact() {
        AdViewParentApi adViewParentApiIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback();
        return adViewParentApiIAuthTabCallback != null && adViewParentApiIAuthTabCallback.IAuthTabCallback();
    }

    public final void IAuthTabCallbackStub() {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(this.IAuthTabCallback);
    }
}
