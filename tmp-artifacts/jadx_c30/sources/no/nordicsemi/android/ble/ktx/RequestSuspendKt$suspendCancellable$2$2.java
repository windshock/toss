package no.nordicsemi.android.ble.ktx;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import o.IABLandingPageActivity1;
import o.getIsSelected;
import o.isUseTextureView;
import o.maybeRemoveAttachStateListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestSuspendKt$suspendCancellable$2$2 implements isUseTextureView {
    final /* synthetic */ getIsSelected onExtraCallback;
    final /* synthetic */ maybeRemoveAttachStateListener<Unit> onExtraCallbackWithResult;

    public final void onInvalidRequest() {
        maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = this.onExtraCallbackWithResult;
        Result.Companion companion = Result.Companion;
        mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(ResultKt.createFailure(new IABLandingPageActivity1(this.onExtraCallback))));
    }
}
