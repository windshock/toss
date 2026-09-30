package o;

import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;
import io.realm.internal.Table;
import o.TombstoneProtosMemoryErrorType1;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setMemory extends RealmObjectSchema {
    public setMemory(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, RealmSchema realmSchema, Table table, TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1) {
        super(tombstoneProtosLogMessageOrBuilder, realmSchema, table, tombstoneProtosMemoryErrorType1);
    }

    public setMemory(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, RealmSchema realmSchema, Table table) {
        super(tombstoneProtosLogMessageOrBuilder, realmSchema, table, new RealmObjectSchema.DynamicColumnIndices(table));
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onExtraCallback(String str, Class<?> cls, clearMemory... clearmemoryArr) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onWarmupCompleted(String str, RealmObjectSchema realmObjectSchema) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onExtraCallbackWithResult(String str, RealmObjectSchema realmObjectSchema) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onNavigationEvent(String str, Class<?> cls) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema IAuthTabCallback(String str) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onExtraCallback(String str, String str2) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onExtraCallback(String str) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onNavigationEvent() {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onWarmupCompleted(String str, boolean z) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onExtraCallbackWithResult(String str, boolean z) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmObjectSchema
    public RealmObjectSchema onExtraCallbackWithResult(RealmObjectSchema.Function function) {
        throw new UnsupportedOperationException("This 'RealmObjectSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmObjectSchema
    public String onWarmupCompleted(String str) {
        TombstoneProtosMemoryErrorType1.IAuthTabCallback iAuthTabCallbackOnExtraCallback = this.onWarmupCompleted.onExtraCallback(str);
        if (iAuthTabCallbackOnExtraCallback == null) {
            throw new IllegalArgumentException(String.format("Property '%s' not found.", str));
        }
        return iAuthTabCallbackOnExtraCallback.onWarmupCompleted;
    }
}
