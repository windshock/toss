package o;

import android.media.MediaPlayer;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DialogHostKtExternalSyntheticLambda2 extends MediaSessionStubExternalSyntheticLambda72 {
    public final /* synthetic */ MediaPlayer onExtraCallbackWithResult;
    public final /* synthetic */ NavOptionsBuilderExternalSyntheticLambda0 onNavigationEvent;
    public final /* synthetic */ MediaControllerImplBaseExternalSyntheticLambda17 onWarmupCompleted;

    public DialogHostKtExternalSyntheticLambda2(NavOptionsBuilderExternalSyntheticLambda0 navOptionsBuilderExternalSyntheticLambda0, MediaControllerImplBaseExternalSyntheticLambda17 mediaControllerImplBaseExternalSyntheticLambda17, MediaPlayer mediaPlayer) {
        this.onNavigationEvent = navOptionsBuilderExternalSyntheticLambda0;
        this.onWarmupCompleted = mediaControllerImplBaseExternalSyntheticLambda17;
        this.onExtraCallbackWithResult = mediaPlayer;
    }

    @Override // o.MediaSessionStubExternalSyntheticLambda72
    public final void onWarmupCompleted() {
        this.onNavigationEvent.IAuthTabCallback.onExtraCallbackWithResult(this.onWarmupCompleted, this.onExtraCallbackWithResult);
    }
}
