package o;

import io.realm.DynamicRealmObject;
import io.realm.RealmFieldType;
import io.realm.RealmModel;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.Util;
import java.util.Date;
import java.util.Locale;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class hasArmMteMetadata extends RealmObjectSchema {
    hasArmMteMetadata(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, RealmSchema realmSchema, Table table) {
        super(tombstoneProtosLogMessageOrBuilder, realmSchema, table, new RealmObjectSchema.DynamicColumnIndices(table));
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onExtraCallback(String str, Class<?> cls, clearMemory... clearmemoryArr) throws Exception {
        RealmObjectSchema.FieldMetaData fieldMetaData = RealmObjectSchema.onNavigationEvent.get(cls);
        if (fieldMetaData == null) {
            if (RealmObjectSchema.onExtraCallback.containsKey(cls)) {
                throw new IllegalArgumentException("Use addRealmObjectField() instead to add fields that link to other RealmObjects: " + str);
            }
            if (RealmModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format(Locale.US, "Use 'addRealmObjectField()' instead to add fields that link to other RealmObjects: %s(%s)", str, cls));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Realm doesn't support this field type: %s(%s)", str, cls));
        }
        if (onExtraCallbackWithResult(clearmemoryArr, clearMemory.PRIMARY_KEY)) {
            asBinder();
            onWarmupCompleted(str, cls);
        }
        access000(str);
        boolean z = fieldMetaData.onWarmupCompleted;
        if (onExtraCallbackWithResult(clearmemoryArr, clearMemory.REQUIRED)) {
            z = false;
        }
        long jOnNavigationEvent = this.asBinder.onNavigationEvent(fieldMetaData.IAuthTabCallback, str, z);
        try {
            onWarmupCompleted(str, clearmemoryArr);
            return this;
        } catch (Exception e) {
            this.asBinder.access100(jOnNavigationEvent);
            throw e;
        }
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onWarmupCompleted(String str, RealmObjectSchema realmObjectSchema) {
        RealmObjectSchema.onNavigationEvent(str);
        access100(str);
        this.asBinder.onExtraCallbackWithResult(RealmFieldType.OBJECT, str, this.IAuthTabCallbackDefault.IAuthTabCallbackDefault.getTable(Table.onExtraCallbackWithResult(realmObjectSchema.onExtraCallbackWithResult())));
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onExtraCallbackWithResult(String str, RealmObjectSchema realmObjectSchema) {
        RealmObjectSchema.onNavigationEvent(str);
        access100(str);
        this.asBinder.onExtraCallbackWithResult(RealmFieldType.LIST, str, this.IAuthTabCallbackDefault.IAuthTabCallbackDefault.getTable(Table.onExtraCallbackWithResult(realmObjectSchema.onExtraCallbackWithResult())));
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onNavigationEvent(String str, Class<?> cls) {
        RealmObjectSchema.onNavigationEvent(str);
        access100(str);
        RealmObjectSchema.FieldMetaData fieldMetaData = RealmObjectSchema.onNavigationEvent.get(cls);
        if (fieldMetaData == null) {
            if (cls.equals(RealmObjectSchema.class) || RealmModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Use 'addRealmListField(String name, RealmObjectSchema schema)' instead to add lists that link to other RealmObjects: " + str);
            }
            throw new IllegalArgumentException(String.format(Locale.US, "RealmList does not support lists with this type: %s(%s)", str, cls));
        }
        this.asBinder.onNavigationEvent(fieldMetaData.onExtraCallback, str, fieldMetaData.onWarmupCompleted);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema IAuthTabCallback(String str) {
        this.IAuthTabCallbackDefault.IAuthTabCallbackDefault();
        RealmObjectSchema.onNavigationEvent(str);
        if (!IAuthTabCallbackStub(str)) {
            throw new IllegalStateException(str + " does not exist.");
        }
        long jIAuthTabCallbackDefault = IAuthTabCallbackDefault(str);
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (str.equals(OsObjectStore.onExtraCallback(this.IAuthTabCallbackDefault.IAuthTabCallbackDefault, strOnExtraCallbackWithResult))) {
            OsObjectStore.IAuthTabCallback(this.IAuthTabCallbackDefault.IAuthTabCallbackDefault, strOnExtraCallbackWithResult, str);
        }
        this.asBinder.access100(jIAuthTabCallbackDefault);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onExtraCallback(String str, String str2) {
        this.IAuthTabCallbackDefault.IAuthTabCallbackDefault();
        RealmObjectSchema.onNavigationEvent(str);
        asInterface(str);
        RealmObjectSchema.onNavigationEvent(str2);
        access100(str2);
        this.asBinder.onExtraCallbackWithResult(IAuthTabCallbackDefault(str), str2);
        return this;
    }

    public RealmObjectSchema onExtraCallbackWithResult(String str) {
        RealmObjectSchema.onNavigationEvent(str);
        asInterface(str);
        long jIAuthTabCallbackDefault = IAuthTabCallbackDefault(str);
        if (this.asBinder.IAuthTabCallbackStubProxy(jIAuthTabCallbackDefault)) {
            throw new IllegalStateException(str + " already has an index.");
        }
        this.asBinder.onWarmupCompleted(jIAuthTabCallbackDefault);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onExtraCallback(String str) {
        asBinder();
        RealmObjectSchema.onNavigationEvent(str);
        asInterface(str);
        String strOnExtraCallback = OsObjectStore.onExtraCallback(this.IAuthTabCallbackDefault.IAuthTabCallbackDefault, onExtraCallbackWithResult());
        if (strOnExtraCallback != null) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Field '%s' has been already defined as primary key.", strOnExtraCallback));
        }
        long jIAuthTabCallbackDefault = IAuthTabCallbackDefault(str);
        RealmFieldType realmFieldTypeOnTransact = onTransact(str);
        onNavigationEvent(str, realmFieldTypeOnTransact);
        if (realmFieldTypeOnTransact != RealmFieldType.STRING && !this.asBinder.IAuthTabCallbackStubProxy(jIAuthTabCallbackDefault)) {
            this.asBinder.onWarmupCompleted(jIAuthTabCallbackDefault);
        }
        OsObjectStore.IAuthTabCallback(this.IAuthTabCallbackDefault.IAuthTabCallbackDefault, onExtraCallbackWithResult(), str);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onNavigationEvent() {
        this.IAuthTabCallbackDefault.IAuthTabCallbackDefault();
        String strOnExtraCallback = OsObjectStore.onExtraCallback(this.IAuthTabCallbackDefault.IAuthTabCallbackDefault, onExtraCallbackWithResult());
        if (strOnExtraCallback == null) {
            throw new IllegalStateException(onExtraCallbackWithResult() + " doesn't have a primary key.");
        }
        long jOnWarmupCompleted = this.asBinder.onWarmupCompleted(strOnExtraCallback);
        if (this.asBinder.IAuthTabCallbackStubProxy(jOnWarmupCompleted)) {
            this.asBinder.getInterfaceDescriptor(jOnWarmupCompleted);
        }
        OsObjectStore.IAuthTabCallback(this.IAuthTabCallbackDefault.IAuthTabCallbackDefault, onExtraCallbackWithResult(), null);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onWarmupCompleted(String str, boolean z) {
        long jOnWarmupCompleted = this.asBinder.onWarmupCompleted(str);
        boolean zIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(str);
        RealmFieldType realmFieldTypeIAuthTabCallbackDefault = this.asBinder.IAuthTabCallbackDefault(jOnWarmupCompleted);
        if (realmFieldTypeIAuthTabCallbackDefault == RealmFieldType.OBJECT) {
            throw new IllegalArgumentException("Cannot modify the required state for RealmObject references: " + str);
        }
        if (realmFieldTypeIAuthTabCallbackDefault == RealmFieldType.LIST) {
            throw new IllegalArgumentException("Cannot modify the required state for RealmList references: " + str);
        }
        if (z && zIAuthTabCallbackStubProxy) {
            throw new IllegalStateException("Field is already required: " + str);
        }
        if (!z && !zIAuthTabCallbackStubProxy) {
            throw new IllegalStateException("Field is already nullable: " + str);
        }
        if (z) {
            try {
                this.asBinder.onExtraCallbackWithResult(jOnWarmupCompleted);
                return this;
            } catch (RuntimeException e) {
                if (e.getMessage().contains("has null value(s) in property")) {
                    throw new IllegalStateException(e.getMessage());
                }
                throw e;
            }
        }
        this.asBinder.onNavigationEvent(jOnWarmupCompleted);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onExtraCallbackWithResult(String str, boolean z) {
        onWarmupCompleted(str, !z);
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onExtraCallbackWithResult(RealmObjectSchema.Function function) {
        if (function != null) {
            OsResults osResultsOnWarmupCompleted = OsResults.onExtraCallback(this.IAuthTabCallbackDefault.IAuthTabCallbackDefault, this.asBinder.access100()).onWarmupCompleted();
            long jIAuthTabCallbackDefault = osResultsOnWarmupCompleted.IAuthTabCallbackDefault();
            if (jIAuthTabCallbackDefault > 2147483647L) {
                throw new UnsupportedOperationException("Too many results to iterate: " + jIAuthTabCallbackDefault);
            }
            int iIAuthTabCallbackDefault = (int) osResultsOnWarmupCompleted.IAuthTabCallbackDefault();
            for (int i = 0; i < iIAuthTabCallbackDefault; i++) {
                DynamicRealmObject dynamicRealmObject = new DynamicRealmObject(this.IAuthTabCallbackDefault, new CheckedRow(osResultsOnWarmupCompleted.onNavigationEvent(i)));
                if (dynamicRealmObject.ax_()) {
                    function.apply(dynamicRealmObject);
                }
            }
        }
        return this;
    }

    @Override // io.realm.RealmObjectSchema
    public String onWarmupCompleted(String str) {
        String strIAuthTabCallback = this.asBinder.asInterface(IAuthTabCallbackDefault(str)).IAuthTabCallback();
        if (Util.onNavigationEvent(strIAuthTabCallback)) {
            throw new IllegalArgumentException(String.format("Property '%s' not found.", str));
        }
        return strIAuthTabCallback;
    }

    private void onWarmupCompleted(String str, clearMemory[] clearmemoryArr) {
        if (clearmemoryArr != null) {
            boolean z = false;
            try {
                if (clearmemoryArr.length > 0) {
                    if (onExtraCallbackWithResult(clearmemoryArr, clearMemory.INDEXED)) {
                        onExtraCallbackWithResult(str);
                        z = true;
                    }
                    if (onExtraCallbackWithResult(clearmemoryArr, clearMemory.PRIMARY_KEY)) {
                        onExtraCallback(str);
                    }
                }
            } catch (Exception e) {
                long jIAuthTabCallbackDefault = IAuthTabCallbackDefault(str);
                if (z) {
                    this.asBinder.getInterfaceDescriptor(jIAuthTabCallbackDefault);
                }
                throw ((RuntimeException) e);
            }
        }
    }

    static boolean onExtraCallbackWithResult(clearMemory[] clearmemoryArr, clearMemory clearmemory) {
        if (clearmemoryArr != null && clearmemoryArr.length != 0) {
            for (clearMemory clearmemory2 : clearmemoryArr) {
                if (clearmemory2 == clearmemory) {
                    return true;
                }
            }
        }
        return false;
    }

    private void access000(String str) {
        RealmObjectSchema.onNavigationEvent(str);
        access100(str);
    }

    private void access100(String str) {
        if (this.asBinder.onWarmupCompleted(str) == -1) {
            return;
        }
        throw new IllegalArgumentException("Field already exists in '" + onExtraCallbackWithResult() + "': " + str);
    }

    private void asBinder() {
        if (this.IAuthTabCallbackDefault.onExtraCallbackWithResult.readTypedObject()) {
            throw new UnsupportedOperationException("'addPrimaryKey' is not supported by synced Realms.");
        }
    }

    private void onWarmupCompleted(String str, Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            onNavigationEvent(str, RealmFieldType.BOOLEAN);
        }
        if (cls == Date.class) {
            onNavigationEvent(str, RealmFieldType.DATE);
        }
    }

    /* renamed from: o.hasArmMteMetadata$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[RealmFieldType.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void onNavigationEvent(String str, RealmFieldType realmFieldType) {
        int i = AnonymousClass3.onNavigationEvent[realmFieldType.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Boolean fields cannot be marked as primary keys: " + str);
        }
        if (i != 2) {
            return;
        }
        throw new IllegalArgumentException("Date fields cannot be marked as primary keys: " + str);
    }
}
