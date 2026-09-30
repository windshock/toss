package o;

import im.toss.devtool.domain.usecase.RunDevToolActionUseCase;
import im.toss.features.main.ui.MainTabFragment;
import o.WebSocketFactory;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVWebSocketProxy implements setSize<MainTabFragment> {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i5);
        int i9 = (~(i7 | i2)) | i8 | (~(i5 | i2));
        int i10 = (~(i7 | (~i2))) | i8;
        int i11 = (~(i2 | i)) | (~((~i5) | i));
        int i12 = i + i5 + i3 + (929125522 * i6) + (1849324972 * i4);
        int i13 = i12 * i12;
        int i14 = (1419820811 * i) + 1146290176 + ((-1462591364) * i5) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i3) + ((-291241984) * i6) + (1012400128 * i4) + ((-1810169856) * i13);
        int i15 = ((i * (-2058557531)) - 518432259) + (i5 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i3 * (-2058558961)) + (i6 * 548722830) + (i4 * 1549712660) + (i13 * (-2087387136));
        int i16 = i14 + (i15 * i15 * (-343605248));
        return i16 != 1 ? i16 != 2 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        CacheStrategy cacheStrategy = (CacheStrategy) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.securitiesHealthCheckManager = cacheStrategy;
        int i4 = IAuthTabCallback + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static void IAuthTabCallback(MainTabFragment mainTabFragment, AFd1gSDK aFd1gSDK) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.mainTabBarTrace = aFd1gSDK;
        int i4 = onWarmupCompleted + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onNavigationEvent(MainTabFragment mainTabFragment, RunDevToolActionUseCase runDevToolActionUseCase) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        mainTabFragment.runDevToolAction = runDevToolActionUseCase;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallback(MainTabFragment mainTabFragment, MySubscribeProxySubscriptionsSetting mySubscribeProxySubscriptionsSetting) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.homeFragmentNavigation = mySubscribeProxySubscriptionsSetting;
        if (i3 != 0) {
            throw null;
        }
    }

    public static void onWarmupCompleted(MainTabFragment mainTabFragment, onRenderInit onrenderinit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        mainTabFragment.feedFragmentNavigation = onrenderinit;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void onNavigationEvent(MainTabFragment mainTabFragment, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.environments = zzadVar;
        int i4 = onWarmupCompleted + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onExtraCallback(MainTabFragment mainTabFragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.tossRouter = sessionTrackerb;
        int i4 = onWarmupCompleted + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onWarmupCompleted(MainTabFragment mainTabFragment, zzag zzagVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.tossClock = zzagVar;
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onWarmupCompleted(MainTabFragment mainTabFragment, createJSONObject createjsonobject) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.bleScanManager = createjsonobject;
        int i4 = IAuthTabCallback + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
    }

    public static void IAuthTabCallback(MainTabFragment mainTabFragment, removeTabBarModel removetabbarmodel) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.airdropTermsManager = removetabbarmodel;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc r8lambdacnf1cf_vta0zlqakxgouxmsc = (r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        mainTabFragment.agreedToAnyTermsUseCase = r8lambdacnf1cf_vta0zlqakxgouxmsc;
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MainTabFragment mainTabFragment = (MainTabFragment) objArr[0];
        openFd openfd = (openFd) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.mainTabManager = openfd;
        int i4 = onWarmupCompleted + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static void onExtraCallbackWithResult(MainTabFragment mainTabFragment, getClosedokhttp getclosedokhttp) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.tossSecTabController = getclosedokhttp;
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void IAuthTabCallback(MainTabFragment mainTabFragment, ExtHubPage extHubPage) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.tabFragmentProvider = extHubPage;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 117;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    public static void onExtraCallbackWithResult(MainTabFragment mainTabFragment, generatorFDId generatorfdid) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.teensMainTabProvider = generatorfdid;
        int i4 = IAuthTabCallback + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onExtraCallbackWithResult(MainTabFragment mainTabFragment, getBillingPeriod getbillingperiod) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.regionManager = getbillingperiod;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void IAuthTabCallback(MainTabFragment mainTabFragment, ExtHubRVEngine extHubRVEngine) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.tabBarBubbleHelper = extHubRVEngine;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = onWarmupCompleted + 51;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
    }

    public static void IAuthTabCallback(MainTabFragment mainTabFragment, getTextProgressMargin gettextprogressmargin) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.tabSwitchTracer = gettextprogressmargin;
        if (i3 != 0) {
            throw null;
        }
    }

    public static void IAuthTabCallback(MainTabFragment mainTabFragment, adOpenedFullscreen adopenedfullscreen) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        mainTabFragment.lcpSessionRegistry = adopenedfullscreen;
        int i4 = onWarmupCompleted + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void IAuthTabCallback(MainTabFragment mainTabFragment, r8lambdacNF1cf_VtA0ZLQAkXGoUxMSc r8lambdacnf1cf_vta0zlqakxgouxmsc) {
        onNavigationEvent(new Object[]{mainTabFragment, r8lambdacnf1cf_vta0zlqakxgouxmsc}, -1126249229, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), 1126249229, WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }

    public static void onNavigationEvent(MainTabFragment mainTabFragment, openFd openfd) {
        onNavigationEvent(new Object[]{mainTabFragment, openfd}, 1151506020, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1151506019, WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }

    public static void onExtraCallback(MainTabFragment mainTabFragment, CacheStrategy cacheStrategy) {
        onNavigationEvent(new Object[]{mainTabFragment, cacheStrategy}, 647370194, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -647370192, WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }
}
