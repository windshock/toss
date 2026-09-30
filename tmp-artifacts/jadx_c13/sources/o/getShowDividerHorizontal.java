package o;

import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getShowDividerHorizontal {
    public static final <T> T onExtraCallbackWithResult(@NotNull AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void onExtraCallback(@NotNull AtomicReference<T> atomicReference, T t) {
        atomicReference.set(t);
    }
}
