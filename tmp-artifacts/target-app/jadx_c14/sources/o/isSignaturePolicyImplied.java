package o;

import android.view.View;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.RequireInput;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class isSignaturePolicyImplied {
    public abstract View onWarmupCompleted();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTransact() {
        if (this instanceof RequireInput) {
            return ((RequireInput) this).IAuthTabCallback();
        }
        return true;
    }
}
