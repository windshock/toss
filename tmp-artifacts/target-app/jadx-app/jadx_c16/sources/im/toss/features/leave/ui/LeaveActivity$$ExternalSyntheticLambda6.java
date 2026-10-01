package im.toss.features.leave.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LeaveActivity f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$2;

    public /* synthetic */ LeaveActivity$$ExternalSyntheticLambda6(LeaveActivity leaveActivity, setParentLayoutDirection setparentlayoutdirection, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        this.f$0 = leaveActivity;
        this.f$1 = setparentlayoutdirection;
        this.f$2 = cameraPresenceProviderExternalSyntheticLambda6;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LeaveActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda8) obj);
        int i4 = onWarmupCompleted + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return unitIAuthTabCallback;
    }
}
