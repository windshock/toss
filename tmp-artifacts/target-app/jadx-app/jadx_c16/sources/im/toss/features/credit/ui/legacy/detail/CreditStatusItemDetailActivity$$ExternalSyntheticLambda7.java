package im.toss.features.credit.ui.legacy.detail;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditStatusItemDetailActivity$$ExternalSyntheticLambda7 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditStatusItemDetailActivity.IAuthTabCallbackDefault(this.f$0, obj);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
    }
}
