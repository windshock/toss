package im.toss.features.account.impl;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.showFavorites;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountRepositoryImpl$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List listOnNavigationEvent = showFavorites.onNavigationEvent((List) obj);
        int i4 = IAuthTabCallback + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return listOnNavigationEvent;
    }
}
