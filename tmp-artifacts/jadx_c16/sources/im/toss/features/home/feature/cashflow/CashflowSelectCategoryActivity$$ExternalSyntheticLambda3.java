package im.toss.features.home.feature.cashflow;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSelectCategoryActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CashflowSelectCategoryActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        Unit unit = (Unit) CashflowSelectCategoryActivity.onExtraCallbackWithResult(-1819244779, C40Encoder.onExtraCallback(), 1819244779, C40Encoder.onExtraCallback(), objArr, C40Encoder.onExtraCallback(), iOnExtraCallback);
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
