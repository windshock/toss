package im.toss.features.home.core.ui.widget;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import o.handleSetNode;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeCardBillDetailFilterView$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ HomeCardBillDetailFilterView f$1;

    public /* synthetic */ HomeCardBillDetailFilterView$$ExternalSyntheticLambda1(Context context, HomeCardBillDetailFilterView homeCardBillDetailFilterView) {
        this.f$0 = context;
        this.f$1 = homeCardBillDetailFilterView;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            HomeCardBillDetailFilterView.onExtraCallback(this.f$0, this.f$1);
            throw null;
        }
        handleSetNode handlesetnodeOnExtraCallback = HomeCardBillDetailFilterView.onExtraCallback(this.f$0, this.f$1);
        int i3 = onWarmupCompleted + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return handlesetnodeOnExtraCallback;
    }
}
