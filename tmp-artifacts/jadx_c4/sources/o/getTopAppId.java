package o;

import android.content.Context;
import im.toss.di.CertificatePinnerModule;
import okhttp3.CertificatePinner;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTopAppId implements captureStartValues<CertificatePinner> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final createAnimators<Context> onExtraCallback;

    public /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CertificatePinner certificatePinnerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return certificatePinnerOnWarmupCompleted;
    }

    public CertificatePinner onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CertificatePinner certificatePinnerOnNavigationEvent = onNavigationEvent((Context) this.onExtraCallback.get());
        int i4 = onNavigationEvent + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return certificatePinnerOnNavigationEvent;
    }

    public static CertificatePinner onNavigationEvent(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CertificatePinner certificatePinner = (CertificatePinner) createAnimator.onNavigationEvent(CertificatePinnerModule.IAuthTabCallback.onNavigationEvent(context));
        int i4 = onWarmupCompleted + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return certificatePinner;
    }
}
