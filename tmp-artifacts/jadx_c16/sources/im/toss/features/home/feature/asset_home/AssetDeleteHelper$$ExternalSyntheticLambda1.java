package im.toss.features.home.feature.asset_home;

import kotlin.jvm.functions.Function1;
import o.deserializeLongCollection;
import o.sendSimpleRpcJsapi;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetDeleteHelper$$ExternalSyntheticLambda1 implements deserializeLongCollection {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final boolean test(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            sendSimpleRpcJsapi.IAuthTabCallback(this.f$0, obj);
            throw null;
        }
        boolean zIAuthTabCallback = sendSimpleRpcJsapi.IAuthTabCallback(this.f$0, obj);
        int i3 = onExtraCallbackWithResult + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallback;
    }
}
