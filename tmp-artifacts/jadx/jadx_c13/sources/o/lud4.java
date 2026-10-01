package o;

import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lud4 {
    public static final setPatch onExtraCallbackWithResult(@NotNull MainDispatcherFactory mainDispatcherFactory, @NotNull List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return IAuthTabCallback(th, mainDispatcherFactory.hintOnError());
        }
    }

    public static final boolean IAuthTabCallback(@NotNull setPatch setpatch) {
        return setpatch.onExtraCallback() instanceof ycx6;
    }

    static /* synthetic */ ycx6 IAuthTabCallback(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return IAuthTabCallback(th, str);
    }

    private static final ycx6 IAuthTabCallback(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        onNavigationEvent();
        throw new setWrite();
    }

    public static final Void onNavigationEvent() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
