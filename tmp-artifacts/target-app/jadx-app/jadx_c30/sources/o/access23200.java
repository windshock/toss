package o;

import io.realm.OrderedRealmCollection;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class access23200<E extends OrderedRealmCollection> {
    private final access11100 IAuthTabCallback;
    private final E onExtraCallback;

    public access23200(E e, @Nullable access11100 access11100Var) {
        this.onExtraCallback = e;
        this.IAuthTabCallback = access11100Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            access23200 access23200Var = (access23200) obj;
            if (!this.onExtraCallback.equals(access23200Var.onExtraCallback)) {
                return false;
            }
            access11100 access11100Var = this.IAuthTabCallback;
            access11100 access11100Var2 = access23200Var.IAuthTabCallback;
            if (access11100Var != null) {
                return access11100Var.equals(access11100Var2);
            }
            if (access11100Var2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallback.hashCode();
        access11100 access11100Var = this.IAuthTabCallback;
        return (iHashCode * 31) + (access11100Var != null ? access11100Var.hashCode() : 0);
    }
}
