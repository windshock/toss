package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda52 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = CreditTestActivity.readTypedObject(this.f$0);
        int i4 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }
}
