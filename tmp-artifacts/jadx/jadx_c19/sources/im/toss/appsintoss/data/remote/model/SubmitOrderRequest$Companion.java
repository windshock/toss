package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.SubmitOrderRequest$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SubmitOrderRequest$Companion {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public /* synthetic */ SubmitOrderRequest$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SubmitOrderRequest$Companion() {
    }

    public final KSerializer<SubmitOrderRequest> serializer() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            SubmitOrderRequest$.serializer serializerVar = SubmitOrderRequest$.serializer.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SubmitOrderRequest$.serializer serializerVar2 = SubmitOrderRequest$.serializer.INSTANCE;
        int i4 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return serializerVar2;
    }
}
