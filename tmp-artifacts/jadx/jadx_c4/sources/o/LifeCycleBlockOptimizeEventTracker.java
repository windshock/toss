package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LifeCycleBlockOptimizeEventTracker {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final boolean IAuthTabCallback;
    private final String onExtraCallback;
    private final List<ANROptimizeSwitchOnANROptimizeSwitchCallback> onExtraCallbackWithResult;
    private final getSwitchValue onNavigationEvent;
    private final setUcInitOpt onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 53;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof LifeCycleBlockOptimizeEventTracker)) {
            return false;
        }
        LifeCycleBlockOptimizeEventTracker lifeCycleBlockOptimizeEventTracker = (LifeCycleBlockOptimizeEventTracker) obj;
        if (this.onWarmupCompleted != lifeCycleBlockOptimizeEventTracker.onWarmupCompleted) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, lifeCycleBlockOptimizeEventTracker.onExtraCallback)) {
            int i4 = onTransact + 69;
            asInterface = i4 % 128;
            return i4 % 2 != 0;
        }
        if (this.IAuthTabCallback != lifeCycleBlockOptimizeEventTracker.IAuthTabCallback || this.onNavigationEvent != lifeCycleBlockOptimizeEventTracker.onNavigationEvent || !Intrinsics.areEqual(this.onExtraCallbackWithResult, lifeCycleBlockOptimizeEventTracker.onExtraCallbackWithResult)) {
            return false;
        }
        int i5 = onTransact + 111;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 83;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        setUcInitOpt setucinitopt = this.onWarmupCompleted;
        if (setucinitopt == null) {
            i = 0;
        } else {
            int iHashCode = setucinitopt.hashCode();
            int i5 = onTransact + 53;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return (((((((i * 31) + this.onExtraCallback.hashCode()) * 31) + Boolean.hashCode(this.IAuthTabCallback)) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TermsGroupInfo(group=" + this.onWarmupCompleted + ", title=" + this.onExtraCallback + ", agreed=" + this.IAuthTabCallback + ", necessity=" + this.onNavigationEvent + ", terms=" + this.onExtraCallbackWithResult + ")";
        int i2 = onTransact + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public LifeCycleBlockOptimizeEventTracker(@Nullable setUcInitOpt setucinitopt, @NotNull String str, boolean z, @NotNull getSwitchValue getswitchvalue, @NotNull List<ANROptimizeSwitchOnANROptimizeSwitchCallback> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getswitchvalue, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.onWarmupCompleted = setucinitopt;
        this.onExtraCallback = str;
        this.IAuthTabCallback = z;
        this.onNavigationEvent = getswitchvalue;
        this.onExtraCallbackWithResult = list;
    }

    public final setUcInitOpt onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 53;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        setUcInitOpt setucinitopt = this.onWarmupCompleted;
        int i5 = i2 + 57;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return setucinitopt;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return z;
    }
}
