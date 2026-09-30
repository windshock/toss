package o;

import android.content.Context;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import im.toss.dynamicfeature.di.TossDynamicFeatureModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class JsErrorAssist implements captureStartValues<SplitInstallManager> {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final TossDynamicFeatureModule IAuthTabCallback;
    private final createAnimators<Context> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SplitInstallManager splitInstallManagerOnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return splitInstallManagerOnNavigationEvent;
    }

    public SplitInstallManager onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(this.IAuthTabCallback, (Context) this.onExtraCallback.get());
            throw null;
        }
        SplitInstallManager splitInstallManagerOnWarmupCompleted = onWarmupCompleted(this.IAuthTabCallback, (Context) this.onExtraCallback.get());
        int i3 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
        return splitInstallManagerOnWarmupCompleted;
    }

    public static SplitInstallManager onWarmupCompleted(TossDynamicFeatureModule tossDynamicFeatureModule, Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SplitInstallManager splitInstallManager = (SplitInstallManager) createAnimator.onNavigationEvent(tossDynamicFeatureModule.IAuthTabCallback(context));
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return splitInstallManager;
    }
}
