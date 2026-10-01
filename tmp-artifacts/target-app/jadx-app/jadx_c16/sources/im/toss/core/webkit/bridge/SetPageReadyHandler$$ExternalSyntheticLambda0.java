package im.toss.core.webkit.bridge;

import im.toss.uikit.base.UIKitBaseActivity;
import o.croppedFace;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SetPageReadyHandler$$ExternalSyntheticLambda0 implements Runnable {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ UIKitBaseActivity f$0;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        croppedFace.onExtraCallback(this.f$0);
        int i4 = IAuthTabCallback + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
