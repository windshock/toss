package im.toss.features.credit.ui.legacy.detail;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditStatusItemDetailActivity$$ExternalSyntheticLambda5 implements deserializeFloat {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditStatusItemDetailActivity.onTransact(this.f$0, obj);
        int i4 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
