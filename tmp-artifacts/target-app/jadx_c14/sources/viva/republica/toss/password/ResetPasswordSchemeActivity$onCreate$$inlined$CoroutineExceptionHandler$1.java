package viva.republica.toss.password;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.unwrapOptional;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResetPasswordSchemeActivity$onCreate$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    final /* synthetic */ ResetPasswordSchemeActivity IAuthTabCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPasswordSchemeActivity$onCreate$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, ResetPasswordSchemeActivity resetPasswordSchemeActivity) {
        super(onwarmupcompleted);
        this.IAuthTabCallback = resetPasswordSchemeActivity;
    }

    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        if (th instanceof unwrapOptional) {
            return;
        }
        ResetPasswordSchemeActivity.onExtraCallback(this.IAuthTabCallback);
    }
}
