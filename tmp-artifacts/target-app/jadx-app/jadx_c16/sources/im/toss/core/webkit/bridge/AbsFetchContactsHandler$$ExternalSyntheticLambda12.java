package im.toss.core.webkit.bridge;

import com.google.gson.JsonArray;
import im.toss.core.webkit.WebViewContentOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setTopGuideBackgroundColor;
import o.surfaceDestroyed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AbsFetchContactsHandler$$ExternalSyntheticLambda12 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ surfaceDestroyed f$2;
    public final /* synthetic */ setTopGuideBackgroundColor f$3;
    public final /* synthetic */ WebViewContentOwner f$4;
    public final /* synthetic */ String f$5;

    public /* synthetic */ AbsFetchContactsHandler$$ExternalSyntheticLambda12(int i, int i2, surfaceDestroyed surfacedestroyed, setTopGuideBackgroundColor settopguidebackgroundcolor, WebViewContentOwner webViewContentOwner, String str) {
        this.f$0 = i;
        this.f$1 = i2;
        this.f$2 = surfacedestroyed;
        this.f$3 = settopguidebackgroundcolor;
        this.f$4 = webViewContentOwner;
        this.f$5 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = surfaceDestroyed.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (JsonArray) obj);
        int i4 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
