package o;

import im.toss.devtool.runtime.data.util.SchemeExecutorActivity;
import im.toss.devtool.runtime.data.util.SchemeExecutorActivity$IAuthTabCallback;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AppNode611 {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AppNode611.class);

    public Object onExtraCallback(@NotNull getMsgHandler getmsghandler, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1725);
        ((SchemeExecutorActivity$IAuthTabCallback) SchemeExecutorActivity.Companion).onExtraCallbackWithResult(getmsghandler.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(221);
        return unit;
    }
}
