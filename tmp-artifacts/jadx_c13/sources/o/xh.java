package o;

import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class xh {
    @Nullable
    public static qgr IAuthTabCallback(String str, qgr qgrVar) {
        oas.onExtraCallbackWithResult(str);
        return uci.onWarmupCompleted(ww.onNavigationEvent(str), qgrVar);
    }

    public static class onExtraCallbackWithResult extends IllegalStateException {
        public onExtraCallbackWithResult(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }
}
