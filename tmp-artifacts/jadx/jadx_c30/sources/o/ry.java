package o;

import kotlin.Result;
import kotlin.ResultKt;
import sun.misc.Signal;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ry {
    private static final boolean onExtraCallback;
    public static final ry onExtraCallbackWithResult = new ry();

    private ry() {
    }

    static {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            obj = Result.constructor-impl(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Boolean bool = (Boolean) (Result.onExtraCallback(obj) ? null : obj);
        onExtraCallback = bool != null ? bool.booleanValue() : tru.onExtraCallback.onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(Signal signal) {
        tru truVar = tru.onExtraCallback;
        if (truVar.IAuthTabCallback()) {
            truVar.onWarmupCompleted(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }
}
