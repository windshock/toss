package im.toss.core.tracker;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RemoteProcessLogIdentity {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final String IAuthTabCallback;
    private final String onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 109;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 == 0;
        }
        if (obj instanceof RemoteProcessLogIdentity) {
            RemoteProcessLogIdentity remoteProcessLogIdentity = (RemoteProcessLogIdentity) obj;
            if (!(!Intrinsics.areEqual(this.IAuthTabCallback, remoteProcessLogIdentity.IAuthTabCallback))) {
                if (Intrinsics.areEqual(this.onNavigationEvent, remoteProcessLogIdentity.onNavigationEvent)) {
                    return true;
                }
                int i6 = onExtraCallback + 19;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i7 = onExtraCallback + 51;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.IAuthTabCallback.hashCode() * 31) + this.onNavigationEvent.hashCode();
        int i4 = onExtraCallbackWithResult + 39;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteProcessLogIdentity(logId=" + this.IAuthTabCallback + ", logTime=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RemoteProcessLogIdentity(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback = str;
        this.onNavigationEvent = str2;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 91;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 49;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.onNavigationEvent;
            int i4 = 81 / 0;
        } else {
            str = this.onNavigationEvent;
        }
        int i5 = i2 + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
