package im.toss.features.home.core.ui.widget;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import o.registry;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewAssetRowAView$$ExternalSyntheticLambda2 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ ExperimentHomeOverviewAssetRowAView f$1;

    public /* synthetic */ ExperimentHomeOverviewAssetRowAView$$ExternalSyntheticLambda2(Context context, ExperimentHomeOverviewAssetRowAView experimentHomeOverviewAssetRowAView) {
        this.f$0 = context;
        this.f$1 = experimentHomeOverviewAssetRowAView;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            ExperimentHomeOverviewAssetRowAView.onWarmupCompleted(this.f$0, this.f$1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        registry registryVarOnWarmupCompleted = ExperimentHomeOverviewAssetRowAView.onWarmupCompleted(this.f$0, this.f$1);
        int i3 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return registryVarOnWarmupCompleted;
    }
}
