package im.toss.ads_sdk.remote.model;

import android.os.Bundle;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
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
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ExposureContent {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String adSourceId;
    private final String adSourceInstanceId;
    private final String adSourceInstanceName;
    private final String adSourceName;
    private final String mediationABTestName;
    private final String mediationABTestVariant;
    private final String mediationGroupName;
    private final AdMobPaidAdValue paidAdValue;
    private final String responseId;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 95;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposureContent)) {
            return false;
        }
        ExposureContent exposureContent = (ExposureContent) obj;
        if (!Intrinsics.areEqual(this.adSourceName, exposureContent.adSourceName)) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 39;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.responseId, exposureContent.responseId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.paidAdValue, exposureContent.paidAdValue)) {
            int i7 = onNavigationEvent + 15;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.adSourceId, exposureContent.adSourceId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.adSourceInstanceName, exposureContent.adSourceInstanceName)) {
            int i9 = onNavigationEvent + 39;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.adSourceInstanceId, exposureContent.adSourceInstanceId) || !Intrinsics.areEqual(this.mediationGroupName, exposureContent.mediationGroupName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.mediationABTestName, exposureContent.mediationABTestName)) {
            return Intrinsics.areEqual(this.mediationABTestVariant, exposureContent.mediationABTestVariant);
        }
        int i11 = IAuthTabCallback + 119;
        onNavigationEvent = i11 % 128;
        return i11 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        String str = this.adSourceName;
        int iHashCode6 = 0;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.responseId;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        AdMobPaidAdValue adMobPaidAdValue = this.paidAdValue;
        if (adMobPaidAdValue == null) {
            int i2 = IAuthTabCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = adMobPaidAdValue.hashCode();
        }
        String str3 = this.adSourceId;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.adSourceInstanceName;
        if (str4 == null) {
            int i4 = onNavigationEvent + 99;
            IAuthTabCallback = i4 % 128;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.adSourceInstanceId;
        if (str5 == null) {
            int i5 = onNavigationEvent + 61;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.mediationGroupName;
        if (str6 == null) {
            int i7 = onNavigationEvent + 75;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str6.hashCode();
        }
        String str7 = this.mediationABTestName;
        if (str7 == null) {
            iHashCode5 = 0;
        } else {
            iHashCode5 = str7.hashCode();
            int i9 = IAuthTabCallback + 23;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
        }
        String str8 = this.mediationABTestVariant;
        if (str8 != null) {
            int i11 = IAuthTabCallback + 83;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            iHashCode6 = str8.hashCode();
        }
        int i13 = (((((((((((((((iHashCode7 * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6;
        int i14 = onNavigationEvent + 61;
        IAuthTabCallback = i14 % 128;
        if (i14 % 2 == 0) {
            return i13;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExposureContent(adSourceName=" + this.adSourceName + ", responseId=" + this.responseId + ", paidAdValue=" + this.paidAdValue + ", adSourceId=" + this.adSourceId + ", adSourceInstanceName=" + this.adSourceInstanceName + ", adSourceInstanceId=" + this.adSourceInstanceId + ", mediationGroupName=" + this.mediationGroupName + ", mediationABTestName=" + this.mediationABTestName + ", mediationABTestVariant=" + this.mediationABTestVariant + ")";
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ ExposureContent(int i, String str, String str2, AdMobPaidAdValue adMobPaidAdValue, String str3, String str4, String str5, String str6, String str7, String str8, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, ExposureContent$$serializer.INSTANCE.getDescriptor());
        }
        this.adSourceName = str;
        this.responseId = str2;
        Object obj = null;
        if ((i & 4) == 0) {
            this.paidAdValue = null;
        } else {
            this.paidAdValue = adMobPaidAdValue;
        }
        if ((i & 8) == 0) {
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.adSourceId = null;
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.adSourceId = str3;
            int i4 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.adSourceInstanceName = null;
            int i5 = onNavigationEvent + 53;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } else {
            this.adSourceInstanceName = str4;
        }
        if ((i & 32) == 0) {
            this.adSourceInstanceId = null;
        } else {
            this.adSourceInstanceId = str5;
        }
        if ((i & 64) == 0) {
            int i7 = onNavigationEvent + 97;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            this.mediationGroupName = null;
            if (i8 != 0) {
                int i9 = 35 / 0;
            }
        } else {
            this.mediationGroupName = str6;
        }
        if ((i & 128) == 0) {
            this.mediationABTestName = null;
        } else {
            this.mediationABTestName = str7;
            int i10 = IAuthTabCallback + 17;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = 2 % 2;
        if ((i & 256) == 0) {
            this.mediationABTestVariant = null;
        } else {
            this.mediationABTestVariant = str8;
        }
    }

    public ExposureContent(@Nullable String str, @Nullable String str2, @Nullable AdMobPaidAdValue adMobPaidAdValue, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.adSourceName = str;
        this.responseId = str2;
        this.paidAdValue = adMobPaidAdValue;
        this.adSourceId = str3;
        this.adSourceInstanceName = str4;
        this.adSourceInstanceId = str5;
        this.mediationGroupName = str6;
        this.mediationABTestName = str7;
        this.mediationABTestVariant = str8;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(ExposureContent exposureContent, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, exposureContent.adSourceName);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, exposureContent.responseId);
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || exposureContent.paidAdValue != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, AdMobPaidAdValue$$serializer.INSTANCE, exposureContent.paidAdValue);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || exposureContent.adSourceId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, exposureContent.adSourceId);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || exposureContent.adSourceInstanceName != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, exposureContent.adSourceInstanceName);
        }
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i4 = onNavigationEvent + 43;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                String str = exposureContent.adSourceInstanceId;
                obj.hashCode();
                throw null;
            }
            if (exposureContent.adSourceInstanceId != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, exposureContent.adSourceInstanceId);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i5 = onNavigationEvent + 3;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                String str2 = exposureContent.mediationGroupName;
                obj.hashCode();
                throw null;
            }
            if (exposureContent.mediationGroupName != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, exposureContent.mediationGroupName);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i6 = IAuthTabCallback + 97;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                String str3 = exposureContent.mediationABTestName;
                throw null;
            }
            if (exposureContent.mediationABTestName != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, exposureContent.mediationABTestName);
                int i7 = onNavigationEvent + 111;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 8)) {
            int i9 = IAuthTabCallback + 13;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            if (exposureContent.mediationABTestVariant == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, exposureContent.mediationABTestVariant);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ExposureContent(String str, String str2, AdMobPaidAdValue adMobPaidAdValue, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        AdMobPaidAdValue adMobPaidAdValue2;
        String str9;
        String str10;
        String str11;
        Object obj = null;
        if ((i & 4) != 0) {
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 95 / 0;
            }
            adMobPaidAdValue2 = null;
        } else {
            adMobPaidAdValue2 = adMobPaidAdValue;
        }
        if ((i & 8) != 0) {
            int i4 = IAuthTabCallback + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str9 = null;
        } else {
            str9 = str3;
        }
        String str12 = (i & 16) != 0 ? null : str4;
        String str13 = (i & 32) != 0 ? null : str5;
        if ((i & 64) != 0) {
            int i5 = onNavigationEvent + 25;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            str10 = null;
        } else {
            str10 = str6;
        }
        String str14 = (i & 128) != 0 ? null : str7;
        if ((i & 256) != 0) {
            int i7 = IAuthTabCallback + 77;
            int i8 = i7 % 128;
            onNavigationEvent = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 5;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
            str11 = null;
        } else {
            str11 = str8;
        }
        this(str, str2, adMobPaidAdValue2, str9, str12, str13, str10, str14, str11);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.adSourceName;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.responseId;
            int i4 = 86 / 0;
        } else {
            str = this.responseId;
        }
        int i5 = i2 + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final AdMobPaidAdValue IAuthTabCallback() {
        AdMobPaidAdValue adMobPaidAdValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            adMobPaidAdValue = this.paidAdValue;
            int i4 = 76 / 0;
        } else {
            adMobPaidAdValue = this.paidAdValue;
        }
        int i5 = i3 + 125;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return adMobPaidAdValue;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ExposureContent> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ExposureContent$$serializer exposureContent$$serializer = ExposureContent$$serializer.INSTANCE;
            if (i3 == 0) {
                return exposureContent$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ExposureContent onExtraCallback(@NotNull NativeAd nativeAd) {
            String adSourceName;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(nativeAd, "");
            ResponseInfo responseInfo = nativeAd.getResponseInfo();
            if (responseInfo != null) {
                int i2 = onNavigationEvent + 83;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AdapterResponseInfo loadedAdapterResponseInfo = responseInfo.getLoadedAdapterResponseInfo();
                if (loadedAdapterResponseInfo != null) {
                    int i4 = onExtraCallbackWithResult + 71;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 == 0) {
                        loadedAdapterResponseInfo.getAdSourceName();
                        str.hashCode();
                        throw null;
                    }
                    adSourceName = loadedAdapterResponseInfo.getAdSourceName();
                } else {
                    adSourceName = null;
                }
            }
            ResponseInfo responseInfo2 = nativeAd.getResponseInfo();
            return new ExposureContent(adSourceName, responseInfo2 != null ? responseInfo2.getResponseId() : null, (AdMobPaidAdValue) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 508, (DefaultConstructorMarker) null);
        }

        public final ExposureContent IAuthTabCallback(@NotNull InterstitialAd interstitialAd) {
            String adSourceName;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            AdapterResponseInfo loadedAdapterResponseInfo = interstitialAd.getResponseInfo().getLoadedAdapterResponseInfo();
            if (loadedAdapterResponseInfo != null) {
                int i4 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                adSourceName = loadedAdapterResponseInfo.getAdSourceName();
            } else {
                adSourceName = null;
            }
            return new ExposureContent(adSourceName, interstitialAd.getResponseInfo().getResponseId(), (AdMobPaidAdValue) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 508, (DefaultConstructorMarker) null);
        }

        public final ExposureContent IAuthTabCallback(@NotNull RewardedAd rewardedAd) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(rewardedAd, "");
            AdapterResponseInfo loadedAdapterResponseInfo = rewardedAd.getResponseInfo().getLoadedAdapterResponseInfo();
            String adSourceName = null;
            if (loadedAdapterResponseInfo != null) {
                int i4 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    loadedAdapterResponseInfo.getAdSourceName();
                    throw null;
                }
                adSourceName = loadedAdapterResponseInfo.getAdSourceName();
            } else {
                int i5 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            return new ExposureContent(adSourceName, rewardedAd.getResponseInfo().getResponseId(), (AdMobPaidAdValue) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 508, (DefaultConstructorMarker) null);
        }

        public final ExposureContent IAuthTabCallback(@NotNull NativeAd nativeAd, @NotNull AdValue adValue) {
            ExposureContent exposureContentOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(nativeAd, "");
                Intrinsics.checkNotNullParameter(adValue, "");
                exposureContentOnNavigationEvent = onNavigationEvent(nativeAd.getResponseInfo(), adValue);
                int i3 = 43 / 0;
            } else {
                Intrinsics.checkNotNullParameter(nativeAd, "");
                Intrinsics.checkNotNullParameter(adValue, "");
                exposureContentOnNavigationEvent = onNavigationEvent(nativeAd.getResponseInfo(), adValue);
            }
            int i4 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return exposureContentOnNavigationEvent;
            }
            throw null;
        }

        public final ExposureContent onExtraCallback(@NotNull InterstitialAd interstitialAd, @NotNull AdValue adValue) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(interstitialAd, "");
            Intrinsics.checkNotNullParameter(adValue, "");
            ExposureContent exposureContentOnNavigationEvent = onNavigationEvent(interstitialAd.getResponseInfo(), adValue);
            int i4 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return exposureContentOnNavigationEvent;
            }
            throw null;
        }

        public final ExposureContent onNavigationEvent(@NotNull RewardedAd rewardedAd, @NotNull AdValue adValue) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(rewardedAd, "");
            Intrinsics.checkNotNullParameter(adValue, "");
            ExposureContent exposureContentOnNavigationEvent = onNavigationEvent(rewardedAd.getResponseInfo(), adValue);
            int i4 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 62 / 0;
            }
            return exposureContentOnNavigationEvent;
        }

        private final ExposureContent onNavigationEvent(ResponseInfo responseInfo, AdValue adValue) {
            String string;
            String string2;
            String string3;
            int i = 2 % 2;
            String str = null;
            AdapterResponseInfo loadedAdapterResponseInfo = responseInfo != null ? responseInfo.getLoadedAdapterResponseInfo() : null;
            Bundle responseExtras = responseInfo != null ? responseInfo.getResponseExtras() : null;
            String adSourceName = loadedAdapterResponseInfo != null ? loadedAdapterResponseInfo.getAdSourceName() : null;
            String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
            long valueMicros = adValue.getValueMicros();
            String currencyCode = adValue.getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode, "");
            AdMobPaidAdValue adMobPaidAdValue = new AdMobPaidAdValue(Long.valueOf(valueMicros), currencyCode, ViewPager2.onExtraCallbackWithResult(adValue));
            String adSourceId = loadedAdapterResponseInfo != null ? loadedAdapterResponseInfo.getAdSourceId() : null;
            String adSourceInstanceName = loadedAdapterResponseInfo != null ? loadedAdapterResponseInfo.getAdSourceInstanceName() : null;
            String adSourceInstanceId = loadedAdapterResponseInfo != null ? loadedAdapterResponseInfo.getAdSourceInstanceId() : null;
            if (responseExtras != null) {
                int i2 = onExtraCallbackWithResult + 97;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    responseExtras.getString("mediation_group_name");
                    throw null;
                }
                string = responseExtras.getString("mediation_group_name");
            } else {
                int i3 = onNavigationEvent + 39;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                string = null;
            }
            if (responseExtras != null) {
                int i5 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                string2 = responseExtras.getString("mediation_ab_test_name");
            } else {
                string2 = null;
            }
            if (responseExtras != null) {
                int i7 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    string3 = responseExtras.getString("mediation_ab_test_variant");
                    int i8 = 93 / 0;
                } else {
                    string3 = responseExtras.getString("mediation_ab_test_variant");
                }
                str = string3;
            }
            return new ExposureContent(adSourceName, responseId, adMobPaidAdValue, adSourceId, adSourceInstanceName, adSourceInstanceId, string, string2, str);
        }
    }
}
