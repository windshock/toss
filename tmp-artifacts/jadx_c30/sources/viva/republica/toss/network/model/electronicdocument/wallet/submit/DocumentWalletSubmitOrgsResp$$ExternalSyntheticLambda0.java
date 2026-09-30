package viva.republica.toss.network.model.electronicdocument.wallet.submit;

import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class DocumentWalletSubmitOrgsResp$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = DocumentWalletSubmitOrgsResp.onExtraCallback();
        int i4 = onExtraCallback + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }
}
