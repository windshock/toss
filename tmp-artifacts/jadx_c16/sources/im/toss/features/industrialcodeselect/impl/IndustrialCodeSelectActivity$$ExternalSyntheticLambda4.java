package im.toss.features.industrialcodeselect.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setAppStartTags;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IndustrialCodeSelectActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ setParentLayoutDirection f$0;
    public final /* synthetic */ IndustrialCodeSelectActivity f$1;

    public /* synthetic */ IndustrialCodeSelectActivity$$ExternalSyntheticLambda4(setParentLayoutDirection setparentlayoutdirection, IndustrialCodeSelectActivity industrialCodeSelectActivity) {
        this.f$0 = setparentlayoutdirection;
        this.f$1 = industrialCodeSelectActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = IndustrialCodeSelectActivity.onNavigationEvent(this.f$0, this.f$1, (setAppStartTags) obj);
        int i4 = onExtraCallbackWithResult + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
