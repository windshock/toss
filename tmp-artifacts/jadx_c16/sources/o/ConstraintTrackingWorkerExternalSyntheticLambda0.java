package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ConstraintTrackingWorkerExternalSyntheticLambda0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final List<RemoteWorkContinuation> onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConstraintTrackingWorkerExternalSyntheticLambda0)) {
            int i4 = i2 + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, ((ConstraintTrackingWorkerExternalSyntheticLambda0) obj).onExtraCallback)) {
            return false;
        }
        int i6 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallback.hashCode();
        int i4 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BottomInfoData(items=" + this.onExtraCallback + ")";
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<RemoteWorkContinuation> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
