package im.toss.features.home.ui.view.lock;

import android.content.DialogInterface;
import com.iap.android.mppclient.container.constant.JsParamKeys;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeHideAmountOfferBottomSheetActivity$$ExternalSyntheticLambda2 implements DialogInterface.OnDismissListener {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeHideAmountOfferBottomSheetActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, dialogInterface};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        HomeHideAmountOfferBottomSheetActivity.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2113308532, JsParamKeys.onExtraCallbackWithResult(), objArr, 2113308534, iOnExtraCallbackWithResult2);
        int i4 = onExtraCallback + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
