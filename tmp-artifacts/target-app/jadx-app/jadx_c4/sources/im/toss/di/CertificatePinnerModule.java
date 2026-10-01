package im.toss.di;

import android.content.Context;
import im.toss.certpin.R;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.setReverse;
import okhttp3.CertificatePinner;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CertificatePinnerModule {
    public static final CertificatePinnerModule IAuthTabCallback = new CertificatePinnerModule();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 73;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private CertificatePinnerModule() {
    }

    @Singleton
    public final CertificatePinner onNavigationEvent(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        CertificatePinner certificatePinnerOnExtraCallbackWithResult = new setReverse(context).onExtraCallbackWithResult(R.xml.toss_network_security_config);
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return certificatePinnerOnExtraCallbackWithResult;
        }
        throw null;
    }
}
