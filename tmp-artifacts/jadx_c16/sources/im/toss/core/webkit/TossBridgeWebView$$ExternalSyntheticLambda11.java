package im.toss.core.webkit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBridgeWebView$$ExternalSyntheticLambda11 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ TossBridgeWebView f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ TossBridgeWebView$$ExternalSyntheticLambda11(TossBridgeWebView tossBridgeWebView, String str) {
        this.f$0 = tossBridgeWebView;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = TossBridgeWebView.onNavigationEvent(this.f$0, this.f$1, (Function1) obj);
        int i4 = onNavigationEvent + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
