package im.toss.features.mobileid.impl.view;

import im.toss.features.mobileid.impl.MobileIdIssueViewModel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdIssueActivity$onExtraCallbackWithResult {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public static final /* synthetic */ int[] onExtraCallbackWithResult;

    static {
        int[] iArr = new int[MobileIdIssueViewModel.onExtraCallback.values().length];
        try {
            iArr[MobileIdIssueViewModel.onExtraCallback.ISSUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MobileIdIssueViewModel.onExtraCallback.BINDING.ordinal()] = 2;
            int i = onExtraCallback + 75;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        onExtraCallbackWithResult = iArr;
        int i3 = IAuthTabCallback + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
