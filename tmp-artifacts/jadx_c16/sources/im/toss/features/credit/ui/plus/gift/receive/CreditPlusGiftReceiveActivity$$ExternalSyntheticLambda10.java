package im.toss.features.credit.ui.plus.gift.receive;

import com.google.android.gms.internal.ads.zzaq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.DocumentMatcher2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftReceiveActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CreditPlusGiftReceiveActivity f$0;
    public final /* synthetic */ DocumentMatcher2 f$1;

    public /* synthetic */ CreditPlusGiftReceiveActivity$$ExternalSyntheticLambda10(CreditPlusGiftReceiveActivity creditPlusGiftReceiveActivity, DocumentMatcher2 documentMatcher2) {
        this.f$0 = creditPlusGiftReceiveActivity;
        this.f$1 = documentMatcher2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, (Throwable) obj};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        Unit unit = (Unit) CreditPlusGiftReceiveActivity.IAuthTabCallback(objArr, -116500134, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 116500138, zzaq.onNavigationEvent(), iOnNavigationEvent);
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
