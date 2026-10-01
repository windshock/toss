package im.toss.features.kyc.edd;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;
import o.readToArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EddInfoRepository$$ExternalSyntheticLambda1 implements deserializeIntNullableCollection {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List listOnExtraCallback = readToArray.onExtraCallback(this.f$0, obj);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return listOnExtraCallback;
    }
}
