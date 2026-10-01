package im.toss.core.webkit;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setCircleColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ FragmentActivity f$0;
    public final /* synthetic */ setCircleColor f$1;

    public /* synthetic */ TossWebChromeClient$$ExternalSyntheticLambda2(FragmentActivity fragmentActivity, setCircleColor setcirclecolor) {
        this.f$0 = fragmentActivity;
        this.f$1 = setcirclecolor;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = setCircleColor.onWarmupCompleted(this.f$0, this.f$1, (Throwable) obj);
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
