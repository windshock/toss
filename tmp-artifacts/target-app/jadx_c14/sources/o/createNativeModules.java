package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeModules {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String password;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof createNativeModules)) {
            int i4 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.password, ((createNativeModules) obj).password)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.password.hashCode();
        int i4 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardPasswordRequest(password=" + this.password + ")";
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public createNativeModules(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.password = str;
    }
}
