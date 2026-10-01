package o;

import android.animation.ArgbEvaluator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setHasUserConsent extends getConfiguration<Integer> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public setHasUserConsent(int i, int i2) {
        super(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public Integer IAuthTabCallback(float f) {
        int i = 2 % 2;
        Object objEvaluate = new ArgbEvaluator().evaluate(f, onExtraCallback(), onWarmupCompleted());
        Intrinsics.checkNotNull(objEvaluate, "");
        Integer num = (Integer) objEvaluate;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return num;
    }
}
