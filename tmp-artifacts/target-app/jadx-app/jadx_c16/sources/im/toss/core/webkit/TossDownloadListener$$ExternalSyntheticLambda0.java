package im.toss.core.webkit;

import android.content.Intent;
import im.toss.uikit.base.UIKitBaseActivity;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import kotlin.jvm.functions.Function1;
import o.setBackgroundAlpha;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossDownloadListener$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ UIKitBaseActivity f$0;
    public final /* synthetic */ Intent f$1;

    public /* synthetic */ TossDownloadListener$$ExternalSyntheticLambda0(UIKitBaseActivity uIKitBaseActivity, Intent intent) {
        this.f$0 = uIKitBaseActivity;
        this.f$1 = intent;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        UIKitBaseActivity uIKitBaseActivity = this.f$0;
        if (i3 != 0) {
            return setBackgroundAlpha.onNavigationEvent(uIKitBaseActivity, this.f$1, (TdsToastV1) obj);
        }
        setBackgroundAlpha.onNavigationEvent(uIKitBaseActivity, this.f$1, (TdsToastV1) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
