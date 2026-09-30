package im.toss.features.mobileid.impl.view;

import im.toss.features.mobile.id.model.AvailableVcListResponse;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdApplicableListActivity$$ExternalSyntheticLambda10 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ RightPreset f$0;
    public final /* synthetic */ AvailableVcListResponse.ApplicableVc f$1;
    public final /* synthetic */ MobileIdApplicableListActivity f$2;

    public /* synthetic */ MobileIdApplicableListActivity$$ExternalSyntheticLambda10(RightPreset rightPreset, AvailableVcListResponse.ApplicableVc applicableVc, MobileIdApplicableListActivity mobileIdApplicableListActivity) {
        this.f$0 = rightPreset;
        this.f$1 = applicableVc;
        this.f$2 = mobileIdApplicableListActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = MobileIdApplicableListActivity.onExtraCallback(this.f$0, this.f$1, this.f$2);
        int i4 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
