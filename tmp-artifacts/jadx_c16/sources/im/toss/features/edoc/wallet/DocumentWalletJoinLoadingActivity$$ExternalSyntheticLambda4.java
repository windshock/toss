package im.toss.features.edoc.wallet;

import kotlin.jvm.functions.Function1;
import o.emitTossBundleLoader_onSendEvent;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletJoinLoadingActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ DocumentWalletJoinLoadingActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        DocumentWalletJoinLoadingActivity documentWalletJoinLoadingActivity = this.f$0;
        emitTossBundleLoader_onSendEvent emittossbundleloader_onsendevent = (emitTossBundleLoader_onSendEvent) obj;
        if (i3 == 0) {
            return DocumentWalletJoinLoadingActivity.onWarmupCompleted(documentWalletJoinLoadingActivity, emittossbundleloader_onsendevent);
        }
        DocumentWalletJoinLoadingActivity.onWarmupCompleted(documentWalletJoinLoadingActivity, emittossbundleloader_onsendevent);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
