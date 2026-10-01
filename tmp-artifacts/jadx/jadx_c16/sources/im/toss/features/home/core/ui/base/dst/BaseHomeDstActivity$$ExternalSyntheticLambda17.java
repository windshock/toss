package im.toss.features.home.core.ui.base.dst;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda17 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ RecyclerView.ViewHolder f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ BaseHomeDstActivity f$3;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda17(RecyclerView.ViewHolder viewHolder, Object obj, float f, BaseHomeDstActivity baseHomeDstActivity) {
        this.f$0 = viewHolder;
        this.f$1 = obj;
        this.f$2 = f;
        this.f$3 = baseHomeDstActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView.ViewHolder viewHolder = this.f$0;
        if (i3 != 0) {
            return Boolean.valueOf(BaseHomeDstActivity.onExtraCallbackWithResult(viewHolder, this.f$1, this.f$2, this.f$3));
        }
        int i4 = 97 / 0;
        return Boolean.valueOf(BaseHomeDstActivity.onExtraCallbackWithResult(viewHolder, this.f$1, this.f$2, this.f$3));
    }
}
