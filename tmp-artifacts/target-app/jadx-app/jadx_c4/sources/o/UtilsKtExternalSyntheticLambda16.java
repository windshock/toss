package o;

import im.toss.components.tuba.distribution.TubaDistributionModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class UtilsKtExternalSyntheticLambda16 implements captureStartValues<UtilsKtExternalSyntheticLambda14> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final createAnimators<ea> onExtraCallbackWithResult;
    private final createAnimators<zzad> onNavigationEvent;
    private final createAnimators<g1> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        UtilsKtExternalSyntheticLambda14 utilsKtExternalSyntheticLambda14OnExtraCallback = onExtraCallback();
        int i4 = onExtraCallback + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return utilsKtExternalSyntheticLambda14OnExtraCallback;
        }
        throw null;
    }

    public UtilsKtExternalSyntheticLambda14 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.onWarmupCompleted.get();
        if (i3 != 0) {
            return onWarmupCompleted((g1) obj, (ea) this.onExtraCallbackWithResult.get(), (zzad) this.onNavigationEvent.get());
        }
        onWarmupCompleted((g1) obj, (ea) this.onExtraCallbackWithResult.get(), (zzad) this.onNavigationEvent.get());
        throw null;
    }

    public static UtilsKtExternalSyntheticLambda14 onWarmupCompleted(g1 g1Var, ea eaVar, zzad zzadVar) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        UtilsKtExternalSyntheticLambda14 utilsKtExternalSyntheticLambda14 = (UtilsKtExternalSyntheticLambda14) createAnimator.onNavigationEvent(TubaDistributionModule.IAuthTabCallback.onNavigationEvent(g1Var, eaVar, zzadVar));
        int i4 = IAuthTabCallback + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return utilsKtExternalSyntheticLambda14;
    }
}
