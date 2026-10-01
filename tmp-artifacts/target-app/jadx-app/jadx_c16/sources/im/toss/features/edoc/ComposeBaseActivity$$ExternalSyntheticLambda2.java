package im.toss.features.edoc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.matches;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ComposeBaseActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ComposeBaseActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
            int iOnExtraCallback = matches.onExtraCallback();
            return (Unit) ComposeBaseActivity.IAuthTabCallback(matches.onExtraCallback(), 170373878, objArr, -170373878, matches.onExtraCallback(), matches.onExtraCallback(), iOnExtraCallback);
        }
        Object[] objArr2 = {this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        int iOnExtraCallback2 = matches.onExtraCallback();
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
