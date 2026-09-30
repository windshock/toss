package o;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class TombstoneProtosTombstoneOrBuilder<E extends Map.Entry<? extends K, ? extends V>, K, V> extends access6800<E> {
    public abstract boolean IAuthTabCallback(@NotNull Map.Entry<? extends K, ? extends V> entry);

    public abstract boolean onExtraCallback(@NotNull Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return onExtraCallbackWithResult((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return onWarmupCompleted((Map.Entry) obj);
        }
        return false;
    }

    public final boolean onExtraCallbackWithResult(@NotNull E e) {
        Intrinsics.checkNotNullParameter(e, "");
        if ((e instanceof Object ? e : null) instanceof Map.Entry) {
            return IAuthTabCallback(e);
        }
        return false;
    }

    public final boolean onWarmupCompleted(@NotNull E e) {
        Intrinsics.checkNotNullParameter(e, "");
        if ((e instanceof Object ? e : null) instanceof Map.Entry) {
            return onExtraCallback(e);
        }
        return false;
    }
}
