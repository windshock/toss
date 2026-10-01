package im.toss.features.foreigner.home.ui.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.setCallUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerHomeTestScreenKt$$ExternalSyntheticLambda21 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            setCallUrl.IAuthTabCallback_Parcel();
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback_Parcel = setCallUrl.IAuthTabCallback_Parcel();
        int i3 = onNavigationEvent + 119;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback_Parcel;
        }
        obj.hashCode();
        throw null;
    }
}
