package viva.republica.toss.network.model.electronicdocument.wallet.submit;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DocumentWalletSubmitOrgsResp$Companion {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public /* synthetic */ DocumentWalletSubmitOrgsResp$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DocumentWalletSubmitOrgsResp$Companion() {
    }

    public final KSerializer<DocumentWalletSubmitOrgsResp> serializer() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DocumentWalletSubmitOrgsResp$$serializer documentWalletSubmitOrgsResp$$serializer = DocumentWalletSubmitOrgsResp$$serializer.INSTANCE;
        if (i3 == 0) {
            return documentWalletSubmitOrgsResp$$serializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
