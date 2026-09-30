package o;

import im.toss.features.applock.impl.view.WarningChangeLowSecurityLevelDialogFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SystemUtils implements setSize<WarningChangeLowSecurityLevelDialogFragment> {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static void onExtraCallback(WarningChangeLowSecurityLevelDialogFragment warningChangeLowSecurityLevelDialogFragment, RVRemoteUtils rVRemoteUtils) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        warningChangeLowSecurityLevelDialogFragment.disableForceAppLockByUserUseCase = rVRemoteUtils;
        int i4 = onWarmupCompleted + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void onWarmupCompleted(WarningChangeLowSecurityLevelDialogFragment warningChangeLowSecurityLevelDialogFragment, isWifiEnabled iswifienabled) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        warningChangeLowSecurityLevelDialogFragment.securityLevelUseCase = iswifienabled;
        if (i3 != 0) {
            throw null;
        }
    }

    public static void onWarmupCompleted(WarningChangeLowSecurityLevelDialogFragment warningChangeLowSecurityLevelDialogFragment, Constant constant) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        warningChangeLowSecurityLevelDialogFragment.appLockLogManager = constant;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
    }
}
