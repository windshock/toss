package im.toss.features.benefit.ui;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import o.getNameByImsi;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseBenefitItemAdapter$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        View viewIAuthTabCallback = getNameByImsi.IAuthTabCallback((Context) obj);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return viewIAuthTabCallback;
    }
}
