package no.nordicsemi.android.ble.ktx;

import kotlin.Result;
import kotlin.ResultKt;
import o.IABLandingPageActivity1;
import o.hasSecondOptions;
import o.isUseTextureView;
import o.loss;
import o.maybeRemoveAttachStateListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspend$14$3 implements isUseTextureView {
    final /* synthetic */ hasSecondOptions onExtraCallback;
    final /* synthetic */ maybeRemoveAttachStateListener<loss> onExtraCallbackWithResult;

    public final void onInvalidRequest() {
        maybeRemoveAttachStateListener<loss> mayberemoveattachstatelistener = this.onExtraCallbackWithResult;
        Result.Companion companion = Result.Companion;
        mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(ResultKt.createFailure(new IABLandingPageActivity1(this.onExtraCallback))));
    }
}
