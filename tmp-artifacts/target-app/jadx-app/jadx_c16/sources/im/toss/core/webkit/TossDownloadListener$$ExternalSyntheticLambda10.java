package im.toss.core.webkit;

import im.toss.uikit.base.UIKitBaseActivity;
import kotlin.jvm.functions.Function1;
import o.setBackgroundAlpha;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossDownloadListener$$ExternalSyntheticLambda10 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ UIKitBaseActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        UIKitBaseActivity uIKitBaseActivity = this.f$0;
        Throwable th = (Throwable) obj;
        if (i3 == 0) {
            return setBackgroundAlpha.onWarmupCompleted(uIKitBaseActivity, th);
        }
        setBackgroundAlpha.onWarmupCompleted(uIKitBaseActivity, th);
        throw null;
    }
}
