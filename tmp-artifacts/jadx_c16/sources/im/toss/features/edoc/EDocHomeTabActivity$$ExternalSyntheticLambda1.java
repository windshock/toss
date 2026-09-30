package im.toss.features.edoc;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocHomeTabActivity$$ExternalSyntheticLambda1 implements Runnable {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ EDocHomeTabActivity f$0;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            EDocHomeTabActivity.IAuthTabCallback(this.f$0);
            throw null;
        }
        EDocHomeTabActivity.IAuthTabCallback(this.f$0);
        int i3 = onNavigationEvent + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
