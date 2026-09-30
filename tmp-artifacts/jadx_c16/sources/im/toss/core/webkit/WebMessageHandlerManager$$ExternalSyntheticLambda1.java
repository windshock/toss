package im.toss.core.webkit;

import com.google.gson.JsonObject;
import o.drawTextBox;
import o.setTopGuideText;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class WebMessageHandlerManager$$ExternalSyntheticLambda1 implements Runnable {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ WebViewContentOwner f$0;
    public final /* synthetic */ drawTextBox f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ JsonObject f$4;

    public /* synthetic */ WebMessageHandlerManager$$ExternalSyntheticLambda1(WebViewContentOwner webViewContentOwner, drawTextBox drawtextbox, String str, String str2, JsonObject jsonObject) {
        this.f$0 = webViewContentOwner;
        this.f$1 = drawtextbox;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = jsonObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setTopGuideText.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
        int i4 = onNavigationEvent + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
