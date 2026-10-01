package no.nordicsemi.android.ble.ktx;

import kotlin.Result;
import kotlin.ResultKt;
import o.FilterWord;
import o.IABLandingPageActivity1;
import o.isUseTextureView;
import o.loss;
import o.maybeRemoveAttachStateListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspend$16$3 implements isUseTextureView {
    final /* synthetic */ maybeRemoveAttachStateListener<loss> IAuthTabCallback;
    final /* synthetic */ FilterWord onNavigationEvent;

    public final void onInvalidRequest() {
        maybeRemoveAttachStateListener<loss> mayberemoveattachstatelistener = this.IAuthTabCallback;
        Result.Companion companion = Result.Companion;
        mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(ResultKt.createFailure(new IABLandingPageActivity1(this.onNavigationEvent))));
    }
}
