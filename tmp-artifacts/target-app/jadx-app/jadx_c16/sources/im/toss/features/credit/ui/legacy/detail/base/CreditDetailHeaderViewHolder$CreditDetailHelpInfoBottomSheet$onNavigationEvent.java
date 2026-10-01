package im.toss.features.credit.ui.legacy.detail.base;

import o.connectWithOverlayPermission;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditDetailHeaderViewHolder$CreditDetailHelpInfoBottomSheet$onNavigationEvent {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final /* synthetic */ int[] onWarmupCompleted;

    static {
        int[] iArr = new int[connectWithOverlayPermission.values().length];
        try {
            iArr[connectWithOverlayPermission.CARD.ordinal()] = 1;
            int i = onExtraCallback + 11;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[connectWithOverlayPermission.LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        onWarmupCompleted = iArr;
        int i4 = onExtraCallback + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
