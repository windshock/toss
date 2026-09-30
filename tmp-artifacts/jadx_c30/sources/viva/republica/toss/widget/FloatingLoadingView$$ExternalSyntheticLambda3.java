package viva.republica.toss.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class FloatingLoadingView$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = FloatingLoadingView.IAuthTabCallback((Throwable) obj);
        int i4 = IAuthTabCallback + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return unitIAuthTabCallback;
    }
}
