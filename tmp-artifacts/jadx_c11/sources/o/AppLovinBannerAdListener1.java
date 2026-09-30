package o;

import com.google.android.gms.internal.ads.zziea;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinBannerAdListener1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ AppLovinBannerAdListener2 onNavigationEvent(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i, Object obj) {
        long jOnNavigationEvent;
        long jOnExtraCallbackWithResult;
        long jLongValue;
        long jOnWarmupCompleted;
        long jOnTransact;
        long j11;
        long jLongValue2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                jOnNavigationEvent = MaxNetworkResponseInfoAdLoadState.onWarmupCompleted.onNavigationEvent();
                int i4 = 26 / 0;
            } else {
                jOnNavigationEvent = MaxNetworkResponseInfoAdLoadState.onWarmupCompleted.onNavigationEvent();
            }
        } else {
            jOnNavigationEvent = j;
        }
        if ((i & 2) != 0) {
            jOnExtraCallbackWithResult = MaxNetworkResponseInfoAdLoadState.onWarmupCompleted.onExtraCallbackWithResult();
            int i5 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            jOnExtraCallbackWithResult = j2;
        }
        if ((i & 4) != 0) {
            jLongValue = ((Long) MaxNetworkResponseInfoAdLoadState.onExtraCallbackWithResult(new Object[]{MaxNetworkResponseInfoAdLoadState.onWarmupCompleted}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -1611684298, 1611684299)).longValue();
        } else {
            jLongValue = j3;
        }
        if ((i & 8) != 0) {
            int i7 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                MaxNetworkResponseInfoAdLoadState.onWarmupCompleted.onWarmupCompleted();
                throw null;
            }
            jOnWarmupCompleted = MaxNetworkResponseInfoAdLoadState.onWarmupCompleted.onWarmupCompleted();
        } else {
            jOnWarmupCompleted = j4;
        }
        long jOnExtraCallback = (i & 16) != 0 ? MaxNetworkResponseInfoAdLoadState.onWarmupCompleted.onExtraCallback() : j5;
        long jAsInterface = (i & 32) != 0 ? MaxNetworkResponseInfoAdLoadState.onWarmupCompleted.asInterface() : j6;
        if ((i & 64) != 0) {
            int i8 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            jOnTransact = MaxNetworkResponseInfoAdLoadState.onWarmupCompleted.onTransact();
        } else {
            jOnTransact = j7;
        }
        long jIAuthTabCallbackDefault = (i & 128) != 0 ? MaxNetworkResponseInfoAdLoadState.onWarmupCompleted.IAuthTabCallbackDefault() : j8;
        if ((i & 256) != 0) {
            int i10 = onExtraCallbackWithResult + 1;
            j11 = jOnTransact;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            jLongValue2 = ((Long) MaxNetworkResponseInfoAdLoadState.onExtraCallbackWithResult(new Object[]{MaxNetworkResponseInfoAdLoadState.onWarmupCompleted}, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), -492262740, 492262740)).longValue();
        } else {
            j11 = jOnTransact;
            jLongValue2 = j9;
        }
        return onNavigationEvent(jOnNavigationEvent, jOnExtraCallbackWithResult, jLongValue, jOnWarmupCompleted, jOnExtraCallback, jAsInterface, j11, jIAuthTabCallbackDefault, jLongValue2, (i & 512) != 0 ? MaxNetworkResponseInfoAdLoadState.onWarmupCompleted.asBinder() : j10);
    }

    public static final AppLovinBannerAdListener2 onNavigationEvent(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        int i = 2 % 2;
        AppLovinBannerAdListener2 appLovinBannerAdListener2 = new AppLovinBannerAdListener2(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, null);
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return appLovinBannerAdListener2;
    }

    public static /* synthetic */ AppLovinBannerAdListener2 onWarmupCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, int i, Object obj) {
        long jLongValue;
        long jLongValue2;
        long jAsInterface;
        long jIAuthTabCallbackStub;
        long j11;
        long jOnTransact;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long jIAuthTabCallback = (i & 1) != 0 ? MaxReward.onWarmupCompleted.IAuthTabCallback() : j;
        if ((i & 2) != 0) {
            Object[] objArr = {MaxReward.onWarmupCompleted};
            jLongValue = ((Long) MaxReward.onExtraCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -667649277, 667649277, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr)).longValue();
        } else {
            jLongValue = j2;
        }
        long jOnNavigationEvent = (i & 4) != 0 ? MaxReward.onWarmupCompleted.onNavigationEvent() : j3;
        if ((i & 8) != 0) {
            int i5 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr2 = {MaxReward.onWarmupCompleted};
                jLongValue2 = ((Long) MaxReward.onExtraCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -682361193, 682361194, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr2)).longValue();
                int i6 = 37 / 0;
            } else {
                Object[] objArr3 = {MaxReward.onWarmupCompleted};
                jLongValue2 = ((Long) MaxReward.onExtraCallback(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -682361193, 682361194, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), objArr3)).longValue();
            }
        } else {
            jLongValue2 = j4;
        }
        long jOnExtraCallback = (i & 16) != 0 ? MaxReward.onWarmupCompleted.onExtraCallback() : j5;
        if ((i & 32) != 0) {
            int i7 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 19 / 0;
                jAsInterface = MaxReward.onWarmupCompleted.asInterface();
            } else {
                jAsInterface = MaxReward.onWarmupCompleted.asInterface();
            }
        } else {
            jAsInterface = j6;
        }
        if ((i & 64) != 0) {
            int i9 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            jIAuthTabCallbackStub = MaxReward.onWarmupCompleted.IAuthTabCallbackStub();
        } else {
            jIAuthTabCallbackStub = j7;
        }
        if ((i & 128) != 0) {
            jOnTransact = MaxReward.onWarmupCompleted.onTransact();
            int i11 = onExtraCallbackWithResult + 113;
            j11 = jIAuthTabCallbackStub;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        } else {
            j11 = jIAuthTabCallbackStub;
            jOnTransact = j8;
        }
        return IAuthTabCallback(jIAuthTabCallback, jLongValue, jOnNavigationEvent, jLongValue2, jOnExtraCallback, jAsInterface, j11, jOnTransact, (i & 256) != 0 ? MaxReward.onWarmupCompleted.IAuthTabCallbackDefault() : j9, (i & 512) != 0 ? MaxReward.onWarmupCompleted.asBinder() : j10);
    }

    public static final AppLovinBannerAdListener2 IAuthTabCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        int i = 2 % 2;
        AppLovinBannerAdListener2 appLovinBannerAdListener2 = new AppLovinBannerAdListener2(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, null);
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return appLovinBannerAdListener2;
    }
}
