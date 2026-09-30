package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ul<T> extends WeakReference<T> {
    public final int onNavigationEvent;

    public ul(T t, @Nullable ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        this.onNavigationEvent = t != null ? t.hashCode() : 0;
    }
}
