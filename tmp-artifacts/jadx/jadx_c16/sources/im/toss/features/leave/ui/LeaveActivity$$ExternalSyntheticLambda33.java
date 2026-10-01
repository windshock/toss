package im.toss.features.leave.ui;

import kotlin.jvm.functions.Function0;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda33 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ setParentLayoutDirection f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setParentLayoutDirection setparentlayoutdirection = this.f$0;
        if (i3 == 0) {
            return LeaveActivity.onExtraCallback(setparentlayoutdirection);
        }
        LeaveActivity.onExtraCallback(setparentlayoutdirection);
        throw null;
    }
}
