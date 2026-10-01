package im.toss.features.edoc;

import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocAuthActivity$$ExternalSyntheticLambda1 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ EDocAuthActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ EDocAuthActivity$$ExternalSyntheticLambda1(EDocAuthActivity eDocAuthActivity, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3) {
        this.f$0 = eDocAuthActivity;
        this.f$1 = str;
        this.f$2 = quirksExternalSyntheticBackport0;
        this.f$3 = i;
        this.f$4 = i2;
        this.f$5 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            EDocAuthActivity eDocAuthActivity = this.f$0;
            String str = this.f$1;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = this.f$2;
            int i3 = this.f$3;
            int i4 = this.f$4;
            int i5 = this.f$5;
            int iIntValue = ((Integer) obj2).intValue();
            Object[] objArr = {eDocAuthActivity, str, quirksExternalSyntheticBackport0, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        EDocAuthActivity eDocAuthActivity2 = this.f$0;
        String str2 = this.f$1;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = this.f$2;
        int i6 = this.f$3;
        int i7 = this.f$4;
        int i8 = this.f$5;
        int iIntValue2 = ((Integer) obj2).intValue();
        Object[] objArr2 = {eDocAuthActivity2, str2, quirksExternalSyntheticBackport02, Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue2)};
        Unit unit = (Unit) EDocAuthActivity.onNavigationEvent(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1972821639, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1972821634, objArr2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int i9 = onNavigationEvent + 13;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }
}
