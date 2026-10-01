package viva.republica.toss.account.agreement;

import android.os.SystemClock;
import kotlin.jvm.functions.Function1;
import o.ToolkitManager_Update;
import o.deserializeIntNullableCollection;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class AccountAgreementHelper$$ExternalSyntheticLambda18 implements deserializeIntNullableCollection {
    public static int IAuthTabCallback;
    public static int onExtraCallback;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ AccountAgreementHelper$$ExternalSyntheticLambda18(Function1 function1) {
        this.f$0 = function1;
    }

    public static int onNavigationEvent() {
        int i = IAuthTabCallback;
        int i2 = i % 9882898;
        IAuthTabCallback = i + 1;
        if (i2 != 0) {
            return onExtraCallback;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        onExtraCallback = iUptimeMillis;
        return iUptimeMillis;
    }

    @Override // o.deserializeIntNullableCollection
    public final Object apply(Object obj) {
        return ToolkitManager_Update.onExtraCallbackWithResult(this.f$0, obj);
    }
}
