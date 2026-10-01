package im.toss.features.benefit.log;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.TinyAppHostApduService1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitLogManager$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        IAuthTabCallback = i2 % 128;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i2 % 2 != 0) {
            return TinyAppHostApduService1.onExtraCallbackWithResult(setDetectableSize);
        }
        TinyAppHostApduService1.onExtraCallbackWithResult(setDetectableSize);
        throw null;
    }
}
