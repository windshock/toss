package im.toss.feature.credit.ui.history.list;

import android.content.DialogInterface;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHistoryActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditHistoryActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (DialogInterface) obj};
        int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        Unit unit = (Unit) CreditHistoryActivity.onWarmupCompleted(1193778521, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr, -1193778521, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent);
        int i4 = IAuthTabCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
