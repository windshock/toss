package o;

import im.toss.feature.kyc.teens.residentregister.nav.ResidentRegisterSubmitDestination;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onBackPerformed$onExtraCallbackWithResult implements onBackPerformed {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final ResidentRegisterSubmitDestination IAuthTabCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onBackPerformed$onExtraCallbackWithResult)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, ((onBackPerformed$onExtraCallbackWithResult) obj).IAuthTabCallback)) {
            int i2 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        int i4 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Navigation(destination=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public onBackPerformed$onExtraCallbackWithResult(@NotNull ResidentRegisterSubmitDestination residentRegisterSubmitDestination) {
        Intrinsics.checkNotNullParameter(residentRegisterSubmitDestination, "");
        this.IAuthTabCallback = residentRegisterSubmitDestination;
    }

    public final ResidentRegisterSubmitDestination onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ResidentRegisterSubmitDestination residentRegisterSubmitDestination = this.IAuthTabCallback;
        int i4 = i3 + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return residentRegisterSubmitDestination;
    }
}
