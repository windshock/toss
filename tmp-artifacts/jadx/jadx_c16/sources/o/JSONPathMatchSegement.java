package o;

import im.toss.features.mobileid.impl.view.MobileIdIssueRrnFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class JSONPathMatchSegement implements setSize<MobileIdIssueRrnFragment> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static void onNavigationEvent(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, AppLovinSdkInitializationConfigurationImplBuilderImpl appLovinSdkInitializationConfigurationImplBuilderImpl) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mobileIdIssueRrnFragment.birthdayValidator = appLovinSdkInitializationConfigurationImplBuilderImpl;
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
    }

    public static void onExtraCallbackWithResult(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, getBigDecimal getbigdecimal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mobileIdIssueRrnFragment.walletErrorHandler = getbigdecimal;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void onWarmupCompleted(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mobileIdIssueRrnFragment.tossRouter = sessionTrackerb;
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onNavigationEvent(MobileIdIssueRrnFragment mobileIdIssueRrnFragment, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        mobileIdIssueRrnFragment.environments = zzadVar;
        int i4 = onNavigationEvent + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
