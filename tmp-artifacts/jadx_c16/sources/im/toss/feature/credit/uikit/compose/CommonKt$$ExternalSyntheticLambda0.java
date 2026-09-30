package im.toss.feature.credit.uikit.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.onPageLoadError;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CommonKt$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            onPageLoadError.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            obj3.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onPageLoadError.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = IAuthTabCallback + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj3.hashCode();
        throw null;
    }
}
