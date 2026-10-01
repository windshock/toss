package o;

import im.toss.devtool.noop.di.SingletonDevToolModule;

/* loaded from: classes.dex */
public final class preCreatePage implements captureStartValues<sendToApp> {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(preCreatePage.class);

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4403);
        sendToApp sendtoappIAuthTabCallback = IAuthTabCallback();
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5772);
        return sendtoappIAuthTabCallback;
    }

    public sendToApp IAuthTabCallback() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5014);
        sendToApp sendtoappOnNavigationEvent = onNavigationEvent();
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2717);
        return sendtoappOnNavigationEvent;
    }

    public static sendToApp onNavigationEvent() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2727);
        sendToApp sendtoapp = (sendToApp) createAnimator.onNavigationEvent((sendToApp) SingletonDevToolModule.onExtraCallback.onExtraCallbackWithResult$30081a78());
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1654);
        return sendtoapp;
    }
}
