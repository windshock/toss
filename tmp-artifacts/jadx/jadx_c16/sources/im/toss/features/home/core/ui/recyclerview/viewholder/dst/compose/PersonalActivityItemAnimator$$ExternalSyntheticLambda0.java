package im.toss.features.home.core.ui.recyclerview.viewholder.dst.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.isGetMethod;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PersonalActivityItemAnimator$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ isGetMethod f$0;

    public final Object invoke(Object obj) {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = isGetMethod.IAuthTabCallback(this.f$0, ((Float) obj).floatValue());
            int i3 = 94 / 0;
        } else {
            unitIAuthTabCallback = isGetMethod.IAuthTabCallback(this.f$0, ((Float) obj).floatValue());
        }
        int i4 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
