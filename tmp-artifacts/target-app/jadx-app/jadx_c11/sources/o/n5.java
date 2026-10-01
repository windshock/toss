package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class n5 {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private final n0a IAuthTabCallback;
    private final n6a asInterface;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final hbExternalSyntheticLambda1 onNavigationEvent;
    private final onRewardedAdLoaded onWarmupCompleted;

    public static /* synthetic */ n5 onNavigationEvent(n5 n5Var, n6a n6aVar, onRewardedAdLoaded onrewardedadloaded, n0a n0aVar, boolean z, boolean z2, hbExternalSyntheticLambda1 hbexternalsyntheticlambda1, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            n6aVar = n5Var.asInterface;
        }
        n6a n6aVar2 = n6aVar;
        if ((i & 2) != 0) {
            onrewardedadloaded = n5Var.onWarmupCompleted;
        }
        onRewardedAdLoaded onrewardedadloaded2 = onrewardedadloaded;
        if ((i & 4) != 0) {
            n0aVar = n5Var.IAuthTabCallback;
        }
        n0a n0aVar2 = n0aVar;
        if ((i & 8) != 0) {
            z = n5Var.onExtraCallback;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            int i3 = onTransact + 49;
            int i4 = i3 % 128;
            IAuthTabCallbackStub = i4;
            int i5 = i3 % 2;
            z2 = n5Var.onExtraCallbackWithResult;
            int i6 = i4 + 109;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 3;
            }
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            int i8 = IAuthTabCallbackStub + 29;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            hbexternalsyntheticlambda1 = n5Var.onNavigationEvent;
            if (i9 != 0) {
                int i10 = 71 / 0;
            }
        }
        return n5Var.IAuthTabCallback(n6aVar2, onrewardedadloaded2, n0aVar2, z3, z4, hbexternalsyntheticlambda1);
    }

    public final n5 IAuthTabCallback(@NotNull n6a n6aVar, @NotNull onRewardedAdLoaded onrewardedadloaded, @NotNull n0a n0aVar, boolean z, boolean z2, @NotNull hbExternalSyntheticLambda1 hbexternalsyntheticlambda1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(n6aVar, "");
        Intrinsics.checkNotNullParameter(onrewardedadloaded, "");
        Intrinsics.checkNotNullParameter(n0aVar, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda1, "");
        n5 n5Var = new n5(n6aVar, onrewardedadloaded, n0aVar, z, z2, hbexternalsyntheticlambda1);
        int i2 = IAuthTabCallbackStub + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return n5Var;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        if (this.asInterface != n5Var.asInterface) {
            int i2 = IAuthTabCallbackStub + 97;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.onWarmupCompleted != n5Var.onWarmupCompleted) {
            int i4 = IAuthTabCallbackStub + 35;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.IAuthTabCallback != n5Var.IAuthTabCallback) {
            return false;
        }
        if (this.onExtraCallback == n5Var.onExtraCallback) {
            return this.onExtraCallbackWithResult == n5Var.onExtraCallbackWithResult && this.onNavigationEvent == n5Var.onNavigationEvent;
        }
        int i6 = IAuthTabCallbackStub + 97;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.asInterface.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + Boolean.hashCode(this.onExtraCallback)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult)) * 31) + this.onNavigationEvent.hashCode();
        int i4 = onTransact + 77;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnWarmupState(tabState=" + this.asInterface + ", fragmentState=" + this.onWarmupCompleted + ", sharedBundleState=" + this.IAuthTabCallback + ", reactHostStarted=" + this.onExtraCallback + ", serviceBundleLoaded=" + this.onExtraCallbackWithResult + ", entryRequestState=" + this.onNavigationEvent + ")";
        int i2 = onTransact + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public n5(@NotNull n6a n6aVar, @NotNull onRewardedAdLoaded onrewardedadloaded, @NotNull n0a n0aVar, boolean z, boolean z2, @NotNull hbExternalSyntheticLambda1 hbexternalsyntheticlambda1) {
        Intrinsics.checkNotNullParameter(n6aVar, "");
        Intrinsics.checkNotNullParameter(onrewardedadloaded, "");
        Intrinsics.checkNotNullParameter(n0aVar, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda1, "");
        this.asInterface = n6aVar;
        this.onWarmupCompleted = onrewardedadloaded;
        this.IAuthTabCallback = n0aVar;
        this.onExtraCallback = z;
        this.onExtraCallbackWithResult = z2;
        this.onNavigationEvent = hbexternalsyntheticlambda1;
    }

    public final n6a IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        throw null;
    }

    public final onRewardedAdLoaded onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 59;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        onRewardedAdLoaded onrewardedadloaded = this.onWarmupCompleted;
        int i5 = i2 + 67;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return onrewardedadloaded;
        }
        throw null;
    }

    public final n0a IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 81;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        n0a n0aVar = this.IAuthTabCallback;
        int i5 = i2 + 71;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return n0aVar;
        }
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 23;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i2 + 105;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final hbExternalSyntheticLambda1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }
}
