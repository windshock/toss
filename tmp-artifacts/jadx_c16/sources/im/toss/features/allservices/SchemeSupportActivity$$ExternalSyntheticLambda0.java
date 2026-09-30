package im.toss.features.allservices;

import im.toss.features.allservices.SchemeSupportActivity;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SchemeSupportActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ SchemeSupportActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SchemeSupportActivity schemeSupportActivity = this.f$0;
        SchemeSupportActivity.onNavigationEvent onnavigationevent = (SchemeSupportActivity.onNavigationEvent) obj;
        if (i3 == 0) {
            return SchemeSupportActivity.onExtraCallbackWithResult(schemeSupportActivity, onnavigationevent);
        }
        SchemeSupportActivity.onExtraCallbackWithResult(schemeSupportActivity, onnavigationevent);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
