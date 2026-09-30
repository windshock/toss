package im.toss.features.benefit.ui;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda33 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = getNameByOperatorName.onExtraCallback((RecyclerView.ViewHolder) obj);
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        return unitOnExtraCallback;
    }
}
