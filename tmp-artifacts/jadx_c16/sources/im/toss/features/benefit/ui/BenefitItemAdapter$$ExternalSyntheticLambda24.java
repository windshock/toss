package im.toss.features.benefit.ui;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.SensorBridgeExtension4;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda24 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = getNameByOperatorName.onExtraCallback(this.f$0, (Context) obj, (SensorBridgeExtension4) obj2);
        int i4 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
