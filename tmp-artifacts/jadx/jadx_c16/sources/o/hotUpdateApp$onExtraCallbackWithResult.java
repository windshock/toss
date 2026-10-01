package o;

import im.toss.features.leave.domain.response.RemainingBalanceResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class hotUpdateApp$onExtraCallbackWithResult implements hotUpdateApp {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final RemainingBalanceResponse onNavigationEvent;
    private final RemainingBalanceResponse onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof hotUpdateApp$onExtraCallbackWithResult) {
                hotUpdateApp$onExtraCallbackWithResult hotupdateapp_onextracallbackwithresult = (hotUpdateApp$onExtraCallbackWithResult) obj;
                return Intrinsics.areEqual(this.onNavigationEvent, hotupdateapp_onextracallbackwithresult.onNavigationEvent) && Intrinsics.areEqual(this.onWarmupCompleted, hotupdateapp_onextracallbackwithresult.onWarmupCompleted);
            }
            int i2 = onExtraCallbackWithResult + 109;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = onExtraCallbackWithResult + 85;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        RemainingBalanceResponse remainingBalanceResponse = this.onNavigationEvent;
        if (remainingBalanceResponse == null) {
            int i4 = i2 + 29;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = remainingBalanceResponse.hashCode();
        }
        return (iHashCode * 31) + this.onWarmupCompleted.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangedRemainingMoney(cachedData=" + this.onNavigationEvent + ", remoteData=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public hotUpdateApp$onExtraCallbackWithResult(@Nullable RemainingBalanceResponse remainingBalanceResponse, @NotNull RemainingBalanceResponse remainingBalanceResponse2) {
        Intrinsics.checkNotNullParameter(remainingBalanceResponse2, "");
        this.onNavigationEvent = remainingBalanceResponse;
        this.onWarmupCompleted = remainingBalanceResponse2;
    }

    public final RemainingBalanceResponse onNavigationEvent() {
        RemainingBalanceResponse remainingBalanceResponse;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 95;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            remainingBalanceResponse = this.onNavigationEvent;
            int i4 = 78 / 0;
        } else {
            remainingBalanceResponse = this.onNavigationEvent;
        }
        int i5 = i2 + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return remainingBalanceResponse;
    }

    public final RemainingBalanceResponse IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
