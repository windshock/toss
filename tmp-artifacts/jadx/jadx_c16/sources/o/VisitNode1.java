package o;

import im.toss.di.TossApiServiceModule;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class VisitNode1 implements captureStartValues<MediaViewListener> {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final createAnimators<g1> onExtraCallbackWithResult;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    public MediaViewListener onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MediaViewListener mediaViewListenerOnExtraCallback = onExtraCallback((g1) this.onExtraCallbackWithResult.get());
        int i4 = IAuthTabCallback + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return mediaViewListenerOnExtraCallback;
    }

    public static MediaViewListener onExtraCallback(g1 g1Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        MediaViewListener mediaViewListener = (MediaViewListener) createAnimator.onNavigationEvent(TossApiServiceModule.IAuthTabCallback.onMessageChannelReady(g1Var));
        int i4 = IAuthTabCallback + 1;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return mediaViewListener;
    }
}
