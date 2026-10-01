package im.toss.features.benefit.test;

import com.google.android.gms.ads.AdInspectorError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AdInspectorError f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = BenefitTestActivity.onWarmupCompleted(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
