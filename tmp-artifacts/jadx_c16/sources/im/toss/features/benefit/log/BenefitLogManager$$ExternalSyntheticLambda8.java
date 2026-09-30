package im.toss.features.benefit.log;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.TinyAppHostApduService1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitLogManager$$ExternalSyntheticLambda8 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i2 % 2 != 0) {
            TinyAppHostApduService1.onNavigationEvent(setDetectableSize);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = TinyAppHostApduService1.onNavigationEvent(setDetectableSize);
        int i3 = onNavigationEvent + 103;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj2.hashCode();
        throw null;
    }
}
