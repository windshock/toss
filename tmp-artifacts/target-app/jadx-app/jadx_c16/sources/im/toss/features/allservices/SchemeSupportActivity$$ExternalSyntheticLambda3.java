package im.toss.features.allservices;

import im.toss.features.allservices.SchemeSupportActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SchemeSupportActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ SchemeSupportActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = SchemeSupportActivity.onExtraCallback(this.f$0, (SchemeSupportActivity.onNavigationEvent) obj);
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
