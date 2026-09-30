package im.toss.features.ble;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import o.putTabBarModel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BLEPermissionsKt$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Context f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = putTabBarModel.asInterface(this.f$0);
        if (i3 != 0) {
            return Boolean.valueOf(zAsInterface);
        }
        Boolean.valueOf(zAsInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
