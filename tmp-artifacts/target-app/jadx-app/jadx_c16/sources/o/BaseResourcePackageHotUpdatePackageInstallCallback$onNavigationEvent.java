package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BaseResourcePackageHotUpdatePackageInstallCallback$onNavigationEvent extends BaseResourcePackageHotUpdatePackageInstallCallback {
    private static int IAuthTabCallback = 0;
    public static final BaseResourcePackageHotUpdatePackageInstallCallback$onNavigationEvent onExtraCallback = new BaseResourcePackageHotUpdatePackageInstallCallback$onNavigationEvent();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 109;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 50 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            return !((obj instanceof BaseResourcePackageHotUpdatePackageInstallCallback$onNavigationEvent) ^ true);
        }
        int i2 = onWarmupCompleted + 59;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return 1522263147;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 49;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 66 / 0;
        }
        int i5 = i2 + 41;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return "NavigateToCancelService";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private BaseResourcePackageHotUpdatePackageInstallCallback$onNavigationEvent() {
        super((DefaultConstructorMarker) null);
    }
}
