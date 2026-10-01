package im.toss.features.home.feature.asset_home;

import kotlin.jvm.functions.Function1;
import o.getArgumentTypes;
import o.sendSimpleRpcJsapi;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetDeleteHelper$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(sendSimpleRpcJsapi.onExtraCallback(this.f$0, (getArgumentTypes) obj));
        int i4 = IAuthTabCallback + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
