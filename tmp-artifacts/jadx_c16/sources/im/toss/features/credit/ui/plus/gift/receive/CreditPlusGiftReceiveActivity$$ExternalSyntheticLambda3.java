package im.toss.features.credit.ui.plus.gift.receive;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftReceiveActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ getTypedExportedConstants f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            CreditPlusGiftReceiveActivity.onNavigationEvent(this.f$0, (View) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = CreditPlusGiftReceiveActivity.onNavigationEvent(this.f$0, (View) obj);
        int i3 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
