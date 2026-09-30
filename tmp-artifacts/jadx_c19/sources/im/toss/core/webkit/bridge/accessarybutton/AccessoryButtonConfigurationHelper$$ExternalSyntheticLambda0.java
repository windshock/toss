package im.toss.core.webkit.bridge.accessarybutton;

import android.view.MenuItem;
import kotlin.jvm.functions.Function1;
import o.TimerCounter;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AccessoryButtonConfigurationHelper$$ExternalSyntheticLambda0 implements MenuItem.OnMenuItemClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Function1 f$0;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Function1 function1 = this.f$0;
        if (i4 != 0) {
            return TimerCounter.onNavigationEvent(function1, menuItem);
        }
        TimerCounter.onNavigationEvent(function1, menuItem);
        throw null;
    }
}
