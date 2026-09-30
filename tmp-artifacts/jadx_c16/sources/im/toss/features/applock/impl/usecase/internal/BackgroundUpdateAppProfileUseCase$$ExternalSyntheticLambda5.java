package im.toss.features.applock.impl.usecase.internal;

import kotlin.jvm.functions.Function1;
import o.RVServerMsgHandler;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundUpdateAppProfileUseCase$$ExternalSyntheticLambda5 implements deserializeFloat {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RVServerMsgHandler.onExtraCallbackWithResult(this.f$0, obj);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
    }
}
