package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Locale;
import o.access21700;
import o.access21900;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class CheckedRow extends UncheckedRow {
    private UncheckedRow onExtraCallbackWithResult;

    @Override // io.realm.internal.UncheckedRow
    protected native boolean nativeGetBoolean(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native byte[] nativeGetByteArray(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetColumnCount(long j);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetColumnKey(long j, String str);

    @Override // io.realm.internal.UncheckedRow
    protected native int nativeGetColumnType(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native long[] nativeGetDecimal128(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native double nativeGetDouble(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native float nativeGetFloat(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetLink(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetLong(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native String nativeGetObjectId(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native String nativeGetString(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native long nativeGetTimestamp(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native boolean nativeIsNullLink(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeNullifyLink(long j, long j2);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetBoolean(long j, long j2, boolean z);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetByteArray(long j, long j2, byte[] bArr);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetDecimal128(long j, long j2, long j3, long j4);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetDouble(long j, long j2, double d);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetFloat(long j, long j2, float f);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetLink(long j, long j2, long j3);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetLong(long j, long j2, long j3);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetObjectId(long j, long j2, String str);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetString(long j, long j2, String str);

    @Override // io.realm.internal.UncheckedRow
    protected native void nativeSetTimestamp(long j, long j2, long j3);

    private CheckedRow(access21700 access21700Var, Table table, long j) {
        super(access21700Var, table, j);
    }

    public CheckedRow(UncheckedRow uncheckedRow) {
        super(uncheckedRow);
        this.onExtraCallbackWithResult = uncheckedRow;
    }

    public static CheckedRow onExtraCallback(access21700 access21700Var, Table table, long j) {
        return new CheckedRow(access21700Var, table, table.nativeGetRowPtr(table.getNativePtr(), j));
    }

    public static CheckedRow onWarmupCompleted(UncheckedRow uncheckedRow) {
        return new CheckedRow(uncheckedRow);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public boolean isNullLink(long j) {
        RealmFieldType columnType = getColumnType(j);
        if (columnType == RealmFieldType.OBJECT || columnType == RealmFieldType.LIST) {
            return super.isNullLink(j);
        }
        return false;
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public boolean isNull(long j) {
        return super.isNull(j);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public void setNull(long j) {
        if (getColumnType(j) == RealmFieldType.BINARY) {
            super.onNavigationEvent(j, null);
        } else {
            super.setNull(j);
        }
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public OsList getModelList(long j) {
        if (getTable().IAuthTabCallbackDefault(j) != RealmFieldType.LIST) {
            throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmList'.", getTable().onTransact(j)));
        }
        return super.getModelList(j);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public OsList getValueList(long j, RealmFieldType realmFieldType) {
        if (realmFieldType != getTable().IAuthTabCallbackDefault(j)) {
            throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", getTable().onTransact(j), realmFieldType.name()));
        }
        return super.getValueList(j, realmFieldType);
    }

    @Override // io.realm.internal.UncheckedRow
    public OsMap onNavigationEvent(long j) {
        if (getTable().IAuthTabCallbackDefault(j) != RealmFieldType.STRING_TO_MIXED_MAP) {
            throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmDictionary'.", getTable().onTransact(j)));
        }
        return super.onNavigationEvent(j);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public OsMap getModelMap(long j) {
        if (getTable().IAuthTabCallbackDefault(j) != RealmFieldType.STRING_TO_LINK_MAP) {
            throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' is not a 'RealmDictionary'.", getTable().onTransact(j)));
        }
        return super.onNavigationEvent(j);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public OsMap getValueMap(long j, RealmFieldType realmFieldType) {
        if (realmFieldType != getTable().IAuthTabCallbackDefault(j)) {
            throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", getTable().onTransact(j), realmFieldType.name()));
        }
        return super.getValueMap(j, realmFieldType);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public OsSet getModelSet(long j) {
        return super.getModelSet(j);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public OsSet getValueSet(long j, RealmFieldType realmFieldType) {
        if (realmFieldType != getTable().IAuthTabCallbackDefault(j)) {
            throw new IllegalArgumentException(String.format(Locale.US, "The type of field '%1$s' is not 'RealmFieldType.%2$s'.", getTable().onTransact(j), realmFieldType.name()));
        }
        return super.getValueSet(j, realmFieldType);
    }

    @Override // io.realm.internal.UncheckedRow, io.realm.internal.Row
    public Row freeze(OsSharedRealm osSharedRealm) {
        if (!isValid()) {
            return access21900.INSTANCE;
        }
        return new CheckedRow(this.onWarmupCompleted, this.onNavigationEvent.onNavigationEvent(osSharedRealm), nativeFreeze(getNativePtr(), osSharedRealm.getNativePtr()));
    }
}
