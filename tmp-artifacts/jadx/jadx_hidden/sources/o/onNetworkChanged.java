package o;

import im.toss.devtool.runtime.data.util.SchemeExecutorActivity;
import im.toss.devtool.runtime.data.util.SchemeExecutorActivity$IAuthTabCallback;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class onNetworkChanged {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(onNetworkChanged.class);

    public Object onExtraCallback(@NotNull getMsgHandler getmsghandler, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2106);
        int i3 = i2 & iOnWarmupCompleted;
        int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 2) & 1;
        Object obj = null;
        if (i4 != 0) {
            ((SchemeExecutorActivity$IAuthTabCallback) SchemeExecutorActivity.Companion).onExtraCallback(getmsghandler.IAuthTabCallback());
            Unit unit = Unit.INSTANCE;
            int i5 = onNavigationEvent;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2665);
            int i6 = i5 & iOnWarmupCompleted2;
            if ((((((i5 ^ iOnWarmupCompleted2) | i6) & (~i6)) >> 14) & 1) != 0) {
                return unit;
            }
            throw null;
        }
        ((SchemeExecutorActivity$IAuthTabCallback) SchemeExecutorActivity.Companion).onExtraCallback(getmsghandler.IAuthTabCallback());
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }
}
