package im.toss.features.edoc;

import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocIssuableListActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ EDocIssuableListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (EDocIssuableCandidate) obj};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        if (i3 == 0) {
            return (Unit) EDocIssuableListActivity.IAuthTabCallback(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, 1332850054, -1332850051, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr);
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
