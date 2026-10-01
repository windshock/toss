package im.toss.ads_sdk.remote.model;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.ViewPager2;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class MediationResultLogRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String adMobFailed;
    private final AdMobFailedDetail adMobFailedDetail;
    private final String adUnitId;
    private final String automationSessionId;
    private final ExposureContent content;
    private final String eventContextToken;
    private final String eventTs;
    private final String mediationId;
    private final Long placementId;
    private final String requestId;
    private final String spaceUnitId;
    private final String tossFailed;
    private final String winnerSource;

    static {
        int i = onNavigationEvent + 17;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediationResultLogRequest)) {
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        MediationResultLogRequest mediationResultLogRequest = (MediationResultLogRequest) obj;
        if (!Intrinsics.areEqual(this.mediationId, mediationResultLogRequest.mediationId)) {
            int i4 = onExtraCallback + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.requestId, mediationResultLogRequest.requestId)) {
            int i6 = IAuthTabCallback + 103;
            onExtraCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.eventContextToken, mediationResultLogRequest.eventContextToken)) {
            int i7 = onExtraCallback + 69;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.winnerSource, mediationResultLogRequest.winnerSource) || !Intrinsics.areEqual(this.content, mediationResultLogRequest.content) || !Intrinsics.areEqual(this.tossFailed, mediationResultLogRequest.tossFailed) || !Intrinsics.areEqual(this.adMobFailed, mediationResultLogRequest.adMobFailed)) {
            return false;
        }
        if (Intrinsics.areEqual(this.adMobFailedDetail, mediationResultLogRequest.adMobFailedDetail)) {
            return Intrinsics.areEqual(this.spaceUnitId, mediationResultLogRequest.spaceUnitId) && Intrinsics.areEqual(this.adUnitId, mediationResultLogRequest.adUnitId) && Intrinsics.areEqual(this.placementId, mediationResultLogRequest.placementId) && Intrinsics.areEqual(this.automationSessionId, mediationResultLogRequest.automationSessionId) && Intrinsics.areEqual(this.eventTs, mediationResultLogRequest.eventTs);
        }
        int i9 = IAuthTabCallback + 65;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iHashCode5 = this.mediationId.hashCode();
        String str = this.requestId;
        int iHashCode6 = 0;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.eventContextToken;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.winnerSource;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        ExposureContent exposureContent = this.content;
        int iHashCode10 = exposureContent == null ? 0 : exposureContent.hashCode();
        String str4 = this.tossFailed;
        if (str4 == null) {
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str4.hashCode();
            int i4 = onExtraCallback + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        String str5 = this.adMobFailed;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        AdMobFailedDetail adMobFailedDetail = this.adMobFailedDetail;
        int iHashCode12 = adMobFailedDetail == null ? 0 : adMobFailedDetail.hashCode();
        int iHashCode13 = this.spaceUnitId.hashCode();
        String str6 = this.adUnitId;
        if (str6 == null) {
            int i6 = onExtraCallback + 19;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str6.hashCode();
        }
        Long l = this.placementId;
        if (l == null) {
            int i8 = onExtraCallback + 77;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = l.hashCode();
        }
        String str7 = this.automationSessionId;
        if (str7 == null) {
            int i10 = onExtraCallback + 73;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str7.hashCode();
        }
        String str8 = this.eventTs;
        if (str8 != null) {
            int i12 = IAuthTabCallback + 115;
            onExtraCallback = i12 % 128;
            if (i12 % 2 == 0) {
                str8.hashCode();
                throw null;
            }
            iHashCode6 = str8.hashCode();
        }
        return (((((((((((((((((((((((iHashCode5 * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MediationResultLogRequest(mediationId=" + this.mediationId + ", requestId=" + this.requestId + ", eventContextToken=" + this.eventContextToken + ", winnerSource=" + this.winnerSource + ", content=" + this.content + ", tossFailed=" + this.tossFailed + ", adMobFailed=" + this.adMobFailed + ", adMobFailedDetail=" + this.adMobFailedDetail + ", spaceUnitId=" + this.spaceUnitId + ", adUnitId=" + this.adUnitId + ", placementId=" + this.placementId + ", automationSessionId=" + this.automationSessionId + ", eventTs=" + this.eventTs + ")";
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ MediationResultLogRequest(int i, String str, String str2, String str3, String str4, ExposureContent exposureContent, String str5, String str6, AdMobFailedDetail adMobFailedDetail, String str7, String str8, Long l, String str9, String str10, okycx okycxVar) {
        if (257 != (i & 257)) {
            htf31.onExtraCallbackWithResult(i, 257, MediationResultLogRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.mediationId = str;
        Object obj = null;
        if ((i & 2) == 0) {
            this.requestId = null;
        } else {
            this.requestId = str2;
        }
        if ((i & 4) == 0) {
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.eventContextToken = null;
        } else {
            this.eventContextToken = str3;
        }
        if ((i & 8) == 0) {
            this.winnerSource = null;
        } else {
            this.winnerSource = str4;
        }
        if ((i & 16) == 0) {
            int i4 = onExtraCallback + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            this.content = null;
        } else {
            this.content = exposureContent;
        }
        if ((i & 32) == 0) {
            this.tossFailed = null;
        } else {
            this.tossFailed = str5;
        }
        if ((i & 64) == 0) {
            this.adMobFailed = null;
        } else {
            this.adMobFailed = str6;
        }
        if ((i & 128) == 0) {
            int i6 = IAuthTabCallback + 5;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            this.adMobFailedDetail = null;
        } else {
            this.adMobFailedDetail = adMobFailedDetail;
        }
        this.spaceUnitId = str7;
        if ((i & 512) == 0) {
            int i8 = onExtraCallback + 85;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            this.adUnitId = null;
            if (i9 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.adUnitId = str8;
        }
        if ((i & 1024) == 0) {
            this.placementId = null;
            int i10 = 2 % 2;
        } else {
            this.placementId = l;
        }
        if ((i & 2048) == 0) {
            this.automationSessionId = null;
        } else {
            this.automationSessionId = str9;
            int i11 = onExtraCallback + 7;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = 2 % 2;
        if ((i & 4096) == 0) {
            this.eventTs = null;
            return;
        }
        this.eventTs = str10;
        int i14 = onExtraCallback + 89;
        IAuthTabCallback = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public MediationResultLogRequest(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable ExposureContent exposureContent, @Nullable String str5, @Nullable String str6, @Nullable AdMobFailedDetail adMobFailedDetail, @NotNull String str7, @Nullable String str8, @Nullable Long l, @Nullable String str9, @Nullable String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.mediationId = str;
        this.requestId = str2;
        this.eventContextToken = str3;
        this.winnerSource = str4;
        this.content = exposureContent;
        this.tossFailed = str5;
        this.adMobFailed = str6;
        this.adMobFailedDetail = adMobFailedDetail;
        this.spaceUnitId = str7;
        this.adUnitId = str8;
        this.placementId = l;
        this.automationSessionId = str9;
        this.eventTs = str10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00da  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(MediationResultLogRequest mediationResultLogRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, mediationResultLogRequest.mediationId);
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || mediationResultLogRequest.requestId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, mediationResultLogRequest.requestId);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i2 = onExtraCallback + 105;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                String str = mediationResultLogRequest.eventContextToken;
                throw null;
            }
            if (mediationResultLogRequest.eventContextToken != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, mediationResultLogRequest.eventContextToken);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || mediationResultLogRequest.winnerSource != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, mediationResultLogRequest.winnerSource);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i3 = IAuthTabCallback + 107;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 63 / 0;
                if (mediationResultLogRequest.content != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 4, ExposureContent$$serializer.INSTANCE, mediationResultLogRequest.content);
                }
            } else if (mediationResultLogRequest.content != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || mediationResultLogRequest.tossFailed != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, mediationResultLogRequest.tossFailed);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || mediationResultLogRequest.adMobFailed != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, mediationResultLogRequest.adMobFailed);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i5 = onExtraCallback + 73;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (mediationResultLogRequest.adMobFailedDetail != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, AdMobFailedDetail$$serializer.INSTANCE, mediationResultLogRequest.adMobFailedDetail);
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 8, mediationResultLogRequest.spaceUnitId);
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 9))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, mediationResultLogRequest.adUnitId);
        } else {
            int i7 = IAuthTabCallback + 37;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 92 / 0;
                if (mediationResultLogRequest.adUnitId != null) {
                }
            } else if (mediationResultLogRequest.adUnitId != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 10) || mediationResultLogRequest.placementId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 10, oty1.onExtraCallback, mediationResultLogRequest.placementId);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 11) || mediationResultLogRequest.automationSessionId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 11, getWriggleLayout.onNavigationEvent, mediationResultLogRequest.automationSessionId);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 12) || mediationResultLogRequest.eventTs != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 12, getWriggleLayout.onNavigationEvent, mediationResultLogRequest.eventTs);
        }
        int i9 = IAuthTabCallback + 11;
        onExtraCallback = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 9 / 0;
        }
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MediationResultLogRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            MediationResultLogRequest$$serializer mediationResultLogRequest$$serializer = MediationResultLogRequest$$serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 67 / 0;
            }
            return mediationResultLogRequest$$serializer;
        }

        public final MediationResultLogRequest IAuthTabCallback(@NotNull NativeAdsDto nativeAdsDto, @NotNull String str, @Nullable String str2, @Nullable ExposureContent exposureContent, @Nullable String str3, @Nullable AdMobFailedReason adMobFailedReason, @Nullable String str4, @Nullable String str5) {
            String str6;
            Long lValueOf;
            Double dOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(nativeAdsDto, "");
                Intrinsics.checkNotNullParameter(str, "");
                nativeAdsDto.onTransact().onNavigationEvent().IAuthTabCallbackStub();
                nativeAdsDto.IAuthTabCallbackStub();
                nativeAdsDto.IAuthTabCallbackDefault();
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            Intrinsics.checkNotNullParameter(str, "");
            String strIAuthTabCallbackStub = nativeAdsDto.onTransact().onNavigationEvent().IAuthTabCallbackStub();
            String strIAuthTabCallbackStub2 = nativeAdsDto.IAuthTabCallbackStub();
            String strIAuthTabCallbackDefault = nativeAdsDto.IAuthTabCallbackDefault();
            String strOnTransact = adMobFailedReason != null ? adMobFailedReason.onTransact() : null;
            AdMobFailedDetail adMobFailedDetailOnWarmupCompleted = adMobFailedReason != null ? ViewPager2.onWarmupCompleted(adMobFailedReason) : null;
            NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult = nativeAdsDto.onTransact().onNavigationEvent().onExtraCallbackWithResult();
            if (admobInfoOnExtraCallbackWithResult != null) {
                String strOnNavigationEvent = admobInfoOnExtraCallbackWithResult.onNavigationEvent();
                int i3 = onNavigationEvent + 71;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                str6 = strOnNavigationEvent;
            } else {
                int i5 = IAuthTabCallback + 13;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                str6 = null;
            }
            NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult2 = nativeAdsDto.onTransact().onNavigationEvent().onExtraCallbackWithResult();
            if (admobInfoOnExtraCallbackWithResult2 == null || (dOnWarmupCompleted = admobInfoOnExtraCallbackWithResult2.onWarmupCompleted()) == null) {
                lValueOf = null;
            } else {
                int i7 = IAuthTabCallback + 73;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                lValueOf = Long.valueOf((long) dOnWarmupCompleted.doubleValue());
            }
            return new MediationResultLogRequest(strIAuthTabCallbackStub, strIAuthTabCallbackStub2, strIAuthTabCallbackDefault, str2, exposureContent, str3, strOnTransact, adMobFailedDetailOnWarmupCompleted, str, str6, lValueOf, str4, str5);
        }
    }
}
