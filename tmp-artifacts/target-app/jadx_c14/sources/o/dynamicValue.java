package o;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import o.dynamicValue;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class dynamicValue {
    public static final dynamicValue onNavigationEvent = new dynamicValue();
    private static final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.dutch.TransferDutchpayDetailNavigator$$ExternalSyntheticLambda0
        public final Object invoke() {
            return dynamicValue.IAuthTabCallback();
        }
    });
    public static final int onExtraCallbackWithResult = 8;

    private dynamicValue() {
    }

    public final FileViewerActivityExternalSyntheticLambda0 onWarmupCompleted() {
        return (FileViewerActivityExternalSyntheticLambda0) onWarmupCompleted.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileViewerActivityExternalSyntheticLambda0 IAuthTabCallback() {
        Response response = Response.onNavigationEvent;
        return ((openSharePage) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), openSharePage.class)).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }
}
