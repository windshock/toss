package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BaseResourcePackageHotUpdatePackageInstallCallback$onTransact extends BaseResourcePackageHotUpdatePackageInstallCallback {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    public static final BaseResourcePackageHotUpdatePackageInstallCallback$onTransact onExtraCallbackWithResult = new BaseResourcePackageHotUpdatePackageInstallCallback$onTransact();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 27;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this != obj) {
            return obj instanceof BaseResourcePackageHotUpdatePackageInstallCallback$onTransact;
        }
        int i5 = i2 + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return 628759320;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return "ShowNoChangedRemainingMoneyBottomSheet";
    }

    private BaseResourcePackageHotUpdatePackageInstallCallback$onTransact() {
        super((DefaultConstructorMarker) null);
    }
}
