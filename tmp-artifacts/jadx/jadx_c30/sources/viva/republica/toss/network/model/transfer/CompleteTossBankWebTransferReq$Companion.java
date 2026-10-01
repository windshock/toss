package viva.republica.toss.network.model.transfer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CompleteTossBankWebTransferReq$Companion {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public /* synthetic */ CompleteTossBankWebTransferReq$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CompleteTossBankWebTransferReq$Companion() {
    }

    public final KSerializer<CompleteTossBankWebTransferReq> serializer() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CompleteTossBankWebTransferReq$$serializer completeTossBankWebTransferReq$$serializer = CompleteTossBankWebTransferReq$$serializer.INSTANCE;
        int i4 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return completeTossBankWebTransferReq$$serializer;
    }
}
