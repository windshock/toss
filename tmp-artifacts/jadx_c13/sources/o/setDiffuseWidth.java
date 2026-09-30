package o;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setDiffuseWidth<T> {
    public volatile SoftReference<T> onNavigationEvent = new SoftReference<>(null);

    public final T onExtraCallbackWithResult(@NotNull Function0<? extends T> function0) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(function0, "");
            T t = this.onNavigationEvent.get();
            if (t != null) {
                return t;
            }
            T tInvoke = function0.invoke();
            this.onNavigationEvent = new SoftReference<>(tInvoke);
            return tInvoke;
        }
    }
}
