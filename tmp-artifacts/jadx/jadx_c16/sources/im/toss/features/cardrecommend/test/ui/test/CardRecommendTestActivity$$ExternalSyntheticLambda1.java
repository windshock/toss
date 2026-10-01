package im.toss.features.cardrecommend.test.ui.test;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardRecommendTestActivity$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function0 f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CardRecommendTestActivity.onNavigationEvent(this.f$0, view);
        int i4 = onWarmupCompleted + 11;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }
}
