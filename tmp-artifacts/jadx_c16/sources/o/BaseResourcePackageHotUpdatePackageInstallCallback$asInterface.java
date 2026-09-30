package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BaseResourcePackageHotUpdatePackageInstallCallback$asInterface extends BaseResourcePackageHotUpdatePackageInstallCallback {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final BaseResourcePackageHotUpdatePackageInstallCallback$asInterface onWarmupCompleted = new BaseResourcePackageHotUpdatePackageInstallCallback$asInterface();

    static {
        int i = onExtraCallback + 103;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj || !(!(obj instanceof BaseResourcePackageHotUpdatePackageInstallCallback$asInterface))) {
            return true;
        }
        int i5 = i2 + 11;
        IAuthTabCallback = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return -476379170;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return "ShowCustomerServiceBottomSheet";
    }

    private BaseResourcePackageHotUpdatePackageInstallCallback$asInterface() {
        super((DefaultConstructorMarker) null);
    }
}
