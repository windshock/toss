package im.toss.core.webkit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setTopGuideBackgroundColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class WebMessageCallbackProxy$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ setTopGuideBackgroundColor f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ WebMessageCallbackProxy$$ExternalSyntheticLambda11(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1) {
        this.f$0 = settopguidebackgroundcolor;
        this.f$1 = function1;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setTopGuideBackgroundColor settopguidebackgroundcolor = this.f$0;
        if (i3 == 0) {
            return setTopGuideBackgroundColor.onWarmupCompleted(settopguidebackgroundcolor, this.f$1, (TossCoreWebView) obj);
        }
        Unit unitOnWarmupCompleted = setTopGuideBackgroundColor.onWarmupCompleted(settopguidebackgroundcolor, this.f$1, (TossCoreWebView) obj);
        int i4 = 87 / 0;
        return unitOnWarmupCompleted;
    }
}
