package im.toss.features.home.feature.asset_home.activity;

import java.util.List;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.mc;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeMydataIntroActivity$$ExternalSyntheticLambda6 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ List f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        Object obj4 = null;
        if (i2 % 2 != 0) {
            AssetHomeMydataIntroActivity.onNavigationEvent(this.f$0, (mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            throw null;
        }
        Unit unitOnNavigationEvent = AssetHomeMydataIntroActivity.onNavigationEvent(this.f$0, (mc) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i3 = IAuthTabCallback + 99;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj4.hashCode();
        throw null;
    }
}
