package o;

import android.content.Context;
import im.toss.di.ApplicationModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onTabInfoGot implements captureStartValues<zzax> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final createAnimators<Context> onWarmupCompleted;

    public /* synthetic */ Object get() {
        zzax zzaxVarOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            zzaxVarOnWarmupCompleted = onWarmupCompleted();
            int i3 = 78 / 0;
        } else {
            zzaxVarOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zzaxVarOnWarmupCompleted;
    }

    public zzax onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Context context = (Context) this.onWarmupCompleted.get();
        if (i3 != 0) {
            return onWarmupCompleted(context);
        }
        onWarmupCompleted(context);
        throw null;
    }

    public static zzax onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        zzax zzaxVar = (zzax) createAnimator.onNavigationEvent(ApplicationModule.onExtraCallbackWithResult.onNavigationEvent(context));
        int i4 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zzaxVar;
        }
        throw null;
    }
}
