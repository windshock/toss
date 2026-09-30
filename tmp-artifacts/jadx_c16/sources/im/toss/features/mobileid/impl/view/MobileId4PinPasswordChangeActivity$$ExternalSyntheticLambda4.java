package im.toss.features.mobileid.impl.view;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.isJSONTypeIgnore;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileId4PinPasswordChangeActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ MobileId4PinPasswordChangeActivity f$0;
    public final /* synthetic */ isJSONTypeIgnore f$1;

    public /* synthetic */ MobileId4PinPasswordChangeActivity$$ExternalSyntheticLambda4(MobileId4PinPasswordChangeActivity mobileId4PinPasswordChangeActivity, isJSONTypeIgnore isjsontypeignore) {
        this.f$0 = mobileId4PinPasswordChangeActivity;
        this.f$1 = isjsontypeignore;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = MobileId4PinPasswordChangeActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (View) obj);
        int i4 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
