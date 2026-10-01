package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class hotUpdateApp$onExtraCallback implements hotUpdateApp {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final String onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof hotUpdateApp$onExtraCallback)) {
            int i4 = onExtraCallback + 61;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        hotUpdateApp$onExtraCallback hotupdateapp_onextracallback = (hotUpdateApp$onExtraCallback) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, hotupdateapp_onextracallback.onExtraCallbackWithResult)) {
            return false;
        }
        if (this.onWarmupCompleted == hotupdateapp_onextracallback.onWarmupCompleted) {
            return true;
        }
        int i6 = onExtraCallback + 43;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onExtraCallbackWithResult.hashCode() * 31) + Integer.hashCode(this.onWarmupCompleted);
        int i4 = onExtraCallback + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NoChangedRemainingMoney(moneyTypes=" + this.onExtraCallbackWithResult + ", point=" + this.onWarmupCompleted + ")";
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public hotUpdateApp$onExtraCallback(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = i;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i3 + 3;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
