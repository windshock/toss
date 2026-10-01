package im.toss.features.account.impl.persistence;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RealmTossAccountDao$$ExternalSyntheticLambda4 implements deserializeIntNullableCollection {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        List listOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            listOnExtraCallback = RealmTossAccountDao.onExtraCallback(this.f$0, obj);
            int i3 = 31 / 0;
        } else {
            listOnExtraCallback = RealmTossAccountDao.onExtraCallback(this.f$0, obj);
        }
        int i4 = onExtraCallback + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return listOnExtraCallback;
        }
        throw null;
    }
}
