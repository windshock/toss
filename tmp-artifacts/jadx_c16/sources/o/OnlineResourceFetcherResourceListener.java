package o;

import im.toss.devtool.domain.usecase.RunDevToolActionUseCase;
import im.toss.features.launcher.HomeLauncherFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class OnlineResourceFetcherResourceListener implements setSize<HomeLauncherFragment> {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static void onWarmupCompleted(HomeLauncherFragment homeLauncherFragment, RunDevToolActionUseCase runDevToolActionUseCase) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        homeLauncherFragment.runDevToolAction = runDevToolActionUseCase;
        int i4 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void onNavigationEvent(HomeLauncherFragment homeLauncherFragment, RVManifestIProxyManifest rVManifestIProxyManifest) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        homeLauncherFragment.homeLogManager = rVManifestIProxyManifest;
        int i4 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
    }

    public static void onExtraCallbackWithResult(HomeLauncherFragment homeLauncherFragment, SessionTrackerb sessionTrackerb) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        homeLauncherFragment.tossRouter = sessionTrackerb;
        int i4 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
