package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BaseResourcePackageHotUpdatePackageInstallCallback$onWarmupCompleted extends BaseResourcePackageHotUpdatePackageInstallCallback {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    public static final BaseResourcePackageHotUpdatePackageInstallCallback$onWarmupCompleted onExtraCallbackWithResult = new BaseResourcePackageHotUpdatePackageInstallCallback$onWarmupCompleted();
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 101;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 7;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof BaseResourcePackageHotUpdatePackageInstallCallback$onWarmupCompleted) {
            return true;
        }
        int i7 = i3 + 117;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i3 + 45;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 80 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return -173842564;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            int i4 = 96 / 0;
        }
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return "DismissChangedRemainingMoneyBottomSheet";
    }

    private BaseResourcePackageHotUpdatePackageInstallCallback$onWarmupCompleted() {
        super((DefaultConstructorMarker) null);
    }
}
