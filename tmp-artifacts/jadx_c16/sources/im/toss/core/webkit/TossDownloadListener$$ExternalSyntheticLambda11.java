package im.toss.core.webkit;

import im.toss.uikit.base.UIKitBaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setBackgroundAlpha;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossDownloadListener$$ExternalSyntheticLambda11 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ setBackgroundAlpha f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ UIKitBaseActivity f$2;

    public /* synthetic */ TossDownloadListener$$ExternalSyntheticLambda11(setBackgroundAlpha setbackgroundalpha, String str, UIKitBaseActivity uIKitBaseActivity) {
        this.f$0 = setbackgroundalpha;
        this.f$1 = str;
        this.f$2 = uIKitBaseActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = setBackgroundAlpha.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (String) obj);
        int i4 = IAuthTabCallback + 95;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
