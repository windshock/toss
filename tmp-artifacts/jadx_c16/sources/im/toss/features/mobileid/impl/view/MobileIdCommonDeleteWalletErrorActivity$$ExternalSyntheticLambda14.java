package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonDeleteWalletErrorActivity$$ExternalSyntheticLambda14 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ MobileIdCommonDeleteWalletErrorActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = MobileIdCommonDeleteWalletErrorActivity.IAuthTabCallback(this.f$0);
        int i4 = onExtraCallback + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
