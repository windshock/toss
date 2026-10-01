package im.toss.core.webkit.bridge.accessarybutton;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.imageBase64String;
import o.setTopGuideBackgroundColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccessoryButtonHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ setTopGuideBackgroundColor f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            imageBase64String.onNavigationEvent(this.f$0, (String) obj);
            throw null;
        }
        Unit unitOnNavigationEvent = imageBase64String.onNavigationEvent(this.f$0, (String) obj);
        int i3 = onExtraCallback + 9;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return unitOnNavigationEvent;
    }
}
