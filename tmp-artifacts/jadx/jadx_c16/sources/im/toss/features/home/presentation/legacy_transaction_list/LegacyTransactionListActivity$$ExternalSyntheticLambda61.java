package im.toss.features.home.presentation.legacy_transaction_list;

import android.view.View;
import o.getTypedExportedConstants;
import o.shouldInterceptWebViewNaviJsApi;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda61 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LegacyTransactionListActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ shouldInterceptWebViewNaviJsApi f$2;
    public final /* synthetic */ getTypedExportedConstants f$3;

    public /* synthetic */ LegacyTransactionListActivity$$ExternalSyntheticLambda61(LegacyTransactionListActivity legacyTransactionListActivity, String str, shouldInterceptWebViewNaviJsApi shouldinterceptwebviewnavijsapi, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = legacyTransactionListActivity;
        this.f$1 = str;
        this.f$2 = shouldinterceptwebviewnavijsapi;
        this.f$3 = gettypedexportedconstants;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            LegacyTransactionListActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, view);
            int i3 = 39 / 0;
        } else {
            LegacyTransactionListActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, view);
        }
        int i4 = IAuthTabCallback + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
