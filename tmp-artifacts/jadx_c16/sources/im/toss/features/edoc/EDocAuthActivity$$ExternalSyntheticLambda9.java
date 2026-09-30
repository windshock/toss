package im.toss.features.edoc;

import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.removeAnimatorListener;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocAuthActivity$$ExternalSyntheticLambda9 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ EDocAuthActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (removeAnimatorListener) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        Unit unit = (Unit) EDocAuthActivity.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -794277872, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 794277874, objArr, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i4 = onExtraCallbackWithResult + 83;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
