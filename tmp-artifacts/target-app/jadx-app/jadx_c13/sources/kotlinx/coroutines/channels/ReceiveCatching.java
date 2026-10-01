package kotlinx.coroutines.channels;

import o.lud;
import o.setResourceInternal;
import o.syncDoGet;
import o.ycx5;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReceiveCatching<E> implements syncDoGet {
    public final setResourceInternal<lud<? extends E>> onNavigationEvent;

    @Override // o.syncDoGet
    public void IAuthTabCallback(@NotNull ycx5<?> ycx5Var, int i) {
        this.onNavigationEvent.IAuthTabCallback(ycx5Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReceiveCatching(@NotNull setResourceInternal<? super lud<? extends E>> setresourceinternal) {
        this.onNavigationEvent = setresourceinternal;
    }
}
