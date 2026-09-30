package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BaseResourcePackageHotUpdatePackageInstallCallback$onExtraCallback extends BaseResourcePackageHotUpdatePackageInstallCallback {
    private static int IAuthTabCallback = 0;
    public static final BaseResourcePackageHotUpdatePackageInstallCallback$onExtraCallback onExtraCallback = new BaseResourcePackageHotUpdatePackageInstallCallback$onExtraCallback();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 49;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof BaseResourcePackageHotUpdatePackageInstallCallback$onExtraCallback) {
            return true;
        }
        int i4 = IAuthTabCallback + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 1338350557;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return "DismissNoChangedRemainingMoneyBottomSheet";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private BaseResourcePackageHotUpdatePackageInstallCallback$onExtraCallback() {
        super((DefaultConstructorMarker) null);
    }
}
