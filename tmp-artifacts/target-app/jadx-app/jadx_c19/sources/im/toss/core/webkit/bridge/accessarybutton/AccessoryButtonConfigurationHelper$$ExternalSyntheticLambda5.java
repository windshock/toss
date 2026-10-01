package im.toss.core.webkit.bridge.accessarybutton;

import android.view.MenuItem;
import kotlin.jvm.functions.Function1;
import o.TimerCounter;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AccessoryButtonConfigurationHelper$$ExternalSyntheticLambda5 implements MenuItem.OnMenuItemClickListener {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ AccessoryButtonConfiguration f$1;

    public /* synthetic */ AccessoryButtonConfigurationHelper$$ExternalSyntheticLambda5(Function1 function1, AccessoryButtonConfiguration accessoryButtonConfiguration) {
        this.f$0 = function1;
        this.f$1 = accessoryButtonConfiguration;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Function1 function1 = this.f$0;
        if (i4 != 0) {
            return TimerCounter.IAuthTabCallback(function1, this.f$1, menuItem);
        }
        boolean zIAuthTabCallback = TimerCounter.IAuthTabCallback(function1, this.f$1, menuItem);
        int i5 = 4 / 0;
        return zIAuthTabCallback;
    }
}
