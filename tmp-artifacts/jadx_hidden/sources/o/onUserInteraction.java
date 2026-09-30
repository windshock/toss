package o;

import im.toss.devtool.noop.di.SingletonDevToolModule;

/* loaded from: classes.dex */
public final class onUserInteraction implements captureStartValues<bindPreRenderContext> {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onUserInteraction.class);

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5517);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 31) & 1) != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        throw null;
    }

    public bindPreRenderContext IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5625);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 5) & 1) != 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static bindPreRenderContext onExtraCallback() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(629);
        bindPreRenderContext bindprerendercontext = (bindPreRenderContext) createAnimator.onNavigationEvent((bindPreRenderContext) SingletonDevToolModule.onExtraCallback.onNavigationEvent$6fd6c57d());
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1505);
        if (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted)) & 1) != 0) {
            return bindprerendercontext;
        }
        throw null;
    }
}
