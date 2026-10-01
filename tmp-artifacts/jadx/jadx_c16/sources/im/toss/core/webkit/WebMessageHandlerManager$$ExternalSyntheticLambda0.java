package im.toss.core.webkit;

import o.setTopGuideText;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class WebMessageHandlerManager$$ExternalSyntheticLambda0 implements Runnable {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ WebMessageHandlerManager$$ExternalSyntheticLambda0(String str, String str2, String str3) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 == 0) {
            setTopGuideText.onExtraCallbackWithResult(str, this.f$1, this.f$2);
        } else {
            setTopGuideText.onExtraCallbackWithResult(str, this.f$1, this.f$2);
            throw null;
        }
    }
}
