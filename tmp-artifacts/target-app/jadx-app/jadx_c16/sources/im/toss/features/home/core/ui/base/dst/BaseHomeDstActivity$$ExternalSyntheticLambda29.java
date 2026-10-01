package im.toss.features.home.core.ui.base.dst;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda29 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Map f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = BaseHomeDstActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            int i3 = 23 / 0;
        } else {
            unitOnExtraCallback = BaseHomeDstActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
        }
        int i4 = onExtraCallback + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return unitOnExtraCallback;
    }
}
