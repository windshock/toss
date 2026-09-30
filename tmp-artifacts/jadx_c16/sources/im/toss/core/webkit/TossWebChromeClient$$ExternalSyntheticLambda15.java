package im.toss.core.webkit;

import android.webkit.JsResult;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.setCircleColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda15 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ JsResult f$1;

    public /* synthetic */ TossWebChromeClient$$ExternalSyntheticLambda15(String str, JsResult jsResult) {
        this.f$0 = str;
        this.f$1 = jsResult;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        if (i3 != 0) {
            return setCircleColor.onExtraCallback(str, this.f$1, (CommonModule_setLeftEdgeTouchEnabled) obj);
        }
        setCircleColor.onExtraCallback(str, this.f$1, (CommonModule_setLeftEdgeTouchEnabled) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
