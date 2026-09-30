package im.toss.features.benefit.ui;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda49 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewIAuthTabCallbackDefault = getNameByOperatorName.IAuthTabCallbackDefault((Context) obj);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        int i5 = onExtraCallback + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return viewIAuthTabCallbackDefault;
    }
}
