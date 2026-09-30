package o;

import android.app.Dialog;
import im.toss.uikit.base.UIKitBaseActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface SidecarCompatExternalSyntheticLambda0 {
    void IAuthTabCallback(@Nullable EventServiceImpl eventServiceImpl);

    boolean IAuthTabCallback();

    void onWarmupCompleted(@NotNull UIKitBaseActivity uIKitBaseActivity, boolean z, @Nullable Dialog dialog);

    static /* synthetic */ void IAuthTabCallback(SidecarCompatExternalSyntheticLambda0 sidecarCompatExternalSyntheticLambda0, UIKitBaseActivity uIKitBaseActivity, boolean z, Dialog dialog, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            dialog = null;
        }
        sidecarCompatExternalSyntheticLambda0.onWarmupCompleted(uIKitBaseActivity, z, dialog);
    }
}
