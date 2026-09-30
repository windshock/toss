package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 IAuthTabCallback;
    private final Throwable onExtraCallbackWithResult;
    private final boolean onNavigationEvent;

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12() {
        this(false, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 13;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 3;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12)) {
            return false;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12 safeActivityEmbeddingComponentProviderExternalSyntheticLambda12 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12) obj;
        if (this.onNavigationEvent != safeActivityEmbeddingComponentProviderExternalSyntheticLambda12.onNavigationEvent) {
            int i7 = i4 + 55;
            onWarmupCompleted = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, safeActivityEmbeddingComponentProviderExternalSyntheticLambda12.IAuthTabCallback)) {
            int i8 = onExtraCallback + 15;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, safeActivityEmbeddingComponentProviderExternalSyntheticLambda12.onExtraCallbackWithResult)) {
            int i10 = onExtraCallback + 25;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            return true;
        }
        int i12 = onExtraCallback + 39;
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.onNavigationEvent);
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 = this.IAuthTabCallback;
        if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 == null) {
            int i2 = onWarmupCompleted + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42.hashCode();
            int i4 = onExtraCallback + 15;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 5;
            }
        }
        Throwable th = this.onExtraCallbackWithResult;
        return (((iHashCode2 * 31) + iHashCode) * 31) + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InAppPurchaseHistoryDetailUiState(isLoading=" + this.onNavigationEvent + ", item=" + this.IAuthTabCallback + ", error=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12(boolean z, @Nullable SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, @Nullable Throwable th) {
        this.onNavigationEvent = z;
        this.IAuthTabCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
        this.onExtraCallbackWithResult = th;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12(boolean z, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 = null;
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallback + 61;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            th = null;
        }
        this(z, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42, th);
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onNavigationEvent;
        int i4 = i2 + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42 = this.IAuthTabCallback;
        int i4 = i2 + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
    }

    public final Throwable onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }
}
