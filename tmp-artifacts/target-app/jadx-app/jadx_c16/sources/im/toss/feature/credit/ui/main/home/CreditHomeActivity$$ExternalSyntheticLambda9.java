package im.toss.feature.credit.ui.main.home;

import android.os.Bundle;
import o.FlowRowOverflowCompanionExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHomeActivity$$ExternalSyntheticLambda9 implements FlowRowOverflowCompanionExternalSyntheticLambda2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditHomeActivity f$0;

    public final void onFragmentResult(String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditHomeActivity.onExtraCallbackWithResult(this.f$0, str, bundle);
        int i4 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
