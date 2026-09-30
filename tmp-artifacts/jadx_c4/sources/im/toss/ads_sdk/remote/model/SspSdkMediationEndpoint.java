package im.toss.ads_sdk.remote.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SspSdkMediationEndpoint {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String error;
    private final String exposure;
    private final String result;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = IAuthTabCallback + 99;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public SspSdkMediationEndpoint() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SspSdkMediationEndpoint)) {
            return false;
        }
        SspSdkMediationEndpoint sspSdkMediationEndpoint = (SspSdkMediationEndpoint) obj;
        if (!Intrinsics.areEqual(this.result, sspSdkMediationEndpoint.result)) {
            int i2 = onExtraCallbackWithResult + 99;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.exposure, sspSdkMediationEndpoint.exposure)) {
            int i3 = onExtraCallbackWithResult + 3;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.error, sspSdkMediationEndpoint.error)) {
            return false;
        }
        int i5 = onExtraCallbackWithResult + 123;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int iHashCode2 = 1;
        if (i2 % 2 != 0 ? (str = this.result) != null : (str = this.result) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i3 + 119;
            onExtraCallback = i4 % 128;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        }
        String str2 = this.exposure;
        if (str2 == null) {
            int i5 = onExtraCallbackWithResult + 37;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                iHashCode2 = 0;
            }
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.error;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SspSdkMediationEndpoint(result=" + this.result + ", exposure=" + this.exposure + ", error=" + this.error + ")";
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SspSdkMediationEndpoint> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                SspSdkMediationEndpoint$$serializer sspSdkMediationEndpoint$$serializer = SspSdkMediationEndpoint$$serializer.INSTANCE;
                throw null;
            }
            SspSdkMediationEndpoint$$serializer sspSdkMediationEndpoint$$serializer2 = SspSdkMediationEndpoint$$serializer.INSTANCE;
            int i3 = onWarmupCompleted + 111;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 66 / 0;
            }
            return sspSdkMediationEndpoint$$serializer2;
        }
    }

    public /* synthetic */ SspSdkMediationEndpoint(int i, String str, String str2, String str3, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.result = null;
            int i2 = onExtraCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.result = str;
        }
        if ((i & 2) == 0) {
            int i5 = onExtraCallback + 55;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            this.exposure = null;
            if (i6 == 0) {
                obj.hashCode();
                throw null;
            }
            int i7 = 2 % 2;
        } else {
            this.exposure = str2;
        }
        if ((i & 4) != 0) {
            this.error = str3;
            return;
        }
        int i8 = onExtraCallback + 63;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        this.error = null;
        if (i9 == 0) {
            throw null;
        }
    }

    public SspSdkMediationEndpoint(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.result = str;
        this.exposure = str2;
        this.error = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(SspSdkMediationEndpoint sspSdkMediationEndpoint, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 37 / 0;
                if (sspSdkMediationEndpoint.result != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, sspSdkMediationEndpoint.result);
                }
            } else if (sspSdkMediationEndpoint.result != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallbackWithResult + 71;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                String str = sspSdkMediationEndpoint.exposure;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (sspSdkMediationEndpoint.exposure != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, sspSdkMediationEndpoint.exposure);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i5 = onExtraCallback + 87;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (sspSdkMediationEndpoint.error == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, sspSdkMediationEndpoint.error);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SspSdkMediationEndpoint(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallback + 75;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 54 / 0;
            }
            str3 = null;
        }
        this(str, str2, str3);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.result;
        int i5 = i3 + 45;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.exposure;
        int i5 = i3 + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.error;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
