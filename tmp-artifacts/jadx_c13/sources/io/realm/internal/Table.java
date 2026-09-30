package io.realm.internal;

import im.toss.uikit.R;
import io.realm.RealmFieldType;
import java.util.Date;
import javax.annotation.Nullable;
import o.access21700;
import o.access22100;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class Table implements access22100 {
    private static final String onExtraCallback;
    private static final long onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private final access21700 IAuthTabCallback;
    private final OsSharedRealm asInterface;
    private final long onWarmupCompleted;

    private native long nativeAddColumn(long j, int i, String str, boolean z);

    private native long nativeAddColumnDictionaryLink(long j, int i, String str, long j2);

    private native long nativeAddColumnLink(long j, int i, String str, long j2);

    private native long nativeAddColumnSetLink(long j, int i, String str, long j2);

    private native long nativeAddPrimitiveDictionaryColumn(long j, int i, String str, boolean z);

    private native long nativeAddPrimitiveListColumn(long j, int i, String str, boolean z);

    private native long nativeAddPrimitiveSetColumn(long j, int i, String str, boolean z);

    private native void nativeAddSearchIndex(long j, long j2);

    private native void nativeClear(long j);

    private native void nativeConvertColumnToNotNullable(long j, long j2, boolean z);

    private native void nativeConvertColumnToNullable(long j, long j2, boolean z);

    private native long nativeCountDouble(long j, long j2, double d);

    private native long nativeCountFloat(long j, long j2, float f);

    private native long nativeCountLong(long j, long j2, long j3);

    private native long nativeCountString(long j, long j2, String str);

    private native long nativeFindFirstBool(long j, long j2, boolean z);

    public static native long nativeFindFirstDecimal128(long j, long j2, long j3, long j4);

    private native long nativeFindFirstDouble(long j, long j2, double d);

    private native long nativeFindFirstFloat(long j, long j2, float f);

    public static native long nativeFindFirstInt(long j, long j2, long j3);

    public static native long nativeFindFirstNull(long j, long j2);

    public static native long nativeFindFirstObjectId(long j, long j2, String str);

    public static native long nativeFindFirstString(long j, long j2, String str);

    private native long nativeFindFirstTimestamp(long j, long j2, long j3);

    public static native long nativeFindFirstUUID(long j, long j2, String str);

    private static native long nativeFreeze(long j, long j2);

    private native boolean nativeGetBoolean(long j, long j2, long j3);

    private native byte[] nativeGetByteArray(long j, long j2, long j3);

    private native long nativeGetColumnCount(long j);

    private native long nativeGetColumnKey(long j, String str);

    private native String nativeGetColumnName(long j, long j2);

    private native String[] nativeGetColumnNames(long j);

    private native int nativeGetColumnType(long j, long j2);

    private native long[] nativeGetDecimal128(long j, long j2, long j3);

    private native double nativeGetDouble(long j, long j2, long j3);

    private static native long nativeGetFinalizerPtr();

    private native float nativeGetFloat(long j, long j2, long j3);

    private native long nativeGetLink(long j, long j2, long j3);

    private native long nativeGetLinkTarget(long j, long j2);

    private native long nativeGetLong(long j, long j2, long j3);

    private native String nativeGetName(long j);

    private native String nativeGetObjectId(long j, long j2, long j3);

    private native String nativeGetString(long j, long j2, long j3);

    private native long nativeGetTimestamp(long j, long j2, long j3);

    private native boolean nativeHasSameSchema(long j, long j2);

    private native boolean nativeHasSearchIndex(long j, long j2);

    public static native void nativeIncrementLong(long j, long j2, long j3, long j4);

    private native boolean nativeIsColumnNullable(long j, long j2);

    private static native boolean nativeIsEmbedded(long j);

    private native boolean nativeIsNull(long j, long j2, long j3);

    private native boolean nativeIsNullLink(long j, long j2, long j3);

    private native boolean nativeIsValid(long j);

    private native void nativeMoveLastOver(long j, long j2);

    public static native void nativeNullifyLink(long j, long j2, long j3);

    private native void nativeRemoveColumn(long j, long j2);

    private native void nativeRemoveSearchIndex(long j, long j2);

    private native void nativeRenameColumn(long j, long j2, String str);

    public static native void nativeSetBoolean(long j, long j2, long j3, boolean z, boolean z2);

    public static native void nativeSetByteArray(long j, long j2, long j3, byte[] bArr, boolean z);

    public static native void nativeSetDecimal128(long j, long j2, long j3, long j4, long j5, boolean z);

    public static native void nativeSetDouble(long j, long j2, long j3, double d, boolean z);

    private static native boolean nativeSetEmbedded(long j, boolean z, boolean z2);

    public static native void nativeSetFloat(long j, long j2, long j3, float f, boolean z);

    public static native void nativeSetLink(long j, long j2, long j3, long j4, boolean z);

    public static native void nativeSetLong(long j, long j2, long j3, long j4, boolean z);

    public static native void nativeSetNull(long j, long j2, long j3, boolean z);

    public static native void nativeSetObjectId(long j, long j2, long j3, String str, boolean z);

    public static native void nativeSetRealmAny(long j, long j2, long j3, long j4, boolean z);

    public static native void nativeSetString(long j, long j2, long j3, String str, boolean z);

    public static native void nativeSetTimestamp(long j, long j2, long j3, long j4, boolean z);

    public static native void nativeSetUUID(long j, long j2, long j3, String str, boolean z);

    private native long nativeSize(long j);

    private native long nativeWhere(long j);

    native long nativeGetRowPtr(long j, long j2);

    static {
        String strIAuthTabCallback = Util.IAuthTabCallback();
        onExtraCallback = strIAuthTabCallback;
        onNavigationEvent = 63 - strIAuthTabCallback.length();
        onExtraCallbackWithResult = nativeGetFinalizerPtr();
    }

    Table(OsSharedRealm osSharedRealm, long j) {
        access21700 access21700Var = osSharedRealm.context;
        this.IAuthTabCallback = access21700Var;
        this.asInterface = osSharedRealm;
        this.onWarmupCompleted = j;
        access21700Var.onWarmupCompleted(this);
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.onWarmupCompleted;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return onExtraCallbackWithResult;
    }

    public boolean IAuthTabCallbackDefault() {
        long j = this.onWarmupCompleted;
        return j != 0 && nativeIsValid(j);
    }

    private void onNavigationEvent(String str) {
        if (str.length() > 63) {
            throw new IllegalArgumentException("Column names are currently limited to max 63 characters.");
        }
    }

    /* renamed from: io.realm.internal.Table$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            onExtraCallback = iArr;
            try {
                iArr[RealmFieldType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[RealmFieldType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallback[RealmFieldType.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallback[RealmFieldType.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onExtraCallback[RealmFieldType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onExtraCallback[RealmFieldType.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onExtraCallback[RealmFieldType.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onExtraCallback[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onExtraCallback[RealmFieldType.MIXED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onExtraCallback[RealmFieldType.UUID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onExtraCallback[RealmFieldType.INTEGER_LIST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                onExtraCallback[RealmFieldType.BOOLEAN_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                onExtraCallback[RealmFieldType.BINARY_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                onExtraCallback[RealmFieldType.DATE_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                onExtraCallback[RealmFieldType.FLOAT_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                onExtraCallback[RealmFieldType.DOUBLE_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                onExtraCallback[RealmFieldType.DECIMAL128_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                onExtraCallback[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                onExtraCallback[RealmFieldType.UUID_LIST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                onExtraCallback[RealmFieldType.MIXED_LIST.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                onExtraCallback[RealmFieldType.INTEGER_SET.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                onExtraCallback[RealmFieldType.BOOLEAN_SET.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                onExtraCallback[RealmFieldType.STRING_SET.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                onExtraCallback[RealmFieldType.BINARY_SET.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                onExtraCallback[RealmFieldType.DATE_SET.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                onExtraCallback[RealmFieldType.FLOAT_SET.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                onExtraCallback[RealmFieldType.DOUBLE_SET.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                onExtraCallback[RealmFieldType.DECIMAL128_SET.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                onExtraCallback[RealmFieldType.OBJECT_ID_SET.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                onExtraCallback[RealmFieldType.UUID_SET.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                onExtraCallback[RealmFieldType.MIXED_SET.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
        }
    }

    public long onNavigationEvent(RealmFieldType realmFieldType, String str, boolean z) {
        onNavigationEvent(str);
        switch (AnonymousClass2.onExtraCallback[realmFieldType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return nativeAddColumn(this.onWarmupCompleted, realmFieldType.getNativeValue(), str, z);
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return nativeAddPrimitiveListColumn(this.onWarmupCompleted, realmFieldType.getNativeValue() - 128, str, z);
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                return nativeAddPrimitiveDictionaryColumn(this.onWarmupCompleted, realmFieldType.getNativeValue() - 512, str, z);
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case R.styleable.Chip_shapeAppearance /* 42 */:
            case R.styleable.Chip_shapeAppearanceOverlay /* 43 */:
            case 44:
                return nativeAddPrimitiveSetColumn(this.onWarmupCompleted, realmFieldType.getNativeValue() - 256, str, z);
            default:
                throw new IllegalArgumentException("Unsupported type: " + realmFieldType);
        }
    }

    public long onExtraCallbackWithResult(RealmFieldType realmFieldType, String str, Table table) {
        onNavigationEvent(str);
        return nativeAddColumnLink(this.onWarmupCompleted, realmFieldType.getNativeValue(), str, table.onWarmupCompleted);
    }

    public void access100(long j) {
        String strIAuthTabCallback = IAuthTabCallback();
        String strOnTransact = onTransact(j);
        String strOnExtraCallback = OsObjectStore.onExtraCallback(this.asInterface, IAuthTabCallback());
        nativeRemoveColumn(this.onWarmupCompleted, j);
        if (strOnTransact.equals(strOnExtraCallback)) {
            OsObjectStore.IAuthTabCallback(this.asInterface, strIAuthTabCallback, null);
        }
    }

    public void onExtraCallbackWithResult(long j, String str) {
        onNavigationEvent(str);
        String strNativeGetColumnName = nativeGetColumnName(this.onWarmupCompleted, j);
        String strOnExtraCallback = OsObjectStore.onExtraCallback(this.asInterface, IAuthTabCallback());
        nativeRenameColumn(this.onWarmupCompleted, j, str);
        if (strNativeGetColumnName.equals(strOnExtraCallback)) {
            try {
                OsObjectStore.IAuthTabCallback(this.asInterface, IAuthTabCallback(), str);
            } catch (Exception e) {
                nativeRenameColumn(this.onWarmupCompleted, j, strNativeGetColumnName);
                throw new RuntimeException(e);
            }
        }
    }

    public boolean IAuthTabCallback_Parcel(long j) {
        return nativeIsColumnNullable(this.onWarmupCompleted, j);
    }

    public void onNavigationEvent(long j) {
        if (this.asInterface.isSyncRealm()) {
            throw new IllegalStateException("This method is only available for non-synchronized Realms");
        }
        nativeConvertColumnToNullable(this.onWarmupCompleted, j, extraCallbackWithResult(j));
    }

    public void onExtraCallbackWithResult(long j) {
        if (this.asInterface.isSyncRealm()) {
            throw new IllegalStateException("This method is only available for non-synchronized Realms");
        }
        nativeConvertColumnToNotNullable(this.onWarmupCompleted, j, extraCallbackWithResult(j));
    }

    public long IAuthTabCallback_Parcel() {
        return nativeSize(this.onWarmupCompleted);
    }

    public void onExtraCallback() {
        onNavigationEvent();
        nativeClear(this.onWarmupCompleted);
    }

    public long onWarmupCompleted() {
        return nativeGetColumnCount(this.onWarmupCompleted);
    }

    public String onTransact(long j) {
        return nativeGetColumnName(this.onWarmupCompleted, j);
    }

    public String[] onExtraCallbackWithResult() {
        return nativeGetColumnNames(this.onWarmupCompleted);
    }

    public long onWarmupCompleted(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Column name can not be null.");
        }
        return nativeGetColumnKey(this.onWarmupCompleted, str);
    }

    public RealmFieldType IAuthTabCallbackDefault(long j) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.onWarmupCompleted, j));
    }

    public void access000(long j) {
        onNavigationEvent();
        nativeMoveLastOver(this.onWarmupCompleted, j);
    }

    private boolean extraCallbackWithResult(long j) {
        return onTransact(j).equals(OsObjectStore.onExtraCallback(this.asInterface, IAuthTabCallback()));
    }

    public OsSharedRealm onTransact() {
        return this.asInterface;
    }

    public Table asInterface(long j) {
        return new Table(this.asInterface, nativeGetLinkTarget(this.onWarmupCompleted, j));
    }

    public UncheckedRow IAuthTabCallbackStub(long j) {
        return UncheckedRow.IAuthTabCallback(this.IAuthTabCallback, this, j);
    }

    public UncheckedRow asBinder(long j) {
        return UncheckedRow.onWarmupCompleted(this.IAuthTabCallback, this, j);
    }

    public CheckedRow onExtraCallback(long j) {
        return CheckedRow.onExtraCallback(this.IAuthTabCallback, this, j);
    }

    public void IAuthTabCallback(long j, long j2, long j3, boolean z) {
        onNavigationEvent();
        nativeSetLong(this.onWarmupCompleted, j, j2, j3, z);
    }

    public void onExtraCallback(long j, long j2, boolean z, boolean z2) {
        onNavigationEvent();
        nativeSetBoolean(this.onWarmupCompleted, j, j2, z, z2);
    }

    public void onExtraCallbackWithResult(long j, long j2, double d, boolean z) {
        onNavigationEvent();
        nativeSetDouble(this.onWarmupCompleted, j, j2, d, z);
    }

    public void onWarmupCompleted(long j, long j2, Date date, boolean z) {
        if (date == null) {
            throw new IllegalArgumentException("Null Date is not allowed.");
        }
        onNavigationEvent();
        nativeSetTimestamp(this.onWarmupCompleted, j, j2, date.getTime(), z);
    }

    public void onWarmupCompleted(long j, long j2, @Nullable String str, boolean z) {
        onNavigationEvent();
        if (str == null) {
            nativeSetNull(this.onWarmupCompleted, j, j2, z);
        } else {
            nativeSetString(this.onWarmupCompleted, j, j2, str, z);
        }
    }

    public void onExtraCallbackWithResult(long j, long j2, long j3, boolean z) {
        onNavigationEvent();
        nativeSetLink(this.onWarmupCompleted, j, j2, j3, z);
    }

    public void onExtraCallbackWithResult(long j, long j2, boolean z) {
        onNavigationEvent();
        nativeSetNull(this.onWarmupCompleted, j, j2, z);
    }

    public void onWarmupCompleted(long j) {
        onNavigationEvent();
        nativeAddSearchIndex(this.onWarmupCompleted, j);
    }

    public void getInterfaceDescriptor(long j) {
        onNavigationEvent();
        nativeRemoveSearchIndex(this.onWarmupCompleted, j);
    }

    public boolean IAuthTabCallbackStubProxy(long j) {
        return nativeHasSearchIndex(this.onWarmupCompleted, j);
    }

    boolean IAuthTabCallbackStub() {
        OsSharedRealm osSharedRealm = this.asInterface;
        return (osSharedRealm == null || osSharedRealm.isInTransaction()) ? false : true;
    }

    void onNavigationEvent() {
        if (IAuthTabCallbackStub()) {
            getInterfaceDescriptor();
        }
    }

    public TableQuery access100() {
        return new TableQuery(this.IAuthTabCallback, this, nativeWhere(this.onWarmupCompleted));
    }

    public long IAuthTabCallback(long j, long j2) {
        return nativeFindFirstInt(this.onWarmupCompleted, j, j2);
    }

    public long onWarmupCompleted(long j, String str) {
        if (str == null) {
            throw new IllegalArgumentException("null is not supported");
        }
        return nativeFindFirstString(this.onWarmupCompleted, j, str);
    }

    public long IAuthTabCallback(long j) {
        return nativeFindFirstNull(this.onWarmupCompleted, j);
    }

    @Nullable
    public String asInterface() {
        return nativeGetName(this.onWarmupCompleted);
    }

    public String IAuthTabCallback() {
        String strOnExtraCallback = onExtraCallback(asInterface());
        if (Util.onNavigationEvent(strOnExtraCallback)) {
            throw new IllegalStateException("This object class is no longer part of the schema for the Realm file. It is therefor not possible to access the schema name.");
        }
        return strOnExtraCallback;
    }

    public String toString() {
        long jOnWarmupCompleted = onWarmupCompleted();
        String strAsInterface = asInterface();
        StringBuilder sb = new StringBuilder("The Table ");
        if (strAsInterface != null && !strAsInterface.isEmpty()) {
            sb.append(asInterface());
            sb.append(" ");
        }
        sb.append("contains ");
        sb.append(jOnWarmupCompleted);
        sb.append(" columns: ");
        String[] strArrOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int length = strArrOnExtraCallbackWithResult.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            String str = strArrOnExtraCallbackWithResult[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append(str);
            i++;
            z = false;
        }
        sb.append(".");
        sb.append(" And ");
        sb.append(IAuthTabCallback_Parcel());
        sb.append(" rows.");
        return sb.toString();
    }

    private static void getInterfaceDescriptor() {
        throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
    }

    public Table onNavigationEvent(OsSharedRealm osSharedRealm) {
        if (!osSharedRealm.isFrozen()) {
            throw new IllegalArgumentException("Frozen Realm required");
        }
        return new Table(osSharedRealm, nativeFreeze(osSharedRealm.getNativePtr(), this.onWarmupCompleted));
    }

    public boolean asBinder() {
        return nativeIsEmbedded(this.onWarmupCompleted);
    }

    public boolean onExtraCallbackWithResult(boolean z, boolean z2) {
        return nativeSetEmbedded(this.onWarmupCompleted, z, z2);
    }

    @Nullable
    public static String onExtraCallback(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String str2 = onExtraCallback;
        return !str.startsWith(str2) ? str : str.substring(str2.length());
    }

    public static String onExtraCallbackWithResult(String str) {
        if (str == null) {
            return null;
        }
        return onExtraCallback + str;
    }
}
