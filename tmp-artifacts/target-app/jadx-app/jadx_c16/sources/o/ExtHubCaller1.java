package o;

import android.content.Context;
import android.content.Intent;
import im.toss.features.kyc.activities.KycForceRedoActivity;
import im.toss.features.kyc.intro.KycIntroActivity;
import im.toss.features.kyc.navigation.models.KycDisplayStatus;
import im.toss.features.kyc.navigation.models.KycStatus;
import im.toss.features.kyc.navigation.models.Status;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ExtHubCaller1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static final GeckoHubImp onWarmupCompleted = putChannelInfo.onWarmupCompleted();

    static {
        int i = onExtraCallbackWithResult + 115;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final GeckoHubImp onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        GeckoHubImp geckoHubImp = onWarmupCompleted;
        int i5 = i2 + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return geckoHubImp;
    }

    public static final Object onWarmupCompleted(@NotNull getEnableJsT2 getenablejst2, boolean z, @NotNull access13800<? super KycStatus> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object objOnExtraCallbackWithResult = RealImageLoaderKtExternalSyntheticLambda1.onExtraCallbackWithResult(getenablejst2.onWarmupCompleted(z, 6L), access13800Var);
            int i3 = IAuthTabCallback + 31;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 90 / 0;
            }
            return objOnExtraCallbackWithResult;
        }
        RealImageLoaderKtExternalSyntheticLambda1.onExtraCallbackWithResult(getenablejst2.onWarmupCompleted(z, 6L), access13800Var);
        throw null;
    }

    public static final boolean onExtraCallbackWithResult(@NotNull KycStatus kycStatus) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(kycStatus, "");
            Status status = Status.KYC_NEEDED;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(kycStatus, "");
        if (((Status) KycStatus.onExtraCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 314909783, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{kycStatus}, -314909781)) == Status.KYC_NEEDED) {
            return true;
        }
        if (((Status) KycStatus.onExtraCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 314909783, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{kycStatus}, -314909781)) == Status.KYC_FORCED) {
            return true;
        }
        int i3 = IAuthTabCallback + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {kycStatus};
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (i4 != 0) {
            return ((Status) KycStatus.onExtraCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 314909783, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, objArr, -314909781)) == Status.EEDD_NEEDED;
        }
        Status status2 = Status.EEDD_NEEDED;
        obj.hashCode();
        throw null;
    }

    public static final boolean onNavigationEvent(@NotNull KycStatus kycStatus) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(kycStatus, "");
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        if (((Status) KycStatus.onExtraCallback(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 314909783, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, new Object[]{kycStatus}, -314909781)) != Status.KYC_NEEDED) {
            return false;
        }
        int i4 = onExtraCallback + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public static final Intent onWarmupCompleted(@NotNull Context context, @NotNull KycStatus kycStatus) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(kycStatus, "");
        KycDisplayStatus kycDisplayStatusAsInterface = kycStatus.asInterface();
        if (kycDisplayStatusAsInterface == null) {
            kycDisplayStatusAsInterface = KycDisplayStatus.KYC_OVERDUE;
            int i2 = onExtraCallback + 63;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 3;
            }
        }
        Date dateIAuthTabCallbackStub = kycStatus.IAuthTabCallbackStub();
        if (kycDisplayStatusAsInterface != KycDisplayStatus.GRC_REJECTED) {
            return KycIntroActivity.Companion.IAuthTabCallback(context, 6L, kycStatus);
        }
        KycForceRedoActivity.onExtraCallbackWithResult onextracallbackwithresult = KycForceRedoActivity.Companion;
        boolean z = false;
        if (dateIAuthTabCallbackStub == null) {
            int i4 = IAuthTabCallback + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                z = true;
            }
        } else {
            int i5 = IAuthTabCallback + 81;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return onextracallbackwithresult.onWarmupCompleted(context, "6", z, kycStatus);
    }
}
