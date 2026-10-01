package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class deleteDownloadPackage$IAuthTabCallback implements deleteDownloadPackage {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final String onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deleteDownloadPackage$IAuthTabCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, ((deleteDownloadPackage$IAuthTabCallback) obj).onNavigationEvent)) {
            return true;
        }
        int i4 = onExtraCallback + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        int i4 = onExtraCallback + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ClickCancellationBottomSheetButton(buttonTitle=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
        return str;
    }

    public deleteDownloadPackage$IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.onNavigationEvent;
        int i4 = i3 + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return str;
    }
}
