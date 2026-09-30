package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class setEngineProxy implements getRenderContext {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(setEngineProxy.class);
    public static final setEngineProxy onExtraCallbackWithResult = new setEngineProxy();

    static {
        int i = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(503);
        if ((((((~i) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i)) >> 3) & 1) == 0) {
            throw null;
        }
    }

    @Override // o.getRenderContext
    public void onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1654);
        int i3 = i2 & iOnWarmupCompleted;
        int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 27) & 1;
        Intrinsics.checkNotNullParameter(context, "");
        if (i4 != 0) {
            int i5 = 94 / 0;
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100);
    }

    private setEngineProxy() {
    }
}
