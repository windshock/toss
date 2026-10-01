package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RotationVectorAbility2$onExtraCallback implements RotationVectorAbility2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final stopDeviceShakeListener onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 45;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof RotationVectorAbility2$onExtraCallback) {
            return Intrinsics.areEqual(this.onWarmupCompleted, ((RotationVectorAbility2$onExtraCallback) obj).onWarmupCompleted);
        }
        int i4 = i2 + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.onWarmupCompleted.hashCode();
        int i3 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PremiumBoard(pointButton=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final stopDeviceShakeListener onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        stopDeviceShakeListener stopdeviceshakelistener = this.onWarmupCompleted;
        int i5 = i3 + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return stopdeviceshakelistener;
    }
}
