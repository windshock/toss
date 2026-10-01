package io.realm;

import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.objectstore.OsKeyPathMapping;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import o.TombstoneProtosLogMessageOrBuilder;
import o.TombstoneProtosMemoryErrorOrBuilder;
import o.TombstoneProtosMemoryErrorType1;
import o.setMemory;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class RealmSchema {
    private final TombstoneProtosMemoryErrorOrBuilder onExtraCallbackWithResult;
    public final TombstoneProtosLogMessageOrBuilder onWarmupCompleted;
    private final Map<String, Table> IAuthTabCallbackDefault = new HashMap();
    private final Map<Class<? extends RealmModel>, Table> onNavigationEvent = new HashMap();
    private final Map<Class<? extends RealmModel>, RealmObjectSchema> IAuthTabCallback = new HashMap();
    private final Map<String, RealmObjectSchema> onExtraCallback = new HashMap();
    private OsKeyPathMapping IAuthTabCallbackStub = null;

    public abstract Set<RealmObjectSchema> IAuthTabCallback();

    public abstract RealmObjectSchema onExtraCallback(String str);

    public abstract void onExtraCallbackWithResult(String str);

    @Nullable
    public abstract RealmObjectSchema onNavigationEvent(String str);

    public RealmSchema(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, @Nullable TombstoneProtosMemoryErrorOrBuilder tombstoneProtosMemoryErrorOrBuilder) {
        this.onWarmupCompleted = tombstoneProtosLogMessageOrBuilder;
        this.onExtraCallbackWithResult = tombstoneProtosMemoryErrorOrBuilder;
    }

    public boolean onWarmupCompleted(String str) {
        return this.onWarmupCompleted.getInterfaceDescriptor().hasTable(Table.onExtraCallbackWithResult(str));
    }

    public void onNavigationEvent(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException(str2);
        }
    }

    public Table IAuthTabCallbackDefault(String str) {
        String strOnExtraCallbackWithResult = Table.onExtraCallbackWithResult(str);
        Table table = this.IAuthTabCallbackDefault.get(strOnExtraCallbackWithResult);
        if (table != null) {
            return table;
        }
        Table table2 = this.onWarmupCompleted.getInterfaceDescriptor().getTable(strOnExtraCallbackWithResult);
        this.IAuthTabCallbackDefault.put(strOnExtraCallbackWithResult, table2);
        return table2;
    }

    public Table onNavigationEvent(Class<? extends RealmModel> cls) {
        Table table = this.onNavigationEvent.get(cls);
        if (table != null) {
            return table;
        }
        Class<? extends RealmModel> clsOnExtraCallbackWithResult = Util.onExtraCallbackWithResult(cls);
        if (onNavigationEvent(clsOnExtraCallbackWithResult, cls)) {
            table = this.onNavigationEvent.get(clsOnExtraCallbackWithResult);
        }
        if (table == null) {
            table = this.onWarmupCompleted.getInterfaceDescriptor().getTable(Table.onExtraCallbackWithResult(this.onWarmupCompleted.access100().getInterfaceDescriptor().asBinder(clsOnExtraCallbackWithResult)));
            this.onNavigationEvent.put(clsOnExtraCallbackWithResult, table);
        }
        if (onNavigationEvent(clsOnExtraCallbackWithResult, cls)) {
            this.onNavigationEvent.put(cls, table);
        }
        return table;
    }

    public RealmObjectSchema IAuthTabCallback(Class<? extends RealmModel> cls) {
        RealmObjectSchema realmObjectSchema = this.IAuthTabCallback.get(cls);
        if (realmObjectSchema != null) {
            return realmObjectSchema;
        }
        Class<? extends RealmModel> clsOnExtraCallbackWithResult = Util.onExtraCallbackWithResult(cls);
        if (onNavigationEvent(clsOnExtraCallbackWithResult, cls)) {
            realmObjectSchema = this.IAuthTabCallback.get(clsOnExtraCallbackWithResult);
        }
        if (realmObjectSchema == null) {
            setMemory setmemory = new setMemory(this.onWarmupCompleted, this, onNavigationEvent(cls), onExtraCallback(clsOnExtraCallbackWithResult));
            this.IAuthTabCallback.put(clsOnExtraCallbackWithResult, setmemory);
            realmObjectSchema = setmemory;
        }
        if (onNavigationEvent(clsOnExtraCallbackWithResult, cls)) {
            this.IAuthTabCallback.put(cls, realmObjectSchema);
        }
        return realmObjectSchema;
    }

    public RealmObjectSchema onTransact(String str) {
        String strOnExtraCallbackWithResult = Table.onExtraCallbackWithResult(str);
        RealmObjectSchema realmObjectSchema = this.onExtraCallback.get(strOnExtraCallbackWithResult);
        if (realmObjectSchema != null && realmObjectSchema.IAuthTabCallback().IAuthTabCallbackDefault() && realmObjectSchema.onExtraCallbackWithResult().equals(str)) {
            return realmObjectSchema;
        }
        if (!this.onWarmupCompleted.getInterfaceDescriptor().hasTable(strOnExtraCallbackWithResult)) {
            throw new IllegalArgumentException("The class " + str + " doesn't exist in this Realm.");
        }
        TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder = this.onWarmupCompleted;
        setMemory setmemory = new setMemory(tombstoneProtosLogMessageOrBuilder, this, tombstoneProtosLogMessageOrBuilder.getInterfaceDescriptor().getTable(strOnExtraCallbackWithResult));
        this.onExtraCallback.put(strOnExtraCallbackWithResult, setmemory);
        return setmemory;
    }

    private boolean onNavigationEvent(Class<? extends RealmModel> cls, Class<? extends RealmModel> cls2) {
        return cls.equals(cls2);
    }

    final boolean onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult != null;
    }

    public final TombstoneProtosMemoryErrorType1 onExtraCallback(Class<? extends RealmModel> cls) {
        asBinder();
        return this.onExtraCallbackWithResult.IAuthTabCallback(cls);
    }

    public final TombstoneProtosMemoryErrorType1 IAuthTabCallback(String str) {
        asBinder();
        return this.onExtraCallbackWithResult.IAuthTabCallback(str);
    }

    public final RealmObjectSchema asBinder(String str) {
        return this.onExtraCallback.remove(str);
    }

    final OsKeyPathMapping onWarmupCompleted() {
        return this.IAuthTabCallbackStub;
    }

    private void asBinder() {
        if (!onExtraCallbackWithResult()) {
            throw new IllegalStateException("Attempt to use column key before set.");
        }
    }

    public void onExtraCallback() {
        this.IAuthTabCallbackStub = new OsKeyPathMapping(this.onWarmupCompleted.IAuthTabCallbackDefault.getNativePtr());
    }

    public void onNavigationEvent() {
        TombstoneProtosMemoryErrorOrBuilder tombstoneProtosMemoryErrorOrBuilder = this.onExtraCallbackWithResult;
        if (tombstoneProtosMemoryErrorOrBuilder != null) {
            tombstoneProtosMemoryErrorOrBuilder.onExtraCallbackWithResult();
        }
        this.IAuthTabCallbackDefault.clear();
        this.onNavigationEvent.clear();
        this.IAuthTabCallback.clear();
        this.onExtraCallback.clear();
    }
}
