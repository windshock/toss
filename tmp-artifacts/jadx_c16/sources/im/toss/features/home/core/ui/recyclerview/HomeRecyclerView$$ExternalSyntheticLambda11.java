package im.toss.features.home.core.ui.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeRecyclerView$$ExternalSyntheticLambda11 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeRecyclerView f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = HomeRecyclerView.onExtraCallback(this.f$0, (RecyclerView.ViewHolder) obj, obj2);
        int i4 = onWarmupCompleted + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
