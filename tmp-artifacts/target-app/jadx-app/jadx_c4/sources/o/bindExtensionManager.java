package o;

import im.toss.di.ConverterFactoryModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class bindExtensionManager implements captureStartValues<ba> {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final createAnimators<zzad> IAuthTabCallback;
    private final createAnimators<wie2> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ba baVarOnWarmupCompleted = onWarmupCompleted();
        int i4 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return baVarOnWarmupCompleted;
    }

    public ba onWarmupCompleted() {
        ba baVarOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            baVarOnWarmupCompleted = onWarmupCompleted((wie2) this.onExtraCallback.get(), (zzad) this.IAuthTabCallback.get());
            int i3 = 14 / 0;
        } else {
            baVarOnWarmupCompleted = onWarmupCompleted((wie2) this.onExtraCallback.get(), (zzad) this.IAuthTabCallback.get());
        }
        int i4 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return baVarOnWarmupCompleted;
    }

    public static ba onWarmupCompleted(wie2 wie2Var, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ba baVar = (ba) createAnimator.onNavigationEvent(ConverterFactoryModule.onNavigationEvent.onWarmupCompleted(wie2Var, zzadVar));
        if (i3 == 0) {
            return baVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
