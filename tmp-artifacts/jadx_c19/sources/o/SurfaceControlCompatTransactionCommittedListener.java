package o;

import java.io.Serializable;
import java.util.Map;
import o.nSetCrop;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SurfaceControlCompatTransactionCommittedListener implements nSetCrop.onWarmupCompleted, Serializable {
    private static final long serialVersionUID = 1;
    protected Map<LifecycleEffectKtExternalSyntheticLambda16, Class<?>> _localMixIns;
    protected final nSetCrop.onWarmupCompleted _overrides;

    public SurfaceControlCompatTransactionCommittedListener(nSetCrop.onWarmupCompleted onwarmupcompleted) {
        this._overrides = onwarmupcompleted;
    }

    @Override // o.nSetCrop.onWarmupCompleted
    public Class<?> onTransact(Class<?> cls) {
        Map<LifecycleEffectKtExternalSyntheticLambda16, Class<?>> map;
        nSetCrop.onWarmupCompleted onwarmupcompleted = this._overrides;
        Class<?> clsOnTransact = onwarmupcompleted == null ? null : onwarmupcompleted.onTransact(cls);
        return (clsOnTransact != null || (map = this._localMixIns) == null) ? clsOnTransact : map.get(new LifecycleEffectKtExternalSyntheticLambda16(cls));
    }

    public boolean onWarmupCompleted() {
        if (this._localMixIns != null) {
            return true;
        }
        nSetCrop.onWarmupCompleted onwarmupcompleted = this._overrides;
        if (onwarmupcompleted == null) {
            return false;
        }
        if (onwarmupcompleted instanceof SurfaceControlCompatTransactionCommittedListener) {
            return ((SurfaceControlCompatTransactionCommittedListener) onwarmupcompleted).onWarmupCompleted();
        }
        return true;
    }
}
