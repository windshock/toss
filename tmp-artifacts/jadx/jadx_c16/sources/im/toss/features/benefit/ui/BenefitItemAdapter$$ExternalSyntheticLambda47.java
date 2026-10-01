package im.toss.features.benefit.ui;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda47 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i2 % 128;
        Context context = (Context) obj;
        if (i2 % 2 != 0) {
            getNameByOperatorName.IAuthTabCallbackStub(context);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        View viewIAuthTabCallbackStub = getNameByOperatorName.IAuthTabCallbackStub(context);
        int i3 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return viewIAuthTabCallbackStub;
    }
}
