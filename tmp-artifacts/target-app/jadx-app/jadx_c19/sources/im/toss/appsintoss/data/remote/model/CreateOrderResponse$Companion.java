package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.CreateOrderResponse$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CreateOrderResponse$Companion {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public /* synthetic */ CreateOrderResponse$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CreateOrderResponse$Companion() {
    }

    public final KSerializer<CreateOrderResponse> serializer() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        CreateOrderResponse$.serializer serializerVar = CreateOrderResponse$.serializer.INSTANCE;
        int i5 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serializerVar;
    }
}
