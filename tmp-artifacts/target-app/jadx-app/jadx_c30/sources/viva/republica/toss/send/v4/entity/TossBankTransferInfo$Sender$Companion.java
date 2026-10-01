package viva.republica.toss.send.v4.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import viva.republica.toss.send.v4.entity.TossBankTransferInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TossBankTransferInfo$Sender$Companion {
    public /* synthetic */ TossBankTransferInfo$Sender$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TossBankTransferInfo$Sender$Companion() {
    }

    public final KSerializer<TossBankTransferInfo.Sender> serializer() {
        return TossBankTransferInfo$Sender$$serializer.INSTANCE;
    }
}
