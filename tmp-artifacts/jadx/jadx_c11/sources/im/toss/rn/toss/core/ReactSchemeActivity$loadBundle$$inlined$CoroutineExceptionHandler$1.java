package im.toss.rn.toss.core;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.ConvertFloatArrayToByteArray;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactSchemeActivity$loadBundle$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public ReactSchemeActivity$loadBundle$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
        super(onwarmupcompleted);
    }

    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("ReactSchemeActivity", th);
            return;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("ReactSchemeActivity", th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
