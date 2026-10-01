package im.toss.core.webkit.bridge.accessarybutton;

import android.view.MenuItem;
import o.TimerCallBack;
import o.TimerCounter;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AccessoryButtonConfigurationHelper$$ExternalSyntheticLambda2 implements Runnable {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TimerCallBack f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ String f$5;
    public final /* synthetic */ MenuItem.OnMenuItemClickListener f$6;
    public final /* synthetic */ MenuItem.OnMenuItemClickListener f$7;

    public /* synthetic */ AccessoryButtonConfigurationHelper$$ExternalSyntheticLambda2(TimerCallBack timerCallBack, String str, String str2, String str3, String str4, String str5, MenuItem.OnMenuItemClickListener onMenuItemClickListener, MenuItem.OnMenuItemClickListener onMenuItemClickListener2) {
        this.f$0 = timerCallBack;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = str3;
        this.f$4 = str4;
        this.f$5 = str5;
        this.f$6 = onMenuItemClickListener;
        this.f$7 = onMenuItemClickListener2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            TimerCounter.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
        } else {
            TimerCounter.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
            int i4 = 45 / 0;
        }
    }
}
