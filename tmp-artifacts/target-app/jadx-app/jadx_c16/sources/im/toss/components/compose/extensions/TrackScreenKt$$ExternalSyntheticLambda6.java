package im.toss.components.compose.extensions;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RealImageLoaderKt;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TrackScreenKt$$ExternalSyntheticLambda6 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ Map f$1;
    public final /* synthetic */ Map f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ TrackScreenKt$$ExternalSyntheticLambda6(long j, Map map, Map map2, int i, int i2) {
        this.f$0 = j;
        this.f$1 = map;
        this.f$2 = map2;
        this.f$3 = i;
        this.f$4 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = RealImageLoaderKt.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
