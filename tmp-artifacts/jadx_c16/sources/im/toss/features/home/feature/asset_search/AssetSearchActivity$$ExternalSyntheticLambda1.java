package im.toss.features.home.feature.asset_search;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetSearchActivity$$ExternalSyntheticLambda1 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ AssetSearchActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(AssetSearchActivity.onExtraCallback(this.f$0, ((Integer) obj).intValue(), (KeyEvent) obj2));
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
