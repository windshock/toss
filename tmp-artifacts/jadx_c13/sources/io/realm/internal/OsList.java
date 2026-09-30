package io.realm.internal;

import io.realm.RealmChangeListener;
import io.realm.internal.ObservableCollection;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import o.access11000;
import o.access21700;
import o.access22100;
import o.access22200;
import o.access22600;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OsList implements access22100, ObservableCollection, access22600 {
    private static final long onWarmupCompleted = nativeGetFinalizerPtr();
    private final Table IAuthTabCallback;
    private final access22200<ObservableCollection.onNavigationEvent> onExtraCallback = new access22200<>();
    private final access21700 onExtraCallbackWithResult;
    private final long onNavigationEvent;

    private static native void nativeAddBinary(long j, @Nullable byte[] bArr);

    private static native void nativeAddBoolean(long j, boolean z);

    private static native void nativeAddDate(long j, long j2);

    private static native void nativeAddDecimal128(long j, long j2, long j3);

    private static native void nativeAddDouble(long j, double d);

    private static native void nativeAddFloat(long j, float f);

    private static native void nativeAddLong(long j, long j2);

    private static native void nativeAddNull(long j);

    private static native void nativeAddObjectId(long j, String str);

    private static native void nativeAddRealmAny(long j, long j2);

    private static native void nativeAddRow(long j, long j2);

    private static native void nativeAddString(long j, @Nullable String str);

    private static native void nativeAddUUID(long j, String str);

    private static native long[] nativeCreate(long j, long j2, long j3);

    private static native long nativeCreateAndAddEmbeddedObject(long j, long j2);

    private static native long nativeCreateAndSetEmbeddedObject(long j, long j2);

    private static native void nativeDelete(long j, long j2);

    private static native void nativeDeleteAll(long j);

    private static native long nativeFreeze(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long j);

    private static native long nativeGetRow(long j, long j2);

    private static native Object nativeGetValue(long j, long j2);

    private static native void nativeInsertBinary(long j, long j2, @Nullable byte[] bArr);

    private static native void nativeInsertBoolean(long j, long j2, boolean z);

    private static native void nativeInsertDate(long j, long j2, long j3);

    private static native void nativeInsertDecimal128(long j, long j2, long j3, long j4);

    private static native void nativeInsertDouble(long j, long j2, double d);

    private static native void nativeInsertFloat(long j, long j2, float f);

    private static native void nativeInsertLong(long j, long j2, long j3);

    private static native void nativeInsertNull(long j, long j2);

    private static native void nativeInsertObjectId(long j, long j2, String str);

    private static native void nativeInsertRealmAny(long j, long j2, long j3);

    private static native void nativeInsertRow(long j, long j2, long j3);

    private static native void nativeInsertString(long j, long j2, @Nullable String str);

    private static native void nativeInsertUUID(long j, long j2, String str);

    private static native boolean nativeIsValid(long j);

    private static native void nativeMove(long j, long j2, long j3);

    private static native void nativeRemove(long j, long j2);

    private static native void nativeRemoveAll(long j);

    private static native void nativeSetBinary(long j, long j2, @Nullable byte[] bArr);

    private static native void nativeSetBoolean(long j, long j2, boolean z);

    private static native void nativeSetDate(long j, long j2, long j3);

    private static native void nativeSetDecimal128(long j, long j2, long j3, long j4);

    private static native void nativeSetDouble(long j, long j2, double d);

    private static native void nativeSetFloat(long j, long j2, float f);

    private static native void nativeSetLong(long j, long j2, long j3);

    private static native void nativeSetNull(long j, long j2);

    private static native void nativeSetObjectId(long j, long j2, String str);

    private static native void nativeSetRealmAny(long j, long j2, long j3);

    private static native void nativeSetRow(long j, long j2, long j3);

    private static native void nativeSetString(long j, long j2, @Nullable String str);

    private static native void nativeSetUUID(long j, long j2, String str);

    private static native long nativeSize(long j);

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    public OsList(UncheckedRow uncheckedRow, long j) {
        OsSharedRealm osSharedRealmOnTransact = uncheckedRow.getTable().onTransact();
        long[] jArrNativeCreate = nativeCreate(osSharedRealmOnTransact.getNativePtr(), uncheckedRow.getNativePtr(), j);
        this.onNavigationEvent = jArrNativeCreate[0];
        access21700 access21700Var = osSharedRealmOnTransact.context;
        this.onExtraCallbackWithResult = access21700Var;
        access21700Var.onWarmupCompleted(this);
        if (jArrNativeCreate[1] != 0) {
            this.IAuthTabCallback = new Table(osSharedRealmOnTransact, jArrNativeCreate[1]);
        } else {
            this.IAuthTabCallback = null;
        }
    }

    private OsList(OsSharedRealm osSharedRealm, long j, @Nullable Table table) {
        this.onNavigationEvent = j;
        this.IAuthTabCallback = table;
        access21700 access21700Var = osSharedRealm.context;
        this.onExtraCallbackWithResult = access21700Var;
        access21700Var.onWarmupCompleted(this);
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.onNavigationEvent;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return onWarmupCompleted;
    }

    public UncheckedRow asInterface(long j) {
        return this.IAuthTabCallback.asBinder(nativeGetRow(this.onNavigationEvent, j));
    }

    public void onWarmupCompleted(long j) {
        nativeAddRow(this.onNavigationEvent, j);
    }

    public void onNavigationEvent(long j, long j2) {
        nativeInsertRow(this.onNavigationEvent, j, j2);
    }

    public void IAuthTabCallbackDefault(long j, long j2) {
        nativeSetRow(this.onNavigationEvent, j, j2);
    }

    public void onNavigationEvent() {
        nativeAddNull(this.onNavigationEvent);
    }

    public void asBinder(long j) {
        nativeInsertNull(this.onNavigationEvent, j);
    }

    public void onTransact(long j) {
        nativeSetNull(this.onNavigationEvent, j);
    }

    public void onNavigationEvent(long j) {
        nativeAddLong(this.onNavigationEvent, j);
    }

    public void onExtraCallbackWithResult(long j, long j2) {
        nativeInsertLong(this.onNavigationEvent, j, j2);
    }

    public void onWarmupCompleted(long j, long j2) {
        nativeSetLong(this.onNavigationEvent, j, j2);
    }

    public void onExtraCallbackWithResult(double d) {
        nativeAddDouble(this.onNavigationEvent, d);
    }

    public void IAuthTabCallback(long j, double d) {
        nativeInsertDouble(this.onNavigationEvent, j, d);
    }

    public void onExtraCallbackWithResult(long j, double d) {
        nativeSetDouble(this.onNavigationEvent, j, d);
    }

    public void IAuthTabCallback(float f) {
        nativeAddFloat(this.onNavigationEvent, f);
    }

    public void onExtraCallbackWithResult(long j, float f) {
        nativeInsertFloat(this.onNavigationEvent, j, f);
    }

    public void IAuthTabCallback(long j, float f) {
        nativeSetFloat(this.onNavigationEvent, j, f);
    }

    public void onExtraCallbackWithResult(boolean z) {
        nativeAddBoolean(this.onNavigationEvent, z);
    }

    public void IAuthTabCallback(long j, boolean z) {
        nativeInsertBoolean(this.onNavigationEvent, j, z);
    }

    public void onWarmupCompleted(long j, boolean z) {
        nativeSetBoolean(this.onNavigationEvent, j, z);
    }

    public void onExtraCallback(@Nullable byte[] bArr) {
        nativeAddBinary(this.onNavigationEvent, bArr);
    }

    public void onWarmupCompleted(long j, @Nullable byte[] bArr) {
        nativeInsertBinary(this.onNavigationEvent, j, bArr);
    }

    public void IAuthTabCallback(long j, @Nullable byte[] bArr) {
        nativeSetBinary(this.onNavigationEvent, j, bArr);
    }

    public void onExtraCallback(@Nullable String str) {
        nativeAddString(this.onNavigationEvent, str);
    }

    public void onNavigationEvent(long j, @Nullable String str) {
        nativeInsertString(this.onNavigationEvent, j, str);
    }

    public void IAuthTabCallback(long j, @Nullable String str) {
        nativeSetString(this.onNavigationEvent, j, str);
    }

    public void onNavigationEvent(@Nullable Date date) {
        if (date == null) {
            nativeAddNull(this.onNavigationEvent);
        } else {
            nativeAddDate(this.onNavigationEvent, date.getTime());
        }
    }

    public void onWarmupCompleted(long j, @Nullable Date date) {
        if (date == null) {
            nativeInsertNull(this.onNavigationEvent, j);
        } else {
            nativeInsertDate(this.onNavigationEvent, j, date.getTime());
        }
    }

    public void onExtraCallback(long j, @Nullable Date date) {
        if (date == null) {
            nativeSetNull(this.onNavigationEvent, j);
        } else {
            nativeSetDate(this.onNavigationEvent, j, date.getTime());
        }
    }

    public void onWarmupCompleted(@Nullable Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeAddNull(this.onNavigationEvent);
        } else {
            nativeAddDecimal128(this.onNavigationEvent, decimal128.onNavigationEvent(), decimal128.onExtraCallbackWithResult());
        }
    }

    public void onNavigationEvent(long j, @Nullable Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeInsertNull(this.onNavigationEvent, j);
        } else {
            nativeInsertDecimal128(this.onNavigationEvent, j, decimal128.onNavigationEvent(), decimal128.onExtraCallbackWithResult());
        }
    }

    public void onWarmupCompleted(long j, @Nullable Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeSetNull(this.onNavigationEvent, j);
        } else {
            nativeSetDecimal128(this.onNavigationEvent, j, decimal128.onNavigationEvent(), decimal128.onExtraCallbackWithResult());
        }
    }

    public void onWarmupCompleted(@Nullable ObjectId objectId) {
        if (objectId == null) {
            nativeAddNull(this.onNavigationEvent);
        } else {
            nativeAddObjectId(this.onNavigationEvent, objectId.toString());
        }
    }

    public void onNavigationEvent(long j, @Nullable ObjectId objectId) {
        if (objectId == null) {
            nativeInsertNull(this.onNavigationEvent, j);
        } else {
            nativeInsertObjectId(this.onNavigationEvent, j, objectId.toString());
        }
    }

    public void onExtraCallback(long j, @Nullable ObjectId objectId) {
        if (objectId == null) {
            nativeSetNull(this.onNavigationEvent, j);
        } else {
            nativeSetObjectId(this.onNavigationEvent, j, objectId.toString());
        }
    }

    public void IAuthTabCallback(@Nullable UUID uuid) {
        if (uuid == null) {
            nativeAddNull(this.onNavigationEvent);
        } else {
            nativeAddUUID(this.onNavigationEvent, uuid.toString());
        }
    }

    public void onWarmupCompleted(long j, @Nullable UUID uuid) {
        if (uuid == null) {
            nativeInsertNull(this.onNavigationEvent, j);
        } else {
            nativeInsertUUID(this.onNavigationEvent, j, uuid.toString());
        }
    }

    public void onExtraCallback(long j, @Nullable UUID uuid) {
        if (uuid == null) {
            nativeSetNull(this.onNavigationEvent, j);
        } else {
            nativeSetUUID(this.onNavigationEvent, j, uuid.toString());
        }
    }

    public void onExtraCallback(long j) {
        nativeAddRealmAny(this.onNavigationEvent, j);
    }

    public void onExtraCallback(long j, long j2) {
        nativeInsertRealmAny(this.onNavigationEvent, j, j2);
    }

    public void IAuthTabCallback(long j, long j2) {
        nativeSetRealmAny(this.onNavigationEvent, j, j2);
    }

    @Nullable
    public Object IAuthTabCallbackDefault(long j) {
        return nativeGetValue(this.onNavigationEvent, j);
    }

    public void IAuthTabCallbackStub(long j) {
        nativeRemove(this.onNavigationEvent, j);
    }

    public void IAuthTabCallback() {
        nativeRemoveAll(this.onNavigationEvent);
    }

    public long onWarmupCompleted() {
        return nativeSize(this.onNavigationEvent);
    }

    public boolean onExtraCallbackWithResult() {
        return nativeIsValid(this.onNavigationEvent);
    }

    public <T> void onWarmupCompleted(T t, access11000<T> access11000Var) {
        if (this.onExtraCallback.IAuthTabCallback()) {
            nativeStartListening(this.onNavigationEvent);
        }
        this.onExtraCallback.onExtraCallback(new ObservableCollection.onNavigationEvent(t, access11000Var));
    }

    public <T> void IAuthTabCallback(T t, RealmChangeListener<T> realmChangeListener) {
        onWarmupCompleted((OsList) t, (access11000<OsList>) new ObservableCollection.IAuthTabCallback(realmChangeListener));
    }

    public <T> void onExtraCallback(T t, access11000<T> access11000Var) {
        this.onExtraCallback.IAuthTabCallback(t, access11000Var);
        if (this.onExtraCallback.IAuthTabCallback()) {
            nativeStopListening(this.onNavigationEvent);
        }
    }

    public <T> void onExtraCallback(T t, RealmChangeListener<T> realmChangeListener) {
        onExtraCallback((OsList) t, (access11000<OsList>) new ObservableCollection.IAuthTabCallback(realmChangeListener));
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j) {
        OsCollectionChangeSet osCollectionChangeSet = new OsCollectionChangeSet(j, false);
        if (osCollectionChangeSet.onNavigationEvent()) {
            return;
        }
        this.onExtraCallback.IAuthTabCallback(new ObservableCollection.onExtraCallbackWithResult(osCollectionChangeSet));
    }

    public OsList onExtraCallbackWithResult(OsSharedRealm osSharedRealm) {
        long jNativeFreeze = nativeFreeze(this.onNavigationEvent, osSharedRealm.getNativePtr());
        Table table = this.IAuthTabCallback;
        return new OsList(osSharedRealm, jNativeFreeze, table != null ? table.onNavigationEvent(osSharedRealm) : null);
    }

    public long onExtraCallback() {
        return nativeCreateAndAddEmbeddedObject(this.onNavigationEvent, onWarmupCompleted());
    }

    public long onExtraCallbackWithResult(long j) {
        return nativeCreateAndAddEmbeddedObject(this.onNavigationEvent, j);
    }

    public long IAuthTabCallback(long j) {
        return nativeCreateAndSetEmbeddedObject(this.onNavigationEvent, j);
    }
}
