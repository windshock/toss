package im.toss.ads_sdk.log;

import kotlin.jvm.functions.Function1;
import o.infoForCurrentScrollPosition;
import okhttp3.Request;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsWebEventLogManager$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ infoForCurrentScrollPosition f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ NativeAdsWebEventLogManager$$ExternalSyntheticLambda1(infoForCurrentScrollPosition infoforcurrentscrollposition, String str) {
        this.f$0 = infoforcurrentscrollposition;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            infoForCurrentScrollPosition.onNavigationEvent(this.f$0, this.f$1, ((Integer) obj).intValue());
            throw null;
        }
        Request requestOnNavigationEvent = infoForCurrentScrollPosition.onNavigationEvent(this.f$0, this.f$1, ((Integer) obj).intValue());
        int i3 = IAuthTabCallback + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return requestOnNavigationEvent;
    }
}
