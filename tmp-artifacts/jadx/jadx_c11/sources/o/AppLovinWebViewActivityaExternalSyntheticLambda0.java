package o;

import android.view.animation.Interpolator;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class AppLovinWebViewActivityaExternalSyntheticLambda0 implements Interpolator {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final deprecated_protocols onWarmupCompleted;

    public AppLovinWebViewActivityaExternalSyntheticLambda0(double d, double d2) {
        this.onWarmupCompleted = new deprecated_protocols(d, d2);
    }

    public final deprecated_protocols onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        deprecated_protocols deprecated_protocolsVar = this.onWarmupCompleted;
        int i5 = i2 + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return deprecated_protocolsVar;
    }
}
