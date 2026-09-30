package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.AppsInTossAvailableProductListRequest$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppsInTossAvailableProductListRequest$Companion {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public /* synthetic */ AppsInTossAvailableProductListRequest$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AppsInTossAvailableProductListRequest$Companion() {
    }

    public final KSerializer<AppsInTossAvailableProductListRequest> serializer() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        AppsInTossAvailableProductListRequest$.serializer serializerVar = AppsInTossAvailableProductListRequest$.serializer.INSTANCE;
        int i5 = onExtraCallbackWithResult + 89;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return serializerVar;
    }
}
