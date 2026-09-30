package im.toss.features.home.core.ui.base.dst;

import kotlin.jvm.functions.Function0;
import o.getCurrentEnv;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda22 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ BaseHomeDstActivity f$0;
    public final /* synthetic */ getCurrentEnv f$1;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda22(BaseHomeDstActivity baseHomeDstActivity, getCurrentEnv getcurrentenv) {
        this.f$0 = baseHomeDstActivity;
        this.f$1 = getcurrentenv;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BaseHomeDstActivity baseHomeDstActivity = this.f$0;
        if (i3 == 0) {
            return Boolean.valueOf(BaseHomeDstActivity.IAuthTabCallback(baseHomeDstActivity, this.f$1));
        }
        int i4 = 86 / 0;
        return Boolean.valueOf(BaseHomeDstActivity.IAuthTabCallback(baseHomeDstActivity, this.f$1));
    }
}
