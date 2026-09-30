package io.realm.internal;

import io.realm.RealmChangeListener;
import io.realm.internal.ObservableCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import o.access11000;
import o.access21600;
import o.access21700;
import o.access22100;
import o.access22200;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OsResults implements access22100, ObservableCollection {
    private static final long onExtraCallbackWithResult = nativeGetFinalizerPtr();
    private final access21700 IAuthTabCallback;
    private final Table asBinder;
    private final OsSharedRealm asInterface;
    protected boolean onNavigationEvent;
    private final long onTransact;
    private boolean onWarmupCompleted = false;
    protected final access22200<ObservableCollection.onNavigationEvent> onExtraCallback = new access22200<>();

    private static native Object nativeAggregate(long j, long j2, byte b);

    private static native void nativeClear(long j);

    private static native boolean nativeContains(long j, long j2);

    protected static native long nativeCreateResults(long j, long j2);

    private static native long nativeCreateResultsFromBacklinks(long j, long j2, long j3, long j4);

    private static native long nativeCreateSnapshot(long j);

    private static native void nativeDelete(long j, long j2);

    private static native boolean nativeDeleteFirst(long j);

    private static native boolean nativeDeleteLast(long j);

    private static native void nativeEvaluateQueryIfNeeded(long j, boolean z);

    private static native long nativeFirstRow(long j);

    private static native long nativeFreeze(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j);

    private static native long nativeGetRow(long j, int i);

    private static native long nativeGetTable(long j);

    private static native Object nativeGetValue(long j, int i);

    private static native long nativeIndexOf(long j, long j2);

    private static native boolean nativeIsValid(long j);

    private static native long nativeLastRow(long j);

    private static native void nativeSetBinary(long j, String str, @Nullable byte[] bArr);

    private static native void nativeSetBoolean(long j, String str, boolean z);

    private static native void nativeSetDecimal128(long j, String str, long j2, long j3);

    private static native void nativeSetDouble(long j, String str, double d);

    private static native void nativeSetFloat(long j, String str, float f);

    private static native void nativeSetInt(long j, String str, long j2);

    private static native void nativeSetList(long j, String str, long j2);

    private static native void nativeSetNull(long j, String str);

    private static native void nativeSetObject(long j, String str, long j2);

    private static native void nativeSetObjectId(long j, String str, String str2);

    private static native void nativeSetString(long j, String str, @Nullable String str2);

    private static native void nativeSetTimestamp(long j, String str, long j2);

    private static native void nativeSetUUID(long j, String str, String str2);

    private static native long nativeSize(long j);

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    private static native long nativeStringDescriptor(long j, String str, long j2);

    private static native long nativeWhere(long j);

    private static native String toJSON(long j, int i);

    public static abstract class onExtraCallbackWithResult<T> implements Iterator<T> {
        protected int onExtraCallback = -1;
        protected OsResults onWarmupCompleted;

        protected abstract T onWarmupCompleted(int i, OsResults osResults);

        public onExtraCallbackWithResult(OsResults osResults) {
            if (osResults.asInterface.isClosed()) {
                throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
            }
            this.onWarmupCompleted = osResults;
            if (osResults.onWarmupCompleted) {
                return;
            }
            if (!osResults.asInterface.isInTransaction()) {
                this.onWarmupCompleted.asInterface.addIterator(this);
            } else {
                onExtraCallbackWithResult();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            onExtraCallback();
            return ((long) (this.onExtraCallback + 1)) < this.onWarmupCompleted.IAuthTabCallbackDefault();
        }

        @Override // java.util.Iterator
        @Nullable
        public T next() {
            onExtraCallback();
            int i = this.onExtraCallback + 1;
            this.onExtraCallback = i;
            if (i >= this.onWarmupCompleted.IAuthTabCallbackDefault()) {
                throw new NoSuchElementException("Cannot access index " + this.onExtraCallback + " when size is " + this.onWarmupCompleted.IAuthTabCallbackDefault() + ". Remember to check hasNext() before using next().");
            }
            return onExtraCallbackWithResult(this.onExtraCallback);
        }

        @Override // java.util.Iterator
        @Deprecated
        public void remove() {
            throw new UnsupportedOperationException("remove() is not supported by RealmResults iterators.");
        }

        void onExtraCallbackWithResult() {
            this.onWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
        }

        void onWarmupCompleted() {
            this.onWarmupCompleted = null;
        }

        void onExtraCallback() {
            if (this.onWarmupCompleted == null) {
                throw new ConcurrentModificationException("No outside changes to a Realm is allowed while iterating a living Realm collection.");
            }
        }

        @Nullable
        T onExtraCallbackWithResult(int i) {
            return onWarmupCompleted(i, this.onWarmupCompleted);
        }
    }

    public static abstract class onWarmupCompleted<T> extends onExtraCallbackWithResult<T> implements ListIterator<T> {
        public onWarmupCompleted(OsResults osResults, int i) {
            super(osResults);
            if (i >= 0 && i <= this.onWarmupCompleted.IAuthTabCallbackDefault()) {
                this.onExtraCallback = i - 1;
                return;
            }
            throw new IndexOutOfBoundsException("Starting location must be a valid index: [0, " + (this.onWarmupCompleted.IAuthTabCallbackDefault() - 1) + "]. Yours was " + i);
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void add(@Nullable T t) {
            throw new UnsupportedOperationException("Adding an element is not supported. Use Realm.createObject() instead.");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            onExtraCallback();
            return this.onExtraCallback >= 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            onExtraCallback();
            return this.onExtraCallback + 1;
        }

        @Override // java.util.ListIterator
        @Nullable
        public T previous() {
            onExtraCallback();
            try {
                this.onExtraCallback--;
                return onExtraCallbackWithResult(this.onExtraCallback);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException("Cannot access index less than zero. This was " + this.onExtraCallback + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            onExtraCallback();
            return this.onExtraCallback;
        }

        @Override // java.util.ListIterator
        @Deprecated
        public void set(@Nullable T t) {
            throw new UnsupportedOperationException("Replacing an element is not supported.");
        }
    }

    public enum IAuthTabCallback {
        EMPTY,
        TABLE,
        PRIMITIVE_LIST,
        QUERY,
        TABLEVIEW;

        static IAuthTabCallback getByValue(byte b) {
            if (b == 0) {
                return EMPTY;
            }
            if (b == 1) {
                return TABLE;
            }
            if (b == 2) {
                return PRIMITIVE_LIST;
            }
            if (b == 3) {
                return QUERY;
            }
            if (b == 4) {
                return TABLEVIEW;
            }
            throw new IllegalArgumentException("Invalid value: " + ((int) b));
        }
    }

    public static OsResults onExtraCallback(OsSharedRealm osSharedRealm, TableQuery tableQuery) {
        tableQuery.asBinder();
        return new OsResults(osSharedRealm, tableQuery.onWarmupCompleted(), nativeCreateResults(osSharedRealm.getNativePtr(), tableQuery.getNativePtr()));
    }

    OsResults(OsSharedRealm osSharedRealm, Table table, long j) {
        this.asInterface = osSharedRealm;
        access21700 access21700Var = osSharedRealm.context;
        this.IAuthTabCallback = access21700Var;
        this.asBinder = table;
        this.onTransact = j;
        access21700Var.onWarmupCompleted(this);
        this.onNavigationEvent = onExtraCallbackWithResult() != IAuthTabCallback.QUERY;
    }

    public OsResults onWarmupCompleted() {
        if (this.onWarmupCompleted) {
            return this;
        }
        OsResults osResults = new OsResults(this.asInterface, this.asBinder, nativeCreateSnapshot(this.onTransact));
        osResults.onWarmupCompleted = true;
        return osResults;
    }

    public OsResults onExtraCallback(OsSharedRealm osSharedRealm) {
        OsResults osResults = new OsResults(osSharedRealm, this.asBinder.onNavigationEvent(osSharedRealm), nativeFreeze(this.onTransact, osSharedRealm.getNativePtr()));
        if (onNavigationEvent()) {
            osResults.asInterface();
        }
        return osResults;
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.onTransact;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return onExtraCallbackWithResult;
    }

    public Object onExtraCallbackWithResult(int i) {
        return nativeGetValue(this.onTransact, i);
    }

    public UncheckedRow onNavigationEvent(int i) {
        return this.asBinder.asBinder(nativeGetRow(this.onTransact, i));
    }

    public UncheckedRow onExtraCallback() {
        long jNativeFirstRow = nativeFirstRow(this.onTransact);
        if (jNativeFirstRow != 0) {
            return this.asBinder.asBinder(jNativeFirstRow);
        }
        return null;
    }

    public long IAuthTabCallbackDefault() {
        return nativeSize(this.onTransact);
    }

    public void IAuthTabCallback() {
        nativeClear(this.onTransact);
    }

    public <T> void onWarmupCompleted(T t, access11000<T> access11000Var) {
        if (this.onExtraCallback.IAuthTabCallback()) {
            nativeStartListening(this.onTransact);
        }
        this.onExtraCallback.onExtraCallback(new ObservableCollection.onNavigationEvent(t, access11000Var));
    }

    public <T> void onWarmupCompleted(T t, RealmChangeListener<T> realmChangeListener) {
        onWarmupCompleted((OsResults) t, (access11000<OsResults>) new ObservableCollection.IAuthTabCallback(realmChangeListener));
    }

    public <T> void onExtraCallback(T t, access11000<T> access11000Var) {
        this.onExtraCallback.IAuthTabCallback(t, access11000Var);
        if (this.onExtraCallback.IAuthTabCallback()) {
            nativeStopListening(this.onTransact);
        }
    }

    public <T> void IAuthTabCallback(T t, RealmChangeListener<T> realmChangeListener) {
        onExtraCallback((OsResults) t, (access11000<OsResults>) new ObservableCollection.IAuthTabCallback(realmChangeListener));
    }

    public void onTransact() {
        this.onExtraCallback.onWarmupCompleted();
        nativeStopListening(this.onTransact);
    }

    public boolean asBinder() {
        return nativeIsValid(this.onTransact);
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j) {
        OsCollectionChangeSet osCollectionChangeSet;
        if (j == 0) {
            osCollectionChangeSet = new access21600();
        } else {
            osCollectionChangeSet = new OsCollectionChangeSet(j, !onNavigationEvent());
        }
        if (osCollectionChangeSet.onNavigationEvent() && onNavigationEvent()) {
            return;
        }
        this.onNavigationEvent = true;
        this.onExtraCallback.IAuthTabCallback(new ObservableCollection.onExtraCallbackWithResult(osCollectionChangeSet));
    }

    public IAuthTabCallback onExtraCallbackWithResult() {
        return IAuthTabCallback.getByValue(nativeGetMode(this.onTransact));
    }

    public boolean onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public void asInterface() {
        if (this.onNavigationEvent) {
            return;
        }
        try {
            nativeEvaluateQueryIfNeeded(this.onTransact, false);
        } catch (IllegalArgumentException e) {
            if (e.getMessage().contains("Cannot sort on a collection property")) {
                throw new IllegalStateException("Illegal Argument: " + e.getMessage());
            }
        } catch (IllegalStateException e2) {
            throw new IllegalArgumentException("Illegal Argument: " + e2.getMessage());
        }
        notifyChangeListeners(0L);
    }
}
