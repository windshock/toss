package im.toss.features.home.legacy.view.transaction.manual;

import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionListActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ ManualTransactionListActivity f$1;

    public /* synthetic */ ManualTransactionListActivity$$ExternalSyntheticLambda10(boolean z, ManualTransactionListActivity manualTransactionListActivity) {
        this.f$0 = z;
        this.f$1 = manualTransactionListActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Boolean.valueOf(this.f$0), this.f$1, (deserializeUriNullableCollection) obj};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Unit unit = (Unit) ManualTransactionListActivity.onNavigationEvent(-572921412, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 572921420);
        int i4 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
