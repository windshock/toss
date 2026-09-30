package im.toss.appsintoss.data.remote.model;

import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AppsInTossProductInfoResponse$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        KSerializer kSerializerIAuthTabCallback = AppsInTossProductInfoResponse.IAuthTabCallback();
        int i5 = onExtraCallback + 89;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return kSerializerIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
