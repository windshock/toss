package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.AppsInTossRefundRequest$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppsInTossRefundRequest$Companion {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public /* synthetic */ AppsInTossRefundRequest$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AppsInTossRefundRequest$Companion() {
    }

    public final KSerializer<AppsInTossRefundRequest> serializer() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        AppsInTossRefundRequest$.serializer serializerVar = AppsInTossRefundRequest$.serializer.INSTANCE;
        if (i4 == 0) {
            return serializerVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
