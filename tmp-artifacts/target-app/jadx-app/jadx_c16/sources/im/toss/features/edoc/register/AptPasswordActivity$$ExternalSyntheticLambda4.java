package im.toss.features.edoc.register;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import o.rmdir;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptPasswordActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Ref.BooleanRef f$0;
    public final /* synthetic */ AptPasswordActivity f$1;
    public final /* synthetic */ rmdir f$2;

    public /* synthetic */ AptPasswordActivity$$ExternalSyntheticLambda4(Ref.BooleanRef booleanRef, AptPasswordActivity aptPasswordActivity, rmdir rmdirVar) {
        this.f$0 = booleanRef;
        this.f$1 = aptPasswordActivity;
        this.f$2 = rmdirVar;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Ref.BooleanRef booleanRef = this.f$0;
        if (i3 != 0) {
            return AptPasswordActivity.onNavigationEvent(booleanRef, this.f$1, this.f$2, (String) obj);
        }
        Unit unitOnNavigationEvent = AptPasswordActivity.onNavigationEvent(booleanRef, this.f$1, this.f$2, (String) obj);
        int i4 = 26 / 0;
        return unitOnNavigationEvent;
    }
}
