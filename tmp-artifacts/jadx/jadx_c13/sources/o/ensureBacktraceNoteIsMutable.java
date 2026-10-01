package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ensureBacktraceNoteIsMutable {
    public static final void IAuthTabCallback(@Nullable AutoCloseable autoCloseable, @Nullable Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                ICustomTabsCallbackStubProxy.onExtraCallbackWithResult(autoCloseable);
                return;
            }
            try {
                ICustomTabsCallbackStubProxy.onExtraCallbackWithResult(autoCloseable);
            } catch (Throwable th2) {
                setExecute.onNavigationEvent(th, th2);
            }
        }
    }
}
