package im.toss.features.benefit.ui;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda53 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onNavigationEvent = i2 % 128;
        Context context = (Context) obj;
        if (i2 % 2 != 0) {
            getNameByOperatorName.onTransact(context);
            throw null;
        }
        View viewOnTransact = getNameByOperatorName.onTransact(context);
        int i3 = IAuthTabCallback + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return viewOnTransact;
    }
}
