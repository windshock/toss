package viva.republica.toss.network.model.verify.guest;

import im.toss.features.applock.model.AppProfile;
import im.toss.features.applock.model.AppProfile$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.nativeReadByte;
import o.okycx;
import o.oty1;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;
import viva.republica.toss.network.model.init.v2.CheckoutResult;
import viva.republica.toss.network.model.init.v2.CheckoutResult$;
import viva.republica.toss.network.model.verify.guest.DevSupportSuperLoginResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DevSupportSuperLoginResponse {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final AppProfile appProfile;
    private final String authPasswordHash;
    private final CheckoutResult checkoutResult;
    private final nativeReadByte currentPasswordFormat;
    private final String gaNo;
    private final Long guestSessionId;
    private final String internalCert;
    private final String loginPasswordHash;
    private final boolean openOnboardingTermsView;
    private final boolean openOnboardingWebView;
    private final String userNo;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.DevSupportSuperLoginResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = DevSupportSuperLoginResponse.onNavigationEvent();
            int i4 = onExtraCallback + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    }), null, null, null, null, null, null, null};

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        int i4 = onWarmupCompleted + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~((~i) | i2);
        int i8 = ~((~i4) | i2);
        int i9 = i7 | i8;
        int i10 = i8 | (~((~i2) | i)) | i7;
        int i11 = i2 + i + i3 + ((-1814252664) * i5) + (2073254503 * i6);
        int i12 = i11 * i11;
        int i13 = ((-223937157) * i2) + 1943797760 + (1745420935 * i) + (i9 * 1162804602) + (1162804602 * i7) + ((-1162804602) * i10) + ((-1386741760) * i3) + ((-1631584256) * i5) + ((-1368915968) * i6) + ((-1053032448) * i12);
        int i14 = (i2 * (-1919122223)) + 1408767311 + (i * (-1919121035)) + (i9 * (-594)) + (i7 * (-594)) + (i10 * 594) + (i3 * (-1919121629)) + (i5 * (-390511720)) + (i6 * 1804971285) + (i12 * 255066112);
        if (i13 + (i14 * i14 * 379846656) != 1) {
            return IAuthTabCallback(objArr);
        }
        DevSupportSuperLoginResponse devSupportSuperLoginResponse = (DevSupportSuperLoginResponse) objArr[0];
        int i15 = 2 % 2;
        int i16 = onWarmupCompleted + 121;
        int i17 = i16 % 128;
        onExtraCallback = i17;
        int i18 = i16 % 2;
        String str = devSupportSuperLoginResponse.loginPasswordHash;
        int i19 = i17 + 27;
        onWarmupCompleted = i19 % 128;
        int i20 = i19 % 2;
        return str;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault();
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i3 = onExtraCallback + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerIAuthTabCallbackDefault;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof DevSupportSuperLoginResponse)) {
            return false;
        }
        DevSupportSuperLoginResponse devSupportSuperLoginResponse = (DevSupportSuperLoginResponse) obj;
        if (!Intrinsics.areEqual(this.userNo, devSupportSuperLoginResponse.userNo) || !Intrinsics.areEqual(this.gaNo, devSupportSuperLoginResponse.gaNo) || (!Intrinsics.areEqual(this.internalCert, devSupportSuperLoginResponse.internalCert))) {
            return false;
        }
        if (this.currentPasswordFormat != devSupportSuperLoginResponse.currentPasswordFormat) {
            int i6 = onExtraCallback + 115;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.openOnboardingTermsView != devSupportSuperLoginResponse.openOnboardingTermsView || !Intrinsics.areEqual(this.loginPasswordHash, devSupportSuperLoginResponse.loginPasswordHash)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.authPasswordHash, devSupportSuperLoginResponse.authPasswordHash)) {
            int i8 = onExtraCallback + 75;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.appProfile, devSupportSuperLoginResponse.appProfile) || !Intrinsics.areEqual(this.checkoutResult, devSupportSuperLoginResponse.checkoutResult)) {
            return false;
        }
        if (Intrinsics.areEqual(this.guestSessionId, devSupportSuperLoginResponse.guestSessionId)) {
            return this.openOnboardingWebView == devSupportSuperLoginResponse.openOnboardingWebView;
        }
        int i10 = onWarmupCompleted + 79;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.userNo;
        if (str == null) {
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.gaNo;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.internalCert.hashCode();
        int iHashCode4 = this.currentPasswordFormat.hashCode();
        int iHashCode5 = Boolean.hashCode(this.openOnboardingTermsView);
        int iHashCode6 = this.loginPasswordHash.hashCode();
        int iHashCode7 = this.authPasswordHash.hashCode();
        AppProfile appProfile = this.appProfile;
        int iHashCode8 = appProfile == null ? 0 : appProfile.hashCode();
        int iHashCode9 = this.checkoutResult.hashCode();
        Long l = this.guestSessionId;
        int iHashCode10 = (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (l != null ? l.hashCode() : 0)) * 31) + Boolean.hashCode(this.openOnboardingWebView);
        int i4 = onWarmupCompleted + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode10;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DevSupportSuperLoginResponse(userNo=" + this.userNo + ", gaNo=" + this.gaNo + ", internalCert=" + this.internalCert + ", currentPasswordFormat=" + this.currentPasswordFormat + ", openOnboardingTermsView=" + this.openOnboardingTermsView + ", loginPasswordHash=" + this.loginPasswordHash + ", authPasswordHash=" + this.authPasswordHash + ", appProfile=" + this.appProfile + ", checkoutResult=" + this.checkoutResult + ", guestSessionId=" + this.guestSessionId + ", openOnboardingWebView=" + this.openOnboardingWebView + ")";
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DevSupportSuperLoginResponse> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                DevSupportSuperLoginResponse$.serializer serializerVar = DevSupportSuperLoginResponse$.serializer.INSTANCE;
                throw null;
            }
            DevSupportSuperLoginResponse$.serializer serializerVar2 = DevSupportSuperLoginResponse$.serializer.INSTANCE;
            int i3 = onWarmupCompleted + 5;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return serializerVar2;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 43;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ DevSupportSuperLoginResponse(int i, String str, String str2, String str3, nativeReadByte nativereadbyte, boolean z, String str4, String str5, AppProfile appProfile, CheckoutResult checkoutResult, Long l, boolean z2, okycx okycxVar) {
        if (2047 != (i & 2047)) {
            int i2 = onExtraCallback + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 2047, DevSupportSuperLoginResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 11;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.userNo = str;
        this.gaNo = str2;
        this.internalCert = str3;
        this.currentPasswordFormat = nativereadbyte;
        this.openOnboardingTermsView = z;
        this.loginPasswordHash = str4;
        this.authPasswordHash = str5;
        this.appProfile = appProfile;
        this.checkoutResult = checkoutResult;
        this.guestSessionId = l;
        this.openOnboardingWebView = z2;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(DevSupportSuperLoginResponse devSupportSuperLoginResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, devSupportSuperLoginResponse.userNo);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, devSupportSuperLoginResponse.gaNo);
        vylVar.onExtraCallback(serialDescriptor, 2, devSupportSuperLoginResponse.internalCert);
        vylVar.onNavigationEvent(serialDescriptor, 3, (py) lazyArr[3].getValue(), devSupportSuperLoginResponse.currentPasswordFormat);
        vylVar.onNavigationEvent(serialDescriptor, 4, devSupportSuperLoginResponse.openOnboardingTermsView);
        vylVar.onExtraCallback(serialDescriptor, 5, devSupportSuperLoginResponse.loginPasswordHash);
        vylVar.onExtraCallback(serialDescriptor, 6, devSupportSuperLoginResponse.authPasswordHash);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 7, AppProfile$.serializer.INSTANCE, devSupportSuperLoginResponse.appProfile);
        vylVar.onNavigationEvent(serialDescriptor, 8, CheckoutResult$.serializer.INSTANCE, devSupportSuperLoginResponse.checkoutResult);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 9, oty1.onExtraCallback, devSupportSuperLoginResponse.guestSessionId);
        vylVar.onNavigationEvent(serialDescriptor, 10, devSupportSuperLoginResponse.openOnboardingWebView);
        int i4 = onWarmupCompleted + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.internalCert;
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.authPasswordHash;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CheckoutResult onExtraCallback() {
        CheckoutResult checkoutResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            checkoutResult = this.checkoutResult;
            int i4 = 93 / 0;
        } else {
            checkoutResult = this.checkoutResult;
        }
        int i5 = i3 + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return checkoutResult;
    }

    public final Long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Long l = this.guestSessionId;
        int i5 = i3 + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str;
        DevSupportSuperLoginResponse devSupportSuperLoginResponse = (DevSupportSuperLoginResponse) objArr[0];
        String str2 = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if ((1 & iIntValue) != 0) {
            int i5 = i2 + 61;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                str = devSupportSuperLoginResponse.internalCert;
                int i6 = 78 / 0;
            } else {
                str = devSupportSuperLoginResponse.internalCert;
            }
            str2 = str;
        }
        return devSupportSuperLoginResponse.onWarmupCompleted(str2);
    }

    public final SignInResponse onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SignInResponse signInResponse = new SignInResponse(str, this.currentPasswordFormat, this.appProfile, this.checkoutResult);
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return signInResponse;
    }

    public static /* synthetic */ SignInResponse onNavigationEvent(DevSupportSuperLoginResponse devSupportSuperLoginResponse, String str, int i, Object obj) {
        Object[] objArr = {devSupportSuperLoginResponse, str, Integer.valueOf(i), obj};
        return (SignInResponse) onExtraCallback(665254114, -665254114, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), objArr);
    }

    public final String asBinder() {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        return (String) onExtraCallback(746991343, -746991342, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{this});
    }
}
