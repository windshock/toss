package im.toss.core.widget;

import android.graphics.Canvas;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsWebSmoothProgressBarV1View$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ TdsWebSmoothProgressBarV1View f$0;
    public final /* synthetic */ float f$1;

    public /* synthetic */ TdsWebSmoothProgressBarV1View$$ExternalSyntheticLambda1(TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View, float f) {
        this.f$0 = tdsWebSmoothProgressBarV1View;
        this.f$1 = f;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TdsWebSmoothProgressBarV1View tdsWebSmoothProgressBarV1View = this.f$0;
        if (i3 != 0) {
            Float fValueOf = Float.valueOf(this.f$1);
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            return (Unit) TdsWebSmoothProgressBarV1View.onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -116907378, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, 116907382, new Object[]{tdsWebSmoothProgressBarV1View, fValueOf, (Canvas) obj}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        Float fValueOf2 = Float.valueOf(this.f$1);
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Unit unit = (Unit) TdsWebSmoothProgressBarV1View.onExtraCallbackWithResult(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -116907378, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, 116907382, new Object[]{tdsWebSmoothProgressBarV1View, fValueOf2, (Canvas) obj}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i4 = 33 / 0;
        return unit;
    }
}
