package im.toss.compose.widget.point.overlay;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.LottieDrawableExternalSyntheticLambda14;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.immediateFailedFuture;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TopPreset$$ExternalSyntheticLambda11 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LottieDrawableExternalSyntheticLambda14 f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$3;
    public final /* synthetic */ long f$4;
    public final /* synthetic */ long f$5;
    public final /* synthetic */ QuirkSettingsLoader f$6;
    public final /* synthetic */ immediateFailedFuture f$7;
    public final /* synthetic */ String f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ TopPreset$$ExternalSyntheticLambda11(LottieDrawableExternalSyntheticLambda14 lottieDrawableExternalSyntheticLambda14, int i, long j, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j2, long j3, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, String str, int i2, int i3) {
        this.f$0 = lottieDrawableExternalSyntheticLambda14;
        this.f$1 = i;
        this.f$2 = j;
        this.f$3 = quirksExternalSyntheticBackport0;
        this.f$4 = j2;
        this.f$5 = j3;
        this.f$6 = quirkSettingsLoader;
        this.f$7 = immediatefailedfuture;
        this.f$8 = str;
        this.f$9 = i2;
        this.f$10 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LottieDrawableExternalSyntheticLambda14.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
