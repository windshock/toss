package o;

import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;
import io.realm.internal.OsObjectStore;
import io.realm.internal.Table;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class access10800 extends RealmSchema {
    access10800(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        super(tombstoneProtosLogMessageOrBuilder, null);
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema onNavigationEvent(String str) {
        onNavigationEvent(str, "Null or empty class names are not allowed");
        String strOnExtraCallbackWithResult = Table.onExtraCallbackWithResult(str);
        if (!this.onWarmupCompleted.getInterfaceDescriptor().hasTable(strOnExtraCallbackWithResult)) {
            return null;
        }
        return new hasArmMteMetadata(this.onWarmupCompleted, this, this.onWarmupCompleted.getInterfaceDescriptor().getTable(strOnExtraCallbackWithResult));
    }

    @Override // io.realm.RealmSchema
    public Set<RealmObjectSchema> IAuthTabCallback() {
        String[] tablesNames = this.onWarmupCompleted.getInterfaceDescriptor().getTablesNames();
        LinkedHashSet linkedHashSet = new LinkedHashSet(tablesNames.length);
        for (String str : tablesNames) {
            RealmObjectSchema realmObjectSchemaOnNavigationEvent = onNavigationEvent(Table.onExtraCallback(str));
            if (realmObjectSchemaOnNavigationEvent != null) {
                linkedHashSet.add(realmObjectSchemaOnNavigationEvent);
            }
        }
        return linkedHashSet;
    }

    @Override // io.realm.RealmSchema
    public RealmObjectSchema onExtraCallback(String str) {
        onNavigationEvent(str, "Null or empty class names are not allowed");
        String strOnExtraCallbackWithResult = Table.onExtraCallbackWithResult(str);
        int length = str.length();
        int i = Table.onNavigationEvent;
        if (length > i) {
            throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", Integer.valueOf(i), Integer.valueOf(str.length())));
        }
        TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder = this.onWarmupCompleted;
        return new hasArmMteMetadata(tombstoneProtosLogMessageOrBuilder, this, tombstoneProtosLogMessageOrBuilder.getInterfaceDescriptor().createTable(strOnExtraCallbackWithResult));
    }

    @Override // io.realm.RealmSchema
    public void onExtraCallbackWithResult(String str) {
        this.onWarmupCompleted.IAuthTabCallbackDefault();
        onNavigationEvent(str, "Null or empty class names are not allowed");
        String strOnExtraCallbackWithResult = Table.onExtraCallbackWithResult(str);
        if (!OsObjectStore.IAuthTabCallback(this.onWarmupCompleted.getInterfaceDescriptor(), str)) {
            throw new IllegalArgumentException("Cannot remove class because it is not in this Realm: " + str);
        }
        asBinder(strOnExtraCallbackWithResult);
    }
}
