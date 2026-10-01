package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.AppsInTossProductInfoRequest$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppsInTossProductInfoRequest$Companion {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public /* synthetic */ AppsInTossProductInfoRequest$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AppsInTossProductInfoRequest$Companion() {
    }

    public final KSerializer<AppsInTossProductInfoRequest> serializer() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        AppsInTossProductInfoRequest$.serializer serializerVar = AppsInTossProductInfoRequest$.serializer.INSTANCE;
        int i5 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serializerVar;
    }
}
