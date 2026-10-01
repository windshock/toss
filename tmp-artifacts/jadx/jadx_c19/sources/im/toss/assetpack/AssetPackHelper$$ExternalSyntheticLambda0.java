package im.toss.assetpack;

import com.google.android.play.core.assetpacks.AssetPackManager;
import kotlin.jvm.functions.Function0;
import o.WindowMetricsCalculatorCompanionExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AssetPackHelper$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ WindowMetricsCalculatorCompanionExternalSyntheticLambda1 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 81;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            WindowMetricsCalculatorCompanionExternalSyntheticLambda1.onNavigationEvent(this.f$0);
            throw null;
        }
        AssetPackManager assetPackManagerOnNavigationEvent = WindowMetricsCalculatorCompanionExternalSyntheticLambda1.onNavigationEvent(this.f$0);
        int i4 = onExtraCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return assetPackManagerOnNavigationEvent;
    }
}
