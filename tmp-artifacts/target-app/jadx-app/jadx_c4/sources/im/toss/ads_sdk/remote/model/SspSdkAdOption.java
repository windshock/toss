package im.toss.ads_sdk.remote.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getDynamicHeight;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SspSdkAdOption {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final boolean adBadgeEnabled;
    private final Integer refetchSeconds;
    private final Integer skippableOffsetSeconds;

    static {
        int i = IAuthTabCallback + 1;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }

    public SspSdkAdOption() {
        this(false, (Integer) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SspSdkAdOption)) {
            int i4 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        SspSdkAdOption sspSdkAdOption = (SspSdkAdOption) obj;
        if (this.adBadgeEnabled != sspSdkAdOption.adBadgeEnabled || !Intrinsics.areEqual(this.skippableOffsetSeconds, sspSdkAdOption.skippableOffsetSeconds)) {
            return false;
        }
        if (Intrinsics.areEqual(this.refetchSeconds, sspSdkAdOption.refetchSeconds)) {
            return true;
        }
        int i6 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[PHI: r1 r3
      0x0026: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r3v3 java.lang.Integer) = (r3v0 java.lang.Integer), (r3v5 java.lang.Integer) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
      0x0024: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        Integer num;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i2 % 128;
        int iHashCode3 = 0;
        if (i2 % 2 != 0) {
            iHashCode = Boolean.hashCode(this.adBadgeEnabled);
            num = this.skippableOffsetSeconds;
            iHashCode2 = num == null ? 0 : num.hashCode();
        } else {
            iHashCode = Boolean.hashCode(this.adBadgeEnabled);
            num = this.skippableOffsetSeconds;
            if (num == null) {
            }
        }
        Integer num2 = this.refetchSeconds;
        if (num2 != null) {
            int i3 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            iHashCode3 = num2.hashCode();
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SspSdkAdOption(adBadgeEnabled=" + this.adBadgeEnabled + ", skippableOffsetSeconds=" + this.skippableOffsetSeconds + ", refetchSeconds=" + this.refetchSeconds + ")";
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SspSdkAdOption> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                SspSdkAdOption$$serializer sspSdkAdOption$$serializer = SspSdkAdOption$$serializer.INSTANCE;
                obj.hashCode();
                throw null;
            }
            SspSdkAdOption$$serializer sspSdkAdOption$$serializer2 = SspSdkAdOption$$serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 57;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return sspSdkAdOption$$serializer2;
            }
            throw null;
        }
    }

    public /* synthetic */ SspSdkAdOption(int i, boolean z, Integer num, Integer num2, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            z = true;
        }
        this.adBadgeEnabled = z;
        if ((i & 2) == 0) {
            int i3 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.skippableOffsetSeconds = null;
            if (i4 == 0) {
                int i5 = 10 / 0;
            }
        } else {
            this.skippableOffsetSeconds = num;
            int i6 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 2;
            } else {
                int i8 = 2 % 2;
            }
        }
        if ((i & 4) != 0) {
            this.refetchSeconds = num2;
            return;
        }
        int i9 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        this.refetchSeconds = null;
    }

    public SspSdkAdOption(boolean z, @Nullable Integer num, @Nullable Integer num2) {
        this.adBadgeEnabled = z;
        this.skippableOffsetSeconds = num;
        this.refetchSeconds = num2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(SspSdkAdOption sspSdkAdOption, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!sspSdkAdOption.adBadgeEnabled) {
                vylVar.onNavigationEvent(serialDescriptor, 0, sspSdkAdOption.adBadgeEnabled);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (sspSdkAdOption.skippableOffsetSeconds != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, sspSdkAdOption.skippableOffsetSeconds);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || sspSdkAdOption.refetchSeconds != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getDynamicHeight.onWarmupCompleted, sspSdkAdOption.refetchSeconds);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SspSdkAdOption(boolean z, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            z = i2 % 2 == 0;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            num = null;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallbackWithResult;
            int i7 = i6 + 67;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 9;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            num2 = null;
        }
        this(z, num, num2);
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.adBadgeEnabled;
        int i5 = i3 + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Integer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.skippableOffsetSeconds;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.refetchSeconds;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return num;
    }
}
