package io.realm;

import io.realm.internal.OsList;
import io.realm.internal.RealmObjectProxy;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import o.TombstoneProtosLogMessageOrBuilder;
import o.TombstoneProtosMemoryDump;
import o.TombstoneProtosMemoryError;
import o.access11000;
import o.access20100;
import o.access20300;
import o.access20700;
import o.access20900;
import o.access21900;
import o.clearBeginAddress;
import o.clearHeap;
import o.getArmMteMetadata;
import o.getRegisterName;
import o.mergeArmMteMetadata;
import o.setToolValue;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RealmList<E> extends AbstractList<E> implements OrderedRealmCollection<E> {
    private final getRegisterName<E> IAuthTabCallback;

    @Nullable
    protected Class<E> onExtraCallback;
    public final TombstoneProtosLogMessageOrBuilder onExtraCallbackWithResult;

    @Nullable
    protected String onNavigationEvent;
    private List<E> onWarmupCompleted;

    @Override // io.realm.RealmCollection
    public boolean onExtraCallbackWithResult() {
        return true;
    }

    public RealmList() {
        this.onExtraCallbackWithResult = null;
        this.IAuthTabCallback = null;
        this.onWarmupCompleted = new ArrayList();
    }

    RealmList(Class<E> cls, OsList osList, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        this.onExtraCallback = cls;
        this.IAuthTabCallback = onNavigationEvent(tombstoneProtosLogMessageOrBuilder, osList, cls, null);
        this.onExtraCallbackWithResult = tombstoneProtosLogMessageOrBuilder;
    }

    RealmList(String str, OsList osList, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        this.onExtraCallbackWithResult = tombstoneProtosLogMessageOrBuilder;
        this.onNavigationEvent = str;
        this.IAuthTabCallback = onNavigationEvent(tombstoneProtosLogMessageOrBuilder, osList, null, str);
    }

    OsList onWarmupCompleted() {
        return this.IAuthTabCallback.onNavigationEvent();
    }

    public boolean onExtraCallback() {
        TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder = this.onExtraCallbackWithResult;
        if (tombstoneProtosLogMessageOrBuilder == null) {
            return true;
        }
        if (tombstoneProtosLogMessageOrBuilder.extraCallbackWithResult()) {
            return false;
        }
        return asInterface();
    }

    public RealmList<E> onNavigationEvent() {
        if (IAuthTabCallback()) {
            if (!onExtraCallback()) {
                throw new IllegalStateException("Only valid, managed RealmLists can be frozen.");
            }
            TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy = this.onExtraCallbackWithResult.IAuthTabCallbackStubProxy();
            OsList osListOnExtraCallbackWithResult = onWarmupCompleted().onExtraCallbackWithResult(tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy.IAuthTabCallbackDefault);
            String str = this.onNavigationEvent;
            if (str != null) {
                return new RealmList<>(str, osListOnExtraCallbackWithResult, tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy);
            }
            return new RealmList<>(this.onExtraCallback, osListOnExtraCallbackWithResult, tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy);
        }
        throw new UnsupportedOperationException("This method is only available in managed mode.");
    }

    @Override // io.realm.RealmCollection
    public boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult != null;
    }

    private boolean asInterface() {
        getRegisterName<E> getregistername = this.IAuthTabCallback;
        return getregistername != null && getregistername.IAuthTabCallback();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, @Nullable E e) {
        if (IAuthTabCallback()) {
            onTransact();
            this.IAuthTabCallback.onWarmupCompleted(i, e);
        } else {
            this.onWarmupCompleted.add(i, e);
        }
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(@Nullable E e) {
        if (IAuthTabCallback()) {
            onTransact();
            this.IAuthTabCallback.onExtraCallbackWithResult(e);
        } else {
            this.onWarmupCompleted.add(e);
        }
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, @Nullable E e) {
        if (IAuthTabCallback()) {
            onTransact();
            return this.IAuthTabCallback.onExtraCallbackWithResult(i, e);
        }
        return this.onWarmupCompleted.set(i, e);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (IAuthTabCallback()) {
            onTransact();
            this.IAuthTabCallback.onExtraCallback();
        } else {
            this.onWarmupCompleted.clear();
        }
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        E eRemove;
        if (IAuthTabCallback()) {
            onTransact();
            eRemove = get(i);
            this.IAuthTabCallback.onTransact(i);
        } else {
            eRemove = this.onWarmupCompleted.remove(i);
        }
        ((AbstractList) this).modCount++;
        return eRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(@Nullable Object obj) {
        if (IAuthTabCallback() && !this.onExtraCallbackWithResult.extraCallback()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        if (IAuthTabCallback() && !this.onExtraCallbackWithResult.extraCallback()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    @Nullable
    public E get(int i) {
        if (IAuthTabCallback()) {
            onTransact();
            return this.IAuthTabCallback.IAuthTabCallback(i);
        }
        return this.onWarmupCompleted.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (IAuthTabCallback()) {
            onTransact();
            return this.IAuthTabCallback.onWarmupCompleted();
        }
        return this.onWarmupCompleted.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@Nullable Object obj) {
        if (IAuthTabCallback()) {
            this.onExtraCallbackWithResult.onTransact();
            if ((obj instanceof RealmObjectProxy) && ((RealmObjectProxy) obj).cb_().IAuthTabCallback() == access21900.INSTANCE) {
                return false;
            }
            return super.contains(obj);
        }
        return this.onWarmupCompleted.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @Nonnull
    public Iterator<E> iterator() {
        if (IAuthTabCallback()) {
            return new RealmItr();
        }
        return super.iterator();
    }

    @Override // java.util.AbstractList, java.util.List
    @Nonnull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @Nonnull
    public ListIterator<E> listIterator(int i) {
        if (IAuthTabCallback()) {
            return new RealmListItr(i);
        }
        return super.listIterator(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTransact() {
        this.onExtraCallbackWithResult.onTransact();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (!IAuthTabCallback()) {
            sb.append("RealmList<?>@[");
            int size = size();
            while (i < size) {
                Object obj = get(i);
                if (obj instanceof RealmModel) {
                    sb.append(System.identityHashCode(obj));
                } else if (obj instanceof byte[]) {
                    sb.append("byte[");
                    sb.append(((byte[]) obj).length);
                    sb.append("]");
                } else {
                    sb.append(obj);
                }
                sb.append(",");
                i++;
            }
            if (size() > 0) {
                sb.setLength(sb.length() - 1);
            }
            sb.append("]");
        } else {
            sb.append("RealmList<");
            String str = this.onNavigationEvent;
            if (str != null) {
                sb.append(str);
            } else if (onExtraCallback((Class<?>) this.onExtraCallback)) {
                sb.append(this.onExtraCallbackWithResult.access000().IAuthTabCallback((Class<? extends RealmModel>) this.onExtraCallback).onExtraCallbackWithResult());
            } else {
                Class<E> cls = this.onExtraCallback;
                if (cls == byte[].class) {
                    sb.append(cls.getSimpleName());
                } else {
                    sb.append(cls.getName());
                }
            }
            sb.append(">@[");
            if (!asInterface()) {
                sb.append("invalid");
            } else if (onExtraCallback((Class<?>) this.onExtraCallback)) {
                while (i < size()) {
                    sb.append(((RealmObjectProxy) get(i)).cb_().IAuthTabCallback().getObjectKey());
                    sb.append(",");
                    i++;
                }
                if (size() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            } else {
                while (i < size()) {
                    Object obj2 = get(i);
                    if (obj2 instanceof byte[]) {
                        sb.append("byte[");
                        sb.append(((byte[]) obj2).length);
                        sb.append("]");
                    } else {
                        sb.append(obj2);
                    }
                    sb.append(",");
                    i++;
                }
                if (size() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            }
            sb.append("]");
        }
        return sb.toString();
    }

    public void onNavigationEvent(access11000<RealmList<E>> access11000Var) {
        access20300.IAuthTabCallback(this.onExtraCallbackWithResult, access11000Var, true);
        this.IAuthTabCallback.onNavigationEvent().onWarmupCompleted((OsList) this, (access11000<OsList>) access11000Var);
    }

    public void onExtraCallback(access11000<RealmList<E>> access11000Var) {
        access20300.IAuthTabCallback(this.onExtraCallbackWithResult, access11000Var, true);
        this.IAuthTabCallback.onNavigationEvent().onExtraCallback((OsList) this, (access11000<OsList>) access11000Var);
    }

    public void onWarmupCompleted(RealmChangeListener<RealmList<E>> realmChangeListener) {
        access20300.IAuthTabCallback(this.onExtraCallbackWithResult, realmChangeListener, true);
        this.IAuthTabCallback.onNavigationEvent().IAuthTabCallback((OsList) this, (RealmChangeListener<OsList>) realmChangeListener);
    }

    public void onNavigationEvent(RealmChangeListener<RealmList<E>> realmChangeListener) {
        access20300.IAuthTabCallback(this.onExtraCallbackWithResult, realmChangeListener, true);
        this.IAuthTabCallback.onNavigationEvent().onExtraCallback((OsList) this, (RealmChangeListener<OsList>) realmChangeListener);
    }

    class RealmItr implements Iterator<E> {
        int onExtraCallbackWithResult;
        int onNavigationEvent;
        int onWarmupCompleted;

        private RealmItr() {
            this.onWarmupCompleted = 0;
            this.onNavigationEvent = -1;
            this.onExtraCallbackWithResult = ((AbstractList) RealmList.this).modCount;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            RealmList.this.onTransact();
            IAuthTabCallback();
            return this.onWarmupCompleted != RealmList.this.size();
        }

        @Override // java.util.Iterator
        @Nullable
        public E next() {
            RealmList.this.onTransact();
            IAuthTabCallback();
            int i = this.onWarmupCompleted;
            try {
                E e = (E) RealmList.this.get(i);
                this.onNavigationEvent = i;
                this.onWarmupCompleted = i + 1;
                return e;
            } catch (IndexOutOfBoundsException unused) {
                IAuthTabCallback();
                throw new NoSuchElementException("Cannot access index " + i + " when size is " + RealmList.this.size() + ". Remember to check hasNext() before using next().");
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            RealmList.this.onTransact();
            if (this.onNavigationEvent < 0) {
                throw new IllegalStateException("Cannot call remove() twice. Must call next() in between.");
            }
            IAuthTabCallback();
            try {
                RealmList.this.remove(this.onNavigationEvent);
                int i = this.onNavigationEvent;
                int i2 = this.onWarmupCompleted;
                if (i < i2) {
                    this.onWarmupCompleted = i2 - 1;
                }
                this.onNavigationEvent = -1;
                this.onExtraCallbackWithResult = ((AbstractList) RealmList.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        final void IAuthTabCallback() {
            if (((AbstractList) RealmList.this).modCount != this.onExtraCallbackWithResult) {
                throw new ConcurrentModificationException();
            }
        }
    }

    class RealmListItr extends RealmList<E>.RealmItr implements ListIterator<E> {
        RealmListItr(int i) {
            super();
            if (i >= 0 && i <= RealmList.this.size()) {
                this.onWarmupCompleted = i;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Starting location must be a valid index: [0, ");
            sb.append(RealmList.this.size() - 1);
            sb.append("]. Index was ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.onWarmupCompleted != 0;
        }

        @Override // java.util.ListIterator
        @Nullable
        public E previous() {
            IAuthTabCallback();
            int i = this.onWarmupCompleted - 1;
            try {
                E e = (E) RealmList.this.get(i);
                this.onWarmupCompleted = i;
                this.onNavigationEvent = i;
                return e;
            } catch (IndexOutOfBoundsException unused) {
                IAuthTabCallback();
                throw new NoSuchElementException("Cannot access index less than zero. This was " + i + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.onWarmupCompleted;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.onWarmupCompleted - 1;
        }

        @Override // java.util.ListIterator
        public void set(@Nullable E e) {
            RealmList.this.onExtraCallbackWithResult.onTransact();
            if (this.onNavigationEvent < 0) {
                throw new IllegalStateException();
            }
            IAuthTabCallback();
            try {
                RealmList.this.set(this.onNavigationEvent, e);
                this.onExtraCallbackWithResult = ((AbstractList) RealmList.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(@Nullable E e) {
            RealmList.this.onExtraCallbackWithResult.onTransact();
            IAuthTabCallback();
            try {
                int i = this.onWarmupCompleted;
                RealmList.this.add(i, e);
                this.onNavigationEvent = -1;
                this.onWarmupCompleted = i + 1;
                this.onExtraCallbackWithResult = ((AbstractList) RealmList.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    private static boolean onExtraCallback(Class<?> cls) {
        return RealmModel.class.isAssignableFrom(cls);
    }

    private getRegisterName<E> onNavigationEvent(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsList osList, @Nullable Class<E> cls, @Nullable String str) {
        if (cls == null || onExtraCallback((Class<?>) cls)) {
            return new RealmModelListOperator(tombstoneProtosLogMessageOrBuilder, osList, cls, str);
        }
        if (cls == String.class) {
            return new clearHeap(tombstoneProtosLogMessageOrBuilder, osList, cls);
        }
        if (cls == Long.class || cls == Integer.class || cls == Short.class || cls == Byte.class) {
            return new getArmMteMetadata(tombstoneProtosLogMessageOrBuilder, osList, cls);
        }
        if (cls == Boolean.class) {
            return new TombstoneProtosMemoryDump(tombstoneProtosLogMessageOrBuilder, osList, cls);
        }
        if (cls == byte[].class) {
            return new access20100(tombstoneProtosLogMessageOrBuilder, osList, cls);
        }
        if (cls == Double.class) {
            return new clearBeginAddress(tombstoneProtosLogMessageOrBuilder, osList, cls);
        }
        if (cls == Float.class) {
            return new mergeArmMteMetadata(tombstoneProtosLogMessageOrBuilder, osList, cls);
        }
        if (cls == Date.class) {
            return new access20900(tombstoneProtosLogMessageOrBuilder, osList, cls);
        }
        if (cls == Decimal128.class) {
            return new access20700(tombstoneProtosLogMessageOrBuilder, osList, cls);
        }
        if (cls == ObjectId.class) {
            return new TombstoneProtosMemoryError(tombstoneProtosLogMessageOrBuilder, osList, cls);
        }
        if (cls == UUID.class) {
            return new setToolValue(tombstoneProtosLogMessageOrBuilder, osList, cls);
        }
        if (cls == RealmAny.class) {
            return new RealmAnyListOperator(tombstoneProtosLogMessageOrBuilder, osList, cls);
        }
        throw new IllegalArgumentException("Unexpected value class: " + cls.getName());
    }
}
