package im.toss.core.webkit;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setCircleColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FragmentActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = setCircleColor.onExtraCallbackWithResult(this.f$0, (DialogInterface) obj);
            int i3 = 96 / 0;
        } else {
            unitOnExtraCallbackWithResult = setCircleColor.onExtraCallbackWithResult(this.f$0, (DialogInterface) obj);
        }
        int i4 = onExtraCallback + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
