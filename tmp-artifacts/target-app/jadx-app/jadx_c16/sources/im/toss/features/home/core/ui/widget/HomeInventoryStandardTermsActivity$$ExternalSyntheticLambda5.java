package im.toss.features.home.core.ui.widget;

import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeInventoryStandardTermsActivity$$ExternalSyntheticLambda5 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HomeInventoryStandardTermsActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ HomeInventoryStandardTermsActivity$$ExternalSyntheticLambda5(HomeInventoryStandardTermsActivity homeInventoryStandardTermsActivity, String str) {
        this.f$0 = homeInventoryStandardTermsActivity;
        this.f$1 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unit = (Unit) HomeInventoryStandardTermsActivity.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -708407332, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 708407332, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            int i3 = 21 / 0;
        } else {
            unit = (Unit) HomeInventoryStandardTermsActivity.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -708407332, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), new Object[]{this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 708407332, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        int i4 = onNavigationEvent + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
