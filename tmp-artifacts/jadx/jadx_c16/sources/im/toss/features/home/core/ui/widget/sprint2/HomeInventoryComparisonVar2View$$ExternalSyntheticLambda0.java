package im.toss.features.home.core.ui.widget.sprint2;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeInventoryComparisonVar2View$$ExternalSyntheticLambda0 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ HomeInventoryComparisonVar2View f$1;

    public /* synthetic */ HomeInventoryComparisonVar2View$$ExternalSyntheticLambda0(Context context, HomeInventoryComparisonVar2View homeInventoryComparisonVar2View) {
        this.f$0 = context;
        this.f$1 = homeInventoryComparisonVar2View;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer numValueOf = Integer.valueOf(HomeInventoryComparisonVar2View.onExtraCallback(this.f$0, this.f$1));
        int i4 = onExtraCallback + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return numValueOf;
        }
        throw null;
    }
}
