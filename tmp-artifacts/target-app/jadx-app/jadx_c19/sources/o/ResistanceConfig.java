package o;

import android.util.SparseArray;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ResistanceConfig implements DrawerStateExternalSyntheticLambda1 {
    private final RippleKtExternalSyntheticLambda0.onExtraCallback IAuthTabCallback;
    private final SparseArray<ScaffoldKtExternalSyntheticLambda1> onExtraCallback = new SparseArray<>();
    private boolean onExtraCallbackWithResult;
    private final DrawerStateExternalSyntheticLambda1 onWarmupCompleted;

    public ResistanceConfig(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this.onWarmupCompleted = drawerStateExternalSyntheticLambda1;
        this.IAuthTabCallback = onextracallback;
    }

    @Override // o.DrawerStateExternalSyntheticLambda1
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onExtraCallbackWithResult(int i2, int i3) {
        if (i3 != 3) {
            this.onExtraCallbackWithResult = true;
            return this.onWarmupCompleted.onExtraCallbackWithResult(i2, i3);
        }
        ScaffoldKtExternalSyntheticLambda1 scaffoldKtExternalSyntheticLambda1 = this.onExtraCallback.get(i2);
        if (scaffoldKtExternalSyntheticLambda1 != null) {
            return scaffoldKtExternalSyntheticLambda1;
        }
        ScaffoldKtExternalSyntheticLambda1 scaffoldKtExternalSyntheticLambda12 = new ScaffoldKtExternalSyntheticLambda1(this.onWarmupCompleted.onExtraCallbackWithResult(i2, i3), this.IAuthTabCallback);
        this.onExtraCallback.put(i2, scaffoldKtExternalSyntheticLambda12);
        return scaffoldKtExternalSyntheticLambda12;
    }

    @Override // o.DrawerStateExternalSyntheticLambda1
    public void onExtraCallbackWithResult() {
        this.onWarmupCompleted.onExtraCallbackWithResult();
        if (this.onExtraCallbackWithResult) {
            for (int i2 = 0; i2 < this.onExtraCallback.size(); i2++) {
                this.onExtraCallback.valueAt(i2).IAuthTabCallback(true);
            }
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda1
    public void IAuthTabCallback(ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4) {
        this.onWarmupCompleted.IAuthTabCallback(exposedDropdownMenu_androidKtExternalSyntheticLambda4);
    }
}
