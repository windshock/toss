package im.toss.features.account.impl.persistence;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RealmTossAccountDao$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List listOnWarmupCompleted = RealmTossAccountDao.onWarmupCompleted((List) obj);
        int i4 = onExtraCallbackWithResult + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return listOnWarmupCompleted;
    }
}
