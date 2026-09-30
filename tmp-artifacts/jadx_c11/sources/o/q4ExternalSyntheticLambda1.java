package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q4ExternalSyntheticLambda1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String IAuthTabCallback;
    private final List<Object> onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4ExternalSyntheticLambda1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, ((q4ExternalSyntheticLambda1) obj).IAuthTabCallback)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.onExtraCallbackWithResult, r6.onExtraCallbackWithResult))) {
            return true;
        }
        int i3 = onWarmupCompleted + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        return i3 != 0 ? (iHashCode >>> 57) >>> this.onExtraCallbackWithResult.hashCode() : (iHashCode * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MonitoringDispatchFailureLog(message=" + this.IAuthTabCallback + ", arguments=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
        return str;
    }

    public q4ExternalSyntheticLambda1(@NotNull String str, @NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = list;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            str = this.IAuthTabCallback;
            int i4 = 28 / 0;
        } else {
            str = this.IAuthTabCallback;
        }
        int i5 = i3 + 61;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Object> IAuthTabCallback() {
        List<Object> list;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.onExtraCallbackWithResult;
            int i4 = 11 / 0;
        } else {
            list = this.onExtraCallbackWithResult;
        }
        int i5 = i2 + 21;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
