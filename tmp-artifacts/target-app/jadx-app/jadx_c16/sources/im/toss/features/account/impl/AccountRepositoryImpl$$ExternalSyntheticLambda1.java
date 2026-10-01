package im.toss.features.account.impl;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;
import o.showFavorites;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountRepositoryImpl$$ExternalSyntheticLambda1 implements deserializeIntNullableCollection {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List listOnExtraCallbackWithResult = showFavorites.onExtraCallbackWithResult(this.f$0, obj);
        int i4 = onExtraCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return listOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
