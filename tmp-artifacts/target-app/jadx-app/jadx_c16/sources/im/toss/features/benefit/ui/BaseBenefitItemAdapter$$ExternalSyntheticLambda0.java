package im.toss.features.benefit.ui;

import im.toss.features.benefit.ui.component.ThumbnailAdMobController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getNameByImsi;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseBenefitItemAdapter$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ getNameByImsi f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = getNameByImsi.onExtraCallbackWithResult(this.f$0, (ThumbnailAdMobController) obj);
            int i3 = 64 / 0;
        } else {
            unitOnExtraCallbackWithResult = getNameByImsi.onExtraCallbackWithResult(this.f$0, (ThumbnailAdMobController) obj);
        }
        int i4 = IAuthTabCallback + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
