package im.toss.features.home.feature.home_asset.edit;

import kotlin.jvm.functions.Function1;
import o.Interruptable$IAuthTabCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditV2ViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        boolean zOnExtraCallback = HomeAssetEditV2ViewModel.onExtraCallback((Interruptable$IAuthTabCallback) obj);
        if (i3 == 0) {
            Boolean.valueOf(zOnExtraCallback);
            obj2.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(zOnExtraCallback);
        int i4 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        obj2.hashCode();
        throw null;
    }
}
