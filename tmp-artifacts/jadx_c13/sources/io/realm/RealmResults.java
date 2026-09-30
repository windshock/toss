package io.realm;

import io.realm.internal.OsResults;
import io.realm.log.RealmLog;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import javax.annotation.Nullable;
import o.JsonReaderUnknownNumberParsing;
import o.TombstoneProtosLogMessageOrBuilder;
import o.access11000;
import o.access11300;
import o.access21400;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RealmResults<E> extends access11300<E> {
    @Override // o.access11300, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean IAuthTabCallback() {
        return super.IAuthTabCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.access11300, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        super.add(i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.access11300, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // o.access11300, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(int i, Collection collection) {
        return super.addAll(i, collection);
    }

    @Override // o.access11300, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    @Override // o.access11300, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // o.access11300, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean contains(@Nullable Object obj) {
        return super.contains(obj);
    }

    @Override // o.access11300, java.util.AbstractList, java.util.List
    @Nullable
    public /* bridge */ /* synthetic */ Object get(int i) {
        return super.get(i);
    }

    @Override // o.access11300, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // o.access11300, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // o.access11300, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return super.listIterator(i);
    }

    @Override // o.access11300
    public /* bridge */ /* synthetic */ boolean onExtraCallback() {
        return super.onExtraCallback();
    }

    @Override // o.access11300
    public /* bridge */ /* synthetic */ boolean onWarmupCompleted() {
        return super.onWarmupCompleted();
    }

    @Override // o.access11300, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object remove(int i) {
        return super.remove(i);
    }

    @Override // o.access11300, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // o.access11300, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // o.access11300, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.access11300, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return super.set(i, obj);
    }

    @Override // o.access11300, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    RealmResults(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, Class<E> cls) {
        this(tombstoneProtosLogMessageOrBuilder, osResults, (Class) cls, false);
    }

    RealmResults(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, Class<E> cls, boolean z) {
        super(tombstoneProtosLogMessageOrBuilder, osResults, cls, access11300.onExtraCallbackWithResult(z, tombstoneProtosLogMessageOrBuilder, osResults, cls, null));
    }

    RealmResults(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, String str) {
        this(tombstoneProtosLogMessageOrBuilder, osResults, str, false);
    }

    RealmResults(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, OsResults osResults, String str, boolean z) {
        super(tombstoneProtosLogMessageOrBuilder, osResults, str, access11300.onExtraCallbackWithResult(z, tombstoneProtosLogMessageOrBuilder, osResults, null, str));
    }

    @Override // io.realm.RealmCollection
    public boolean onExtraCallbackWithResult() {
        this.onNavigationEvent.onTransact();
        return this.onWarmupCompleted.onNavigationEvent();
    }

    public boolean asBinder() {
        this.onNavigationEvent.onTransact();
        this.onWarmupCompleted.asInterface();
        return true;
    }

    /* renamed from: io.realm.RealmResults$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[RealmFieldType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[RealmFieldType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onNavigationEvent[RealmFieldType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onNavigationEvent[RealmFieldType.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onNavigationEvent[RealmFieldType.DECIMAL128.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onNavigationEvent[RealmFieldType.OBJECT_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onNavigationEvent[RealmFieldType.UUID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onNavigationEvent[RealmFieldType.LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onNavigationEvent[RealmFieldType.INTEGER_LIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onNavigationEvent[RealmFieldType.BOOLEAN_LIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onNavigationEvent[RealmFieldType.STRING_LIST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                onNavigationEvent[RealmFieldType.BINARY_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                onNavigationEvent[RealmFieldType.DATE_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                onNavigationEvent[RealmFieldType.DECIMAL128_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                onNavigationEvent[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                onNavigationEvent[RealmFieldType.UUID_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                onNavigationEvent[RealmFieldType.FLOAT_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                onNavigationEvent[RealmFieldType.DOUBLE_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public RealmResults<E> IAuthTabCallbackStub() {
        if (!onExtraCallback()) {
            throw new IllegalStateException("Only valid, managed RealmResults can be frozen.");
        }
        TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy = this.onNavigationEvent.IAuthTabCallbackStubProxy();
        OsResults osResultsOnExtraCallback = this.onWarmupCompleted.onExtraCallback(tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy.IAuthTabCallbackDefault);
        String str = this.onExtraCallback;
        if (str != null) {
            return new RealmResults<>(tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy, osResultsOnExtraCallback, str);
        }
        return new RealmResults<>(tombstoneProtosLogMessageOrBuilderIAuthTabCallbackStubProxy, osResultsOnExtraCallback, this.IAuthTabCallback);
    }

    public void onExtraCallbackWithResult(RealmChangeListener<RealmResults<E>> realmChangeListener) {
        onExtraCallbackWithResult((Object) realmChangeListener);
        this.onWarmupCompleted.onWarmupCompleted((OsResults) this, (RealmChangeListener<OsResults>) realmChangeListener);
    }

    public void onNavigationEvent(access11000<RealmResults<E>> access11000Var) {
        onExtraCallbackWithResult(access11000Var);
        this.onWarmupCompleted.onWarmupCompleted((OsResults) this, (access11000<OsResults>) access11000Var);
    }

    private void onExtraCallbackWithResult(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        this.onNavigationEvent.onTransact();
        this.onNavigationEvent.IAuthTabCallbackDefault.capabilities.onNavigationEvent("Listeners cannot be used on current thread.");
    }

    private void IAuthTabCallback(@Nullable Object obj, boolean z) {
        if (z && obj == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if (this.onNavigationEvent.extraCallbackWithResult()) {
            RealmLog.onExtraCallbackWithResult("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.onNavigationEvent.onExtraCallbackWithResult.asInterface());
        }
    }

    public void IAuthTabCallbackDefault() {
        IAuthTabCallback(null, false);
        this.onWarmupCompleted.onTransact();
    }

    public void onNavigationEvent(RealmChangeListener<RealmResults<E>> realmChangeListener) {
        IAuthTabCallback(realmChangeListener, true);
        this.onWarmupCompleted.IAuthTabCallback(this, realmChangeListener);
    }

    public void IAuthTabCallback(access11000<RealmResults<E>> access11000Var) {
        IAuthTabCallback(access11000Var, true);
        this.onWarmupCompleted.onExtraCallback((OsResults) this, (access11000<OsResults>) access11000Var);
    }

    public JsonReaderUnknownNumberParsing<RealmResults<E>> onNavigationEvent() {
        TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder = this.onNavigationEvent;
        if (tombstoneProtosLogMessageOrBuilder instanceof Realm) {
            return tombstoneProtosLogMessageOrBuilder.onExtraCallbackWithResult.IAuthTabCallbackStubProxy().onExtraCallback((Realm) this.onNavigationEvent, this);
        }
        if (tombstoneProtosLogMessageOrBuilder instanceof access21400) {
            return tombstoneProtosLogMessageOrBuilder.onExtraCallbackWithResult.IAuthTabCallbackStubProxy().onExtraCallback((access21400) tombstoneProtosLogMessageOrBuilder, this);
        }
        throw new UnsupportedOperationException(this.onNavigationEvent.getClass() + " does not support RxJava2.");
    }
}
