package im.toss.features.foreigner.home.ui.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            setCallUrl.access000();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAccess000 = setCallUrl.access000();
        int i3 = onWarmupCompleted + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitAccess000;
    }
}
