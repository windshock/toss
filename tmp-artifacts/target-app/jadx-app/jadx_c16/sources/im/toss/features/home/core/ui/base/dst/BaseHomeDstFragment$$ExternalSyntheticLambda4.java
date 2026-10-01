package im.toss.features.home.core.ui.base.dst;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstFragment$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ RecyclerView.ViewHolder f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ BaseHomeDstFragment f$3;

    public /* synthetic */ BaseHomeDstFragment$$ExternalSyntheticLambda4(RecyclerView.ViewHolder viewHolder, Object obj, float f, BaseHomeDstFragment baseHomeDstFragment) {
        this.f$0 = viewHolder;
        this.f$1 = obj;
        this.f$2 = f;
        this.f$3 = baseHomeDstFragment;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView.ViewHolder viewHolder = this.f$0;
        if (i3 != 0) {
            return Boolean.valueOf(BaseHomeDstFragment.IAuthTabCallbackDefault(viewHolder, this.f$1, this.f$2, this.f$3));
        }
        int i4 = 49 / 0;
        return Boolean.valueOf(BaseHomeDstFragment.IAuthTabCallbackDefault(viewHolder, this.f$1, this.f$2, this.f$3));
    }
}
