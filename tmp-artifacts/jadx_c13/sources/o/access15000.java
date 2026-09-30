package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class access15000<T extends Enum<T>> extends AbstractList<T> implements EnumEntries<T>, RandomAccess, Serializable {
    private final T[] entries;

    public access15000(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        this.entries = tArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return IAuthTabCallback((Enum) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return onNavigationEvent((Enum) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return onExtraCallback((Enum) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.entries.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public T get(int i) {
        AbstractList.Companion.onExtraCallbackWithResult(i, this.entries.length);
        return this.entries[i];
    }

    public boolean IAuthTabCallback(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        return ((Enum) ArraysKt___ArraysKt.getOrNull(this.entries, t.ordinal())) == t;
    }

    public int onNavigationEvent(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        int iOrdinal = t.ordinal();
        if (((Enum) ArraysKt___ArraysKt.getOrNull(this.entries, iOrdinal)) == t) {
            return iOrdinal;
        }
        return -1;
    }

    public int onExtraCallback(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        return onNavigationEvent(t);
    }

    private final Object writeReplace() {
        return new access15500(this.entries);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
