package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getJavaScriptContextHolder {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String result;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof getJavaScriptContextHolder) {
            return Intrinsics.areEqual(this.result, ((getJavaScriptContextHolder) obj).result);
        }
        int i3 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i3 % 128;
        return i3 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.result.hashCode();
        int i4 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CertifyRrnRes(result=" + this.result + ")";
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
