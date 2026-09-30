package im.toss.core.webkit;

import o.setCircleStrokeWidth;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossNativeBridge$$ExternalSyntheticLambda0 implements Runnable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ setCircleStrokeWidth f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Exception f$2;

    public /* synthetic */ TossNativeBridge$$ExternalSyntheticLambda0(setCircleStrokeWidth setcirclestrokewidth, String str, Exception exc) {
        this.f$0 = setcirclestrokewidth;
        this.f$1 = str;
        this.f$2 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            setCircleStrokeWidth.onNavigationEvent(this.f$0, this.f$1, this.f$2);
            int i3 = 81 / 0;
        } else {
            setCircleStrokeWidth.onNavigationEvent(this.f$0, this.f$1, this.f$2);
        }
        int i4 = onExtraCallback + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
