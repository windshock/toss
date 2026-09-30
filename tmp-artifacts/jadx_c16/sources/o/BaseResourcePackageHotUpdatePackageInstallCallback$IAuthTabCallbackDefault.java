package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BaseResourcePackageHotUpdatePackageInstallCallback$IAuthTabCallbackDefault extends BaseResourcePackageHotUpdatePackageInstallCallback {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final BaseResourcePackageHotUpdatePackageInstallCallback$IAuthTabCallbackDefault onWarmupCompleted = new BaseResourcePackageHotUpdatePackageInstallCallback$IAuthTabCallbackDefault();

    static {
        int i = onExtraCallback + 65;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof BaseResourcePackageHotUpdatePackageInstallCallback$IAuthTabCallbackDefault)) {
            int i4 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 == 0;
        }
        int i5 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 1934913911;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return "ShowChangedRemainingMoneyBottomSheet";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private BaseResourcePackageHotUpdatePackageInstallCallback$IAuthTabCallbackDefault() {
        super((DefaultConstructorMarker) null);
    }
}
