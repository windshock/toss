package im.toss.features.home.core.data.repository;

import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import kotlin.jvm.functions.Function2;
import o.IgnoreLogUtils;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionTransactionCountUpdater$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Integer) obj).intValue();
        if (i3 != 0) {
            Object[] objArr = {Integer.valueOf(iIntValue), Integer.valueOf(((Integer) obj2).intValue())};
            return Boolean.valueOf(((Boolean) IgnoreLogUtils.onWarmupCompleted(-1893423429, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, 1893423430, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).booleanValue());
        }
        Object[] objArr2 = {Integer.valueOf(iIntValue), Integer.valueOf(((Integer) obj2).intValue())};
        Boolean.valueOf(((Boolean) IgnoreLogUtils.onWarmupCompleted(-1893423429, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr2, 1893423430, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback())).booleanValue());
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
