package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class deleteDownloadPackage$onNavigationEvent implements deleteDownloadPackage {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final boolean onExtraCallback;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deleteDownloadPackage$onNavigationEvent)) {
            return false;
        }
        deleteDownloadPackage$onNavigationEvent deletedownloadpackage_onnavigationevent = (deleteDownloadPackage$onNavigationEvent) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, deletedownloadpackage_onnavigationevent.onWarmupCompleted)) {
            int i2 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 == 0;
        }
        if (this.onExtraCallback == deletedownloadpackage_onnavigationevent.onExtraCallback) {
            return true;
        }
        int i3 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        return (i3 != 0 ? iHashCode / 18 : iHashCode * 31) + Boolean.hashCode(this.onExtraCallback);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ClickFoldableCard(serviceName=" + this.onWarmupCompleted + ", collapsed=" + this.onExtraCallback + ")";
        int i2 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public deleteDownloadPackage$onNavigationEvent(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
        this.onExtraCallback = z;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
