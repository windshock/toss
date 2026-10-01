package im.toss.features.credit.ui.legacy.detail;

import im.toss.features.credit.data.legacy.detail.StatusDetailSection;
import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.cleanPath;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditStatusAdapter$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ StatusDetailSection f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            cleanPath.onWarmupCompleted(this.f$0, (BaseTextView) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = cleanPath.onWarmupCompleted(this.f$0, (BaseTextView) obj);
        int i3 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
