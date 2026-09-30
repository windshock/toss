package im.toss.features.credit.ui.plus.gift.receive;

import com.google.android.gms.internal.ads.zzaq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.DocumentMatcher2;
import o.RecomposerKt;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftReceiveActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPlusGiftReceiveActivity f$0;
    public final /* synthetic */ DocumentMatcher2 f$1;

    public /* synthetic */ CreditPlusGiftReceiveActivity$$ExternalSyntheticLambda9(CreditPlusGiftReceiveActivity creditPlusGiftReceiveActivity, DocumentMatcher2 documentMatcher2) {
        this.f$0 = creditPlusGiftReceiveActivity;
        this.f$1 = documentMatcher2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, (RecomposerKt) obj};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        Unit unit = (Unit) CreditPlusGiftReceiveActivity.IAuthTabCallback(objArr, 1555988598, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -1555988597, zzaq.onNavigationEvent(), iOnNavigationEvent);
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return unit;
    }
}
