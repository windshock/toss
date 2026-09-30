package im.toss.ads_sdk.ui.screen;

import com.google.android.material.datepicker.DateFormatTextWatcher$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {(useAndConfigureProgramWithTexture) obj};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i4 != 0) {
            return (Unit) WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onExtraCallbackWithResult(iOnNavigationEvent, -1829179207, iOnNavigationEvent4, iOnNavigationEvent3, objArr, 1829179207, iOnNavigationEvent2);
        }
        Unit unit = (Unit) WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onExtraCallbackWithResult(iOnNavigationEvent, -1829179207, iOnNavigationEvent4, iOnNavigationEvent3, objArr, 1829179207, iOnNavigationEvent2);
        int i5 = 43 / 0;
        return unit;
    }
}
