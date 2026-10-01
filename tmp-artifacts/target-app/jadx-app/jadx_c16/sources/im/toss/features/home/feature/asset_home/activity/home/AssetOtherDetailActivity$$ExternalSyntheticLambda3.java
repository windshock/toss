package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CollectionUtils;
import o.getBacktraceNote;
import o.u4;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOtherDetailActivity$$ExternalSyntheticLambda3 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CollectionUtils f$0;
    public final /* synthetic */ AssetOtherDetailActivity f$1;

    public /* synthetic */ AssetOtherDetailActivity$$ExternalSyntheticLambda3(CollectionUtils collectionUtils, AssetOtherDetailActivity assetOtherDetailActivity) {
        this.f$0 = collectionUtils;
        this.f$1 = assetOtherDetailActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = AssetOtherDetailActivity.onExtraCallback(this.f$0, this.f$1, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onWarmupCompleted + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
