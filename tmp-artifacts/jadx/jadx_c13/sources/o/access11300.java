package o;

import io.realm.OrderedRealmCollection;
import io.realm.RealmAny;
import io.realm.RealmAnyOperator;
import io.realm.internal.OsResults;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.UncheckedRow;
import io.realm.internal.core.NativeRealmAny;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import javax.annotation.Nullable;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class access11300<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    @Nullable
    public final Class<E> IAuthTabCallback;

    @Nullable
    public final String onExtraCallback;
    final onExtraCallbackWithResult<E> onExtraCallbackWithResult;
    public final TombstoneProtosLogMessageOrBuilder onNavigationEvent;
    public final OsResults onWarmupCompleted;

    public boolean IAuthTabCallback() {
        return true;
    }

    public access11300(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, Class<E> cls, onExtraCallbackWithResult<E> onextracallbackwithresult) {
        this(tombstoneProtosLogMessageOrBuilder, osResults, cls, null, onextracallbackwithresult);
    }

    public access11300(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, String str, onExtraCallbackWithResult<E> onextracallbackwithresult) {
        this(tombstoneProtosLogMessageOrBuilder, osResults, null, str, onextracallbackwithresult);
    }

    private access11300(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, @Nullable Class<E> cls, @Nullable String str, onExtraCallbackWithResult<E> onextracallbackwithresult) {
        this.onNavigationEvent = tombstoneProtosLogMessageOrBuilder;
        this.onWarmupCompleted = osResults;
        this.IAuthTabCallback = cls;
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = onextracallbackwithresult;
    }

    public boolean onExtraCallback() {
        return this.onWarmupCompleted.asBinder();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@Nullable Object obj) {
        if (!onExtraCallbackWithResult() || ((obj instanceof RealmObjectProxy) && ((RealmObjectProxy) obj).cb_().IAuthTabCallback() == access21900.INSTANCE)) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            E next = it.next();
            if ((next instanceof byte[]) && (obj instanceof byte[])) {
                if (Arrays.equals((byte[]) next, (byte[]) obj)) {
                    return true;
                }
            } else {
                if (next != null && next.equals(obj)) {
                    return true;
                }
                if (next == null && obj == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    @Nullable
    public E get(int i) {
        this.onNavigationEvent.onTransact();
        return this.onExtraCallbackWithResult.onWarmupCompleted(i);
    }

    public boolean onWarmupCompleted() {
        this.onNavigationEvent.onTransact();
        if (size() <= 0) {
            return false;
        }
        this.onWarmupCompleted.IAuthTabCallback();
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new asBinder();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new IAuthTabCallbackStub(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        return new IAuthTabCallbackStub(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (!onExtraCallbackWithResult()) {
            return 0;
        }
        long jIAuthTabCallbackDefault = this.onWarmupCompleted.IAuthTabCallbackDefault();
        return jIAuthTabCallbackDefault > 2147483647L ? IntCompanionObject.MAX_VALUE : (int) jIAuthTabCallbackDefault;
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E remove(int i) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E set(int i, E e) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean add(E e) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public void add(int i, E e) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    class asBinder extends OsResults.onExtraCallbackWithResult<E> {
        asBinder() {
            super(access11300.this.onWarmupCompleted);
        }

        @Override // io.realm.internal.OsResults.onExtraCallbackWithResult
        public E onWarmupCompleted(int i, OsResults osResults) {
            return access11300.this.onExtraCallbackWithResult.onWarmupCompleted(i, osResults);
        }
    }

    class IAuthTabCallbackStub extends OsResults.onWarmupCompleted<E> {
        IAuthTabCallbackStub(int i) {
            super(access11300.this.onWarmupCompleted, i);
        }

        @Override // io.realm.internal.OsResults.onExtraCallbackWithResult
        public E onWarmupCompleted(int i, OsResults osResults) {
            return access11300.this.onExtraCallbackWithResult.onWarmupCompleted(i, osResults);
        }
    }

    public static <T> onExtraCallbackWithResult<T> onExtraCallbackWithResult(boolean z, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, @Nullable Class<T> cls, @Nullable String str) {
        if (z) {
            if (cls == Integer.class) {
                return new IAuthTabCallback(tombstoneProtosLogMessageOrBuilder, osResults, Integer.class, str);
            }
            if (cls == Short.class) {
                return new onTransact(tombstoneProtosLogMessageOrBuilder, osResults, Short.class, str);
            }
            if (cls == Byte.class) {
                return new onNavigationEvent(tombstoneProtosLogMessageOrBuilder, osResults, Byte.class, str);
            }
            if (cls == RealmAny.class) {
                return new asInterface(tombstoneProtosLogMessageOrBuilder, osResults, RealmAny.class, str);
            }
            return new onWarmupCompleted(tombstoneProtosLogMessageOrBuilder, osResults, cls, str);
        }
        return new onExtraCallback(tombstoneProtosLogMessageOrBuilder, osResults, cls, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    protected static abstract class onExtraCallbackWithResult<T> {
        protected final TombstoneProtosLogMessageOrBuilder IAuthTabCallback;
        protected final OsResults onExtraCallback;

        @Nullable
        protected final Class<T> onExtraCallbackWithResult;

        @Nullable
        protected final String onWarmupCompleted;

        public abstract T onWarmupCompleted(int i);

        public abstract T onWarmupCompleted(int i, OsResults osResults);

        onExtraCallbackWithResult(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, @Nullable Class<T> cls, @Nullable String str) {
            this.IAuthTabCallback = tombstoneProtosLogMessageOrBuilder;
            this.onExtraCallback = osResults;
            this.onExtraCallbackWithResult = cls;
            this.onWarmupCompleted = str;
        }
    }

    static class onExtraCallback<T> extends onExtraCallbackWithResult<T> {
        onExtraCallback(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, @Nullable Class<T> cls, @Nullable String str) {
            super(tombstoneProtosLogMessageOrBuilder, osResults, cls, str);
        }

        @Override // o.access11300.onExtraCallbackWithResult
        public T onWarmupCompleted(int i) {
            return (T) this.IAuthTabCallback.onExtraCallback(this.onExtraCallbackWithResult, this.onWarmupCompleted, this.onExtraCallback.onNavigationEvent(i));
        }

        public T IAuthTabCallback(UncheckedRow uncheckedRow) {
            return (T) this.IAuthTabCallback.onExtraCallback(this.onExtraCallbackWithResult, this.onWarmupCompleted, uncheckedRow);
        }

        @Override // o.access11300.onExtraCallbackWithResult
        public T onWarmupCompleted(int i, OsResults osResults) {
            return IAuthTabCallback(osResults.onNavigationEvent(i));
        }
    }

    static class onWarmupCompleted<T> extends onExtraCallbackWithResult<T> {
        onWarmupCompleted(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, @Nullable Class<T> cls, @Nullable String str) {
            super(tombstoneProtosLogMessageOrBuilder, osResults, cls, str);
        }

        @Override // o.access11300.onExtraCallbackWithResult
        public T onWarmupCompleted(int i) {
            return (T) this.onExtraCallback.onExtraCallbackWithResult(i);
        }

        @Override // o.access11300.onExtraCallbackWithResult
        public T onWarmupCompleted(int i, OsResults osResults) {
            return (T) osResults.onExtraCallbackWithResult(i);
        }
    }

    static class IAuthTabCallback extends onWarmupCompleted<Integer> {
        IAuthTabCallback(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, @Nullable Class<Integer> cls, @Nullable String str) {
            super(tombstoneProtosLogMessageOrBuilder, osResults, cls, str);
        }

        @Override // o.access11300.onWarmupCompleted, o.access11300.onExtraCallbackWithResult
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public Integer onWarmupCompleted(int i) {
            return Integer.valueOf(((Long) this.onExtraCallback.onExtraCallbackWithResult(i)).intValue());
        }

        @Override // o.access11300.onWarmupCompleted, o.access11300.onExtraCallbackWithResult
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public Integer onWarmupCompleted(int i, OsResults osResults) {
            Long l = (Long) osResults.onExtraCallbackWithResult(i);
            if (l == null) {
                return null;
            }
            return Integer.valueOf(l.intValue());
        }
    }

    static class onTransact extends onWarmupCompleted<Short> {
        onTransact(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, @Nullable Class<Short> cls, @Nullable String str) {
            super(tombstoneProtosLogMessageOrBuilder, osResults, cls, str);
        }

        @Override // o.access11300.onWarmupCompleted, o.access11300.onExtraCallbackWithResult
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public Short onWarmupCompleted(int i) {
            return Short.valueOf(((Long) this.onExtraCallback.onExtraCallbackWithResult(i)).shortValue());
        }

        @Override // o.access11300.onWarmupCompleted, o.access11300.onExtraCallbackWithResult
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public Short onWarmupCompleted(int i, OsResults osResults) {
            Long l = (Long) osResults.onExtraCallbackWithResult(i);
            if (l == null) {
                return null;
            }
            return Short.valueOf(l.shortValue());
        }
    }

    static class onNavigationEvent extends onWarmupCompleted<Byte> {
        onNavigationEvent(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, @Nullable Class<Byte> cls, @Nullable String str) {
            super(tombstoneProtosLogMessageOrBuilder, osResults, cls, str);
        }

        @Override // o.access11300.onWarmupCompleted, o.access11300.onExtraCallbackWithResult
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public Byte onWarmupCompleted(int i) {
            return Byte.valueOf(((Long) this.onExtraCallback.onExtraCallbackWithResult(i)).byteValue());
        }

        @Override // o.access11300.onWarmupCompleted, o.access11300.onExtraCallbackWithResult
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public Byte onWarmupCompleted(int i, OsResults osResults) {
            Long l = (Long) osResults.onExtraCallbackWithResult(i);
            if (l == null) {
                return null;
            }
            return Byte.valueOf(l.byteValue());
        }
    }

    static class asInterface extends onWarmupCompleted<RealmAny> {
        asInterface(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, @Nullable Class<RealmAny> cls, @Nullable String str) {
            super(tombstoneProtosLogMessageOrBuilder, osResults, cls, str);
        }

        @Override // o.access11300.onWarmupCompleted, o.access11300.onExtraCallbackWithResult
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public RealmAny onWarmupCompleted(int i) {
            return new RealmAny(RealmAnyOperator.onExtraCallbackWithResult(this.IAuthTabCallback, (NativeRealmAny) this.onExtraCallback.onExtraCallbackWithResult(i)));
        }

        @Override // o.access11300.onWarmupCompleted, o.access11300.onExtraCallbackWithResult
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public RealmAny onWarmupCompleted(int i, OsResults osResults) {
            return new RealmAny(RealmAnyOperator.onExtraCallbackWithResult(this.IAuthTabCallback, (NativeRealmAny) osResults.onExtraCallbackWithResult(i)));
        }
    }
}
