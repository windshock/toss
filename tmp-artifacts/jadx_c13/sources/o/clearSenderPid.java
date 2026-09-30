package o;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class clearSenderPid<E extends Map.Entry<? extends K, ? extends V>, K, V> extends access6800<E> {
    public abstract boolean onExtraCallbackWithResult(@NotNull Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return IAuthTabCallback((Map.Entry) obj);
        }
        return false;
    }

    public boolean onExtraCallback(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return onExtraCallback((Map.Entry) obj);
        }
        return false;
    }

    public final boolean IAuthTabCallback(@NotNull E e) {
        Intrinsics.checkNotNullParameter(e, "");
        return onExtraCallbackWithResult(e);
    }
}
