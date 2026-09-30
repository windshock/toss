package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access7000 implements Map, Serializable, KMappedMarker {
    public static final access7000 IAuthTabCallback = new access7000();
    private static final long serialVersionUID = 8246714829545688274L;

    public int IAuthTabCallback() {
        return 0;
    }

    public boolean IAuthTabCallback(@NotNull Void r2) {
        Intrinsics.checkNotNullParameter(r2, "");
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Void get(@Nullable Object obj) {
        return null;
    }

    @Override // java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private access7000() {
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return IAuthTabCallback((Void) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry> entrySet() {
        return onWarmupCompleted();
    }

    @Override // java.util.Map
    public final Set<Object> keySet() {
        return onNavigationEvent();
    }

    @Override // java.util.Map
    public final int size() {
        return IAuthTabCallback();
    }

    @Override // java.util.Map
    public final Collection values() {
        return onExtraCallbackWithResult();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public String toString() {
        return "{}";
    }

    public Set<Map.Entry> onWarmupCompleted() {
        return access7100.onExtraCallback;
    }

    public Set<Object> onNavigationEvent() {
        return access7100.onExtraCallback;
    }

    public Collection onExtraCallbackWithResult() {
        return access7400.onExtraCallback;
    }

    private final Object readResolve() {
        return IAuthTabCallback;
    }
}
