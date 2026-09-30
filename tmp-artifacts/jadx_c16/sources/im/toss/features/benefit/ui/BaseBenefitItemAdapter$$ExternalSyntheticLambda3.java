package im.toss.features.benefit.ui;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import o.getNameByImsi;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseBenefitItemAdapter$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewOnExtraCallbackWithResult = getNameByImsi.onExtraCallbackWithResult((Context) obj);
        int i4 = onExtraCallback + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return viewOnExtraCallbackWithResult;
    }
}
