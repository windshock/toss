package o;

import android.os.Process;
import java.security.cert.X509Certificate;
import java.util.List;

/* loaded from: classes.dex */
public final class ExoPlayerImplExternalSyntheticLambda25 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private Exception onExtraCallback;
    private int onNavigationEvent;
    private List<X509Certificate> onWarmupCompleted;

    public ExoPlayerImplExternalSyntheticLambda25(int i, Exception exc, List<X509Certificate> list) {
        this.onNavigationEvent = i;
        this.onExtraCallback = exc;
        this.onWarmupCompleted = list;
    }

    public final List<X509Certificate> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = (i2 & 61) + (i2 | 61);
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw new NullPointerException();
        }
        List<X509Certificate> list = this.onWarmupCompleted;
        Process.myTid();
        Process.myTid();
        return list;
    }
}
