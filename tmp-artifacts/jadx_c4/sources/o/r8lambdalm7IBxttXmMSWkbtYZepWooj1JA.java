package o;

import android.content.Context;
import im.toss.components.tuba.variable.v2.impl.di.NetworkModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class r8lambdalm7IBxttXmMSWkbtYZepWooj1JA implements captureStartValues<RoundedCornersTransformation> {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult;
    private final createAnimators<ea> IAuthTabCallback;
    private final createAnimators<zzad> onExtraCallback;
    private final createAnimators<g1> onNavigationEvent;
    private final createAnimators<Context> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent();
            throw null;
        }
        RoundedCornersTransformation roundedCornersTransformationOnNavigationEvent = onNavigationEvent();
        int i3 = IAuthTabCallbackStub + 45;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return roundedCornersTransformationOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public RoundedCornersTransformation onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        RoundedCornersTransformation roundedCornersTransformationOnWarmupCompleted = onWarmupCompleted((Context) this.onWarmupCompleted.get(), (zzad) this.onExtraCallback.get(), (g1) this.onNavigationEvent.get(), (ea) this.IAuthTabCallback.get());
        int i4 = onExtraCallbackWithResult + 89;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return roundedCornersTransformationOnWarmupCompleted;
        }
        throw null;
    }

    public static RoundedCornersTransformation onWarmupCompleted(Context context, zzad zzadVar, g1 g1Var, ea eaVar) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        RoundedCornersTransformation roundedCornersTransformation = (RoundedCornersTransformation) createAnimator.onNavigationEvent(NetworkModule.IAuthTabCallback.onExtraCallback(context, zzadVar, g1Var, eaVar));
        int i4 = IAuthTabCallbackStub + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return roundedCornersTransformation;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
