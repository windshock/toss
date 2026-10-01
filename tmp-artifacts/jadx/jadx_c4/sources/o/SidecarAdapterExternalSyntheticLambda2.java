package o;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface SidecarAdapterExternalSyntheticLambda2 {
    static /* synthetic */ boolean onExtraCallback() {
        int i = 2 % 2;
        return onExtraCallbackWithResult();
    }

    private static boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        return true;
    }

    boolean IAuthTabCallback();

    void onExtraCallbackWithResult(@NotNull Fragment fragment);

    void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull Function0<Boolean> function0);

    getAdUnitIds onNavigationEvent();

    Activity onWarmupCompleted();
}
