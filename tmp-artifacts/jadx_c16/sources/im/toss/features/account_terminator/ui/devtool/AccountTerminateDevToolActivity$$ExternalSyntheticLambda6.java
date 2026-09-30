package im.toss.features.account_terminator.ui.devtool;

import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.getSupportedHighSpeedResolutionsFor;
import o.setCurrentIndex;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateDevToolActivity$$ExternalSyntheticLambda6 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) AccountTerminateDevToolActivity.onExtraCallback(-260996340, setCurrentIndex.onNavigationEvent(), 260996345, setCurrentIndex.onNavigationEvent(), objArr, iOnNavigationEvent, setCurrentIndex.onNavigationEvent());
        int i4 = IAuthTabCallback + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
