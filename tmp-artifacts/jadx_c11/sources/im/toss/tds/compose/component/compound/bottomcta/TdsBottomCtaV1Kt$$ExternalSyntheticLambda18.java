package im.toss.tds.compose.component.compound.bottomcta;

import android.os.Process;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.u1;
import o.u4;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class TdsBottomCtaV1Kt$$ExternalSyntheticLambda18 implements Function2 {
    private static int IAuthTabCallback = 0;
    public static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public static int onWarmupCompleted;
    public final /* synthetic */ getBacktraceNote f$0;
    public final /* synthetic */ u4 f$1;

    public /* synthetic */ TdsBottomCtaV1Kt$$ExternalSyntheticLambda18(getBacktraceNote getbacktracenote, u4 u4Var) {
        this.f$0 = getbacktracenote;
        this.f$1 = u4Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = u1.onWarmupCompleted(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static int onExtraCallbackWithResult() {
        int i = onWarmupCompleted;
        int i2 = i % 9785887;
        onWarmupCompleted = i + 1;
        if (i2 != 0) {
            return onExtraCallback;
        }
        int iMyPid = Process.myPid();
        onExtraCallback = iMyPid;
        return iMyPid;
    }
}
