package im.toss.ads_sdk.ui.screen;

import com.google.android.material.datepicker.DateFormatTextWatcher$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.Futures3;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;
import o.getSupportedHighSpeedResolutions;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda5 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getSupportedHighSpeedResolutions f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f$0, (Futures3) obj};
        if (i4 != 0) {
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onExtraCallbackWithResult(iOnNavigationEvent, -1682135171, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, 1682135178, iOnNavigationEvent2);
        }
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        throw null;
    }
}
