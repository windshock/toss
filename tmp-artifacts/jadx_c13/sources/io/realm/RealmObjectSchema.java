package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.Table;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import o.TombstoneProtosLogMessageOrBuilder;
import o.TombstoneProtosMemoryErrorType1;
import o.clearMemory;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class RealmObjectSchema {
    static final Map<Class<?>, FieldMetaData> IAuthTabCallback;
    public static final Map<Class<?>, FieldMetaData> onExtraCallback;
    static final Map<Class<?>, FieldMetaData> onExtraCallbackWithResult;
    public static final Map<Class<?>, FieldMetaData> onNavigationEvent;
    public final TombstoneProtosLogMessageOrBuilder IAuthTabCallbackDefault;
    public final Table asBinder;
    final RealmSchema asInterface;
    public final TombstoneProtosMemoryErrorType1 onWarmupCompleted;

    public abstract RealmObjectSchema IAuthTabCallback(String str);

    public abstract RealmObjectSchema onExtraCallback(String str);

    public abstract RealmObjectSchema onExtraCallback(String str, Class<?> cls, clearMemory... clearmemoryArr);

    public abstract RealmObjectSchema onExtraCallback(String str, String str2);

    public abstract RealmObjectSchema onExtraCallbackWithResult(Function function);

    public abstract RealmObjectSchema onExtraCallbackWithResult(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema onExtraCallbackWithResult(String str, boolean z);

    public abstract RealmObjectSchema onNavigationEvent();

    public abstract RealmObjectSchema onNavigationEvent(String str, Class<?> cls);

    public abstract RealmObjectSchema onWarmupCompleted(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema onWarmupCompleted(String str, boolean z);

    public abstract String onWarmupCompleted(String str);

    static {
        HashMap map = new HashMap();
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        map.put(String.class, new FieldMetaData(realmFieldType, RealmFieldType.STRING_LIST, true));
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        RealmFieldType realmFieldType3 = RealmFieldType.INTEGER_LIST;
        FieldMetaData fieldMetaData = new FieldMetaData(realmFieldType2, realmFieldType3, false);
        Class cls = Short.TYPE;
        map.put(cls, fieldMetaData);
        map.put(Short.class, new FieldMetaData(realmFieldType2, realmFieldType3, true));
        FieldMetaData fieldMetaData2 = new FieldMetaData(realmFieldType2, realmFieldType3, false);
        Class cls2 = Integer.TYPE;
        map.put(cls2, fieldMetaData2);
        map.put(Integer.class, new FieldMetaData(realmFieldType2, realmFieldType3, true));
        FieldMetaData fieldMetaData3 = new FieldMetaData(realmFieldType2, realmFieldType3, false);
        Class cls3 = Long.TYPE;
        map.put(cls3, fieldMetaData3);
        map.put(Long.class, new FieldMetaData(realmFieldType2, realmFieldType3, true));
        RealmFieldType realmFieldType4 = RealmFieldType.FLOAT;
        RealmFieldType realmFieldType5 = RealmFieldType.FLOAT_LIST;
        FieldMetaData fieldMetaData4 = new FieldMetaData(realmFieldType4, realmFieldType5, false);
        Class cls4 = Float.TYPE;
        map.put(cls4, fieldMetaData4);
        map.put(Float.class, new FieldMetaData(realmFieldType4, realmFieldType5, true));
        RealmFieldType realmFieldType6 = RealmFieldType.DOUBLE;
        RealmFieldType realmFieldType7 = RealmFieldType.DOUBLE_LIST;
        FieldMetaData fieldMetaData5 = new FieldMetaData(realmFieldType6, realmFieldType7, false);
        Class cls5 = Double.TYPE;
        map.put(cls5, fieldMetaData5);
        map.put(Double.class, new FieldMetaData(realmFieldType6, realmFieldType7, true));
        RealmFieldType realmFieldType8 = RealmFieldType.BOOLEAN;
        RealmFieldType realmFieldType9 = RealmFieldType.BOOLEAN_LIST;
        FieldMetaData fieldMetaData6 = new FieldMetaData(realmFieldType8, realmFieldType9, false);
        Class cls6 = Boolean.TYPE;
        map.put(cls6, fieldMetaData6);
        map.put(Boolean.class, new FieldMetaData(realmFieldType8, realmFieldType9, true));
        FieldMetaData fieldMetaData7 = new FieldMetaData(realmFieldType2, realmFieldType3, false);
        Class cls7 = Byte.TYPE;
        map.put(cls7, fieldMetaData7);
        map.put(Byte.class, new FieldMetaData(realmFieldType2, realmFieldType3, true));
        RealmFieldType realmFieldType10 = RealmFieldType.BINARY;
        map.put(byte[].class, new FieldMetaData(realmFieldType10, RealmFieldType.BINARY_LIST, true));
        RealmFieldType realmFieldType11 = RealmFieldType.DATE;
        map.put(Date.class, new FieldMetaData(realmFieldType11, RealmFieldType.DATE_LIST, true));
        RealmFieldType realmFieldType12 = RealmFieldType.OBJECT_ID;
        map.put(ObjectId.class, new FieldMetaData(realmFieldType12, RealmFieldType.OBJECT_ID_LIST, true));
        RealmFieldType realmFieldType13 = RealmFieldType.DECIMAL128;
        map.put(Decimal128.class, new FieldMetaData(realmFieldType13, RealmFieldType.DECIMAL128_LIST, true));
        RealmFieldType realmFieldType14 = RealmFieldType.UUID;
        map.put(UUID.class, new FieldMetaData(realmFieldType14, RealmFieldType.UUID_LIST, true));
        RealmFieldType realmFieldType15 = RealmFieldType.MIXED;
        map.put(RealmAny.class, new FieldMetaData(realmFieldType15, RealmFieldType.MIXED_LIST, true));
        onNavigationEvent = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put(String.class, new FieldMetaData(realmFieldType, RealmFieldType.STRING_TO_STRING_MAP, true));
        RealmFieldType realmFieldType16 = RealmFieldType.STRING_TO_INTEGER_MAP;
        map2.put(cls, new FieldMetaData(realmFieldType2, realmFieldType16, false));
        map2.put(Short.class, new FieldMetaData(realmFieldType2, realmFieldType16, true));
        map2.put(cls2, new FieldMetaData(realmFieldType2, realmFieldType16, false));
        map2.put(Integer.class, new FieldMetaData(realmFieldType2, realmFieldType16, true));
        map2.put(cls3, new FieldMetaData(realmFieldType2, realmFieldType16, false));
        map2.put(Long.class, new FieldMetaData(realmFieldType2, realmFieldType16, true));
        RealmFieldType realmFieldType17 = RealmFieldType.STRING_TO_FLOAT_MAP;
        map2.put(cls4, new FieldMetaData(realmFieldType4, realmFieldType17, false));
        map2.put(Float.class, new FieldMetaData(realmFieldType4, realmFieldType17, true));
        RealmFieldType realmFieldType18 = RealmFieldType.STRING_TO_DOUBLE_MAP;
        map2.put(cls5, new FieldMetaData(realmFieldType6, realmFieldType18, false));
        map2.put(Double.class, new FieldMetaData(realmFieldType6, realmFieldType18, true));
        RealmFieldType realmFieldType19 = RealmFieldType.STRING_TO_BOOLEAN_MAP;
        map2.put(cls6, new FieldMetaData(realmFieldType8, realmFieldType19, false));
        map2.put(Boolean.class, new FieldMetaData(realmFieldType8, realmFieldType19, true));
        map2.put(cls7, new FieldMetaData(realmFieldType2, realmFieldType16, false));
        map2.put(Byte.class, new FieldMetaData(realmFieldType2, realmFieldType16, true));
        map2.put(byte[].class, new FieldMetaData(realmFieldType10, RealmFieldType.STRING_TO_BINARY_MAP, true));
        map2.put(Date.class, new FieldMetaData(realmFieldType11, RealmFieldType.STRING_TO_DATE_MAP, true));
        map2.put(ObjectId.class, new FieldMetaData(realmFieldType12, RealmFieldType.STRING_TO_OBJECT_ID_MAP, true));
        map2.put(Decimal128.class, new FieldMetaData(realmFieldType13, RealmFieldType.STRING_TO_DECIMAL128_MAP, true));
        map2.put(UUID.class, new FieldMetaData(realmFieldType14, RealmFieldType.STRING_TO_UUID_MAP, true));
        map2.put(RealmAny.class, new FieldMetaData(realmFieldType15, RealmFieldType.STRING_TO_MIXED_MAP, true));
        onExtraCallbackWithResult = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        map3.put(String.class, new FieldMetaData(realmFieldType, RealmFieldType.STRING_SET, true));
        RealmFieldType realmFieldType20 = RealmFieldType.INTEGER_SET;
        map3.put(cls, new FieldMetaData(realmFieldType2, realmFieldType20, false));
        map3.put(Short.class, new FieldMetaData(realmFieldType2, realmFieldType20, true));
        map3.put(cls2, new FieldMetaData(realmFieldType2, realmFieldType20, false));
        map3.put(Integer.class, new FieldMetaData(realmFieldType2, realmFieldType20, true));
        map3.put(cls3, new FieldMetaData(realmFieldType2, realmFieldType20, false));
        map3.put(Long.class, new FieldMetaData(realmFieldType2, realmFieldType20, true));
        RealmFieldType realmFieldType21 = RealmFieldType.FLOAT_SET;
        map3.put(cls4, new FieldMetaData(realmFieldType4, realmFieldType21, false));
        map3.put(Float.class, new FieldMetaData(realmFieldType4, realmFieldType21, true));
        RealmFieldType realmFieldType22 = RealmFieldType.DOUBLE_SET;
        map3.put(cls5, new FieldMetaData(realmFieldType6, realmFieldType22, false));
        map3.put(Double.class, new FieldMetaData(realmFieldType6, realmFieldType22, true));
        RealmFieldType realmFieldType23 = RealmFieldType.BOOLEAN_SET;
        map3.put(cls6, new FieldMetaData(realmFieldType8, realmFieldType23, false));
        map3.put(Boolean.class, new FieldMetaData(realmFieldType8, realmFieldType23, true));
        map3.put(cls7, new FieldMetaData(realmFieldType2, realmFieldType20, false));
        map3.put(Byte.class, new FieldMetaData(realmFieldType2, realmFieldType20, true));
        map3.put(byte[].class, new FieldMetaData(realmFieldType10, RealmFieldType.BINARY_SET, true));
        map3.put(Date.class, new FieldMetaData(realmFieldType11, RealmFieldType.DATE_SET, true));
        map3.put(ObjectId.class, new FieldMetaData(realmFieldType12, RealmFieldType.OBJECT_ID_SET, true));
        map3.put(Decimal128.class, new FieldMetaData(realmFieldType13, RealmFieldType.DECIMAL128_SET, true));
        map3.put(UUID.class, new FieldMetaData(realmFieldType14, RealmFieldType.UUID_SET, true));
        map3.put(RealmAny.class, new FieldMetaData(realmFieldType15, RealmFieldType.MIXED_SET, true));
        IAuthTabCallback = Collections.unmodifiableMap(map3);
        HashMap map4 = new HashMap();
        map4.put(RealmObject.class, new FieldMetaData(RealmFieldType.OBJECT, null, false));
        map4.put(RealmList.class, new FieldMetaData(RealmFieldType.LIST, null, false));
        map4.put(RealmDictionary.class, new FieldMetaData(RealmFieldType.STRING_TO_LINK_MAP, null, false));
        map4.put(RealmSet.class, new FieldMetaData(RealmFieldType.LINK_SET, null, false));
        onExtraCallback = Collections.unmodifiableMap(map4);
    }

    public RealmObjectSchema(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, RealmSchema realmSchema, Table table, TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1) {
        this.asInterface = realmSchema;
        this.IAuthTabCallbackDefault = tombstoneProtosLogMessageOrBuilder;
        this.asBinder = table;
        this.onWarmupCompleted = tombstoneProtosMemoryErrorType1;
    }

    public String onExtraCallbackWithResult() {
        return this.asBinder.IAuthTabCallback();
    }

    public boolean IAuthTabCallbackStub(String str) {
        return this.asBinder.onWarmupCompleted(str) != -1;
    }

    public boolean IAuthTabCallbackStubProxy(String str) {
        return !this.asBinder.IAuthTabCallback_Parcel(IAuthTabCallbackDefault(str));
    }

    public boolean asBinder(String str) {
        return this.asBinder.IAuthTabCallback_Parcel(IAuthTabCallbackDefault(str));
    }

    public boolean getInterfaceDescriptor(String str) {
        asInterface(str);
        return str.equals(OsObjectStore.onExtraCallback(this.IAuthTabCallbackDefault.IAuthTabCallbackDefault, onExtraCallbackWithResult()));
    }

    public boolean onExtraCallback() {
        return OsObjectStore.onExtraCallback(this.IAuthTabCallbackDefault.IAuthTabCallbackDefault, onExtraCallbackWithResult()) != null;
    }

    public String onWarmupCompleted() {
        String strOnExtraCallback = OsObjectStore.onExtraCallback(this.IAuthTabCallbackDefault.IAuthTabCallbackDefault, onExtraCallbackWithResult());
        if (strOnExtraCallback != null) {
            return strOnExtraCallback;
        }
        throw new IllegalStateException(onExtraCallbackWithResult() + " doesn't have a primary key.");
    }

    public RealmFieldType onTransact(String str) {
        return this.asBinder.IAuthTabCallbackDefault(IAuthTabCallbackDefault(str));
    }

    public boolean asInterface() {
        return this.asBinder.asBinder();
    }

    public void IAuthTabCallback(boolean z) {
        IAuthTabCallback(z, false);
    }

    public void IAuthTabCallback(boolean z, boolean z2) {
        if (onExtraCallback()) {
            throw new IllegalStateException("Embedded classes cannot have primary keys. This class has a primary key defined so cannot be marked as embedded: " + onExtraCallbackWithResult());
        }
        if (!this.asBinder.onExtraCallbackWithResult(z, z2) && z) {
            throw new IllegalStateException("The class could not be marked as embedded as some objects of this type break some of the Embedded Objects invariants. In order to convert all objects to be embedded, they must have one and exactly one parent objectpointing to them.");
        }
    }

    public boolean onWarmupCompleted(RealmFieldType realmFieldType) {
        return realmFieldType == RealmFieldType.OBJECT || realmFieldType == RealmFieldType.LIST;
    }

    Table IAuthTabCallback() {
        return this.asBinder;
    }

    public static void onNavigationEvent(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Field name can not be null or empty");
        }
        if (str.contains(".")) {
            throw new IllegalArgumentException("Field name can not contain '.'");
        }
        if (str.length() > 63) {
            throw new IllegalArgumentException("Field name is currently limited to max 63 characters.");
        }
    }

    public void asInterface(String str) {
        if (this.asBinder.onWarmupCompleted(str) != -1) {
            return;
        }
        throw new IllegalArgumentException("Field name doesn't exist on object '" + onExtraCallbackWithResult() + "': " + str);
    }

    public long IAuthTabCallbackDefault(String str) {
        long jOnWarmupCompleted = this.asBinder.onWarmupCompleted(str);
        if (jOnWarmupCompleted != -1) {
            return jOnWarmupCompleted;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field name '%s' does not exist on schema for '%s'", str, onExtraCallbackWithResult()));
    }

    public static final class DynamicColumnIndices extends TombstoneProtosMemoryErrorType1 {
        private final Table onNavigationEvent;

        public DynamicColumnIndices(Table table) {
            super((TombstoneProtosMemoryErrorType1) null, false);
            this.onNavigationEvent = table;
        }

        @Override // o.TombstoneProtosMemoryErrorType1
        public TombstoneProtosMemoryErrorType1.IAuthTabCallback onExtraCallback(String str) {
            throw new UnsupportedOperationException("DynamicColumnIndices do not support 'getColumnDetails'");
        }

        @Override // o.TombstoneProtosMemoryErrorType1
        public void onExtraCallback(TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
        }

        @Override // o.TombstoneProtosMemoryErrorType1
        public void onWarmupCompleted(TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1, TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType12) {
            throw new UnsupportedOperationException("DynamicColumnIndices cannot copy");
        }
    }

    public static final class FieldMetaData {
        public final RealmFieldType IAuthTabCallback;
        public final RealmFieldType onExtraCallback;
        public final boolean onWarmupCompleted;

        FieldMetaData(RealmFieldType realmFieldType, @Nullable RealmFieldType realmFieldType2, boolean z) {
            this.IAuthTabCallback = realmFieldType;
            this.onExtraCallback = realmFieldType2;
            this.onWarmupCompleted = z;
        }
    }
}
