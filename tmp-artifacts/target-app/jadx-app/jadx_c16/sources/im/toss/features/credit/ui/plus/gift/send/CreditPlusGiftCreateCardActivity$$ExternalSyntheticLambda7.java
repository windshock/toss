package im.toss.features.credit.ui.plus.gift.send;

import android.view.View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftCreateCardActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ TdsBottomCtaV1View f$0;
    public final /* synthetic */ CreditPlusGiftCreateCardActivity f$1;

    public /* synthetic */ CreditPlusGiftCreateCardActivity$$ExternalSyntheticLambda7(TdsBottomCtaV1View tdsBottomCtaV1View, CreditPlusGiftCreateCardActivity creditPlusGiftCreateCardActivity) {
        this.f$0 = tdsBottomCtaV1View;
        this.f$1 = creditPlusGiftCreateCardActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TdsBottomCtaV1View tdsBottomCtaV1View = this.f$0;
        if (i3 != 0) {
            return CreditPlusGiftCreateCardActivity.IAuthTabCallback(tdsBottomCtaV1View, this.f$1, (View) obj);
        }
        CreditPlusGiftCreateCardActivity.IAuthTabCallback(tdsBottomCtaV1View, this.f$1, (View) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
