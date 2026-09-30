package im.toss.feature.credit.ui.main.home.raise_edge_case;

import android.content.Context;
import im.toss.uikit.widget.TdsSkeletonV1View;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditScoreRaiseCoolTimeActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TdsSkeletonV1View tdsSkeletonV1ViewIAuthTabCallback = CreditScoreRaiseCoolTimeActivity.IAuthTabCallback((Context) obj);
        int i4 = onNavigationEvent + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return tdsSkeletonV1ViewIAuthTabCallback;
    }
}
