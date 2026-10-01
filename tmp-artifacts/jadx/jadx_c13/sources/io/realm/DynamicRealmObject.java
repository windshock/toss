package io.realm;

import im.toss.uikit.R;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.UncheckedRow;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import javax.annotation.Nullable;
import o.TombstoneProtosLogMessageOrBuilder;
import o.access11500;
import okhttp3.internal.url._UrlKt;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class DynamicRealmObject extends RealmObject implements RealmObjectProxy {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final access11500<DynamicRealmObject> proxyState;

    enum onNavigationEvent {
        LIST,
        DICTIONARY,
        SET
    }

    @Override // io.realm.internal.RealmObjectProxy
    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public DynamicRealmObject(RealmModel realmModel) {
        access11500<DynamicRealmObject> access11500Var = new access11500<>(this);
        this.proxyState = access11500Var;
        if (realmModel == null) {
            throw new IllegalArgumentException("A non-null object must be provided.");
        }
        if (!(realmModel instanceof DynamicRealmObject)) {
            int i = onNavigationEvent + 67;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
            if (!(!RealmObject.onWarmupCompleted(realmModel))) {
                int i3 = IAuthTabCallback + 35;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    if (!RealmObject.onTransact(realmModel)) {
                        throw new IllegalArgumentException("A valid object managed by Realm must be provided. This object was deleted.");
                    }
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmModel;
                    Row rowIAuthTabCallback = realmObjectProxy.cb_().IAuthTabCallback();
                    access11500Var.onExtraCallbackWithResult(realmObjectProxy.cb_().onExtraCallback());
                    access11500Var.onExtraCallbackWithResult(((UncheckedRow) rowIAuthTabCallback).onExtraCallbackWithResult());
                    access11500Var.IAuthTabCallbackDefault();
                    return;
                }
                RealmObject.onTransact(realmModel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            throw new IllegalArgumentException("An object managed by Realm must be provided. This is an unmanaged object.");
        }
        throw new IllegalArgumentException("The object is already a DynamicRealmObject: " + realmModel);
    }

    public DynamicRealmObject(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, Row row) {
        access11500<DynamicRealmObject> access11500Var = new access11500<>(this);
        this.proxyState = access11500Var;
        access11500Var.onExtraCallbackWithResult(tombstoneProtosLogMessageOrBuilder);
        access11500Var.onExtraCallbackWithResult(row);
        access11500Var.IAuthTabCallbackDefault();
    }

    public boolean onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.proxyState.onExtraCallback().onTransact();
        long columnKey = this.proxyState.IAuthTabCallback().getColumnKey(str);
        try {
            boolean z = this.proxyState.IAuthTabCallback().getBoolean(columnKey);
            int i4 = IAuthTabCallback + 9;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            throw null;
        } catch (IllegalArgumentException e) {
            onWarmupCompleted(str, columnKey, RealmFieldType.BOOLEAN);
            throw e;
        }
    }

    public int onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(str);
            throw null;
        }
        int iIAuthTabCallback = (int) IAuthTabCallback(str);
        int i3 = IAuthTabCallback + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iIAuthTabCallback;
    }

    public long IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (i3 != 0) {
                this.proxyState.onExtraCallback().onTransact();
                long j = this.proxyState.IAuthTabCallback().getLong(this.proxyState.IAuthTabCallback().getColumnKey(str));
                int i4 = onNavigationEvent + 111;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return j;
            }
            this.proxyState.onExtraCallback().onTransact();
            this.proxyState.IAuthTabCallback().getLong(this.proxyState.IAuthTabCallback().getColumnKey(str));
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (IllegalArgumentException e) {
            onWarmupCompleted(str, i3, RealmFieldType.INTEGER);
            throw e;
        }
    }

    public String onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (i3 == 0) {
                this.proxyState.onExtraCallback().onTransact();
                str = this.proxyState.IAuthTabCallback().getString(this.proxyState.IAuthTabCallback().getColumnKey(str));
                int i4 = 28 / 0;
            } else {
                this.proxyState.onExtraCallback().onTransact();
                str = this.proxyState.IAuthTabCallback().getString(this.proxyState.IAuthTabCallback().getColumnKey(str));
            }
            int i5 = IAuthTabCallback + 73;
            onNavigationEvent = i5 % 128;
            i3 = i5 % 2;
            return str;
        } catch (IllegalArgumentException e) {
            onWarmupCompleted(str, i3, RealmFieldType.STRING);
            throw e;
        }
    }

    /* renamed from: io.realm.DynamicRealmObject$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] onExtraCallbackWithResult;
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[onNavigationEvent.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[onNavigationEvent.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[onNavigationEvent.DICTIONARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[onNavigationEvent.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[RealmFieldType.values().length];
            onExtraCallbackWithResult = iArr2;
            try {
                iArr2[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.DATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.MIXED.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.UUID.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_TO_LINK_MAP.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.INTEGER_SET.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.BOOLEAN_SET.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_SET.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.BINARY_SET.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.DATE_SET.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.FLOAT_SET.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.DOUBLE_SET.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.DECIMAL128_SET.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.OBJECT_ID_SET.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.UUID_SET.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.LINK_SET.ordinal()] = 36;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.MIXED_SET.ordinal()] = 37;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.LINKING_OBJECTS.ordinal()] = 38;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.INTEGER_LIST.ordinal()] = 39;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.BOOLEAN_LIST.ordinal()] = 40;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.STRING_LIST.ordinal()] = 41;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.BINARY_LIST.ordinal()] = 42;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.DATE_LIST.ordinal()] = 43;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.FLOAT_LIST.ordinal()] = 44;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.DOUBLE_LIST.ordinal()] = 45;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.DECIMAL128_LIST.ordinal()] = 46;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 47;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.UUID_LIST.ordinal()] = 48;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                onExtraCallbackWithResult[RealmFieldType.MIXED_LIST.ordinal()] = 49;
            } catch (NoSuchFieldError unused52) {
            }
        }
    }

    public boolean asInterface(String str) {
        int i = 2 % 2;
        this.proxyState.onExtraCallback().onTransact();
        long columnKey = this.proxyState.IAuthTabCallback().getColumnKey(str);
        switch (AnonymousClass5.onExtraCallbackWithResult[this.proxyState.IAuthTabCallback().getColumnType(columnKey).ordinal()]) {
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
                boolean zIsNull = this.proxyState.IAuthTabCallback().isNull(columnKey);
                int i2 = onNavigationEvent + 77;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 27 / 0;
                }
                return zIsNull;
            case 12:
                return this.proxyState.IAuthTabCallback().isNullLink(columnKey);
            default:
                int i4 = IAuthTabCallback + 57;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 46 / 0;
                }
                return false;
        }
    }

    public boolean onExtraCallback(String str) {
        int i = 2 % 2;
        this.proxyState.onExtraCallback().onTransact();
        if (str == null || str.isEmpty()) {
            return false;
        }
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zHasColumn = this.proxyState.IAuthTabCallback().hasColumn(str);
        int i4 = IAuthTabCallback + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return zHasColumn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.proxyState.onExtraCallback().onTransact();
        String[] columnNames = this.proxyState.IAuthTabCallback().getColumnNames();
        int i4 = IAuthTabCallback + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return columnNames;
    }

    public void onExtraCallback(String str, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.proxyState.onExtraCallback().onTransact();
        this.proxyState.IAuthTabCallback().setBoolean(this.proxyState.IAuthTabCallback().getColumnKey(str), z);
        int i4 = onNavigationEvent + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    public void onNavigationEvent(String str, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 35;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            this.proxyState.onExtraCallback().onTransact();
            onTransact(str);
            this.proxyState.IAuthTabCallback().setLong(this.proxyState.IAuthTabCallback().getColumnKey(str), i);
            return;
        }
        this.proxyState.onExtraCallback().onTransact();
        onTransact(str);
        this.proxyState.IAuthTabCallback().setLong(this.proxyState.IAuthTabCallback().getColumnKey(str), i);
        throw null;
    }

    public void onWarmupCompleted(String str, long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.proxyState.onExtraCallback().onTransact();
        onTransact(str);
        this.proxyState.IAuthTabCallback().setLong(this.proxyState.IAuthTabCallback().getColumnKey(str), j);
        int i4 = onNavigationEvent + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void IAuthTabCallback(String str, @Nullable String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.proxyState.onExtraCallback().onTransact();
            onTransact(str);
            this.proxyState.IAuthTabCallback().setString(this.proxyState.IAuthTabCallback().getColumnKey(str), str2);
            int i3 = IAuthTabCallback + 89;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.proxyState.onExtraCallback().onTransact();
        onTransact(str);
        this.proxyState.IAuthTabCallback().setString(this.proxyState.IAuthTabCallback().getColumnKey(str), str2);
        obj.hashCode();
        throw null;
    }

    public void onWarmupCompleted(String str, @Nullable Date date) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.proxyState.onExtraCallback().onTransact();
        long columnKey = this.proxyState.IAuthTabCallback().getColumnKey(str);
        if (date != null) {
            this.proxyState.IAuthTabCallback().setDate(columnKey, date);
            return;
        }
        int i4 = IAuthTabCallback + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            this.proxyState.IAuthTabCallback().setNull(columnKey);
            int i5 = 38 / 0;
        } else {
            this.proxyState.IAuthTabCallback().setNull(columnKey);
        }
        int i6 = onNavigationEvent + 55;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.proxyState.onExtraCallback().onTransact();
        String strIAuthTabCallback = this.proxyState.IAuthTabCallback().getTable().IAuthTabCallback();
        int i4 = IAuthTabCallback + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    private void onWarmupCompleted(String str, long j, RealmFieldType realmFieldType) {
        int i = 2 % 2;
        RealmFieldType columnType = this.proxyState.IAuthTabCallback().getColumnType(j);
        Object obj = null;
        if (columnType != realmFieldType) {
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
            String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
            Object obj2 = (realmFieldType == realmFieldType2 || realmFieldType == RealmFieldType.OBJECT) ? "n" : _UrlKt.FRAGMENT_ENCODE_SET;
            if (columnType != realmFieldType2) {
                int i4 = onNavigationEvent + 61;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    RealmFieldType realmFieldType3 = RealmFieldType.OBJECT;
                    obj.hashCode();
                    throw null;
                }
                if (columnType == RealmFieldType.OBJECT) {
                    int i5 = onNavigationEvent + 37;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    str2 = "n";
                }
            } else {
                str2 = "n";
            }
            throw new IllegalArgumentException(String.format(Locale.US, "'%s' is not a%s '%s', but a%s '%s'.", str, obj2, realmFieldType, str2, columnType));
        }
        int i7 = onNavigationEvent + 29;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        this.proxyState.onExtraCallback().onTransact();
        String strIAuthTabCallback_Parcel = this.proxyState.onExtraCallback().IAuthTabCallback_Parcel();
        String strAsInterface = this.proxyState.IAuthTabCallback().getTable().asInterface();
        long objectKey = this.proxyState.IAuthTabCallback().getObjectKey();
        int iHashCode2 = 0;
        if (strIAuthTabCallback_Parcel != null) {
            iHashCode = strIAuthTabCallback_Parcel.hashCode();
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        } else {
            iHashCode = 0;
        }
        if (strAsInterface != null) {
            int i4 = IAuthTabCallback + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = strAsInterface.hashCode();
        }
        return ((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r4 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.proxyState.onExtraCallback().onTransact();
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i4 = IAuthTabCallback + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (getClass() == obj.getClass()) {
                DynamicRealmObject dynamicRealmObject = (DynamicRealmObject) obj;
                String strIAuthTabCallback_Parcel = this.proxyState.onExtraCallback().IAuthTabCallback_Parcel();
                String strIAuthTabCallback_Parcel2 = dynamicRealmObject.proxyState.onExtraCallback().IAuthTabCallback_Parcel();
                if (strIAuthTabCallback_Parcel == null ? strIAuthTabCallback_Parcel2 != null : !strIAuthTabCallback_Parcel.equals(strIAuthTabCallback_Parcel2)) {
                    return false;
                }
                String strAsInterface = this.proxyState.IAuthTabCallback().getTable().asInterface();
                String strAsInterface2 = dynamicRealmObject.proxyState.IAuthTabCallback().getTable().asInterface();
                if (strAsInterface != null) {
                    if (!strAsInterface.equals(strAsInterface2)) {
                        int i6 = onNavigationEvent + 51;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return false;
                    }
                    if (this.proxyState.IAuthTabCallback().getObjectKey() == dynamicRealmObject.proxyState.IAuthTabCallback().getObjectKey()) {
                        int i8 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    public String toString() {
        int i = 2 % 2;
        this.proxyState.onExtraCallback().onTransact();
        if (!this.proxyState.IAuthTabCallback().isValid()) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder(this.proxyState.IAuthTabCallback().getTable().IAuthTabCallback() + " = dynamic[");
        String[] strArrOnNavigationEvent = onNavigationEvent();
        int length = strArrOnNavigationEvent.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrOnNavigationEvent[i2];
            long columnKey = this.proxyState.IAuthTabCallback().getColumnKey(str);
            RealmFieldType columnType = this.proxyState.IAuthTabCallback().getColumnType(columnKey);
            sb.append("{");
            sb.append(str);
            sb.append(":");
            ?? r11 = "null";
            switch (AnonymousClass5.onExtraCallbackWithResult[columnType.ordinal()]) {
                case 1:
                    Boolean boolValueOf = r11;
                    if (!this.proxyState.IAuthTabCallback().isNull(columnKey)) {
                        int i3 = IAuthTabCallback + 9;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 == 0) {
                            Boolean.valueOf(this.proxyState.IAuthTabCallback().getBoolean(columnKey));
                            throw null;
                        }
                        boolValueOf = Boolean.valueOf(this.proxyState.IAuthTabCallback().getBoolean(columnKey));
                    }
                    sb.append(boolValueOf);
                    break;
                case 2:
                    Long lValueOf = r11;
                    if (!this.proxyState.IAuthTabCallback().isNull(columnKey)) {
                        int i4 = onNavigationEvent + 119;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        lValueOf = Long.valueOf(this.proxyState.IAuthTabCallback().getLong(columnKey));
                    }
                    sb.append(lValueOf);
                    break;
                case 3:
                    Float fValueOf = r11;
                    if (!this.proxyState.IAuthTabCallback().isNull(columnKey)) {
                        fValueOf = Float.valueOf(this.proxyState.IAuthTabCallback().getFloat(columnKey));
                    }
                    sb.append(fValueOf);
                    break;
                case 4:
                    Double dValueOf = r11;
                    if (!this.proxyState.IAuthTabCallback().isNull(columnKey)) {
                        int i6 = onNavigationEvent + 79;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        dValueOf = Double.valueOf(this.proxyState.IAuthTabCallback().getDouble(columnKey));
                    }
                    sb.append(dValueOf);
                    break;
                case 5:
                    sb.append(this.proxyState.IAuthTabCallback().getString(columnKey));
                    break;
                case 6:
                    sb.append(Arrays.toString(this.proxyState.IAuthTabCallback().getBinaryByteArray(columnKey)));
                    break;
                case 7:
                    Date date = r11;
                    if (!this.proxyState.IAuthTabCallback().isNull(columnKey)) {
                        date = this.proxyState.IAuthTabCallback().getDate(columnKey);
                    }
                    sb.append(date);
                    break;
                case 8:
                    Decimal128 decimal128 = r11;
                    if (!this.proxyState.IAuthTabCallback().isNull(columnKey)) {
                        int i8 = onNavigationEvent + 3;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        decimal128 = this.proxyState.IAuthTabCallback().getDecimal128(columnKey);
                    }
                    sb.append(decimal128);
                    break;
                case 9:
                    ObjectId objectId = r11;
                    if (!this.proxyState.IAuthTabCallback().isNull(columnKey)) {
                        objectId = this.proxyState.IAuthTabCallback().getObjectId(columnKey);
                    }
                    sb.append(objectId);
                    break;
                case 10:
                    RealmAny realmAnyIAuthTabCallback = r11;
                    if (!this.proxyState.IAuthTabCallback().isNull(columnKey)) {
                        realmAnyIAuthTabCallback = IAuthTabCallback(columnKey);
                    }
                    sb.append(realmAnyIAuthTabCallback);
                    break;
                case 11:
                    UUID uuid = r11;
                    if (!this.proxyState.IAuthTabCallback().isNull(columnKey)) {
                        int i10 = onNavigationEvent + 1;
                        IAuthTabCallback = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 43 / 0;
                            uuid = this.proxyState.IAuthTabCallback().getUUID(columnKey);
                        } else {
                            uuid = this.proxyState.IAuthTabCallback().getUUID(columnKey);
                        }
                    }
                    sb.append(uuid);
                    break;
                case 12:
                    String strIAuthTabCallback = r11;
                    if (!this.proxyState.IAuthTabCallback().isNullLink(columnKey)) {
                        int i12 = IAuthTabCallback + 37;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        strIAuthTabCallback = this.proxyState.IAuthTabCallback().getTable().asInterface(columnKey).IAuthTabCallback();
                    }
                    sb.append(strIAuthTabCallback);
                    break;
                case 13:
                    sb.append(String.format(Locale.US, "RealmList<%s>[%s]", this.proxyState.IAuthTabCallback().getTable().asInterface(columnKey).IAuthTabCallback(), Long.valueOf(this.proxyState.IAuthTabCallback().getModelList(columnKey).onWarmupCompleted())));
                    break;
                case 14:
                    sb.append(String.format(Locale.US, "RealmDictionary<Long>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueMap(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 15:
                    sb.append(String.format(Locale.US, "RealmDictionary<Boolean>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueMap(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 16:
                    sb.append(String.format(Locale.US, "RealmDictionary<String>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueMap(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 17:
                    sb.append(String.format(Locale.US, "RealmDictionary<byte[]>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueMap(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 18:
                    sb.append(String.format(Locale.US, "RealmDictionary<Date>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueMap(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 19:
                    sb.append(String.format(Locale.US, "RealmDictionary<Float>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueMap(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 20:
                    sb.append(String.format(Locale.US, "RealmDictionary<Double>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueMap(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 21:
                    sb.append(String.format(Locale.US, "RealmDictionary<Decimal128>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueMap(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 22:
                    sb.append(String.format(Locale.US, "RealmDictionary<ObjectId>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueMap(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 23:
                    sb.append(String.format(Locale.US, "RealmDictionary<UUID>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueMap(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 24:
                    sb.append(String.format(Locale.US, "RealmDictionary<RealmAny>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueMap(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 25:
                    sb.append(String.format(Locale.US, "RealmDictionary<%s>[%s]", this.proxyState.IAuthTabCallback().getTable().asInterface(columnKey).IAuthTabCallback(), Long.valueOf(this.proxyState.IAuthTabCallback().getModelMap(columnKey).onWarmupCompleted())));
                    break;
                case 26:
                    sb.append(String.format(Locale.US, "RealmSet<Long>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueSet(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 27:
                    sb.append(String.format(Locale.US, "RealmSet<Boolean>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueSet(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 28:
                    sb.append(String.format(Locale.US, "RealmSet<String>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueSet(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 29:
                    sb.append(String.format(Locale.US, "RealmSet<byte[]>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueSet(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 30:
                    sb.append(String.format(Locale.US, "RealmSet<Date>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueSet(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 31:
                    sb.append(String.format(Locale.US, "RealmSet<Float>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueSet(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 32:
                    sb.append(String.format(Locale.US, "RealmSet<Double>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueSet(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 33:
                    sb.append(String.format(Locale.US, "RealmSet<Decimal128>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueSet(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 34:
                    sb.append(String.format(Locale.US, "RealmSet<ObjectId>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueSet(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 35:
                    sb.append(String.format(Locale.US, "RealmSet<UUID>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueSet(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 36:
                    sb.append(String.format(Locale.US, "RealmSet<%s>[%s]", this.proxyState.IAuthTabCallback().getTable().asInterface(columnKey).IAuthTabCallback(), Long.valueOf(this.proxyState.IAuthTabCallback().getModelSet(columnKey).onWarmupCompleted())));
                    break;
                case 37:
                    sb.append(String.format(Locale.US, "RealmSet<RealmAny>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueSet(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 38:
                default:
                    sb.append("?");
                    break;
                case 39:
                    sb.append(String.format(Locale.US, "RealmList<Long>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueList(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 40:
                    sb.append(String.format(Locale.US, "RealmList<Boolean>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueList(columnKey, columnType).onWarmupCompleted())));
                    int i14 = onNavigationEvent + 3;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    break;
                case 41:
                    sb.append(String.format(Locale.US, "RealmList<String>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueList(columnKey, columnType).onWarmupCompleted())));
                    break;
                case R.styleable.Chip_shapeAppearance /* 42 */:
                    sb.append(String.format(Locale.US, "RealmList<byte[]>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueList(columnKey, columnType).onWarmupCompleted())));
                    break;
                case R.styleable.Chip_shapeAppearanceOverlay /* 43 */:
                    sb.append(String.format(Locale.US, "RealmList<Date>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueList(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 44:
                    sb.append(String.format(Locale.US, "RealmList<Float>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueList(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 45:
                    sb.append(String.format(Locale.US, "RealmList<Double>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueList(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 46:
                    sb.append(String.format(Locale.US, "RealmList<Decimal128>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueList(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 47:
                    sb.append(String.format(Locale.US, "RealmList<ObjectId>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueList(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 48:
                    sb.append(String.format(Locale.US, "RealmList<UUID>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueList(columnKey, columnType).onWarmupCompleted())));
                    break;
                case 49:
                    sb.append(String.format(Locale.US, "RealmList<RealmAny>[%s]", Long.valueOf(this.proxyState.IAuthTabCallback().getValueList(columnKey, columnType).onWarmupCompleted())));
                    break;
            }
            sb.append("},");
        }
        sb.replace(sb.length() - 1, sb.length(), _UrlKt.FRAGMENT_ENCODE_SET);
        sb.append("]");
        return sb.toString();
    }

    private RealmAny IAuthTabCallback(long j) {
        int i = 2 % 2;
        RealmAny realmAny = new RealmAny(RealmAnyOperator.onExtraCallbackWithResult(this.proxyState.onExtraCallback(), this.proxyState.IAuthTabCallback().getNativeRealmAny(j)));
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return realmAny;
    }

    @Override // io.realm.internal.RealmObjectProxy
    public access11500 cb_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        access11500<DynamicRealmObject> access11500Var = this.proxyState;
        int i5 = i2 + 113;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return access11500Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0045 A[PHI: r1
      0x0045: PHI (r1v8 io.realm.RealmObjectSchema) = (r1v7 io.realm.RealmObjectSchema), (r1v16 io.realm.RealmObjectSchema) binds: [B:8:0x0043, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onTransact(String str) {
        RealmObjectSchema realmObjectSchemaOnTransact;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            realmObjectSchemaOnTransact = this.proxyState.onExtraCallback().access000().onTransact(onExtraCallbackWithResult());
            int i3 = 37 / 0;
            if (!(!realmObjectSchemaOnTransact.onExtraCallback())) {
                if (realmObjectSchemaOnTransact.onWarmupCompleted().equals(str)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Primary key field '%s' cannot be changed after object was created.", str));
                }
            }
        } else {
            realmObjectSchemaOnTransact = this.proxyState.onExtraCallback().access000().onTransact(onExtraCallbackWithResult());
            if (realmObjectSchemaOnTransact.onExtraCallback()) {
            }
        }
        int i4 = IAuthTabCallback + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
