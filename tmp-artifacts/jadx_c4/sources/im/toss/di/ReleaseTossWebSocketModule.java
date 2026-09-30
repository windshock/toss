package im.toss.di;

import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.clearFeatureFlags;
import o.convertThreadbugsnag_android_core_release;
import o.findResAndMsg;
import o.getBreadcrumbs;
import o.getUser;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ReleaseTossWebSocketModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final ReleaseTossWebSocketModule onNavigationEvent = new ReleaseTossWebSocketModule();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 81;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ReleaseTossWebSocketModule() {
    }

    @Singleton
    public final getBreadcrumbs onExtraCallbackWithResult(@NotNull findResAndMsg findresandmsg, @NotNull clearFeatureFlags clearfeatureflags, @NotNull convertThreadbugsnag_android_core_release convertthreadbugsnag_android_core_release) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(clearfeatureflags, "");
        Intrinsics.checkNotNullParameter(convertthreadbugsnag_android_core_release, "");
        getUser getuser = new getUser(findresandmsg, clearfeatureflags, convertthreadbugsnag_android_core_release);
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return getuser;
    }
}
