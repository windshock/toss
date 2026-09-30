package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda2 {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final hbExternalSyntheticLambda11 onExtraCallbackWithResult;
    private final onRewardedAdDisplayFailed onNavigationEvent;
    private final n5 onTransact;
    private final hbExternalSyntheticLambda13 onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbExternalSyntheticLambda2)) {
            return false;
        }
        hbExternalSyntheticLambda2 hbexternalsyntheticlambda2 = (hbExternalSyntheticLambda2) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, hbexternalsyntheticlambda2.onExtraCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, hbexternalsyntheticlambda2.IAuthTabCallback)) {
            int i2 = IAuthTabCallbackDefault + 55;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, hbexternalsyntheticlambda2.onTransact)) {
            int i4 = asBinder + 25;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, hbexternalsyntheticlambda2.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, hbexternalsyntheticlambda2.onNavigationEvent)) {
            int i6 = asBinder + 73;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, hbexternalsyntheticlambda2.onExtraCallbackWithResult)) {
            return true;
        }
        int i8 = asBinder + 23;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.onExtraCallback.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = IAuthTabCallbackDefault + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnPreHideLifecycleEvent(sharedBundleName=" + this.onExtraCallback + ", serviceBundleName=" + this.IAuthTabCallback + ", stateBeforeHide=" + this.onTransact + ", overlayLifecyclePolicy=" + this.onWarmupCompleted + ", activityWindowState=" + this.onNavigationEvent + ", ownedOverlayDismissState=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallbackDefault + 21;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public hbExternalSyntheticLambda2(@NotNull String str, @NotNull String str2, @NotNull n5 n5Var, @NotNull hbExternalSyntheticLambda13 hbexternalsyntheticlambda13, @NotNull onRewardedAdDisplayFailed onrewardedaddisplayfailed, @NotNull hbExternalSyntheticLambda11 hbexternalsyntheticlambda11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(n5Var, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda13, "");
        Intrinsics.checkNotNullParameter(onrewardedaddisplayfailed, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda11, "");
        this.onExtraCallback = str;
        this.IAuthTabCallback = str2;
        this.onTransact = n5Var;
        this.onWarmupCompleted = hbexternalsyntheticlambda13;
        this.onNavigationEvent = onrewardedaddisplayfailed;
        this.onExtraCallbackWithResult = hbexternalsyntheticlambda11;
    }
}
