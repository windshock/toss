package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult implements SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String IAuthTabCallback;
    private final boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 119;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        if (this == obj) {
            int i7 = i3 + 15;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        if (!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult)) {
            int i9 = i5 + 35;
            onExtraCallbackWithResult = i9 % 128;
            return i9 % 2 != 0;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult safeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, safeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult.IAuthTabCallback)) {
            int i10 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.onWarmupCompleted == safeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult.onWarmupCompleted) {
            return true;
        }
        int i12 = onExtraCallbackWithResult;
        int i13 = i12 + 115;
        onNavigationEvent = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i12 + 15;
        onNavigationEvent = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 41 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        return i4 == 0 ? (iHashCode - 31) / Boolean.hashCode(this.onWarmupCompleted) : (iHashCode * 31) + Boolean.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "OnBeProductGranted(orderId=" + this.IAuthTabCallback + ", granted=" + this.onWarmupCompleted + ")";
        int i3 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda34$onExtraCallbackWithResult(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = z;
    }

    public final String onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.onWarmupCompleted;
        int i6 = i3 + 11;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
