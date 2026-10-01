package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BreadcrumbType {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final String onExtraCallback;
    private final Map<String, String> onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof BreadcrumbType) {
            BreadcrumbType breadcrumbType = (BreadcrumbType) obj;
            return !(Intrinsics.areEqual(this.onExtraCallback, breadcrumbType.onExtraCallback) ^ true) && Intrinsics.areEqual(this.onExtraCallbackWithResult, breadcrumbType.onExtraCallbackWithResult);
        }
        int i7 = i3 + 111;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onExtraCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = IAuthTabCallback + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ParsedUrl(pathWithSchemeAndHost=" + this.onExtraCallback + ", query=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public BreadcrumbType(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = map;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    public final Map<String, String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> map = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return map;
    }
}
