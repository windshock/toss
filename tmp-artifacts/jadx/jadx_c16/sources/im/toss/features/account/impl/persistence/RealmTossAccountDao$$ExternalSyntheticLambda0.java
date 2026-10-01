package im.toss.features.account.impl.persistence;

import io.realm.RealmQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RealmTossAccountDao$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = RealmTossAccountDao.onNavigationEvent((RealmQuery) obj);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return unitOnNavigationEvent;
    }
}
