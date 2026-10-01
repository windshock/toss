package im.toss.compose.widget.point.overlay;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.LottieDrawableExternalSyntheticLambda14;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.immediateFailedFuture;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TopPreset$$ExternalSyntheticLambda10 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ QuirksExternalSyntheticBackport0 f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ QuirkSettingsLoader f$3;
    public final /* synthetic */ immediateFailedFuture f$4;
    public final /* synthetic */ String f$5;

    public /* synthetic */ TopPreset$$ExternalSyntheticLambda10(int i, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, QuirkSettingsLoader quirkSettingsLoader, immediateFailedFuture immediatefailedfuture, String str) {
        this.f$0 = i;
        this.f$1 = quirksExternalSyntheticBackport0;
        this.f$2 = j;
        this.f$3 = quirkSettingsLoader;
        this.f$4 = immediatefailedfuture;
        this.f$5 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LottieDrawableExternalSyntheticLambda14.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onNavigationEvent + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
