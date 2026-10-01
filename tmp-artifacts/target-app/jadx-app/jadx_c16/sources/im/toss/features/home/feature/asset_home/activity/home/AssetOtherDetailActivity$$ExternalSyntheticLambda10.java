package im.toss.features.home.feature.asset_home.activity.home;

import android.content.Context;
import kotlin.Unit;
import o.ByteArrayPools;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CollectionUtils;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOtherDetailActivity$$ExternalSyntheticLambda10 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CollectionUtils f$0;
    public final /* synthetic */ Context f$1;
    public final /* synthetic */ AssetOtherDetailActivity f$2;

    public /* synthetic */ AssetOtherDetailActivity$$ExternalSyntheticLambda10(CollectionUtils collectionUtils, Context context, AssetOtherDetailActivity assetOtherDetailActivity) {
        this.f$0 = collectionUtils;
        this.f$1 = context;
        this.f$2 = assetOtherDetailActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = AssetOtherDetailActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (ByteArrayPools) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
