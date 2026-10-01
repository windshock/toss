package im.toss.features.home.core.ui.widget;

import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import o.pin;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IntelligenceBenefitVar1View$$ExternalSyntheticLambda24 implements TdsListRowV1View.IAuthTabCallbackStub {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final float get(pin pinVar) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = IntelligenceBenefitVar1View.IAuthTabCallback(pinVar);
        int i4 = onExtraCallback + 87;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return fIAuthTabCallback;
    }
}
