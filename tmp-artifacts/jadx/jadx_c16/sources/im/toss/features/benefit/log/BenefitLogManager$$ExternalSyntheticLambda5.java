package im.toss.features.benefit.log;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RotationVectorAbility1;
import o.SetDetectableSize;
import o.TinyAppHostApduService1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitLogManager$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ RotationVectorAbility1.onExtraCallback f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ BenefitLogManager$$ExternalSyntheticLambda5(RotationVectorAbility1.onExtraCallback onextracallback, String str) {
        this.f$0 = onextracallback;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = TinyAppHostApduService1.onNavigationEvent(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onExtraCallbackWithResult + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
