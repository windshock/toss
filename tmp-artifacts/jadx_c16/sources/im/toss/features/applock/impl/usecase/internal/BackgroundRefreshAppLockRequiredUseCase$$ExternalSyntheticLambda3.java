package im.toss.features.applock.impl.usecase.internal;

import kotlin.jvm.functions.Function1;
import o.RemoteExtension;
import o.deserializeLongCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BackgroundRefreshAppLockRequiredUseCase$$ExternalSyntheticLambda3 implements deserializeLongCollection {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function1 f$0;

    public final boolean test(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = RemoteExtension.IAuthTabCallback(this.f$0, obj);
        int i4 = onExtraCallbackWithResult + 73;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return zIAuthTabCallback;
    }
}
