package o;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setNumber<E> extends access6800<E> implements Set<E>, Serializable, KMutableSet {
    private static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final setNumber onWarmupCompleted = new setNumber(setCodeNameBytes.Companion.onNavigationEvent());
    private final setCodeNameBytes<E, ?> backing;

    public setNumber(@NotNull setCodeNameBytes<E, ?> setcodenamebytes) {
        Intrinsics.checkNotNullParameter(setcodenamebytes, "");
        this.backing = setcodenamebytes;
    }

    static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public setNumber() {
        this(new setCodeNameBytes());
    }

    public setNumber(int i) {
        this(new setCodeNameBytes(i));
    }

    public final Set<E> onWarmupCompleted() {
        this.backing.onExtraCallback();
        return size() > 0 ? this : onWarmupCompleted;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.backing.IAuthTabCallbackDefault()) {
            return new setHasSender(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // o.access6800
    public int onExtraCallback() {
        return this.backing.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.backing.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        return this.backing.onExtraCallback((setCodeNameBytes<E, ?>) e) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.backing.IAuthTabCallback((setCodeNameBytes<E, ?>) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.backing.access100();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.backing.onWarmupCompleted();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.backing.onWarmupCompleted();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.backing.onWarmupCompleted();
        return super.retainAll(collection);
    }
}
