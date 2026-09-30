package im.toss.features.benefit.ui;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda36 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
        if (i2 % 2 != 0) {
            getNameByOperatorName.onNavigationEvent(viewHolder);
            throw null;
        }
        Unit unitOnNavigationEvent = getNameByOperatorName.onNavigationEvent(viewHolder);
        int i3 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 11 / 0;
        }
        return unitOnNavigationEvent;
    }
}
