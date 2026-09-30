package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.annotation.Annotation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface SidecarCompatTranslatingCallback {
    boolean IAuthTabCallback(@NotNull Fragment fragment);

    void onExtraCallback();

    boolean onExtraCallback(@NotNull Fragment fragment);

    boolean onExtraCallbackWithResult(@NotNull Annotation annotation);

    void onNavigationEvent(@NotNull Activity activity, @NotNull Throwable th, @Nullable Bundle bundle);

    boolean onNavigationEvent(@NotNull Activity activity);

    boolean onNavigationEvent(@NotNull Annotation annotation);

    boolean onNavigationEvent(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @Nullable View view);

    void onWarmupCompleted(@NotNull Activity activity, @Nullable setMediationProvider setmediationprovider);

    void onWarmupCompleted(@NotNull Context context);

    void onWarmupCompleted(@NotNull Context context, @NotNull Intent intent);

    void onWarmupCompleted(@NotNull Fragment fragment, @NotNull MotionEvent motionEvent);
}
