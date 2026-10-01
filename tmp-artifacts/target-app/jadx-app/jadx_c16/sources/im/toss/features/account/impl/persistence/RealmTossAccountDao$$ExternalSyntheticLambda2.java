package im.toss.features.account.impl.persistence;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RealmTossAccountDao$$ExternalSyntheticLambda2 implements deserializeIntNullableCollection {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List listIAuthTabCallback = RealmTossAccountDao.IAuthTabCallback(this.f$0, obj);
        int i4 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return listIAuthTabCallback;
    }
}
