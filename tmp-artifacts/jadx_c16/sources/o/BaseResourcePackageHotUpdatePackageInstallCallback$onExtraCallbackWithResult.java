package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BaseResourcePackageHotUpdatePackageInstallCallback$onExtraCallbackWithResult extends BaseResourcePackageHotUpdatePackageInstallCallback {
    private static int IAuthTabCallback = 1;
    public static final BaseResourcePackageHotUpdatePackageInstallCallback$onExtraCallbackWithResult onExtraCallback = new BaseResourcePackageHotUpdatePackageInstallCallback$onExtraCallbackWithResult();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 41;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 89 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj || !(!(obj instanceof BaseResourcePackageHotUpdatePackageInstallCallback$onExtraCallbackWithResult))) {
            return true;
        }
        int i4 = i3 + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return -1704882202;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return "NavigateToConfirmMyData";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private BaseResourcePackageHotUpdatePackageInstallCallback$onExtraCallbackWithResult() {
        super((DefaultConstructorMarker) null);
    }
}
