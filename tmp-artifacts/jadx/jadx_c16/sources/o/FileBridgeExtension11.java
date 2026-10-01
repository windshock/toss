package o;

import im.toss.features.edoc.wallet.issue.DocumentWalletIssueInputFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class FileBridgeExtension11 implements setSize<DocumentWalletIssueInputFragment> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static void IAuthTabCallback(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, TitleBarExtension1 titleBarExtension1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        documentWalletIssueInputFragment.searchAddressIntent = titleBarExtension1;
        int i4 = onExtraCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onNavigationEvent(DocumentWalletIssueInputFragment documentWalletIssueInputFragment, getDummyAd getdummyad) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        documentWalletIssueInputFragment.standardTermsV2Intent = getdummyad;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = onExtraCallback + 7;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
