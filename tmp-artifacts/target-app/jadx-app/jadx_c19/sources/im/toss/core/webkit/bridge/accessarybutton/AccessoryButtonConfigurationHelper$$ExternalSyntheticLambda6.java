package im.toss.core.webkit.bridge.accessarybutton;

import android.view.MenuItem;
import o.TimerCallBack;
import o.TimerCounter;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AccessoryButtonConfigurationHelper$$ExternalSyntheticLambda6 implements Runnable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ TimerCallBack f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ MenuItem.OnMenuItemClickListener f$5;

    public /* synthetic */ AccessoryButtonConfigurationHelper$$ExternalSyntheticLambda6(boolean z, TimerCallBack timerCallBack, String str, String str2, String str3, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f$0 = z;
        this.f$1 = timerCallBack;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = str3;
        this.f$5 = onMenuItemClickListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        TimerCounter.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }
}
