package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda14 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            CreditTestActivity.onExtraCallbackWithResult(this.f$0, ((Boolean) obj).booleanValue());
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = CreditTestActivity.onExtraCallbackWithResult(this.f$0, ((Boolean) obj).booleanValue());
        int i3 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj2.hashCode();
        throw null;
    }
}
