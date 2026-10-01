package im.toss.features.home.core.ui.base.dst;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda19 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ RecyclerView.ViewHolder f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda19(RecyclerView.ViewHolder viewHolder, Object obj, float f) {
        this.f$0 = viewHolder;
        this.f$1 = obj;
        this.f$2 = f;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView.ViewHolder viewHolder = this.f$0;
        if (i3 != 0) {
            return Boolean.valueOf(BaseHomeDstActivity.onNavigationEvent(viewHolder, this.f$1, this.f$2));
        }
        int i4 = 53 / 0;
        return Boolean.valueOf(BaseHomeDstActivity.onNavigationEvent(viewHolder, this.f$1, this.f$2));
    }
}
