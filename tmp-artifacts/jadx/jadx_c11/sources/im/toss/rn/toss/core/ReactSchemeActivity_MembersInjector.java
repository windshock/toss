package im.toss.rn.toss.core;

import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleLoaderV2;
import im.toss.rn.toss.core.observability.ReactNativeRouteLcpSessionManager;
import im.toss.rn.toss.core.observability.RnPhaseObserver;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.access;
import o.calculateMaxTextSize;
import o.ebExternalSyntheticLambda0;
import o.getBillingPeriod;
import o.getStartTimeMillis;
import o.r8lambdaHDAe14RP_YfkbgNStt68qt10Iow;
import o.r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE;
import o.setSize;
import o.zzad;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactSchemeActivity_MembersInjector implements setSize<ReactSchemeActivity> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i6);
        int i9 = ~i;
        int i10 = (~(i9 | i4)) | i8;
        int i11 = ~i6;
        int i12 = i11 | i4;
        int i13 = i10 | (~i12);
        int i14 = i7 | i;
        int i15 = i8 | (~i14);
        int i16 = (~(i6 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i));
        int i17 = i4 + i + i5 + ((-1254723898) * i2) + ((-1667789834) * i3);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i4) + 1379663872 + ((-481802647) * i) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i5) + ((-1033371648) * i2) + ((-106430464) * i3) + (1552875520 * i18);
        int i20 = ((i4 * (-402395399)) - 1316031342) + (i * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i5 * (-402393527)) + (i2 * (-1219896714)) + (i3 * (-610841306)) + (i18 * (-825819136));
        return i19 + ((i20 * i20) * (-1063190528)) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static void IAuthTabCallback(ReactSchemeActivity reactSchemeActivity, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.environment = zzadVar;
        int i4 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow = (r8lambdaHDAe14RP_YfkbgNStt68qt10Iow) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.distributionGroupManager = r8lambdahdae14rp_yfkbgnstt68qt10iow;
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return null;
    }

    public static void onExtraCallback(ReactSchemeActivity reactSchemeActivity, r8lambdaUsR520CEU4yIJcrTWhO1uYwJGE r8lambdausr520ceu4yijcrtwho1uywjge) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.tossReactMessageHandlerManager = r8lambdausr520ceu4yijcrtwho1uywjge;
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
    }

    public static void onExtraCallbackWithResult(ReactSchemeActivity reactSchemeActivity, ReactBundleLoaderV2.Factory factory) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.reactBundleLoaderV2Factory = factory;
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void onWarmupCompleted(ReactSchemeActivity reactSchemeActivity, calculateMaxTextSize calculatemaxtextsize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.reactMessageHandlerPoolSet = calculatemaxtextsize;
        int i4 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
    }

    public static void onWarmupCompleted(ReactSchemeActivity reactSchemeActivity, getBillingPeriod getbillingperiod) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.tossRegionManager = getbillingperiod;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        int i5 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
    }

    public static void onExtraCallback(ReactSchemeActivity reactSchemeActivity, RnPhaseObserver rnPhaseObserver) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.rnPhaseObserver = rnPhaseObserver;
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        int i5 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ReactSchemeActivity reactSchemeActivity = (ReactSchemeActivity) objArr[0];
        getStartTimeMillis getstarttimemillis = (getStartTimeMillis) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        reactSchemeActivity.localeManager = getstarttimemillis;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static void onWarmupCompleted(ReactSchemeActivity reactSchemeActivity, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.environments = zzadVar;
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onWarmupCompleted(ReactSchemeActivity reactSchemeActivity, ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.unique = constraintsSizeResolverExternalSyntheticLambda0;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallback(ReactSchemeActivity reactSchemeActivity, ebExternalSyntheticLambda0 ebexternalsyntheticlambda0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.tossReactDebug = ebexternalsyntheticlambda0;
        if (i3 == 0) {
            throw null;
        }
    }

    public static void onExtraCallback(ReactSchemeActivity reactSchemeActivity, ReactNativeRouteLcpSessionManager reactNativeRouteLcpSessionManager) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        reactSchemeActivity.reactNativeRouteLcpSessions = reactNativeRouteLcpSessionManager;
        if (i3 == 0) {
            throw null;
        }
    }

    public static void onExtraCallback(ReactSchemeActivity reactSchemeActivity, r8lambdaHDAe14RP_YfkbgNStt68qt10Iow r8lambdahdae14rp_yfkbgnstt68qt10iow) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        IAuthTabCallback(613901009, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{reactSchemeActivity, r8lambdahdae14rp_yfkbgnstt68qt10iow}, -613901009, iIAuthTabCallback2, iIAuthTabCallback);
    }

    public static void onExtraCallback(ReactSchemeActivity reactSchemeActivity, getStartTimeMillis getstarttimemillis) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        IAuthTabCallback(1164305552, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{reactSchemeActivity, getstarttimemillis}, -1164305551, iIAuthTabCallback2, iIAuthTabCallback);
    }
}
