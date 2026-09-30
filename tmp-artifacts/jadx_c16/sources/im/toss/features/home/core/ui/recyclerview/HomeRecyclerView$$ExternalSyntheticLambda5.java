package im.toss.features.home.core.ui.recyclerview;

import kotlin.jvm.functions.Function0;
import o.ErrorNoLogBuilder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeRecyclerView$$ExternalSyntheticLambda5 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ HomeRecyclerView f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ErrorNoLogBuilder errorNoLogBuilderOnWarmupCompleted = HomeRecyclerView.onWarmupCompleted(this.f$0);
        int i4 = onExtraCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return errorNoLogBuilderOnWarmupCompleted;
    }
}
