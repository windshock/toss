package im.toss.features.home.legacy.view.transaction.manual;

import kotlin.jvm.functions.Function1;
import o.NativeSegmentFetcherSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda36 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ManualTransactionAddActivity manualTransactionAddActivity = this.f$0;
        NativeSegmentFetcherSpec nativeSegmentFetcherSpec = (NativeSegmentFetcherSpec) obj;
        if (i3 != 0) {
            return ManualTransactionAddActivity.onExtraCallback(manualTransactionAddActivity, nativeSegmentFetcherSpec);
        }
        ManualTransactionAddActivity.onExtraCallback(manualTransactionAddActivity, nativeSegmentFetcherSpec);
        throw null;
    }
}
