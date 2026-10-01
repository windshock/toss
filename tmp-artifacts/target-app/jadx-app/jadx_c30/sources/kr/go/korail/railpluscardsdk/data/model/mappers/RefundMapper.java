package kr.go.korail.railpluscardsdk.data.model.mappers;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.AdSlotBuilder;
import o.isAutoPlay;
import o.setExpressViewAccepted;
import o.setIsRotateBanner;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RefundMapper {
    public static final RefundMapper onExtraCallback = new RefundMapper();

    private RefundMapper() {
    }

    public final isAutoPlay IAuthTabCallback(AdSlotBuilder adSlotBuilder, setExpressViewAccepted setexpressviewaccepted, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(adSlotBuilder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(setexpressviewaccepted, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str5, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str6, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str7, BuildConfig.FLAVOR);
        return new isAutoPlay(str3, adSlotBuilder.IAuthTabCallback(), adSlotBuilder.asBinder(), adSlotBuilder.onExtraCallbackWithResult(), adSlotBuilder.onWarmupCompleted(), str, str2, str4, str5, str6, str7);
    }

    public final setIsRotateBanner onExtraCallback(AdSlotBuilder adSlotBuilder, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(adSlotBuilder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str5, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str6, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str7, BuildConfig.FLAVOR);
        return new setIsRotateBanner(adSlotBuilder.IAuthTabCallback(), adSlotBuilder.onExtraCallback(), adSlotBuilder.asBinder(), adSlotBuilder.onExtraCallbackWithResult(), adSlotBuilder.onNavigationEvent(), adSlotBuilder.onWarmupCompleted(), adSlotBuilder.onTransact(), str, str2, str3, str4, str5, str6, str7);
    }
}
