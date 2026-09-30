package im.toss.features.applock.impl.usecase.internal;

import kotlin.jvm.functions.Function1;
import o.RemoteExtension;
import o.deserializeIntNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundRefreshAppLockRequiredUseCase$$ExternalSyntheticLambda9 implements deserializeIntNullableCollection {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Function1 function1 = this.f$0;
        if (i3 != 0) {
            return RemoteExtension.onExtraCallback(function1, obj);
        }
        RemoteExtension.onExtraCallback(function1, obj);
        throw null;
    }
}
