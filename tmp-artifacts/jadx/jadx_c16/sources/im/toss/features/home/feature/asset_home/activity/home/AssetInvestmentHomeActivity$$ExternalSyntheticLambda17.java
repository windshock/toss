package im.toss.features.home.feature.asset_home.activity.home;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda17 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        Unit unit = (Unit) AssetInvestmentHomeActivity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), iOnExtraCallback, 1045828724, new Object[]{(SetDetectableSize) obj}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), -1045828715);
        int i4 = IAuthTabCallback + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
