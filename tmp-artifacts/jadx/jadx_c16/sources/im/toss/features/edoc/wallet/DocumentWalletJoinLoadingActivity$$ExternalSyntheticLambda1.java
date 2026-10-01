package im.toss.features.edoc.wallet;

import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;
import o.emitTossBundleLoader_onSendEvent;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletJoinLoadingActivity$$ExternalSyntheticLambda1 implements deserializeIntNullableCollection {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        emitTossBundleLoader_onSendEvent emittossbundleloader_onsendeventOnTransact;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            emittossbundleloader_onsendeventOnTransact = DocumentWalletJoinLoadingActivity.onTransact(this.f$0, obj);
            int i3 = 36 / 0;
        } else {
            emittossbundleloader_onsendeventOnTransact = DocumentWalletJoinLoadingActivity.onTransact(this.f$0, obj);
        }
        int i4 = onExtraCallback + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return emittossbundleloader_onsendeventOnTransact;
    }
}
