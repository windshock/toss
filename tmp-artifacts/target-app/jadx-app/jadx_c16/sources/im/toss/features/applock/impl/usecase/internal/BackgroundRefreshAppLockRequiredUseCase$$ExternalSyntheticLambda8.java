package im.toss.features.applock.impl.usecase.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RemoteExtension;
import o.serializeRaw;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundRefreshAppLockRequiredUseCase$$ExternalSyntheticLambda8 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ RemoteExtension f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serializeRaw serializerawOnExtraCallbackWithResult = RemoteExtension.onExtraCallbackWithResult(this.f$0, (Unit) obj);
        int i4 = IAuthTabCallback + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return serializerawOnExtraCallbackWithResult;
    }
}
