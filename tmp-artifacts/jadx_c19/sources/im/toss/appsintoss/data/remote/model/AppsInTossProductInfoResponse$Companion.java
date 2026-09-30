package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.AppsInTossProductInfoResponse$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppsInTossProductInfoResponse$Companion {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public /* synthetic */ AppsInTossProductInfoResponse$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AppsInTossProductInfoResponse$Companion() {
    }

    public final KSerializer<AppsInTossProductInfoResponse> serializer() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            AppsInTossProductInfoResponse$.serializer serializerVar = AppsInTossProductInfoResponse$.serializer.INSTANCE;
            throw null;
        }
        AppsInTossProductInfoResponse$.serializer serializerVar2 = AppsInTossProductInfoResponse$.serializer.INSTANCE;
        int i4 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return serializerVar2;
    }
}
