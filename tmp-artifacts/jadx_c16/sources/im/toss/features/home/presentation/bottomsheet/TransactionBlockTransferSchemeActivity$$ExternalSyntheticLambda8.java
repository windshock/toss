package im.toss.features.home.presentation.bottomsheet;

import im.toss.uikit.widget.snackbar.TdsToastV1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionBlockTransferSchemeActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ TransactionBlockTransferSchemeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            TransactionBlockTransferSchemeActivity.onNavigationEvent(this.f$0, (TdsToastV1) obj);
            throw null;
        }
        Unit unitOnNavigationEvent = TransactionBlockTransferSchemeActivity.onNavigationEvent(this.f$0, (TdsToastV1) obj);
        int i3 = IAuthTabCallback + 19;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
