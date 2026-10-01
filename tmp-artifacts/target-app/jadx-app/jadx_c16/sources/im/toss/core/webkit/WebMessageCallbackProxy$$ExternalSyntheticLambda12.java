package im.toss.core.webkit;

import kotlin.jvm.functions.Function1;
import o.setTopGuideBackgroundColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class WebMessageCallbackProxy$$ExternalSyntheticLambda12 implements Runnable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ setTopGuideBackgroundColor f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ WebMessageCallbackProxy$$ExternalSyntheticLambda12(setTopGuideBackgroundColor settopguidebackgroundcolor, Function1 function1) {
        this.f$0 = settopguidebackgroundcolor;
        this.f$1 = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setTopGuideBackgroundColor settopguidebackgroundcolor = this.f$0;
        if (i3 != 0) {
            setTopGuideBackgroundColor.onExtraCallback(settopguidebackgroundcolor, this.f$1);
        } else {
            setTopGuideBackgroundColor.onExtraCallback(settopguidebackgroundcolor, this.f$1);
            int i4 = 55 / 0;
        }
    }
}
