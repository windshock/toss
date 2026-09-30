package io.realm;

import io.realm.RealmModel;
import javax.annotation.Nullable;
import o.TombstoneProtosMemoryDumpMetadataCase;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface RealmObjectChangeListener<T extends RealmModel> {
    void onChange(T t, @Nullable TombstoneProtosMemoryDumpMetadataCase tombstoneProtosMemoryDumpMetadataCase);
}
