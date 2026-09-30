package im.toss.features.benefit.ads.appbridge;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.setFillAlpha;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RequestAdMobPrivacyConsentWebHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ setFillAlpha f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ RequestAdMobPrivacyConsentWebHandler$$ExternalSyntheticLambda0(String str, setFillAlpha setfillalpha, String str2) {
        this.f$0 = str;
        this.f$1 = setfillalpha;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = RequestAdMobPrivacyConsentWebHandler.onExtraCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
