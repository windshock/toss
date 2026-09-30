package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda4 {
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private final n5 IAuthTabCallback;
    private final n5 onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final hbExternalSyntheticLambda13 onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 15;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof hbExternalSyntheticLambda4)) {
            return false;
        }
        hbExternalSyntheticLambda4 hbexternalsyntheticlambda4 = (hbExternalSyntheticLambda4) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, hbexternalsyntheticlambda4.onExtraCallbackWithResult)) {
            int i4 = asInterface + 51;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, hbexternalsyntheticlambda4.onNavigationEvent)) {
            int i6 = asInterface + 117;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, hbexternalsyntheticlambda4.onExtraCallback)) {
            int i8 = asInterface + 23;
            IAuthTabCallbackDefault = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, hbexternalsyntheticlambda4.IAuthTabCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, hbexternalsyntheticlambda4.onWarmupCompleted)) {
            return true;
        }
        int i9 = asInterface + 93;
        int i10 = i9 % 128;
        IAuthTabCallbackDefault = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 65;
        asInterface = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.onExtraCallbackWithResult.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
        int i4 = asInterface + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnPostShowLifecycleEvent(sharedBundleName=" + this.onExtraCallbackWithResult + ", serviceBundleName=" + this.onNavigationEvent + ", stateBeforeShow=" + this.onExtraCallback + ", stateAfterShow=" + this.IAuthTabCallback + ", overlayLifecyclePolicy=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallbackDefault + 67;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public hbExternalSyntheticLambda4(@NotNull String str, @NotNull String str2, @NotNull n5 n5Var, @NotNull n5 n5Var2, @NotNull hbExternalSyntheticLambda13 hbexternalsyntheticlambda13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(n5Var, "");
        Intrinsics.checkNotNullParameter(n5Var2, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda13, "");
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = str2;
        this.onExtraCallback = n5Var;
        this.IAuthTabCallback = n5Var2;
        this.onWarmupCompleted = hbexternalsyntheticlambda13;
    }
}
