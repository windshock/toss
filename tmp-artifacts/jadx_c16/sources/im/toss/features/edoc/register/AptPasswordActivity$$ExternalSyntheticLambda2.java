package im.toss.features.edoc.register;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptPasswordActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = AptPasswordActivity.onNavigationEvent((CharSequence) obj);
        int i4 = IAuthTabCallback + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }
}
