package im.toss.features.account.impl;

import kotlin.jvm.functions.Function1;
import o.ErrorView;
import o.showFavorites;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountRepositoryImpl$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        ErrorView.onExtraCallbackWithResult onextracallbackwithresult = (ErrorView.onExtraCallbackWithResult) obj;
        if (i2 % 2 == 0) {
            return showFavorites.onExtraCallbackWithResult(onextracallbackwithresult);
        }
        showFavorites.onExtraCallbackWithResult(onextracallbackwithresult);
        throw null;
    }
}
