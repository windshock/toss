package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class registerAppHandler$onNavigationEvent implements registerAppHandler {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 113;
            onExtraCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof registerAppHandler$onNavigationEvent)) {
            int i3 = onExtraCallback + 13;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, ((registerAppHandler$onNavigationEvent) obj).onWarmupCompleted)) {
            return true;
        }
        int i5 = IAuthTabCallback + 9;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        int i4 = IAuthTabCallback + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AuthAndMobileId(label=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return str;
    }

    public registerAppHandler$onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
        this.onNavigationEvent = "auth_and_mobile_id";
    }

    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 79;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 113;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 107;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 11;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.onExtraCallbackWithResult;
        int i4 = i2 + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }
}
