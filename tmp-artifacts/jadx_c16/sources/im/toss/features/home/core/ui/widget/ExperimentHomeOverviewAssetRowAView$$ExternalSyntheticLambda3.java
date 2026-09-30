package im.toss.features.home.core.ui.widget;

import android.content.Context;
import im.toss.tds.view.component.atom.text.Typography;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentHomeOverviewAssetRowAView$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Context f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            ExperimentHomeOverviewAssetRowAView.onExtraCallbackWithResult(this.f$0);
            throw null;
        }
        Typography typographyOnExtraCallbackWithResult = ExperimentHomeOverviewAssetRowAView.onExtraCallbackWithResult(this.f$0);
        int i3 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return typographyOnExtraCallbackWithResult;
        }
        throw null;
    }
}
