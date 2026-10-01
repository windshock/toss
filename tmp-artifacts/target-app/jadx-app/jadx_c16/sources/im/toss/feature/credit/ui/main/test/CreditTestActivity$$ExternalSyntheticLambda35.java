package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda35 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnPostMessage = CreditTestActivity.onPostMessage(this.f$0);
        int i4 = onExtraCallbackWithResult + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return unitOnPostMessage;
    }
}
