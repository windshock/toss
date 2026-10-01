package o;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class initNativePlugin implements disableAnrReporting<r8lambdauySRm1mZP8abhbkrYCVyutMa2H4> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Function2<Integer, Integer, Unit> IAuthTabCallback;
    private final List<r8lambdauySRm1mZP8abhbkrYCVyutMa2H4> onNavigationEvent;
    private int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof initNativePlugin)) {
            return false;
        }
        initNativePlugin initnativeplugin = (initNativePlugin) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, initnativeplugin.onNavigationEvent)) {
            int i4 = onExtraCallbackWithResult + 17;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.onWarmupCompleted != initnativeplugin.onWarmupCompleted) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, initnativeplugin.IAuthTabCallback)) {
            return true;
        }
        int i6 = onExtraCallback + 55;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.onNavigationEvent.hashCode() * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + this.IAuthTabCallback.hashCode();
        int i4 = onExtraCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsMenuV1CheckBoxGroup(items=" + this.onNavigationEvent + ", checkedIndex=" + this.onWarmupCompleted + ", onClicked=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
        return str;
    }

    @Override // o.disableAnrReporting
    public List<r8lambdauySRm1mZP8abhbkrYCVyutMa2H4> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<r8lambdauySRm1mZP8abhbkrYCVyutMa2H4> list = this.onNavigationEvent;
        int i5 = i2 + 59;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i3 + 41;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 43;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        this.onWarmupCompleted = i;
        int i6 = i4 + 119;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public final Function2<Integer, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Function2<Integer, Integer, Unit> function2 = this.IAuthTabCallback;
        int i5 = i3 + 91;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final r8lambdauySRm1mZP8abhbkrYCVyutMa2H4 IAuthTabCallback() {
        r8lambdauySRm1mZP8abhbkrYCVyutMa2H4 r8lambdauysrm1mzp8abhbkrycvyutma2h4;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            r8lambdauysrm1mzp8abhbkrycvyutma2h4 = (r8lambdauySRm1mZP8abhbkrYCVyutMa2H4) CollectionsKt___CollectionsKt.getOrNull(onExtraCallbackWithResult(), this.onWarmupCompleted);
            int i3 = 16 / 0;
        } else {
            r8lambdauysrm1mzp8abhbkrycvyutma2h4 = (r8lambdauySRm1mZP8abhbkrYCVyutMa2H4) CollectionsKt___CollectionsKt.getOrNull(onExtraCallbackWithResult(), this.onWarmupCompleted);
        }
        int i4 = onExtraCallbackWithResult + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return r8lambdauysrm1mzp8abhbkrycvyutma2h4;
        }
        throw null;
    }
}
