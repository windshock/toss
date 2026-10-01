package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.CreateOrderRequest$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CreateOrderRequest$Companion {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public /* synthetic */ CreateOrderRequest$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CreateOrderRequest$Companion() {
    }

    public final KSerializer<CreateOrderRequest> serializer() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        CreateOrderRequest$.serializer serializerVar = CreateOrderRequest$.serializer.INSTANCE;
        if (i4 != 0) {
            return serializerVar;
        }
        throw null;
    }
}
