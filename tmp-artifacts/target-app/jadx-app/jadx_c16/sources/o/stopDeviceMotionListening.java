package o;

import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class stopDeviceMotionListening extends SensorBridgeExtension3 implements SensorBridgeExtension {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final BenefitActivationIntelligence.Type1 onExtraCallback;
    private final int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof stopDeviceMotionListening)) {
            int i4 = IAuthTabCallback + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        stopDeviceMotionListening stopdevicemotionlistening = (stopDeviceMotionListening) obj;
        if (Intrinsics.areEqual(this.onExtraCallback, stopdevicemotionlistening.onExtraCallback)) {
            return this.onWarmupCompleted == stopdevicemotionlistening.onWarmupCompleted;
        }
        int i6 = onNavigationEvent + 17;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallback.hashCode();
        return i3 == 0 ? (iHashCode - 22) >> Integer.hashCode(this.onWarmupCompleted) : (iHashCode * 31) + Integer.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BenefitActivationIntelligenceType1Item(data=" + this.onExtraCallback + ", sectionOrder=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public stopDeviceMotionListening(@NotNull BenefitActivationIntelligence.Type1 type1, int i) {
        Intrinsics.checkNotNullParameter(type1, "");
        this.onExtraCallback = type1;
        this.onWarmupCompleted = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ stopDeviceMotionListening(BenefitActivationIntelligence.Type1 type1, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 39;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 5;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(type1, i);
    }

    public final BenefitActivationIntelligence.Type1 onNavigationEvent() {
        BenefitActivationIntelligence.Type1 type1;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            type1 = this.onExtraCallback;
            int i4 = 29 / 0;
        } else {
            type1 = this.onExtraCallback;
        }
        int i5 = i2 + 77;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return type1;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onWarmupCompleted;
        if (i3 == 0) {
            int i5 = 34 / 0;
        }
        return i4;
    }
}
