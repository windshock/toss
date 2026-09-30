package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import o.access21700;
import o.access21900;
import o.access22100;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class UncheckedRow implements access22100, Row {
    private static final long onExtraCallback = nativeGetFinalizerPtr();
    private final long IAuthTabCallback;
    protected final Table onNavigationEvent;
    protected final access21700 onWarmupCompleted;

    private static native long nativeGetFinalizerPtr();

    @Override // io.realm.internal.Row
    public boolean isLoaded() {
        return true;
    }

    protected native long nativeCreateEmbeddedObject(long j, long j2);

    protected native long nativeFreeze(long j, long j2);

    protected native boolean nativeGetBoolean(long j, long j2);

    protected native byte[] nativeGetByteArray(long j, long j2);

    protected native long nativeGetColumnCount(long j);

    protected native long nativeGetColumnKey(long j, String str);

    protected native String[] nativeGetColumnNames(long j);

    protected native int nativeGetColumnType(long j, long j2);

    protected native long[] nativeGetDecimal128(long j, long j2);

    protected native double nativeGetDouble(long j, long j2);

    protected native float nativeGetFloat(long j, long j2);

    protected native long nativeGetLink(long j, long j2);

    protected native long nativeGetLong(long j, long j2);

    protected native String nativeGetObjectId(long j, long j2);

    protected native long nativeGetObjectKey(long j);

    protected native long nativeGetRealmAny(long j, long j2);

    protected native String nativeGetString(long j, long j2);

    protected native long nativeGetTimestamp(long j, long j2);

    protected native String nativeGetUUID(long j, long j2);

    protected native boolean nativeHasColumn(long j, String str);

    protected native boolean nativeIsNull(long j, long j2);

    protected native boolean nativeIsNullLink(long j, long j2);

    protected native boolean nativeIsValid(long j);

    protected native void nativeNullifyLink(long j, long j2);

    protected native void nativeSetBoolean(long j, long j2, boolean z);

    protected native void nativeSetByteArray(long j, long j2, @Nullable byte[] bArr);

    protected native void nativeSetDecimal128(long j, long j2, long j3, long j4);

    protected native void nativeSetDouble(long j, long j2, double d);

    protected native void nativeSetFloat(long j, long j2, float f);

    protected native void nativeSetLink(long j, long j2, long j3);

    protected native void nativeSetLong(long j, long j2, long j3);

    protected native void nativeSetNull(long j, long j2);

    protected native void nativeSetObjectId(long j, long j2, String str);

    protected native void nativeSetRealmAny(long j, long j2, long j3);

    protected native void nativeSetString(long j, long j2, String str);

    protected native void nativeSetTimestamp(long j, long j2, long j3);

    protected native void nativeSetUUID(long j, long j2, String str);

    public UncheckedRow(access21700 access21700Var, Table table, long j) {
        this.onWarmupCompleted = access21700Var;
        this.onNavigationEvent = table;
        this.IAuthTabCallback = j;
        access21700Var.onWarmupCompleted(this);
    }

    UncheckedRow(UncheckedRow uncheckedRow) {
        this.onWarmupCompleted = uncheckedRow.onWarmupCompleted;
        this.onNavigationEvent = uncheckedRow.onNavigationEvent;
        this.IAuthTabCallback = uncheckedRow.IAuthTabCallback;
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.IAuthTabCallback;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return onExtraCallback;
    }

    static UncheckedRow IAuthTabCallback(access21700 access21700Var, Table table, long j) {
        return new UncheckedRow(access21700Var, table, table.nativeGetRowPtr(table.getNativePtr(), j));
    }

    static UncheckedRow onWarmupCompleted(access21700 access21700Var, Table table, long j) {
        return new UncheckedRow(access21700Var, table, j);
    }

    @Override // io.realm.internal.Row
    public String[] getColumnNames() {
        return nativeGetColumnNames(this.IAuthTabCallback);
    }

    @Override // io.realm.internal.Row
    public long getColumnKey(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Column name can not be null.");
        }
        return nativeGetColumnKey(this.IAuthTabCallback, str);
    }

    @Override // io.realm.internal.Row
    public RealmFieldType getColumnType(long j) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.IAuthTabCallback, j));
    }

    @Override // io.realm.internal.Row
    public Table getTable() {
        return this.onNavigationEvent;
    }

    @Override // io.realm.internal.Row
    public long getObjectKey() {
        return nativeGetObjectKey(this.IAuthTabCallback);
    }

    @Override // io.realm.internal.Row
    public long getLong(long j) {
        return nativeGetLong(this.IAuthTabCallback, j);
    }

    @Override // io.realm.internal.Row
    public boolean getBoolean(long j) {
        return nativeGetBoolean(this.IAuthTabCallback, j);
    }

    @Override // io.realm.internal.Row
    public float getFloat(long j) {
        return nativeGetFloat(this.IAuthTabCallback, j);
    }

    @Override // io.realm.internal.Row
    public double getDouble(long j) {
        return nativeGetDouble(this.IAuthTabCallback, j);
    }

    @Override // io.realm.internal.Row
    public Date getDate(long j) {
        return new Date(nativeGetTimestamp(this.IAuthTabCallback, j));
    }

    @Override // io.realm.internal.Row
    public String getString(long j) {
        return nativeGetString(this.IAuthTabCallback, j);
    }

    @Override // io.realm.internal.Row
    public byte[] getBinaryByteArray(long j) {
        return nativeGetByteArray(this.IAuthTabCallback, j);
    }

    @Override // io.realm.internal.Row
    public Decimal128 getDecimal128(long j) {
        long[] jArrNativeGetDecimal128 = nativeGetDecimal128(this.IAuthTabCallback, j);
        if (jArrNativeGetDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(jArrNativeGetDecimal128[1], jArrNativeGetDecimal128[0]);
        }
        return null;
    }

    @Override // io.realm.internal.Row
    public ObjectId getObjectId(long j) {
        return new ObjectId(nativeGetObjectId(this.IAuthTabCallback, j));
    }

    @Override // io.realm.internal.Row
    public UUID getUUID(long j) {
        return UUID.fromString(nativeGetUUID(this.IAuthTabCallback, j));
    }

    @Override // io.realm.internal.Row
    public NativeRealmAny getNativeRealmAny(long j) {
        return new NativeRealmAny(nativeGetRealmAny(this.IAuthTabCallback, j));
    }

    @Override // io.realm.internal.Row
    public long getLink(long j) {
        return nativeGetLink(this.IAuthTabCallback, j);
    }

    public boolean isNullLink(long j) {
        return nativeIsNullLink(this.IAuthTabCallback, j);
    }

    public OsList getModelList(long j) {
        return new OsList(this, j);
    }

    public OsList getValueList(long j, RealmFieldType realmFieldType) {
        return new OsList(this, j);
    }

    public OsMap onNavigationEvent(long j) {
        return new OsMap(this, j);
    }

    public OsMap getModelMap(long j) {
        return new OsMap(this, j);
    }

    public OsMap getValueMap(long j, RealmFieldType realmFieldType) {
        return new OsMap(this, j);
    }

    public OsSet getModelSet(long j) {
        return new OsSet(this, j);
    }

    public OsSet getValueSet(long j, RealmFieldType realmFieldType) {
        return new OsSet(this, j);
    }

    @Override // io.realm.internal.Row
    public void setLong(long j, long j2) {
        this.onNavigationEvent.onNavigationEvent();
        nativeSetLong(this.IAuthTabCallback, j, j2);
    }

    @Override // io.realm.internal.Row
    public void setBoolean(long j, boolean z) {
        this.onNavigationEvent.onNavigationEvent();
        nativeSetBoolean(this.IAuthTabCallback, j, z);
    }

    @Override // io.realm.internal.Row
    public void setDouble(long j, double d) {
        this.onNavigationEvent.onNavigationEvent();
        nativeSetDouble(this.IAuthTabCallback, j, d);
    }

    @Override // io.realm.internal.Row
    public void setDate(long j, Date date) {
        this.onNavigationEvent.onNavigationEvent();
        if (date == null) {
            throw new IllegalArgumentException("Null Date is not allowed.");
        }
        nativeSetTimestamp(this.IAuthTabCallback, j, date.getTime());
    }

    @Override // io.realm.internal.Row
    public void setString(long j, @Nullable String str) {
        this.onNavigationEvent.onNavigationEvent();
        if (str == null) {
            nativeSetNull(this.IAuthTabCallback, j);
        } else {
            nativeSetString(this.IAuthTabCallback, j, str);
        }
    }

    public void onNavigationEvent(long j, @Nullable byte[] bArr) {
        this.onNavigationEvent.onNavigationEvent();
        nativeSetByteArray(this.IAuthTabCallback, j, bArr);
    }

    @Override // io.realm.internal.Row
    public void setLink(long j, long j2) {
        this.onNavigationEvent.onNavigationEvent();
        nativeSetLink(this.IAuthTabCallback, j, j2);
    }

    @Override // io.realm.internal.Row
    public void nullifyLink(long j) {
        this.onNavigationEvent.onNavigationEvent();
        nativeNullifyLink(this.IAuthTabCallback, j);
    }

    public boolean isNull(long j) {
        return nativeIsNull(this.IAuthTabCallback, j);
    }

    public void setNull(long j) {
        this.onNavigationEvent.onNavigationEvent();
        nativeSetNull(this.IAuthTabCallback, j);
    }

    /* renamed from: io.realm.internal.UncheckedRow$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[RealmFieldType.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[RealmFieldType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // io.realm.internal.Row
    public long createEmbeddedObject(long j, RealmFieldType realmFieldType) {
        int i = AnonymousClass2.IAuthTabCallback[realmFieldType.ordinal()];
        if (i == 1) {
            this.onNavigationEvent.onNavigationEvent();
            return nativeCreateEmbeddedObject(this.IAuthTabCallback, j);
        }
        if (i == 2) {
            return getModelList(j).onExtraCallback();
        }
        throw new IllegalArgumentException("Wrong parentPropertyType, expected OBJECT or LIST but received " + realmFieldType);
    }

    public CheckedRow onExtraCallbackWithResult() {
        return CheckedRow.onWarmupCompleted(this);
    }

    @Override // io.realm.internal.Row
    public boolean isValid() {
        long j = this.IAuthTabCallback;
        return j != 0 && nativeIsValid(j);
    }

    @Override // io.realm.internal.Row
    public boolean hasColumn(String str) {
        return nativeHasColumn(this.IAuthTabCallback, str);
    }

    public Row freeze(OsSharedRealm osSharedRealm) {
        if (!isValid()) {
            return access21900.INSTANCE;
        }
        return new UncheckedRow(this.onWarmupCompleted, this.onNavigationEvent.onNavigationEvent(osSharedRealm), nativeFreeze(this.IAuthTabCallback, osSharedRealm.getNativePtr()));
    }
}
