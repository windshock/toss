package im.toss.features.home.core.ui.base.dst;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ BaseHomeDstActivity f$0;
    public final /* synthetic */ Map f$1;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda3(BaseHomeDstActivity baseHomeDstActivity, Map map) {
        this.f$0 = baseHomeDstActivity;
        this.f$1 = map;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BaseHomeDstActivity baseHomeDstActivity = this.f$0;
        if (i3 == 0) {
            return BaseHomeDstActivity.IAuthTabCallback(baseHomeDstActivity, this.f$1);
        }
        BaseHomeDstActivity.IAuthTabCallback(baseHomeDstActivity, this.f$1);
        throw null;
    }
}
