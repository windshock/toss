package o;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface setBinaryArch {
    void IAuthTabCallback(@NotNull AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1);

    void onExtraCallback(float f);

    void onExtraCallbackWithResult(@NotNull AnrPluginExternalSyntheticLambda1 anrPluginExternalSyntheticLambda1);

    void onNavigationEvent(float f);

    void onNavigationEvent(@NotNull List<? extends AnrPluginExternalSyntheticLambda1> list);

    void onNavigationEvent(boolean z);

    void onTransact();

    void onWarmupCompleted(boolean z);

    static /* synthetic */ void onNavigationEvent(setBinaryArch setbinaryarch, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishMobileId");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        setbinaryarch.onNavigationEvent(z);
    }
}
