package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class dv82 implements dv4, dv54 {
    private final List<dv4> onExtraCallback;
    private final dv52 onWarmupCompleted = new dv52();

    public dv82(List<? extends dv4> list) {
        pmi10.onExtraCallbackWithResult("codecProviders must not be null or empty", list != null && list.size() > 0);
        this.onExtraCallback = new ArrayList(list);
    }

    @Override // o.dv18
    public <T> dv12<T> onNavigationEvent(Class<T> cls) {
        return onWarmupCompleted(new dv6<>(this, cls));
    }

    @Override // o.dv4
    public <T> dv12<T> onExtraCallbackWithResult(Class<T> cls, dv18 dv18Var) {
        Iterator<dv4> it = this.onExtraCallback.iterator();
        while (it.hasNext()) {
            dv12<T> dv12VarOnExtraCallbackWithResult = it.next().onExtraCallbackWithResult(cls, dv18Var);
            if (dv12VarOnExtraCallbackWithResult != null) {
                return dv12VarOnExtraCallbackWithResult;
            }
        }
        return null;
    }

    @Override // o.dv54
    public <T> dv12<T> onWarmupCompleted(dv6<T> dv6Var) {
        if (!this.onWarmupCompleted.IAuthTabCallback(dv6Var.IAuthTabCallback())) {
            Iterator<dv4> it = this.onExtraCallback.iterator();
            while (it.hasNext()) {
                dv12<T> dv12VarOnExtraCallbackWithResult = it.next().onExtraCallbackWithResult(dv6Var.IAuthTabCallback(), dv6Var);
                if (dv12VarOnExtraCallbackWithResult != null) {
                    this.onWarmupCompleted.onExtraCallback(dv6Var.IAuthTabCallback(), dv12VarOnExtraCallbackWithResult);
                    return dv12VarOnExtraCallbackWithResult;
                }
            }
            this.onWarmupCompleted.onExtraCallback(dv6Var.IAuthTabCallback(), null);
        }
        return this.onWarmupCompleted.onExtraCallbackWithResult(dv6Var.IAuthTabCallback());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dv82.class != obj.getClass()) {
            return false;
        }
        dv82 dv82Var = (dv82) obj;
        if (this.onExtraCallback.size() != dv82Var.onExtraCallback.size()) {
            return false;
        }
        for (int i = 0; i < this.onExtraCallback.size(); i++) {
            if (this.onExtraCallback.get(i).getClass() != dv82Var.onExtraCallback.get(i).getClass()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.onExtraCallback.hashCode();
    }
}
