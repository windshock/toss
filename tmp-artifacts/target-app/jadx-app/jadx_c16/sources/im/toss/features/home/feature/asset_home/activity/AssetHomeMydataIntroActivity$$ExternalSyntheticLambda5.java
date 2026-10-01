package im.toss.features.home.feature.asset_home.activity;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeMydataIntroActivity$$ExternalSyntheticLambda5 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AssetHomeMydataIntroActivity f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ AssetHomeMydataIntroActivity$$ExternalSyntheticLambda5(AssetHomeMydataIntroActivity assetHomeMydataIntroActivity, List list) {
        this.f$0 = assetHomeMydataIntroActivity;
        this.f$1 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = AssetHomeMydataIntroActivity.IAuthTabCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 64 / 0;
        } else {
            unitIAuthTabCallback = AssetHomeMydataIntroActivity.IAuthTabCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
