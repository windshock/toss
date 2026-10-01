package im.toss.features.home.core.ui.base.dst;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda21 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ RecyclerView.ViewHolder f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ BaseHomeDstActivity f$3;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda21(RecyclerView.ViewHolder viewHolder, Object obj, float f, BaseHomeDstActivity baseHomeDstActivity) {
        this.f$0 = viewHolder;
        this.f$1 = obj;
        this.f$2 = f;
        this.f$3 = baseHomeDstActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(BaseHomeDstActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3));
        int i4 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
