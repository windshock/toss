package im.toss.core.webkit.bridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda14 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = surfaceDestroyed.IAuthTabCallback((Throwable) obj);
        int i4 = IAuthTabCallback + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
