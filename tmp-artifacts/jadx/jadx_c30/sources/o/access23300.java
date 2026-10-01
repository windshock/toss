package o;

import io.realm.RealmModel;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class access23300<E extends RealmModel> {
    private final E IAuthTabCallback;
    private final TombstoneProtosMemoryDumpMetadataCase onExtraCallback;

    public access23300(E e, @Nullable TombstoneProtosMemoryDumpMetadataCase tombstoneProtosMemoryDumpMetadataCase) {
        this.IAuthTabCallback = e;
        this.onExtraCallback = tombstoneProtosMemoryDumpMetadataCase;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            access23300 access23300Var = (access23300) obj;
            if (!this.IAuthTabCallback.equals(access23300Var.IAuthTabCallback)) {
                return false;
            }
            TombstoneProtosMemoryDumpMetadataCase tombstoneProtosMemoryDumpMetadataCase = this.onExtraCallback;
            TombstoneProtosMemoryDumpMetadataCase tombstoneProtosMemoryDumpMetadataCase2 = access23300Var.onExtraCallback;
            if (tombstoneProtosMemoryDumpMetadataCase != null) {
                return tombstoneProtosMemoryDumpMetadataCase.equals(tombstoneProtosMemoryDumpMetadataCase2);
            }
            if (tombstoneProtosMemoryDumpMetadataCase2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallback.hashCode();
        TombstoneProtosMemoryDumpMetadataCase tombstoneProtosMemoryDumpMetadataCase = this.onExtraCallback;
        return (iHashCode * 31) + (tombstoneProtosMemoryDumpMetadataCase != null ? tombstoneProtosMemoryDumpMetadataCase.hashCode() : 0);
    }

    public String toString() {
        return "ObjectChange{object=" + this.IAuthTabCallback + ", changeset=" + this.onExtraCallback + '}';
    }
}
