package im.toss.features.industrialcodeselect.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setAppStartTags;
import o.setParentLayoutDirection;
import o.setPopupContentSizefhxjrPA;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IndustrialCodeSelectActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ setAppStartTags f$0;
    public final /* synthetic */ setParentLayoutDirection f$1;

    public /* synthetic */ IndustrialCodeSelectActivity$$ExternalSyntheticLambda3(setAppStartTags setappstarttags, setParentLayoutDirection setparentlayoutdirection) {
        this.f$0 = setappstarttags;
        this.f$1 = setparentlayoutdirection;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = IndustrialCodeSelectActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (setPopupContentSizefhxjrPA) obj);
        int i4 = onWarmupCompleted + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
