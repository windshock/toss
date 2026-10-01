package o;

import io.realm.RealmModel;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmProxyMediator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nonnull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosMemoryErrorOrBuilder {
    private final OsSchemaInfo IAuthTabCallback;
    private final RealmProxyMediator onNavigationEvent;
    private final Map<Class<? extends RealmModel>, TombstoneProtosMemoryErrorType1> onExtraCallback = new ConcurrentHashMap();
    private final Map<String, TombstoneProtosMemoryErrorType1> onWarmupCompleted = new HashMap();

    public TombstoneProtosMemoryErrorOrBuilder(RealmProxyMediator realmProxyMediator, OsSchemaInfo osSchemaInfo) {
        this.onNavigationEvent = realmProxyMediator;
        this.IAuthTabCallback = osSchemaInfo;
    }

    @Nonnull
    public TombstoneProtosMemoryErrorType1 IAuthTabCallback(Class<? extends RealmModel> cls) {
        TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1 = this.onExtraCallback.get(cls);
        if (tombstoneProtosMemoryErrorType1 != null) {
            return tombstoneProtosMemoryErrorType1;
        }
        TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1OnExtraCallback = this.onNavigationEvent.onExtraCallback(cls, this.IAuthTabCallback);
        this.onExtraCallback.put(cls, tombstoneProtosMemoryErrorType1OnExtraCallback);
        return tombstoneProtosMemoryErrorType1OnExtraCallback;
    }

    @Nonnull
    public TombstoneProtosMemoryErrorType1 IAuthTabCallback(String str) {
        TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1IAuthTabCallback = this.onWarmupCompleted.get(str);
        if (tombstoneProtosMemoryErrorType1IAuthTabCallback == null) {
            Iterator<Class<? extends RealmModel>> it = this.onNavigationEvent.onExtraCallback().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class<? extends RealmModel> next = it.next();
                if (this.onNavigationEvent.asBinder(next).equals(str)) {
                    tombstoneProtosMemoryErrorType1IAuthTabCallback = IAuthTabCallback(next);
                    this.onWarmupCompleted.put(str, tombstoneProtosMemoryErrorType1IAuthTabCallback);
                    break;
                }
            }
        }
        if (tombstoneProtosMemoryErrorType1IAuthTabCallback != null) {
            return tombstoneProtosMemoryErrorType1IAuthTabCallback;
        }
        throw new RealmException(String.format(Locale.US, "'%s' doesn't exist in current schema.", str));
    }

    public void onExtraCallbackWithResult() {
        for (Map.Entry<Class<? extends RealmModel>, TombstoneProtosMemoryErrorType1> entry : this.onExtraCallback.entrySet()) {
            entry.getValue().onExtraCallback(this.onNavigationEvent.onExtraCallback(entry.getKey(), this.IAuthTabCallback));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnIndices[");
        boolean z = false;
        for (Map.Entry<Class<? extends RealmModel>, TombstoneProtosMemoryErrorType1> entry : this.onExtraCallback.entrySet()) {
            if (z) {
                sb.append(",");
            }
            sb.append(entry.getKey().getSimpleName());
            sb.append("->");
            sb.append(entry.getValue());
            z = true;
        }
        sb.append("]");
        return sb.toString();
    }
}
