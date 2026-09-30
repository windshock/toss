package im.toss.appsintoss.iap.model;

import im.toss.appsintoss.iap.model.AppsInTossRefundRequestResult$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppsInTossRefundRequestResult$Companion {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public /* synthetic */ AppsInTossRefundRequestResult$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AppsInTossRefundRequestResult$Companion() {
    }

    public final KSerializer<AppsInTossRefundRequestResult> serializer() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        AppsInTossRefundRequestResult$.serializer serializerVar = AppsInTossRefundRequestResult$.serializer.INSTANCE;
        int i5 = onWarmupCompleted + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return serializerVar;
        }
        throw null;
    }
}
