package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableSensorServiceContextOpt {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<LifeCycleBlockOptimizeEventTracker> onExtraCallback;
    private final CommonSwitch onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 71;
            onNavigationEvent = i2 % 128;
            return !(i2 % 2 != 0);
        }
        if (!(obj instanceof enableSensorServiceContextOpt)) {
            int i3 = onNavigationEvent + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        enableSensorServiceContextOpt enablesensorservicecontextopt = (enableSensorServiceContextOpt) obj;
        if (Intrinsics.areEqual(this.onExtraCallback, enablesensorservicecontextopt.onExtraCallback)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, enablesensorservicecontextopt.onExtraCallbackWithResult);
        }
        int i5 = onWarmupCompleted + 39;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onExtraCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = onWarmupCompleted + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditTermsGroupInfo(termsGroupInfo=" + this.onExtraCallback + ", creditStandardTermsUiData=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public enableSensorServiceContextOpt(@NotNull List<LifeCycleBlockOptimizeEventTracker> list, @NotNull CommonSwitch commonSwitch) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(commonSwitch, "");
        this.onExtraCallback = list;
        this.onExtraCallbackWithResult = commonSwitch;
    }

    public final List<LifeCycleBlockOptimizeEventTracker> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<LifeCycleBlockOptimizeEventTracker> list = this.onExtraCallback;
        int i5 = i3 + 29;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<LifeCycleBlockOptimizeEventTracker> onExtraCallbackWithResult() {
        int i = 2 % 2;
        List<LifeCycleBlockOptimizeEventTracker> list = this.onExtraCallback;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            Object next = it.next();
            if (!((LifeCycleBlockOptimizeEventTracker) next).onExtraCallbackWithResult()) {
                int i2 = onNavigationEvent + 117;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                arrayList.add(next);
                int i4 = onWarmupCompleted + 125;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 % 4;
                }
            }
        }
        int i6 = onWarmupCompleted + 117;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 44 / 0;
        }
        return arrayList;
    }
}
