package im.toss.ads_sdk.ui.screen;

import com.google.android.material.datepicker.DateFormatTextWatcher$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda16 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ Function1 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 33;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Object[] objArr = {this.f$0};
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0};
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onExtraCallbackWithResult(iOnNavigationEvent3, 352558637, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, -352558628, iOnNavigationEvent4);
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }
}
