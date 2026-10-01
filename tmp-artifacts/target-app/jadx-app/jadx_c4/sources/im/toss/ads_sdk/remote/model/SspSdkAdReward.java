package im.toss.ads_sdk.remote.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SspSdkAdReward {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final int amount;
    private final String type;

    static {
        int i = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 27 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SspSdkAdReward() {
        String str = null;
        this(str, 0, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SspSdkAdReward)) {
            return false;
        }
        SspSdkAdReward sspSdkAdReward = (SspSdkAdReward) obj;
        if (!(!Intrinsics.areEqual(this.type, sspSdkAdReward.type))) {
            return this.amount == sspSdkAdReward.amount;
        }
        int i4 = onNavigationEvent + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.type.hashCode() >>> 13) << Integer.hashCode(this.amount) : (this.type.hashCode() * 31) + Integer.hashCode(this.amount);
        int i3 = onNavigationEvent + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 30 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SspSdkAdReward(type=" + this.type + ", amount=" + this.amount + ")";
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SspSdkAdReward> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SspSdkAdReward$$serializer sspSdkAdReward$$serializer = SspSdkAdReward$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
            return sspSdkAdReward$$serializer;
        }
    }

    public /* synthetic */ SspSdkAdReward(int i, String str, int i2, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i3 = onNavigationEvent + 27;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str = "";
        }
        this.type = str;
        if ((i & 2) != 0) {
            this.amount = i2;
            return;
        }
        int i6 = onExtraCallback + 47;
        onNavigationEvent = i6 % 128;
        this.amount = i6 % 2 == 0 ? 1 : 0;
    }

    public SspSdkAdReward(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.amount = i;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(SspSdkAdReward sspSdkAdReward, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(sspSdkAdReward.type, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, sspSdkAdReward.type);
            int i2 = onNavigationEvent + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallback + 15;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (sspSdkAdReward.amount == 0) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 1, sspSdkAdReward.amount);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SspSdkAdReward(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = onNavigationEvent + 17;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 16 / 0;
            }
            int i5 = 2 % 2;
            str = "";
        }
        if ((i2 & 2) != 0) {
            int i6 = onNavigationEvent + 101;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(str, i);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.amount;
        int i6 = i2 + 15;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
