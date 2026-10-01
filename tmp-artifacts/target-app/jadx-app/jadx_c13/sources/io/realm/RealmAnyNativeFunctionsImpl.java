package io.realm;

import io.realm.internal.RealmAnyNativeFunctions;
import io.realm.internal.TableQuery;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RealmAnyNativeFunctionsImpl implements RealmAnyNativeFunctions {
    @Override // io.realm.internal.RealmAnyNativeFunctions
    public void onWarmupCompleted(long j, RealmAny realmAny) {
        OsObjectBuilder.nativeAddRealmAnyListItem(j, realmAny.onExtraCallbackWithResult());
    }

    @Override // io.realm.internal.RealmAnyNativeFunctions
    public void onExtraCallback(long j, Map.Entry<String, RealmAny> entry) {
        OsObjectBuilder.nativeAddRealmAnyDictionaryEntry(j, entry.getKey(), entry.getValue().onExtraCallbackWithResult());
    }

    public void onExtraCallbackWithResult(TableQuery tableQuery, @Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny... realmAnyArr) {
        long[] jArr = new long[realmAnyArr.length];
        for (int i = 0; i < realmAnyArr.length; i++) {
            try {
                jArr[i] = realmAnyArr[i].onExtraCallbackWithResult();
            } catch (IllegalStateException e) {
                throw new IllegalArgumentException("Unmanaged Realm objects are not valid query arguments", e);
            }
        }
        tableQuery.IAuthTabCallback(osKeyPathMapping, str, jArr);
    }
}
