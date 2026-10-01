package im.toss.features.home.ui.dst.view.investment.portfolio.select.account;

import android.content.DialogInterface;
import com.google.android.gms.internal.ads.zziea;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstInvestmentSelectAccountBottomSheetActivity$$ExternalSyntheticLambda1 implements DialogInterface.OnDismissListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ HomeDstInvestmentSelectAccountBottomSheetActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeDstInvestmentSelectAccountBottomSheetActivity.onExtraCallbackWithResult(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{this.f$0, dialogInterface}, zziea.IAuthTabCallback(), 691895724, -691895722, zziea.IAuthTabCallback());
        int i4 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
