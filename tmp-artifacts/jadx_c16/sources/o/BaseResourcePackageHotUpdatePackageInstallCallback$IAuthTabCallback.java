package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BaseResourcePackageHotUpdatePackageInstallCallback$IAuthTabCallback extends BaseResourcePackageHotUpdatePackageInstallCallback {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final BaseResourcePackageHotUpdatePackageInstallCallback$IAuthTabCallback onWarmupCompleted = new BaseResourcePackageHotUpdatePackageInstallCallback$IAuthTabCallback();

    static {
        int i = IAuthTabCallback + 13;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 107;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof BaseResourcePackageHotUpdatePackageInstallCallback$IAuthTabCallback) {
            return true;
        }
        int i6 = i2 + 25;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return -2060435879;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return "Authenticate";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private BaseResourcePackageHotUpdatePackageInstallCallback$IAuthTabCallback() {
        super((DefaultConstructorMarker) null);
    }
}
