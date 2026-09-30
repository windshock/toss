package o;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class addCommandLine<T, K> extends access6400<T> {
    private final Iterator<T> IAuthTabCallback;
    private final HashSet<K> onExtraCallback;
    private final Function1<T, K> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public addCommandLine(@NotNull Iterator<? extends T> it, @NotNull Function1<? super T, ? extends K> function1) {
        Intrinsics.checkNotNullParameter(it, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallback = it;
        this.onWarmupCompleted = function1;
        this.onExtraCallback = new HashSet<>();
    }

    @Override // o.access6400
    public void onNavigationEvent() {
        while (this.IAuthTabCallback.hasNext()) {
            T next = this.IAuthTabCallback.next();
            if (this.onExtraCallback.add(this.onWarmupCompleted.invoke(next))) {
                onExtraCallback(next);
                return;
            }
        }
        onExtraCallback();
    }
}
