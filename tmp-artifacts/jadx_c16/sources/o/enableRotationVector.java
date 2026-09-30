package o;

import im.toss.features.benefit.dto.BenefitActivationIntelligence;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class enableRotationVector extends SensorBridgeExtension3 implements SensorBridgeExtension {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final BenefitActivationIntelligence.Type3 onExtraCallbackWithResult;
    private final int onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof enableRotationVector)) {
            int i4 = onExtraCallback + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        enableRotationVector enablerotationvector = (enableRotationVector) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, enablerotationvector.onExtraCallbackWithResult)) {
            return false;
        }
        if (this.onNavigationEvent == enablerotationvector.onNavigationEvent) {
            return true;
        }
        int i6 = IAuthTabCallback + 91;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        return i3 == 0 ? (iHashCode * 7) << Integer.hashCode(this.onNavigationEvent) : (iHashCode * 31) + Integer.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BenefitActivationIntelligenceType3Item(data=" + this.onExtraCallbackWithResult + ", sectionOrder=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public enableRotationVector(@NotNull BenefitActivationIntelligence.Type3 type3, int i) {
        Intrinsics.checkNotNullParameter(type3, "");
        this.onExtraCallbackWithResult = type3;
        this.onNavigationEvent = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ enableRotationVector(BenefitActivationIntelligence.Type3 type3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 27;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 33;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(type3, i);
    }

    public final BenefitActivationIntelligence.Type3 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        BenefitActivationIntelligence.Type3 type3 = this.onExtraCallbackWithResult;
        int i5 = i3 + 101;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return type3;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i2 + 119;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
