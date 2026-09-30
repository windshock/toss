package im.toss.compose.v3.textfield;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsTextFieldV3View$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function1 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayoutOnWarmupCompleted = TdsTextFieldV3View.onWarmupCompleted(this.f$0, (Context) obj);
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return linearLayoutOnWarmupCompleted;
    }
}
