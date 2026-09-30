package im.toss.ads_sdk.remote.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.encryptType4;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SspSdkMediationAdmob {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String adFormat;
    private final String adUnitId;
    private final String format;
    private final Long placementId;
    private final JsonObject requestOptions;
    private final SspSdkAdReward reward;

    static {
        int i = onExtraCallback + 39;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 73 / 0;
        }
    }

    public SspSdkMediationAdmob() {
        this((String) null, (Long) null, (String) null, (String) null, (SspSdkAdReward) null, (JsonObject) null, 63, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 51;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof SspSdkMediationAdmob)) {
            return false;
        }
        SspSdkMediationAdmob sspSdkMediationAdmob = (SspSdkMediationAdmob) obj;
        if (!Intrinsics.areEqual(this.adUnitId, sspSdkMediationAdmob.adUnitId)) {
            int i7 = onNavigationEvent + 35;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.placementId, sspSdkMediationAdmob.placementId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.adFormat, sspSdkMediationAdmob.adFormat)) {
            int i9 = onWarmupCompleted + 19;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.format, sspSdkMediationAdmob.format)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.reward, sspSdkMediationAdmob.reward)) {
            int i11 = onWarmupCompleted + 77;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.requestOptions, sspSdkMediationAdmob.requestOptions)) {
            return false;
        }
        int i13 = onWarmupCompleted + 5;
        onNavigationEvent = i13 % 128;
        int i14 = i13 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.adUnitId.hashCode();
        Long l = this.placementId;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        int iHashCode4 = this.adFormat.hashCode();
        int iHashCode5 = this.format.hashCode();
        SspSdkAdReward sspSdkAdReward = this.reward;
        if (sspSdkAdReward == null) {
            int i4 = onNavigationEvent;
            int i5 = i4 + 27;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 101;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 % 2;
            }
            iHashCode = 0;
        } else {
            iHashCode = sspSdkAdReward.hashCode();
            int i9 = onNavigationEvent + 53;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        JsonObject jsonObject = this.requestOptions;
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SspSdkMediationAdmob(adUnitId=" + this.adUnitId + ", placementId=" + this.placementId + ", adFormat=" + this.adFormat + ", format=" + this.format + ", reward=" + this.reward + ", requestOptions=" + this.requestOptions + ")";
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
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

        public final KSerializer<SspSdkMediationAdmob> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            SspSdkMediationAdmob$$serializer sspSdkMediationAdmob$$serializer = SspSdkMediationAdmob$$serializer.INSTANCE;
            if (i3 != 0) {
                return sspSdkMediationAdmob$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ SspSdkMediationAdmob(int i, String str, Long l, String str2, String str3, SspSdkAdReward sspSdkAdReward, JsonObject jsonObject, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.adUnitId = "";
        } else {
            this.adUnitId = str;
        }
        Object obj = null;
        if ((i & 2) == 0) {
            this.placementId = null;
        } else {
            this.placementId = l;
        }
        if ((i & 4) == 0) {
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.adFormat = "";
            if (i3 == 0) {
                int i4 = 72 / 0;
            }
        } else {
            this.adFormat = str2;
        }
        if ((i & 8) == 0) {
            int i5 = onNavigationEvent + 121;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            this.format = "";
            int i7 = 2 % 2;
        } else {
            this.format = str3;
        }
        if ((i & 16) == 0) {
            int i8 = onWarmupCompleted + 27;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            this.reward = null;
            if (i9 == 0) {
                throw null;
            }
        } else {
            this.reward = sspSdkAdReward;
        }
        int i10 = 2 % 2;
        if ((i & 32) != 0) {
            this.requestOptions = jsonObject;
            return;
        }
        int i11 = onNavigationEvent + 21;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        this.requestOptions = null;
        if (i12 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public SspSdkMediationAdmob(@NotNull String str, @Nullable Long l, @NotNull String str2, @NotNull String str3, @Nullable SspSdkAdReward sspSdkAdReward, @Nullable JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.adUnitId = str;
        this.placementId = l;
        this.adFormat = str2;
        this.format = str3;
        this.reward = sspSdkAdReward;
        this.requestOptions = jsonObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(SspSdkMediationAdmob sspSdkMediationAdmob, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(sspSdkMediationAdmob.adUnitId, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, sspSdkMediationAdmob.adUnitId);
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 % 3;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || sspSdkMediationAdmob.placementId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, sspSdkMediationAdmob.placementId);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = onNavigationEvent + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (!Intrinsics.areEqual(sspSdkMediationAdmob.adFormat, "")) {
                vylVar.onExtraCallback(serialDescriptor, 2, sspSdkMediationAdmob.adFormat);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i6 = onWarmupCompleted + 39;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (!Intrinsics.areEqual(sspSdkMediationAdmob.format, "")) {
                vylVar.onExtraCallback(serialDescriptor, 3, sspSdkMediationAdmob.format);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i8 = onWarmupCompleted + 41;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            SspSdkAdReward sspSdkAdReward = sspSdkMediationAdmob.reward;
            if (i9 == 0) {
                int i10 = 76 / 0;
                if (sspSdkAdReward != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 4, SspSdkAdReward$$serializer.INSTANCE, sspSdkMediationAdmob.reward);
                }
            } else if (sspSdkAdReward != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || sspSdkMediationAdmob.requestOptions != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, encryptType4.IAuthTabCallback, sspSdkMediationAdmob.requestOptions);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SspSdkMediationAdmob(String str, Long l, String str2, String str3, SspSdkAdReward sspSdkAdReward, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l2;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 99;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            l2 = null;
        } else {
            l2 = l;
        }
        this(str, l2, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : sspSdkAdReward, (i & 32) == 0 ? jsonObject : null);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.adUnitId;
        int i5 = i3 + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return str;
    }

    public final Long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.placementId;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.adFormat;
        int i5 = i3 + 59;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            str = this.format;
            int i4 = 7 / 0;
        } else {
            str = this.format;
        }
        int i5 = i3 + 57;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return str;
    }

    public final JsonObject onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 81;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        JsonObject jsonObject = this.requestOptions;
        int i5 = i2 + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return jsonObject;
    }
}
