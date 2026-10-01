package o;

import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.Property;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class TombstoneProtosMemoryErrorType1 {
    private final Map<String, IAuthTabCallback> IAuthTabCallback;
    private final Map<String, String> onExtraCallbackWithResult;
    private final Map<String, IAuthTabCallback> onNavigationEvent;
    private final boolean onWarmupCompleted;

    protected abstract void onWarmupCompleted(TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1, TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType12);

    public TombstoneProtosMemoryErrorType1(int i) {
        this(i, true);
    }

    public TombstoneProtosMemoryErrorType1(@Nullable TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1, boolean z) {
        this(tombstoneProtosMemoryErrorType1 == null ? 0 : tombstoneProtosMemoryErrorType1.onNavigationEvent.size(), z);
        if (tombstoneProtosMemoryErrorType1 != null) {
            this.onNavigationEvent.putAll(tombstoneProtosMemoryErrorType1.onNavigationEvent);
        }
    }

    private TombstoneProtosMemoryErrorType1(int i, boolean z) {
        this.onNavigationEvent = new HashMap(i);
        this.IAuthTabCallback = new HashMap(i);
        this.onExtraCallbackWithResult = new HashMap(i);
        this.onWarmupCompleted = z;
    }

    @Nullable
    public IAuthTabCallback onExtraCallback(String str) {
        return this.onNavigationEvent.get(str);
    }

    public void onExtraCallback(TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1) {
        if (!this.onWarmupCompleted) {
            throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
        }
        if (tombstoneProtosMemoryErrorType1 == null) {
            throw new NullPointerException("Attempt to copy null ColumnInfo");
        }
        this.onNavigationEvent.clear();
        this.onNavigationEvent.putAll(tombstoneProtosMemoryErrorType1.onNavigationEvent);
        this.IAuthTabCallback.clear();
        this.IAuthTabCallback.putAll(tombstoneProtosMemoryErrorType1.IAuthTabCallback);
        this.onExtraCallbackWithResult.clear();
        this.onExtraCallbackWithResult.putAll(tombstoneProtosMemoryErrorType1.onExtraCallbackWithResult);
        onWarmupCompleted(tombstoneProtosMemoryErrorType1, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnInfo[");
        sb.append("mutable=" + this.onWarmupCompleted);
        sb.append(",");
        boolean z = false;
        if (this.onNavigationEvent != null) {
            sb.append("JavaFieldNames=[");
            boolean z2 = false;
            for (Map.Entry<String, IAuthTabCallback> entry : this.onNavigationEvent.entrySet()) {
                if (z2) {
                    sb.append(",");
                }
                sb.append(entry.getKey());
                sb.append("->");
                sb.append(entry.getValue());
                z2 = true;
            }
            sb.append("]");
        }
        if (this.IAuthTabCallback != null) {
            sb.append(", InternalFieldNames=[");
            for (Map.Entry<String, IAuthTabCallback> entry2 : this.IAuthTabCallback.entrySet()) {
                if (z) {
                    sb.append(",");
                }
                sb.append(entry2.getKey());
                sb.append("->");
                sb.append(entry2.getValue());
                z = true;
            }
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }

    public final long onNavigationEvent(String str, String str2, OsObjectSchemaInfo osObjectSchemaInfo) {
        Property propertyOnExtraCallback = osObjectSchemaInfo.onExtraCallback(str2);
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(propertyOnExtraCallback);
        this.onNavigationEvent.put(str, iAuthTabCallback);
        this.IAuthTabCallback.put(str2, iAuthTabCallback);
        this.onExtraCallbackWithResult.put(str, str2);
        return propertyOnExtraCallback.onExtraCallbackWithResult();
    }
}
