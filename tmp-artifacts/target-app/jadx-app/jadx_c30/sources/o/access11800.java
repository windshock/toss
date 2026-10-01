package o;

import io.realm.DynamicRealmObject;
import io.realm.RealmAny;
import io.realm.RealmAnySetIterator;
import io.realm.RealmModelSetIterator;
import io.realm.RealmSet;
import io.realm.internal.ObservableSet;
import io.realm.internal.OsSet;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class access11800<E> implements ObservableSet {
    public final Class<E> IAuthTabCallback;
    public final OsSet onExtraCallback;
    protected final String onExtraCallbackWithResult;
    public final TombstoneProtosLogMessageOrBuilder onNavigationEvent;
    protected final access22200<ObservableSet.IAuthTabCallback<E>> onWarmupCompleted;

    protected abstract boolean IAuthTabCallback(@Nullable Object obj);

    protected abstract boolean IAuthTabCallback(Collection<?> collection);

    protected abstract boolean onExtraCallback(Collection<?> collection);

    protected abstract boolean onExtraCallbackWithResult(@Nullable Object obj);

    protected abstract boolean onExtraCallbackWithResult(Collection<? extends E> collection);

    public abstract boolean onWarmupCompleted(@Nullable E e);

    protected abstract boolean onWarmupCompleted(Collection<?> collection);

    public void notifyChangeListeners(long j) {
        this.onExtraCallback.onExtraCallbackWithResult(j, this.onWarmupCompleted);
    }

    public boolean onNavigationEvent(@Nullable Object obj) {
        if (!IAuthTabCallbackStub(obj)) {
            throw new ClassCastException("Set contents and object must be the same type when calling 'contains'.");
        }
        return IAuthTabCallback(obj);
    }

    public boolean onExtraCallback(@Nullable Object obj) {
        if (!IAuthTabCallbackStub(obj)) {
            throw new ClassCastException("Set contents and object must be the same type when calling 'remove'.");
        }
        return onExtraCallbackWithResult(obj);
    }

    public boolean onTransact(Collection<?> collection) {
        if (IAuthTabCallbackDefault(collection)) {
            return onExtraCallbackWithResult(((RealmSet) collection).onExtraCallback(), OsSet.onExtraCallback.CONTAINS_ALL);
        }
        if (!asBinder(collection)) {
            throw new ClassCastException("Set contents and collection must be the same type when calling 'containsAll'.");
        }
        return onWarmupCompleted(collection);
    }

    public boolean onNavigationEvent(Collection<? extends E> collection) {
        if (IAuthTabCallbackDefault(collection)) {
            return onExtraCallbackWithResult(((RealmSet) collection).onExtraCallback(), OsSet.onExtraCallback.ADD_ALL);
        }
        if (!getInterfaceDescriptor(collection)) {
            throw new ClassCastException("Set contents and collection must be the same type when calling 'addAll'.");
        }
        return onExtraCallbackWithResult((Collection) collection);
    }

    public boolean asInterface(Collection<?> collection) {
        if (IAuthTabCallbackDefault(collection)) {
            return onExtraCallbackWithResult(((RealmSet) collection).onExtraCallback(), OsSet.onExtraCallback.REMOVE_ALL);
        }
        if (!asBinder(collection)) {
            throw new ClassCastException("Set contents and collection must be the same type when calling 'removeAll'.");
        }
        return onExtraCallback(collection);
    }

    public boolean IAuthTabCallbackStub(Collection<?> collection) {
        if (IAuthTabCallbackDefault(collection)) {
            return onExtraCallbackWithResult(((RealmSet) collection).onExtraCallback(), OsSet.onExtraCallback.RETAIN_ALL);
        }
        if (!asBinder(collection)) {
            throw new ClassCastException("Set contents and collection must be the same type when calling 'retainAll'.");
        }
        return IAuthTabCallback(collection);
    }

    public int onExtraCallbackWithResult() {
        return Long.valueOf(this.onExtraCallback.onWarmupCompleted()).intValue();
    }

    public boolean onWarmupCompleted() {
        return onExtraCallbackWithResult() == 0;
    }

    public Iterator<E> IAuthTabCallback() {
        return onExtraCallback(this.IAuthTabCallback, this.onExtraCallback, this.onNavigationEvent, this.onExtraCallbackWithResult);
    }

    public void onExtraCallback() {
        this.onExtraCallback.IAuthTabCallback();
    }

    public OsSet onNavigationEvent() {
        return this.onExtraCallback;
    }

    protected boolean IAuthTabCallbackDefault(Collection<?> collection) {
        return (collection instanceof RealmSet) && ((RealmSet) collection).IAuthTabCallback();
    }

    /* renamed from: o.access11800$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[OsSet.onExtraCallback.values().length];
            onExtraCallback = iArr;
            try {
                iArr[OsSet.onExtraCallback.CONTAINS_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[OsSet.onExtraCallback.ADD_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallback[OsSet.onExtraCallback.REMOVE_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallback[OsSet.onExtraCallback.RETAIN_ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected boolean onExtraCallbackWithResult(OsSet osSet, OsSet.onExtraCallback onextracallback) {
        if (this.onExtraCallback.getNativePtr() == osSet.getNativePtr()) {
            int i = AnonymousClass2.onExtraCallback[onextracallback.ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            if (i == 3) {
                this.onExtraCallback.IAuthTabCallback();
                return true;
            }
            if (i == 4) {
                return false;
            }
            throw new IllegalStateException("Unexpected value: " + onextracallback);
        }
        int i2 = AnonymousClass2.onExtraCallback[onextracallback.ordinal()];
        if (i2 == 1) {
            return this.onExtraCallback.onWarmupCompleted(osSet);
        }
        if (i2 == 2) {
            return this.onExtraCallback.onNavigationEvent(osSet);
        }
        if (i2 == 3) {
            return this.onExtraCallback.onExtraCallbackWithResult(osSet);
        }
        if (i2 == 4) {
            return this.onExtraCallback.onExtraCallback(osSet);
        }
        throw new IllegalStateException("Unexpected value: " + onextracallback);
    }

    private boolean IAuthTabCallbackStub(@Nullable Object obj) {
        if (obj != null) {
            return this.IAuthTabCallback.isAssignableFrom(obj.getClass());
        }
        return true;
    }

    private boolean getInterfaceDescriptor(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return true;
        }
        for (E e : collection) {
            if (e != null && !this.IAuthTabCallback.isAssignableFrom(e.getClass())) {
                return false;
            }
        }
        return true;
    }

    private boolean asBinder(Collection<?> collection) {
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj != null && !this.IAuthTabCallback.isAssignableFrom(obj.getClass())) {
                return false;
            }
        }
        return true;
    }

    private static <T> access11600<T> onExtraCallback(Class<T> cls, OsSet osSet, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, String str) {
        if (cls == Boolean.class) {
            return new access20400(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == String.class) {
            return new mergeHeap(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == Integer.class) {
            return new getMappingNameBytes(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == Long.class) {
            return new getMappingName(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == Short.class) {
            return new access11700(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == Byte.class) {
            return new access20600(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == Float.class) {
            return new setMappingNameBytes(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == Double.class) {
            return new access21300(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == byte[].class) {
            return new TombstoneProtosLogMessageBuilder(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == Date.class) {
            return new access21000(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == Decimal128.class) {
            return new access21200(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == ObjectId.class) {
            return new access11200(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == UUID.class) {
            return new setHeap(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == RealmAny.class) {
            return new RealmAnySetIterator(osSet, tombstoneProtosLogMessageOrBuilder);
        }
        if (cls == DynamicRealmObject.class) {
            return new clearMappingName(osSet, tombstoneProtosLogMessageOrBuilder, str);
        }
        if (access20300.onExtraCallback(cls)) {
            return new RealmModelSetIterator(osSet, tombstoneProtosLogMessageOrBuilder, cls);
        }
        throw new IllegalArgumentException("Unknown class for iterator: " + cls.getSimpleName());
    }
}
