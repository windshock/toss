package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class sendPrepareFailMsgToClient {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof sendPrepareFailMsgToClient)) {
            int i4 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        sendPrepareFailMsgToClient sendpreparefailmsgtoclient = (sendPrepareFailMsgToClient) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, sendpreparefailmsgtoclient.IAuthTabCallback)) {
            int i6 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, sendpreparefailmsgtoclient.onExtraCallback)) {
            int i8 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i8 % 128;
            return i8 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, sendpreparefailmsgtoclient.onNavigationEvent)) {
            int i9 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 78 / 0;
            }
            return true;
        }
        int i11 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.IAuthTabCallback.hashCode() >>> 40) * this.onExtraCallback.hashCode()) / 99) << this.onNavigationEvent.hashCode() : (((this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode();
        int i3 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionCategoryUpdateParameterDto(categoryNo=" + this.IAuthTabCallback + ", categoryName=" + this.onExtraCallback + ", categoryIconNo=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public sendPrepareFailMsgToClient(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.IAuthTabCallback = str;
        this.onExtraCallback = str2;
        this.onNavigationEvent = str3;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 7;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallback;
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            str = this.onNavigationEvent;
            int i4 = 38 / 0;
        } else {
            str = this.onNavigationEvent;
        }
        int i5 = i3 + 45;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
