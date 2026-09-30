package im.toss.features.account_terminator.ui.devtool;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setCurrentIndex;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda14 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AccountTerminateDevToolActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) AccountTerminateDevToolActivity.onExtraCallback(-712007189, setCurrentIndex.onNavigationEvent(), 712007197, setCurrentIndex.onNavigationEvent(), objArr, iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
        int i4 = onNavigationEvent + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
