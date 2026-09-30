package o;

import im.toss.features.home.core.local.model.dst.element.LocalHomeBpsLocal;
import im.toss.features.home.core.local.model.dst.element.LocalHomeGlobalActivationLocal;
import im.toss.features.home.core.local.model.dst.element.LocalHomeNativeAdsLocal;
import im.toss.features.home.core.local.model.dst.element.LocalItemElementCardNotificationLocal;
import im.toss.features.home.core.local.model.dst.element.LocalItemElementLocal;
import im.toss.features.home.core.local.model.dst.element.LocalItemElementNoneLocal;
import im.toss.features.home.core.local.model.dst.element.LocalItemElementTeensTransportationLocal;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class appendJsApiDetail4TinyWithT2 extends onReceiveCdp<LocalItemElementLocal> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public static final appendJsApiDetail4TinyWithT2 onNavigationEvent = new appendJsApiDetail4TinyWithT2();

    static {
        int i = onExtraCallback + 109;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private appendJsApiDetail4TinyWithT2() {
        super(Reflection.getOrCreateKotlinClass(LocalItemElementLocal.class), "localType", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("HOME_BPS", Reflection.getOrCreateKotlinClass(LocalHomeBpsLocal.class)), getWrite.IAuthTabCallback("ACTIVATION_SDK", Reflection.getOrCreateKotlinClass(LocalHomeGlobalActivationLocal.class)), getWrite.IAuthTabCallback("ADS_SDK", Reflection.getOrCreateKotlinClass(LocalHomeNativeAdsLocal.class)), getWrite.IAuthTabCallback("CARD_NOTIFICATION", Reflection.getOrCreateKotlinClass(LocalItemElementCardNotificationLocal.class)), getWrite.IAuthTabCallback("NONE", Reflection.getOrCreateKotlinClass(LocalItemElementNoneLocal.class)), getWrite.IAuthTabCallback("TEENS_TRANSPORTATION", Reflection.getOrCreateKotlinClass(LocalItemElementTeensTransportationLocal.class))}), (String) null, 8, (DefaultConstructorMarker) null);
    }
}
