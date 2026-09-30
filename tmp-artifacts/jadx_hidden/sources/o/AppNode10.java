package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AppNode10 implements ALCFaceSDK4ExternalSyntheticLambda1 {
    static int onExtraCallbackWithResult = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AppNode10.class);
    public static final AppNode10 onNavigationEvent = new AppNode10();

    static {
        if ((((onExtraCallbackWithResult ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(737)) >> 24) & 1) == 0) {
            throw null;
        }
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
    }

    public <T> void IAuthTabCallback(@NotNull String str, @NotNull T t) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5517);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        int i5 = (((i4 & i3) | (i3 ^ i4)) >> 23) & 1;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        if (i5 == 0) {
            throw null;
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(283);
    }

    public boolean IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(126);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        int i5 = (((i4 & i3) | (i3 ^ i4)) >> 11) & 1;
        Intrinsics.checkNotNullParameter(str, "");
        return i5 == 0;
    }

    public void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4615);
        Intrinsics.checkNotNullParameter(str, "");
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1240);
    }

    public <T> T onNavigationEvent(@NotNull String str, @NotNull Class<T> cls, @Nullable T t) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3073);
        int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 27) & 1;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    private AppNode10() {
    }
}
