package im.toss.core.webkit;

import android.webkit.JsResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.setCircleColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda14 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ JsResult f$1;

    public /* synthetic */ TossWebChromeClient$$ExternalSyntheticLambda14(String str, JsResult jsResult) {
        this.f$0 = str;
        this.f$1 = jsResult;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 != 0) {
            return setCircleColor.onNavigationEvent(str, this.f$1, (CommonModule_setLeftEdgeTouchEnabled) obj);
        }
        Unit unitOnNavigationEvent = setCircleColor.onNavigationEvent(str, this.f$1, (CommonModule_setLeftEdgeTouchEnabled) obj);
        int i4 = 69 / 0;
        return unitOnNavigationEvent;
    }
}
