package im.toss.features.fx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.TypeUtils2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ FxTransferActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = FxTransferActivity.IAuthTabCallback(this.f$0, (TypeUtils2) obj);
            int i3 = 6 / 0;
        } else {
            unitIAuthTabCallback = FxTransferActivity.IAuthTabCallback(this.f$0, (TypeUtils2) obj);
        }
        int i4 = IAuthTabCallback + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
