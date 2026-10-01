package o;

import io.realm.RealmModel;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Table;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setBeginAddress extends RealmSchema {
    public setBeginAddress(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, TombstoneProtosMemoryErrorOrBuilder tombstoneProtosMemoryErrorOrBuilder) {
        super(tombstoneProtosLogMessageOrBuilder, tombstoneProtosMemoryErrorOrBuilder);
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema onNavigationEvent(String str) {
        onNavigationEvent(str, "Null or empty class names are not allowed");
        String strOnExtraCallbackWithResult = Table.onExtraCallbackWithResult(str);
        if (!this.onWarmupCompleted.getInterfaceDescriptor().hasTable(strOnExtraCallbackWithResult)) {
            return null;
        }
        return new setMemory(this.onWarmupCompleted, this, this.onWarmupCompleted.getInterfaceDescriptor().getTable(strOnExtraCallbackWithResult), IAuthTabCallback(str));
    }

    @Override // io.realm.RealmSchema
    public Set<RealmObjectSchema> IAuthTabCallback() {
        RealmProxyMediator interfaceDescriptor = this.onWarmupCompleted.access100().getInterfaceDescriptor();
        Set<Class<? extends RealmModel>> setOnExtraCallback = interfaceDescriptor.onExtraCallback();
        LinkedHashSet linkedHashSet = new LinkedHashSet(setOnExtraCallback.size());
        Iterator<Class<? extends RealmModel>> it = setOnExtraCallback.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(onNavigationEvent(interfaceDescriptor.asBinder(it.next())));
        }
        return linkedHashSet;
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema onExtraCallback(String str) {
        throw new UnsupportedOperationException("This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }

    @Override // io.realm.RealmSchema
    public void onExtraCallbackWithResult(String str) {
        throw new UnsupportedOperationException("This 'RealmSchema' is immutable. Please use 'DynamicRealm.getSchema() to get a mutable instance.");
    }
}
