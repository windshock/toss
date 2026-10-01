package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getNodeType {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final DeviceOrientationAbility IAuthTabCallback;
    private final DeviceOrientationAbility onExtraCallbackWithResult;
    private final DeviceOrientationAbility onWarmupCompleted;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.getNodeType) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (o.getNodeType) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallbackWithResult, r6.onExtraCallbackWithResult) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        r6 = o.getNodeType.onNavigationEvent + 81;
        o.getNodeType.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.IAuthTabCallback.hashCode() * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = onNavigationEvent + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BenefitAdSlots(top=" + this.IAuthTabCallback + ", bottom=" + this.onWarmupCompleted + ", feed=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
        return str;
    }

    public getNodeType(@NotNull DeviceOrientationAbility deviceOrientationAbility, @NotNull DeviceOrientationAbility deviceOrientationAbility2, @NotNull DeviceOrientationAbility deviceOrientationAbility3) {
        Intrinsics.checkNotNullParameter(deviceOrientationAbility, "");
        Intrinsics.checkNotNullParameter(deviceOrientationAbility2, "");
        Intrinsics.checkNotNullParameter(deviceOrientationAbility3, "");
        this.IAuthTabCallback = deviceOrientationAbility;
        this.onWarmupCompleted = deviceOrientationAbility2;
        this.onExtraCallbackWithResult = deviceOrientationAbility3;
    }

    public final DeviceOrientationAbility onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DeviceOrientationAbility deviceOrientationAbility = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return deviceOrientationAbility;
    }

    public final DeviceOrientationAbility onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public final DeviceOrientationAbility onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 63;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        DeviceOrientationAbility deviceOrientationAbility = this.onExtraCallbackWithResult;
        int i4 = i2 + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return deviceOrientationAbility;
    }
}
