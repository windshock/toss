package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class getEngineProxy {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(getEngineProxy.class);
    private final List<getExtensionManager> onExtraCallbackWithResult;

    public getEngineProxy(@NotNull List<getExtensionManager> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = list;
    }

    public final List<getExtensionManager> onNavigationEvent() {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4780);
        List<getExtensionManager> list = this.onExtraCallbackWithResult;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3073);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 6) & 1) != 0) {
            int i3 = 19 / 0;
        }
        return list;
    }
}
