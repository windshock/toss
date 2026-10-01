package im.toss.core.webkit.bridge.accessarybutton;

import android.view.MenuItem;
import kotlin.jvm.functions.Function1;
import o.TimerCounter;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AccessoryButtonConfigurationHelper$$ExternalSyntheticLambda1 implements MenuItem.OnMenuItemClickListener {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean zOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            zOnExtraCallbackWithResult = TimerCounter.onExtraCallbackWithResult(this.f$0, menuItem);
            int i4 = 52 / 0;
        } else {
            zOnExtraCallbackWithResult = TimerCounter.onExtraCallbackWithResult(this.f$0, menuItem);
        }
        int i5 = onWarmupCompleted + 63;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return zOnExtraCallbackWithResult;
    }
}
