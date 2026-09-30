package im.toss.compose.widget;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import o.SessionProcessorCaptureCallback;
import o.removeObserverLocked;
import o.setImageAssetsFolder;
import o.toMetersPerSecond;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsRadialGradientKt$$ExternalSyntheticLambda9 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ toMetersPerSecond f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ float f$3;
    public final /* synthetic */ Pair[] f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ float f$6;

    public /* synthetic */ TdsRadialGradientKt$$ExternalSyntheticLambda9(toMetersPerSecond tometerspersecond, float f, float f2, float f3, Pair[] pairArr, int i, float f4) {
        this.f$0 = tometerspersecond;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = f3;
        this.f$4 = pairArr;
        this.f$5 = i;
        this.f$6 = f4;
    }

    public final Object invoke(Object obj) {
        removeObserverLocked removeobserverlockedOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        toMetersPerSecond tometerspersecond = this.f$0;
        float f = this.f$1;
        if (i3 == 0) {
            removeobserverlockedOnWarmupCompleted = setImageAssetsFolder.onWarmupCompleted(tometerspersecond, f, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (SessionProcessorCaptureCallback) obj);
            int i4 = 39 / 0;
        } else {
            removeobserverlockedOnWarmupCompleted = setImageAssetsFolder.onWarmupCompleted(tometerspersecond, f, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (SessionProcessorCaptureCallback) obj);
        }
        int i5 = onWarmupCompleted + 95;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return removeobserverlockedOnWarmupCompleted;
    }
}
