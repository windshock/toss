package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BaseResourcePackageHotUpdatePackageInstallCallback$asBinder extends BaseResourcePackageHotUpdatePackageInstallCallback {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final String IAuthTabCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 77;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof BaseResourcePackageHotUpdatePackageInstallCallback$asBinder)) {
            int i4 = onExtraCallback + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, ((BaseResourcePackageHotUpdatePackageInstallCallback$asBinder) obj).IAuthTabCallback)) {
            return true;
        }
        int i6 = onNavigationEvent + 121;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallback;
        if (i3 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NavigateWebView(landingUrl=" + this.IAuthTabCallback + ")";
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseResourcePackageHotUpdatePackageInstallCallback$asBinder(@NotNull String str) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 37;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return str;
    }
}
