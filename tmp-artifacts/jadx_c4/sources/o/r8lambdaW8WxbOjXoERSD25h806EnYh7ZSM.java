package o;

import android.content.Context;
import im.toss.components.tuba.variable.v2.impl.di.NetworkModule;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class r8lambdaW8WxbOjXoERSD25h806EnYh7ZSM implements captureStartValues<ImageViewTarget> {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback;
    private final createAnimators<Context> IAuthTabCallback;
    private final createAnimators<g1> onExtraCallbackWithResult;
    private final createAnimators<zzad> onNavigationEvent;
    private final createAnimators<ea> onWarmupCompleted;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ImageViewTarget imageViewTargetOnNavigationEvent = onNavigationEvent();
        int i4 = onExtraCallback + 101;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return imageViewTargetOnNavigationEvent;
    }

    public ImageViewTarget onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ImageViewTarget imageViewTargetOnNavigationEvent = onNavigationEvent((Context) this.IAuthTabCallback.get(), (zzad) this.onNavigationEvent.get(), (g1) this.onExtraCallbackWithResult.get(), (ea) this.onWarmupCompleted.get());
        int i4 = IAuthTabCallbackStub + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return imageViewTargetOnNavigationEvent;
    }

    public static ImageViewTarget onNavigationEvent(Context context, zzad zzadVar, g1 g1Var, ea eaVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ImageViewTarget imageViewTarget = (ImageViewTarget) createAnimator.onNavigationEvent(NetworkModule.IAuthTabCallback.IAuthTabCallback(context, zzadVar, g1Var, eaVar));
        int i4 = IAuthTabCallbackStub + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return imageViewTarget;
        }
        throw null;
    }
}
