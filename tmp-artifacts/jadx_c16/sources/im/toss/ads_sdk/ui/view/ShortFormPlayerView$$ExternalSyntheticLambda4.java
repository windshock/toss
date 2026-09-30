package im.toss.ads_sdk.ui.view;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ShortFormPlayerView$$ExternalSyntheticLambda4 implements Runnable {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ ShortFormPlayerView f$0;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ShortFormPlayerView.onWarmupCompleted(this.f$0);
        int i4 = onExtraCallbackWithResult + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
