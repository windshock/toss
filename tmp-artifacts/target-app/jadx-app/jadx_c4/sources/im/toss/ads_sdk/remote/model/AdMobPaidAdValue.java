package im.toss.ads_sdk.remote.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AdMobPaidAdValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final String currencyCode;
    private final String precisionType;
    private final Long valueMicros;

    static {
        int i = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AdMobPaidAdValue)) {
            int i4 = onNavigationEvent + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        AdMobPaidAdValue adMobPaidAdValue = (AdMobPaidAdValue) obj;
        if (Intrinsics.areEqual(this.valueMicros, adMobPaidAdValue.valueMicros)) {
            return Intrinsics.areEqual(this.currencyCode, adMobPaidAdValue.currencyCode) && Intrinsics.areEqual(this.precisionType, adMobPaidAdValue.precisionType);
        }
        int i6 = onExtraCallback + 51;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Long l = this.valueMicros;
        if (l == null) {
            int i4 = i3 + 21;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        return (((iHashCode * 31) + this.currencyCode.hashCode()) * 31) + this.precisionType.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdMobPaidAdValue(valueMicros=" + this.valueMicros + ", currencyCode=" + this.currencyCode + ", precisionType=" + this.precisionType + ")";
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdMobPaidAdValue> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AdMobPaidAdValue$$serializer adMobPaidAdValue$$serializer = AdMobPaidAdValue$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 15;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return adMobPaidAdValue$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ AdMobPaidAdValue(int i, Long l, String str, String str2, okycx okycxVar) {
        if (6 != (i & 6)) {
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 6, AdMobPaidAdValue$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.valueMicros = null;
        } else {
            this.valueMicros = l;
            int i4 = onNavigationEvent + 119;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 5;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.currencyCode = str;
        this.precisionType = str2;
        int i7 = onNavigationEvent + 99;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    public AdMobPaidAdValue(@Nullable Long l, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueMicros = l;
        this.currencyCode = str;
        this.precisionType = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(AdMobPaidAdValue adMobPaidAdValue, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (adMobPaidAdValue.valueMicros != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, adMobPaidAdValue.valueMicros);
                int i4 = onNavigationEvent + 95;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 5;
                }
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 1, adMobPaidAdValue.currencyCode);
        vylVar.onExtraCallback(serialDescriptor, 2, adMobPaidAdValue.precisionType);
    }

    public final Long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.valueMicros;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currencyCode;
        int i5 = i2 + 53;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.precisionType;
        int i4 = i3 + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
