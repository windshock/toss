package im.toss.features.home.core.ui.recyclerview.util;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeSmoothScrollLinearLayoutManager$$ExternalSyntheticLambda0 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnExtraCallback = HomeSmoothScrollLinearLayoutManager.onExtraCallback();
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return pairOnExtraCallback;
    }
}
