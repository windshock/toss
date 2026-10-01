package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isColdStartup$onNavigationEvent implements isColdStartup {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private final String onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 51;
            IAuthTabCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        if (obj instanceof isColdStartup$onNavigationEvent) {
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((isColdStartup$onNavigationEvent) obj).onExtraCallbackWithResult)) {
                return true;
            }
            int i7 = IAuthTabCallback + 37;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i4 + 49;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        if (str == null) {
            int i5 = i3 + 35;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i7 = IAuthTabCallback + 119;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 59 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShowDefault(livingStabilizationScheme=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public isColdStartup$onNavigationEvent(@Nullable String str) {
        this.onExtraCallbackWithResult = str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onExtraCallbackWithResult;
        int i4 = i3 + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
