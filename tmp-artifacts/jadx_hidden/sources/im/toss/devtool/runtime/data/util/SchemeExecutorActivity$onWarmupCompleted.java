package im.toss.devtool.runtime.data.util;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.initMiniApp;

/* loaded from: classes.dex */
public final class SchemeExecutorActivity$onWarmupCompleted implements Function1<initMiniApp.onWarmupCompleted, Unit> {
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(SchemeExecutorActivity$onWarmupCompleted.class);
    public static final SchemeExecutorActivity$onWarmupCompleted onExtraCallbackWithResult = new SchemeExecutorActivity$onWarmupCompleted();

    static {
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4498);
    }

    public final void onExtraCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1443);
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2054);
    }

    public /* synthetic */ Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5014);
        int i3 = ((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 23) & 1;
        onExtraCallback((initMiniApp.onWarmupCompleted) obj);
        if (i3 == 0) {
            unit = Unit.INSTANCE;
            int i4 = 13 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(273);
        return unit;
    }
}
