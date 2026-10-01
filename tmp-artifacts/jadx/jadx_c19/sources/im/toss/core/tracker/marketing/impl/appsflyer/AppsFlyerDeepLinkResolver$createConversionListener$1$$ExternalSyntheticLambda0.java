package im.toss.core.tracker.marketing.impl.appsflyer;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setAssetUpdatedDate;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AppsFlyerDeepLinkResolver$createConversionListener$1$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ setAssetUpdatedDate f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ AppsFlyerDeepLinkResolver$createConversionListener$1$$ExternalSyntheticLambda0(setAssetUpdatedDate setassetupdateddate, long j, String str) {
        this.f$0 = setassetupdateddate;
        this.f$1 = j;
        this.f$2 = str;
    }

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = setAssetUpdatedDate.IAuthTabCallback.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (String) obj);
        int i5 = onExtraCallback + 65;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
