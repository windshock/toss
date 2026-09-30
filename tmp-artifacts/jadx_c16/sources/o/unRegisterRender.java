package o;

import im.toss.features.feed.normal.FeedV2Fragment;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class unRegisterRender implements setSize<FeedV2Fragment> {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = (~i4) | i8;
        int i10 = i7 | (~i9);
        int i11 = i4 | i8;
        int i12 = ~(i9 | i6);
        int i13 = i5 + i6 + i + (1075552530 * i2) + ((-1519595880) * i3);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i5) - 1639710720) + ((-2116975300) * i6) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i) + ((-189792256) * i2) + (1111490560 * i3) + (1415839744 * i14);
        int i16 = (i5 * 251836610) + 257048825 + (i6 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i * 251837547) + (i2 * 1710852742) + (i3 * (-1855850104)) + (i14 * (-1244921856));
        return i15 + ((i16 * i16) * (-1300496384)) != 1 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    public static void onExtraCallback(FeedV2Fragment feedV2Fragment, zzag zzagVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.tossClock = zzagVar;
        int i4 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
    }

    public static void onWarmupCompleted(FeedV2Fragment feedV2Fragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.tossRouter = sessionTrackerb;
        if (i3 != 0) {
            throw null;
        }
    }

    public static void onExtraCallback(FeedV2Fragment feedV2Fragment, setSerializeConfig setserializeconfig) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.pushTokenEnableDataSource = setserializeconfig;
        int i4 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void IAuthTabCallback(FeedV2Fragment feedV2Fragment, trackCheckout trackcheckout) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.notificationHelper = trackcheckout;
        int i4 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void onNavigationEvent(FeedV2Fragment feedV2Fragment, AppLovinAdServiceImplc appLovinAdServiceImplc) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.analyticsHelper = appLovinAdServiceImplc;
        int i4 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImpl = (AppLovinSdkInitializationConfigurationImpl) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.inbox = appLovinSdkInitializationConfigurationImpl;
        if (i3 != 0) {
            return null;
        }
        int i4 = 56 / 0;
        return null;
    }

    public static void IAuthTabCallback(FeedV2Fragment feedV2Fragment, updateLoadParamUrl updateloadparamurl) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.messengerApi = updateloadparamurl;
        int i4 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void onExtraCallbackWithResult(FeedV2Fragment feedV2Fragment, decapitalize decapitalizeVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.tossIncomeNotificationStatusApi = decapitalizeVar;
        int i4 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        FeedV2Fragment feedV2Fragment = (FeedV2Fragment) objArr[0];
        updateAdInfo updateadinfo = (updateAdInfo) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.messageCompanyParser = updateadinfo;
        int i4 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static void onExtraCallback(FeedV2Fragment feedV2Fragment, getPricingPhaseList getpricingphaselist) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.region = getpricingphaselist;
        int i4 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void onExtraCallbackWithResult(FeedV2Fragment feedV2Fragment, setSerializerFeatures setserializerfeatures) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        feedV2Fragment.marketingNotificationAvailability = setserializerfeatures;
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onWarmupCompleted(FeedV2Fragment feedV2Fragment, AppLovinSdkInitializationConfigurationImpl appLovinSdkInitializationConfigurationImpl) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{feedV2Fragment, appLovinSdkInitializationConfigurationImpl}, iOnExtraCallbackWithResult, -2135462123, 2135462123);
    }

    public static void onNavigationEvent(FeedV2Fragment feedV2Fragment, updateAdInfo updateadinfo) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onWarmupCompleted(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{feedV2Fragment, updateadinfo}, iOnExtraCallbackWithResult, -177298703, 177298704);
    }
}
