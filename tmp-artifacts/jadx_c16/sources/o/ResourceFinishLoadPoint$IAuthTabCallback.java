package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ResourceFinishLoadPoint$IAuthTabCallback implements ResourceFinishLoadPoint {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final onReceivedResponseHeader onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResourceFinishLoadPoint$IAuthTabCallback) {
            if (this.onExtraCallbackWithResult != ((ResourceFinishLoadPoint$IAuthTabCallback) obj).onExtraCallbackWithResult) {
                return false;
            }
            int i2 = onExtraCallback + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i3 = onNavigationEvent + 67;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 97;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Failure(reason=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ResourceFinishLoadPoint$IAuthTabCallback(@NotNull onReceivedResponseHeader onreceivedresponseheader) {
        Intrinsics.checkNotNullParameter(onreceivedresponseheader, "");
        this.onExtraCallbackWithResult = onreceivedresponseheader;
    }

    public final onReceivedResponseHeader onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        onReceivedResponseHeader onreceivedresponseheader = this.onExtraCallbackWithResult;
        int i5 = i2 + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return onreceivedresponseheader;
    }
}
