package im.toss.features.benefit.ui;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda51 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        View viewOnExtraCallback = getNameByOperatorName.onExtraCallback((Context) obj);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return viewOnExtraCallback;
    }
}
