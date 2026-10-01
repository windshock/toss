package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setCodeName<K, V> extends clearSenderPid<Map.Entry<K, V>, K, V> {
    private final setCodeNameBytes<K, V> IAuthTabCallback;

    public setCodeName(@NotNull setCodeNameBytes<K, V> setcodenamebytes) {
        Intrinsics.checkNotNullParameter(setcodenamebytes, "");
        this.IAuthTabCallback = setcodenamebytes;
    }

    @Override // o.access6800
    public int onExtraCallback() {
        return this.IAuthTabCallback.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.IAuthTabCallback.isEmpty();
    }

    @Override // o.clearSenderPid
    public boolean onExtraCallbackWithResult(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return this.IAuthTabCallback.IAuthTabCallback((Map.Entry) entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.IAuthTabCallback.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public boolean add(@NotNull Map.Entry<K, V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends Map.Entry<K, V>> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        throw new UnsupportedOperationException();
    }

    @Override // o.clearSenderPid
    public boolean onExtraCallback(@NotNull Map.Entry<K, V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return this.IAuthTabCallback.onWarmupCompleted((Map.Entry) entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.IAuthTabCallback.IAuthTabCallback();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.IAuthTabCallback.onExtraCallback(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.IAuthTabCallback.onWarmupCompleted();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.IAuthTabCallback.onWarmupCompleted();
        return super.retainAll(collection);
    }
}
