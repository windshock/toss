package im.toss.features.edoc;

import kotlin.jvm.functions.Function1;
import viva.republica.toss.network.model.electronicdocument.wallet.ExistDocument;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssueCandidatesActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = EDocIssueCandidatesActivity.onNavigationEvent((ExistDocument) obj);
        int i4 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
