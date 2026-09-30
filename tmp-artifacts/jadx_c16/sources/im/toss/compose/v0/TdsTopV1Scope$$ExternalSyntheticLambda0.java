package im.toss.compose.v0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.removeAnimatorListener;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsTopV1Scope$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ removeAnimatorListener f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ TdsTopV1Scope$$ExternalSyntheticLambda0(removeAnimatorListener removeanimatorlistener, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2) {
        this.f$0 = removeanimatorlistener;
        this.f$1 = str;
        this.f$2 = quirksExternalSyntheticBackport0;
        this.f$3 = j;
        this.f$4 = i;
        this.f$5 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = removeAnimatorListener.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
