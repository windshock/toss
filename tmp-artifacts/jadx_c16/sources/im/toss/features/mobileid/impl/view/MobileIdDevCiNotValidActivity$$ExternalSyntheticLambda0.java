package im.toss.features.mobileid.impl.view;

import android.view.View;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdDevCiNotValidActivity$$ExternalSyntheticLambda0 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MobileIdDevCiNotValidActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, view};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        if (i3 != 0) {
            MobileIdDevCiNotValidActivity.onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1053803206, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 1053803206, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr);
        } else {
            MobileIdDevCiNotValidActivity.onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1053803206, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, 1053803206, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr);
            throw null;
        }
    }
}
