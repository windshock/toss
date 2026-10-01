package im.toss.core.webkit;

import im.toss.uikit.base.UIKitBaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.setBackgroundAlpha;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossDownloadListener$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ UIKitBaseActivity f$1;

    public /* synthetic */ TossDownloadListener$$ExternalSyntheticLambda2(Function0 function0, UIKitBaseActivity uIKitBaseActivity) {
        this.f$0 = function0;
        this.f$1 = uIKitBaseActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            setBackgroundAlpha.IAuthTabCallback(this.f$0, this.f$1, (Boolean) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = setBackgroundAlpha.IAuthTabCallback(this.f$0, this.f$1, (Boolean) obj);
        int i3 = onWarmupCompleted + 93;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
