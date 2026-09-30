package im.toss.features.edoc;

import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import kotlin.jvm.functions.Function0;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssuableListActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[0];
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        if (i3 == 0) {
            throw null;
        }
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) EDocIssuableListActivity.IAuthTabCallback(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -351572437, 351572438, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr);
        int i4 = IAuthTabCallback + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return getsupportedhighspeedresolutionsfor;
    }
}
