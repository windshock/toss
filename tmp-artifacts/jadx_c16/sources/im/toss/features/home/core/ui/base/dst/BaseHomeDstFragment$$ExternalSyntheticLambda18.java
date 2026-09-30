package im.toss.features.home.core.ui.base.dst;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstFragment$$ExternalSyntheticLambda18 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ RecyclerView.ViewHolder f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ BaseHomeDstFragment f$3;

    public /* synthetic */ BaseHomeDstFragment$$ExternalSyntheticLambda18(RecyclerView.ViewHolder viewHolder, Object obj, float f, BaseHomeDstFragment baseHomeDstFragment) {
        this.f$0 = viewHolder;
        this.f$1 = obj;
        this.f$2 = f;
        this.f$3 = baseHomeDstFragment;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(BaseHomeDstFragment.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3));
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
