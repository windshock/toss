package im.toss.core.webkit;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.setCircleColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ FragmentActivity f$1;

    public /* synthetic */ TossWebChromeClient$$ExternalSyntheticLambda1(String str, FragmentActivity fragmentActivity) {
        this.f$0 = str;
        this.f$1 = fragmentActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = setCircleColor.onExtraCallbackWithResult(this.f$0, this.f$1, (CommonModule_setLeftEdgeTouchEnabled) obj);
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
