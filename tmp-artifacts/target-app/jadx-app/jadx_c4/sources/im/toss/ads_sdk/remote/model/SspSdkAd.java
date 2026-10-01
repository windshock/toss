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
import o.setScrollingCacheEnabled;
import o.setUserInputEnabled;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SspSdkAd {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String adFormat;
    private final String adId;
    private final SspSdkAdOption adOption;
    private final JsonObject experimentVariables;
    private final SspSdkMediation mediation;
    private final String placementId;
    private final SspSdkAdReward reward;
    private final SdkTemplate sdkTemplate;
    private final String slotId;
    private final String status;

    static {
        int i = onNavigationEvent + 73;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public SspSdkAd() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (SspSdkAdOption) null, (SspSdkMediation) null, (SdkTemplate) null, (SspSdkAdReward) null, (JsonObject) null, 1023, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SspSdkAd)) {
            int i5 = i2 + 107;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        SspSdkAd sspSdkAd = (SspSdkAd) obj;
        if (!Intrinsics.areEqual(this.slotId, sspSdkAd.slotId) || !Intrinsics.areEqual(this.placementId, sspSdkAd.placementId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.status, sspSdkAd.status)) {
            int i7 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 92 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.adFormat, sspSdkAd.adFormat) || !Intrinsics.areEqual(this.adId, sspSdkAd.adId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.adOption, sspSdkAd.adOption)) {
            int i9 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i9 % 128;
            return i9 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.mediation, sspSdkAd.mediation)) {
            int i10 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sdkTemplate, sspSdkAd.sdkTemplate)) {
            int i12 = onExtraCallbackWithResult + 7;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.reward, sspSdkAd.reward)) {
            int i14 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.experimentVariables, sspSdkAd.experimentVariables)) {
            return true;
        }
        int i16 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = this.slotId.hashCode();
        int iHashCode4 = this.placementId.hashCode();
        int iHashCode5 = this.status.hashCode();
        int iHashCode6 = this.adFormat.hashCode();
        int iHashCode7 = this.adId.hashCode();
        SspSdkAdOption sspSdkAdOption = this.adOption;
        if (sspSdkAdOption == null) {
            int i4 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = sspSdkAdOption.hashCode();
        }
        SspSdkMediation sspSdkMediation = this.mediation;
        int iHashCode8 = sspSdkMediation == null ? 0 : sspSdkMediation.hashCode();
        SdkTemplate sdkTemplate = this.sdkTemplate;
        int iHashCode9 = sdkTemplate == null ? 0 : sdkTemplate.hashCode();
        SspSdkAdReward sspSdkAdReward = this.reward;
        if (sspSdkAdReward == null) {
            int i6 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = sspSdkAdReward.hashCode();
        }
        JsonObject jsonObject = this.experimentVariables;
        return (((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SspSdkAd(slotId=" + this.slotId + ", placementId=" + this.placementId + ", status=" + this.status + ", adFormat=" + this.adFormat + ", adId=" + this.adId + ", adOption=" + this.adOption + ", mediation=" + this.mediation + ", sdkTemplate=" + this.sdkTemplate + ", reward=" + this.reward + ", experimentVariables=" + this.experimentVariables + ")";
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SspSdkAd> serializer() {
            SspSdkAd$$serializer sspSdkAd$$serializer;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                sspSdkAd$$serializer = SspSdkAd$$serializer.INSTANCE;
                int i3 = 58 / 0;
            } else {
                sspSdkAd$$serializer = SspSdkAd$$serializer.INSTANCE;
            }
            int i4 = IAuthTabCallback + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
            return sspSdkAd$$serializer;
        }
    }

    public /* synthetic */ SspSdkAd(int i, String str, String str2, String str3, String str4, String str5, SspSdkAdOption sspSdkAdOption, SspSdkMediation sspSdkMediation, SdkTemplate sdkTemplate, SspSdkAdReward sspSdkAdReward, JsonObject jsonObject, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.slotId = "";
            int i2 = 2 % 2;
        } else {
            this.slotId = str;
        }
        if ((i & 2) == 0) {
            this.placementId = "";
        } else {
            this.placementId = str2;
        }
        if ((i & 4) == 0) {
            this.status = "";
        } else {
            this.status = str3;
        }
        if ((i & 8) == 0) {
            int i3 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            this.adFormat = "";
        } else {
            this.adFormat = str4;
        }
        if ((i & 16) == 0) {
            int i5 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            this.adId = "";
            if (i6 != 0) {
                throw null;
            }
        } else {
            this.adId = str5;
        }
        if ((i & 32) == 0) {
            this.adOption = null;
            int i7 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        } else {
            this.adOption = sspSdkAdOption;
        }
        if ((i & 64) == 0) {
            this.mediation = null;
            int i10 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 5 % 5;
            } else {
                int i12 = 2 % 2;
            }
        } else {
            this.mediation = sspSdkMediation;
        }
        if ((i & 128) == 0) {
            this.sdkTemplate = null;
            int i13 = 2 % 2;
        } else {
            this.sdkTemplate = sdkTemplate;
        }
        if ((i & 256) == 0) {
            int i14 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            this.reward = null;
        } else {
            this.reward = sspSdkAdReward;
            int i16 = onExtraCallbackWithResult + 57;
            IAuthTabCallback = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 2 % 2;
            }
        }
        if ((i & 512) == 0) {
            this.experimentVariables = null;
        } else {
            this.experimentVariables = jsonObject;
        }
    }

    public SspSdkAd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable SspSdkAdOption sspSdkAdOption, @Nullable SspSdkMediation sspSdkMediation, @Nullable SdkTemplate sdkTemplate, @Nullable SspSdkAdReward sspSdkAdReward, @Nullable JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.slotId = str;
        this.placementId = str2;
        this.status = str3;
        this.adFormat = str4;
        this.adId = str5;
        this.adOption = sspSdkAdOption;
        this.mediation = sspSdkMediation;
        this.sdkTemplate = sdkTemplate;
        this.reward = sspSdkAdReward;
        this.experimentVariables = jsonObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(SspSdkAd sspSdkAd, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0)) || !Intrinsics.areEqual(sspSdkAd.slotId, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, sspSdkAd.slotId);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(sspSdkAd.placementId, "")) {
            vylVar.onExtraCallback(serialDescriptor, 1, sspSdkAd.placementId);
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 2)) || (!Intrinsics.areEqual(sspSdkAd.status, ""))) {
            vylVar.onExtraCallback(serialDescriptor, 2, sspSdkAd.status);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(sspSdkAd.adFormat, "")) {
            vylVar.onExtraCallback(serialDescriptor, 3, sspSdkAd.adFormat);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(sspSdkAd.adId, "")) {
            vylVar.onExtraCallback(serialDescriptor, 4, sspSdkAd.adId);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i4 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 52 / 0;
                if (sspSdkAd.adOption != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 5, SspSdkAdOption$$serializer.INSTANCE, sspSdkAd.adOption);
                }
            } else if (sspSdkAd.adOption != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || sspSdkAd.mediation != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, SspSdkMediation$$serializer.INSTANCE, sspSdkAd.mediation);
            int i6 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || sspSdkAd.sdkTemplate != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, setUserInputEnabled.onExtraCallbackWithResult, sspSdkAd.sdkTemplate);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || sspSdkAd.reward != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, SspSdkAdReward$$serializer.INSTANCE, sspSdkAd.reward);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
            int i8 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            if (sspSdkAd.experimentVariables == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 9, encryptType4.IAuthTabCallback, sspSdkAd.experimentVariables);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SspSdkAd(String str, String str2, String str3, String str4, String str5, SspSdkAdOption sspSdkAdOption, SspSdkMediation sspSdkMediation, SdkTemplate sdkTemplate, SspSdkAdReward sspSdkAdReward, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        SspSdkMediation sspSdkMediation2;
        SdkTemplate sdkTemplate2;
        SspSdkAdReward sspSdkAdReward2;
        String str7 = (i & 1) != 0 ? "" : str;
        String str8 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i2 = 2 % 2;
            str6 = "";
        } else {
            str6 = str3;
        }
        String str9 = (i & 8) != 0 ? "" : str4;
        String str10 = (i & 16) == 0 ? str5 : "";
        JsonObject jsonObject2 = null;
        SspSdkAdOption sspSdkAdOption2 = (i & 32) != 0 ? null : sspSdkAdOption;
        if ((i & 64) != 0) {
            int i3 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            sspSdkMediation2 = null;
        } else {
            sspSdkMediation2 = sspSdkMediation;
        }
        if ((i & 128) != 0) {
            int i5 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                jsonObject2.hashCode();
                throw null;
            }
            sdkTemplate2 = null;
        } else {
            sdkTemplate2 = sdkTemplate;
        }
        if ((i & 256) != 0) {
            int i6 = 2 % 2;
            sspSdkAdReward2 = null;
        } else {
            sspSdkAdReward2 = sspSdkAdReward;
        }
        if ((i & 512) != 0) {
            int i7 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        } else {
            jsonObject2 = jsonObject;
        }
        this(str7, str8, str6, str9, str10, sspSdkAdOption2, sspSdkMediation2, sdkTemplate2, sspSdkAdReward2, jsonObject2);
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.slotId;
        int i5 = i3 + 79;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.status;
        int i4 = i2 + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.adId;
        int i5 = i2 + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SspSdkAdOption onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SspSdkAdOption sspSdkAdOption = this.adOption;
        int i5 = i2 + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return sspSdkAdOption;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SspSdkMediation onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SspSdkMediation sspSdkMediation = this.mediation;
        int i5 = i2 + 5;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return sspSdkMediation;
    }

    public final SdkTemplate onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SdkTemplate sdkTemplate = this.sdkTemplate;
        int i5 = i2 + 29;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return sdkTemplate;
    }

    public final SspSdkAdReward onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SspSdkAdReward sspSdkAdReward = this.reward;
        int i5 = i3 + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return sspSdkAdReward;
    }

    public final setScrollingCacheEnabled asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setScrollingCacheEnabled setscrollingcacheenabledOnExtraCallback = setScrollingCacheEnabled.Companion.onExtraCallback(this.status);
        int i4 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return setscrollingcacheenabledOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
