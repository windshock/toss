package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw {
    private static int asInterface = 0;
    private static int onTransact = 1;
    private final int IAuthTabCallback;
    private final boolean asBinder;
    private final int onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final boolean onWarmupCompleted;

    public r8lambdaQnRUHkCOdtAfUc0ntUwc8JIScw(@NotNull getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks, @NotNull getDirectClickTrackingPostbacks getdirectclicktrackingpostbacks2) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(getdirectclicktrackingpostbacks, "");
        Intrinsics.checkNotNullParameter(getdirectclicktrackingpostbacks2, "");
        int iOnNavigationEvent = getdirectclicktrackingpostbacks.onNavigationEvent() - getdirectclicktrackingpostbacks2.onNavigationEvent();
        this.IAuthTabCallback = iOnNavigationEvent;
        int iAbs = Math.abs(iOnNavigationEvent);
        this.onExtraCallback = iAbs;
        boolean z3 = true;
        if (iOnNavigationEvent > 0) {
            int i = asInterface + 41;
            onTransact = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            z = true;
        } else {
            z = false;
        }
        this.onExtraCallbackWithResult = z;
        if (iOnNavigationEvent < 0) {
            int i4 = onTransact + 77;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        this.onWarmupCompleted = z2;
        if (iAbs == 0) {
            int i6 = onTransact + 105;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
            }
            this.asBinder = z3;
            this.onNavigationEvent = RangesKt.coerceAtLeast(iOnNavigationEvent, 0);
        }
        int i7 = asInterface + 119;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 2 % 2;
        z3 = false;
        this.asBinder = z3;
        this.onNavigationEvent = RangesKt.coerceAtLeast(iOnNavigationEvent, 0);
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 79;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onExtraCallbackWithResult;
        int i4 = i2 + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.onWarmupCompleted;
        int i5 = i3 + 5;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return z;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 53;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i2 + 121;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
