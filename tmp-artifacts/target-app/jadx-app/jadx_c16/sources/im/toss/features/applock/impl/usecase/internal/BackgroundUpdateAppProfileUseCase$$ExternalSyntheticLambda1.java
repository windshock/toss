package im.toss.features.applock.impl.usecase.internal;

import kotlin.jvm.functions.Function1;
import o.RVServerMsgHandler;
import o.deserializeLongCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundUpdateAppProfileUseCase$$ExternalSyntheticLambda1 implements deserializeLongCollection {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final boolean test(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Function1 function1 = this.f$0;
        if (i3 != 0) {
            return RVServerMsgHandler.onExtraCallback(function1, obj);
        }
        RVServerMsgHandler.onExtraCallback(function1, obj);
        throw null;
    }
}
