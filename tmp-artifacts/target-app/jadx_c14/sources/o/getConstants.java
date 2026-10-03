package o;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getConstants implements Serializable {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String schemeUri;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getConstants)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.schemeUri, ((getConstants) obj).schemeUri)) {
            int i4 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 13 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.schemeUri.hashCode();
        int i4 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensAccountOnboarding(schemeUri=" + this.schemeUri + ")";
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public getConstants(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.schemeUri = str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.schemeUri;
        int i5 = i2 + 1;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
