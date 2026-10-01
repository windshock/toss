package o;

import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setJustifyContent {
    public static final boolean onExtraCallbackWithResult() {
        return true;
    }

    static {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Result.onNavigationEvent(obj);
    }
}
