package o;

import android.content.Context;
import im.toss.components.tuba.variable.v1.di.NetworkModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ImageRequests_androidKtExternalSyntheticLambda1 implements captureStartValues<ViewTargetRequestDelegate> {
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted;
    private final createAnimators<zzad> IAuthTabCallback;
    private final createAnimators<ea> onExtraCallback;
    private final createAnimators<g1> onExtraCallbackWithResult;
    private final createAnimators<Context> onNavigationEvent;

    public /* synthetic */ Object get() {
        ViewTargetRequestDelegate viewTargetRequestDelegateOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            viewTargetRequestDelegateOnWarmupCompleted = onWarmupCompleted();
            int i3 = 55 / 0;
        } else {
            viewTargetRequestDelegateOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = onWarmupCompleted + 23;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return viewTargetRequestDelegateOnWarmupCompleted;
        }
        throw null;
    }

    public ViewTargetRequestDelegate onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ViewTargetRequestDelegate viewTargetRequestDelegateOnWarmupCompleted = onWarmupCompleted((Context) this.onNavigationEvent.get(), (zzad) this.IAuthTabCallback.get(), (g1) this.onExtraCallbackWithResult.get(), (ea) this.onExtraCallback.get());
        int i4 = IAuthTabCallbackStub + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return viewTargetRequestDelegateOnWarmupCompleted;
        }
        throw null;
    }

    public static ViewTargetRequestDelegate onWarmupCompleted(Context context, zzad zzadVar, g1 g1Var, ea eaVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ViewTargetRequestDelegate viewTargetRequestDelegate = (ViewTargetRequestDelegate) createAnimator.onNavigationEvent(NetworkModule.onWarmupCompleted.IAuthTabCallback(context, zzadVar, g1Var, eaVar));
        int i4 = IAuthTabCallbackStub + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return viewTargetRequestDelegate;
    }
}
