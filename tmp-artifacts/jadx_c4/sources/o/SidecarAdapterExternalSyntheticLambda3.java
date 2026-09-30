package o;

import android.app.Dialog;
import im.toss.uikit.base.UIKitBaseActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface SidecarAdapterExternalSyntheticLambda3 {
    void IAuthTabCallback(@Nullable Dialog dialog, long j);

    void onExtraCallbackWithResult(@Nullable Dialog dialog);

    Dialog onNavigationEvent(@NotNull UIKitBaseActivity uIKitBaseActivity);

    default boolean onWarmupCompleted(@Nullable Dialog dialog) {
        int i = 2 % 2;
        return false;
    }
}
