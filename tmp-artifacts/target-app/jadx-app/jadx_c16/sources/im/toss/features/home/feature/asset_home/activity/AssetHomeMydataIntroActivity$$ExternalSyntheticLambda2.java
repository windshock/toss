package im.toss.features.home.feature.asset_home.activity;

import java.util.List;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeMydataIntroActivity$$ExternalSyntheticLambda2 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ AssetHomeMydataIntroActivity f$1;

    public /* synthetic */ AssetHomeMydataIntroActivity$$ExternalSyntheticLambda2(List list, AssetHomeMydataIntroActivity assetHomeMydataIntroActivity) {
        this.f$0 = list;
        this.f$1 = assetHomeMydataIntroActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List list = this.f$0;
        if (i3 == 0) {
            return AssetHomeMydataIntroActivity.IAuthTabCallback(list, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        AssetHomeMydataIntroActivity.IAuthTabCallback(list, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        throw null;
    }
}
