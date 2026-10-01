package im.toss.features.home.feature.asset_home.activity.home;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda11 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AssetInvestmentHomeActivity$IAuthTabCallback f$0;
    public final /* synthetic */ AssetInvestmentHomeActivity f$1;

    public /* synthetic */ AssetInvestmentHomeActivity$$ExternalSyntheticLambda11(AssetInvestmentHomeActivity$IAuthTabCallback assetInvestmentHomeActivity$IAuthTabCallback, AssetInvestmentHomeActivity assetInvestmentHomeActivity) {
        this.f$0 = assetInvestmentHomeActivity$IAuthTabCallback;
        this.f$1 = assetInvestmentHomeActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        Unit unit = (Unit) AssetInvestmentHomeActivity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1887824210, objArr, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 1887824214);
        int i4 = IAuthTabCallback + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
