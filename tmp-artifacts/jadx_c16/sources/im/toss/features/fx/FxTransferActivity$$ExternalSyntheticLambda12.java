package im.toss.features.fx;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FxTransferActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        FxTransferActivity fxTransferActivity = this.f$0;
        DialogInterface dialogInterface = (DialogInterface) obj;
        if (i3 == 0) {
            return FxTransferActivity.onWarmupCompleted(fxTransferActivity, dialogInterface);
        }
        Unit unitOnWarmupCompleted = FxTransferActivity.onWarmupCompleted(fxTransferActivity, dialogInterface);
        int i4 = 18 / 0;
        return unitOnWarmupCompleted;
    }
}
