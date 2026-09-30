package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.RealmModel;
import io.realm.RealmObjectChangeListener;
import io.realm.exceptions.RealmException;
import java.util.UUID;
import javax.annotation.Nullable;
import o.TombstoneProtosMemoryDumpMetadataCase;
import o.access22100;
import o.access22200;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OsObject implements access22100 {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private access22200<onWarmupCompleted> observerPairs = new access22200<>();

    private static native long nativeCreate(long j, long j2);

    private static native long nativeCreateEmbeddedObject(long j, long j2, long j3);

    private static native long nativeCreateNewObject(long j);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateNewObjectWithUUIDPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateRow(long j);

    private static native long nativeCreateRowWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateRowWithStringPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateRowWithUUIDPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeGetFinalizerPtr();

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    public static class onWarmupCompleted<T extends RealmModel> extends access22200.onWarmupCompleted<T, RealmObjectChangeListener<T>> {
        public onWarmupCompleted(T t, RealmObjectChangeListener<T> realmObjectChangeListener) {
            super(t, realmObjectChangeListener);
        }

        public void onExtraCallback(T t, @Nullable TombstoneProtosMemoryDumpMetadataCase tombstoneProtosMemoryDumpMetadataCase) {
            ((RealmObjectChangeListener) this.onExtraCallback).onChange(t, tombstoneProtosMemoryDumpMetadataCase);
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr());
        osSharedRealm.context.onWarmupCompleted(this);
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.nativePtr;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    public <T extends RealmModel> void addListener(T t, RealmObjectChangeListener<T> realmObjectChangeListener) {
        if (this.observerPairs.IAuthTabCallback()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.onExtraCallback(new onWarmupCompleted(t, realmObjectChangeListener));
    }

    public <T extends RealmModel> void removeListener(T t) {
        this.observerPairs.onWarmupCompleted(t);
        if (this.observerPairs.IAuthTabCallback()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public <T extends RealmModel> void removeListener(T t, RealmObjectChangeListener<T> realmObjectChangeListener) {
        this.observerPairs.IAuthTabCallback(t, realmObjectChangeListener);
        if (this.observerPairs.IAuthTabCallback()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(access22200<onWarmupCompleted> access22200Var) {
        if (!this.observerPairs.IAuthTabCallback()) {
            throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
        }
        this.observerPairs = access22200Var;
        if (access22200Var.IAuthTabCallback()) {
            return;
        }
        nativeStartListening(this.nativePtr);
    }

    public static UncheckedRow create(Table table) {
        return new UncheckedRow(table.onTransact().context, table, nativeCreateNewObject(table.getNativePtr()));
    }

    public static long createRow(Table table) {
        return nativeCreateRow(table.getNativePtr());
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
        String strOnExtraCallback = OsObjectStore.onExtraCallback(table.onTransact(), table.IAuthTabCallback());
        if (strOnExtraCallback == null) {
            throw new IllegalStateException(table.asInterface() + " has no primary key defined.");
        }
        return table.onWarmupCompleted(strOnExtraCallback);
    }

    public static UncheckedRow createWithPrimaryKey(Table table, @Nullable Object obj) {
        long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        RealmFieldType realmFieldTypeIAuthTabCallbackDefault = table.IAuthTabCallbackDefault(andVerifyPrimaryKeyColumnIndex);
        OsSharedRealm osSharedRealmOnTransact = table.onTransact();
        if (realmFieldTypeIAuthTabCallbackDefault == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: " + obj);
            }
            return new UncheckedRow(osSharedRealmOnTransact.context, table, nativeCreateNewObjectWithStringPrimaryKey(osSharedRealmOnTransact.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, (String) obj));
        }
        if (realmFieldTypeIAuthTabCallbackDefault == RealmFieldType.INTEGER) {
            return new UncheckedRow(osSharedRealmOnTransact.context, table, nativeCreateNewObjectWithLongPrimaryKey(osSharedRealmOnTransact.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? 0L : Long.parseLong(obj.toString()), obj == null));
        }
        if (realmFieldTypeIAuthTabCallbackDefault == RealmFieldType.OBJECT_ID) {
            return new UncheckedRow(osSharedRealmOnTransact.context, table, nativeCreateNewObjectWithObjectIdPrimaryKey(osSharedRealmOnTransact.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? null : obj.toString()));
        }
        if (realmFieldTypeIAuthTabCallbackDefault == RealmFieldType.UUID) {
            return new UncheckedRow(osSharedRealmOnTransact.context, table, nativeCreateNewObjectWithUUIDPrimaryKey(osSharedRealmOnTransact.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? null : obj.toString()));
        }
        throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + realmFieldTypeIAuthTabCallbackDefault);
    }

    public static long createRowWithPrimaryKey(Table table, long j, @Nullable Object obj) {
        RealmFieldType realmFieldTypeIAuthTabCallbackDefault = table.IAuthTabCallbackDefault(j);
        OsSharedRealm osSharedRealmOnTransact = table.onTransact();
        if (realmFieldTypeIAuthTabCallbackDefault == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                throw new IllegalArgumentException("Primary key value is not a String: " + obj);
            }
            return nativeCreateRowWithStringPrimaryKey(osSharedRealmOnTransact.getNativePtr(), table.getNativePtr(), j, (String) obj);
        }
        if (realmFieldTypeIAuthTabCallbackDefault == RealmFieldType.INTEGER) {
            return nativeCreateRowWithLongPrimaryKey(osSharedRealmOnTransact.getNativePtr(), table.getNativePtr(), j, obj == null ? 0L : Long.parseLong(obj.toString()), obj == null);
        }
        if (realmFieldTypeIAuthTabCallbackDefault == RealmFieldType.OBJECT_ID) {
            if (obj == null || (obj instanceof ObjectId)) {
                return nativeCreateRowWithObjectIdPrimaryKey(osSharedRealmOnTransact.getNativePtr(), table.getNativePtr(), j, obj != null ? obj.toString() : null);
            }
            throw new IllegalArgumentException("Primary key value is not an ObjectId: " + obj);
        }
        if (realmFieldTypeIAuthTabCallbackDefault == RealmFieldType.UUID) {
            if (obj == null || (obj instanceof UUID)) {
                return nativeCreateRowWithUUIDPrimaryKey(osSharedRealmOnTransact.getNativePtr(), table.getNativePtr(), j, obj != null ? obj.toString() : null);
            }
            throw new IllegalArgumentException("Primary key value is not an UUID: " + obj);
        }
        throw new RealmException("Cannot check for duplicate rows for unsupported primary key type: " + realmFieldTypeIAuthTabCallbackDefault);
    }

    public static long createEmbeddedObject(Table table, long j, long j2) {
        return nativeCreateEmbeddedObject(table.getNativePtr(), j, j2);
    }

    private void notifyChangeListeners(String[] strArr) {
        this.observerPairs.IAuthTabCallback(new onExtraCallbackWithResult(strArr));
    }
}
