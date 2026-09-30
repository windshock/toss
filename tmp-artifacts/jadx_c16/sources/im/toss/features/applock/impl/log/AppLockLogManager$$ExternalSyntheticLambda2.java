package im.toss.features.applock.impl.log;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.Constant;
import o.SetDetectableSize;
import o.isNotificationsEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockLogManager$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ isNotificationsEnabled f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Constant f$2;

    public /* synthetic */ AppLockLogManager$$ExternalSyntheticLambda2(isNotificationsEnabled isnotificationsenabled, String str, Constant constant) {
        this.f$0 = isnotificationsenabled;
        this.f$1 = str;
        this.f$2 = constant;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = Constant.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = onExtraCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
