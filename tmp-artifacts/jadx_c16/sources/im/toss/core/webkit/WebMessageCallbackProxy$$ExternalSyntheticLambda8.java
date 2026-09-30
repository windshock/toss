package im.toss.core.webkit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.setTopGuideBackgroundColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class WebMessageCallbackProxy$$ExternalSyntheticLambda8 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        Object obj3 = null;
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) obj;
        Function1 function1 = (Function1) obj2;
        if (i2 % 2 != 0) {
            setTopGuideBackgroundColor.IAuthTabCallback(settopguidebackgroundcolor, function1);
            obj3.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = setTopGuideBackgroundColor.IAuthTabCallback(settopguidebackgroundcolor, function1);
        int i3 = IAuthTabCallback + 81;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj3.hashCode();
        throw null;
    }
}
