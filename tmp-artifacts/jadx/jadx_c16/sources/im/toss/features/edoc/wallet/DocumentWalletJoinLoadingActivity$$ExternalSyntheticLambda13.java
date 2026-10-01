package im.toss.features.edoc.wallet;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletJoinLoadingActivity$$ExternalSyntheticLambda13 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Throwable f$0;
    public final /* synthetic */ DocumentWalletJoinLoadingActivity f$1;

    public /* synthetic */ DocumentWalletJoinLoadingActivity$$ExternalSyntheticLambda13(Throwable th, DocumentWalletJoinLoadingActivity documentWalletJoinLoadingActivity) {
        this.f$0 = th;
        this.f$1 = documentWalletJoinLoadingActivity;
    }

    public final Object invoke() {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = DocumentWalletJoinLoadingActivity.onNavigationEvent(this.f$0, this.f$1);
            int i3 = 1 / 0;
        } else {
            unitOnNavigationEvent = DocumentWalletJoinLoadingActivity.onNavigationEvent(this.f$0, this.f$1);
        }
        int i4 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
