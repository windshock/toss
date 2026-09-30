package im.toss.feature.credit.ui.main.test;

import android.view.View;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda11 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getTypedExportedConstants f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, view};
            int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            CreditTestActivity.onWarmupCompleted(1155787098, iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1155787076, objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2);
            throw null;
        }
        Object[] objArr2 = {this.f$0, view};
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        CreditTestActivity.onWarmupCompleted(1155787098, iOnExtraCallback3, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1155787076, objArr2, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback4);
        int i3 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
