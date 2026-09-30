package io.realm.internal;

import io.realm.RealmAny;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface RealmAnyNativeFunctions {
    void onExtraCallback(long j, Map.Entry<String, RealmAny> entry);

    void onWarmupCompleted(long j, RealmAny realmAny);
}
