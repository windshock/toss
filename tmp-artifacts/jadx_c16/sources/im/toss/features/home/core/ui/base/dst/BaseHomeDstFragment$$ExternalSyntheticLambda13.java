package im.toss.features.home.core.ui.base.dst;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstFragment$$ExternalSyntheticLambda13 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ RecyclerView.ViewHolder f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ BaseHomeDstFragment f$3;

    public /* synthetic */ BaseHomeDstFragment$$ExternalSyntheticLambda13(RecyclerView.ViewHolder viewHolder, Object obj, float f, BaseHomeDstFragment baseHomeDstFragment) {
        this.f$0 = viewHolder;
        this.f$1 = obj;
        this.f$2 = f;
        this.f$3 = baseHomeDstFragment;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(BaseHomeDstFragment.onTransact(this.f$0, this.f$1, this.f$2, this.f$3));
        int i4 = IAuthTabCallback + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }
}
