package im.toss.features.benefit.log;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.TinyAppHostApduService1;
import o.registerDefault;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitLogManager$$ExternalSyntheticLambda7 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ registerDefault f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ BenefitLogManager$$ExternalSyntheticLambda7(registerDefault registerdefault, String str) {
        this.f$0 = registerdefault;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        registerDefault registerdefault = this.f$0;
        if (i3 == 0) {
            return TinyAppHostApduService1.onWarmupCompleted(registerdefault, this.f$1, (SetDetectableSize) obj);
        }
        TinyAppHostApduService1.onWarmupCompleted(registerdefault, this.f$1, (SetDetectableSize) obj);
        throw null;
    }
}
