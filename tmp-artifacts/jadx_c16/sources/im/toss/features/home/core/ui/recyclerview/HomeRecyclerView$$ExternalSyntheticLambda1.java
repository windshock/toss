package im.toss.features.home.core.ui.recyclerview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeRecyclerView$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeRecyclerView f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            HomeRecyclerView.onWarmupCompleted(this.f$0, ((Boolean) obj).booleanValue());
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = HomeRecyclerView.onWarmupCompleted(this.f$0, ((Boolean) obj).booleanValue());
        int i3 = onWarmupCompleted + 61;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
