package im.toss.features.edoc.wallet;

import kotlin.jvm.functions.Function1;
import o.emitTossBundleLoader_onSendEvent;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletJoinLoadingActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        emitTossBundleLoader_onSendEvent emittossbundleloader_onsendevent = (emitTossBundleLoader_onSendEvent) obj;
        if (i2 % 2 != 0) {
            DocumentWalletJoinLoadingActivity.onExtraCallbackWithResult(emittossbundleloader_onsendevent);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        emitTossBundleLoader_onSendEvent emittossbundleloader_onsendeventOnExtraCallbackWithResult = DocumentWalletJoinLoadingActivity.onExtraCallbackWithResult(emittossbundleloader_onsendevent);
        int i3 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return emittossbundleloader_onsendeventOnExtraCallbackWithResult;
    }
}
