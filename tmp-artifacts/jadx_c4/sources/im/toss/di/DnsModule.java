package im.toss.di;

import dagger.Lazy;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.ea;
import o.onRequestPermissionResult;
import o.zzad;
import okhttp3.CertificatePinner;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DnsModule {
    private static int IAuthTabCallback = 1;
    public static final DnsModule onExtraCallback = new DnsModule();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 57;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private DnsModule() {
    }

    @Singleton
    public final ea onWarmupCompleted(@NotNull zzad zzadVar, @NotNull Lazy<CertificatePinner> lazy) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        onRequestPermissionResult onrequestpermissionresult = new onRequestPermissionResult(zzadVar, lazy);
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onrequestpermissionresult;
        }
        throw null;
    }
}
