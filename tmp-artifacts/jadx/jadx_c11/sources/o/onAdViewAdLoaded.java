package o;

import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionManager;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import im.toss.rn.toss.core.portal.PortalServiceActivity;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAdViewAdLoaded implements setSize<PortalServiceActivity> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = i5 | i9;
        int i11 = ~i5;
        int i12 = i9 | (~(i11 | i3));
        int i13 = (~(i | i7 | i5)) | (~(i8 | i11 | i7));
        int i14 = i3 + i5 + i4 + ((-619979367) * i2) + (68302741 * i6);
        int i15 = i14 * i14;
        int i16 = (i3 * 561304900) + 382271488 + (561304900 * i5) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i4) + (1615200256 * i2) + ((-1821507584) * i6) + (428933120 * i15);
        int i17 = ((i3 * (-96142684)) - 56799437) + (i5 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i4 * (-96141863)) + (i2 * (-1380774991)) + (i6 * (-1175232947)) + (i15 * (-118947840));
        return i16 + ((i17 * i17) * (-1369505792)) != 1 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[0];
        onInterstitialAdDisplayFailed oninterstitialaddisplayfailed = (onInterstitialAdDisplayFailed) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.portalRuntime = oninterstitialaddisplayfailed;
        int i4 = onNavigationEvent + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return null;
    }

    public static void IAuthTabCallback(PortalServiceActivity portalServiceActivity, RnPhaseObserver rnPhaseObserver) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.rnPhaseObserver = rnPhaseObserver;
        int i4 = onExtraCallback + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    public static void onWarmupCompleted(PortalServiceActivity portalServiceActivity, ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.reactNativeRouteLcpSessions = reactNativeRouteLcpSessionManager;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PortalServiceActivity portalServiceActivity = (PortalServiceActivity) objArr[0];
        r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjge = (r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.tossReactMessageHandlerManager = r8lambdausr520ceu4yijcrtwho1uywjge;
        if (i3 != 0) {
            return null;
        }
        int i4 = 17 / 0;
        return null;
    }

    public static void IAuthTabCallback(PortalServiceActivity portalServiceActivity, calculateMaxTextSize calculatemaxtextsize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.reactMessageHandlerPoolSet = calculatemaxtextsize;
        int i4 = onNavigationEvent + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void onNavigationEvent(PortalServiceActivity portalServiceActivity, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.environments = zzadVar;
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        int i5 = onExtraCallback + 39;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static void onNavigationEvent(PortalServiceActivity portalServiceActivity, getStartTimeMillis getstarttimemillis) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.localeManager = getstarttimemillis;
        int i4 = onExtraCallback + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onWarmupCompleted(PortalServiceActivity portalServiceActivity, getBillingPeriod getbillingperiod) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.tossRegionManager = getbillingperiod;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallback(PortalServiceActivity portalServiceActivity, ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.unique = constraintsSizeResolverExternalSyntheticLambda0;
        int i4 = onNavigationEvent + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
    }

    public static void onExtraCallbackWithResult(PortalServiceActivity portalServiceActivity, r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        portalServiceActivity.distributionGroupManager = r8lambdahdae14rp_yfkbgnstt68qt10iow;
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
    }

    public static void onExtraCallbackWithResult(PortalServiceActivity portalServiceActivity, onInterstitialAdDisplayFailed oninterstitialaddisplayfailed) {
        onExtraCallback(new Object[]{portalServiceActivity, oninterstitialaddisplayfailed}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -140567024, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 140567024, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
    }

    public static void onNavigationEvent(PortalServiceActivity portalServiceActivity, r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjge) {
        onExtraCallback(new Object[]{portalServiceActivity, r8lambdausr520ceu4yijcrtwho1uywjge}, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), -1762427348, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1762427349, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent());
    }
}
