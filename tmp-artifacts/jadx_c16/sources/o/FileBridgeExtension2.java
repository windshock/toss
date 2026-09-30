package o;

import im.toss.features.edoc.wallet.pkg.PackageIssueFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FileBridgeExtension2 implements setSize<PackageIssueFragment> {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static void onExtraCallbackWithResult(PackageIssueFragment packageIssueFragment, TitleBarExtension1 titleBarExtension1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        packageIssueFragment.searchAddressIntent = titleBarExtension1;
        int i4 = IAuthTabCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onNavigationEvent(PackageIssueFragment packageIssueFragment, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        packageIssueFragment.standardTermsV2Intent = getdummyad;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
