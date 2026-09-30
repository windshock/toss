package o;

import io.realm.DynamicRealmObject;
import io.realm.RealmModel;
import io.realm.RealmModelOperator;
import io.realm.internal.Table;
import io.realm.internal.core.NativeRealmAny;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setArmMteMetadata extends RealmModelOperator {
    private static <T extends RealmModel> T onExtraCallback(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, NativeRealmAny nativeRealmAny) {
        return (T) tombstoneProtosLogMessageOrBuilder.onWarmupCompleted(DynamicRealmObject.class, Table.onExtraCallback(nativeRealmAny.getRealmModelTableName(tombstoneProtosLogMessageOrBuilder.getInterfaceDescriptor())), nativeRealmAny.getRealmModelRowKey());
    }

    public setArmMteMetadata(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, NativeRealmAny nativeRealmAny) {
        super(onExtraCallback(tombstoneProtosLogMessageOrBuilder, nativeRealmAny));
    }

    @Override // io.realm.RealmModelOperator, io.realm.RealmAnyOperator
    public Class<?> IAuthTabCallback() {
        return DynamicRealmObject.class;
    }
}
