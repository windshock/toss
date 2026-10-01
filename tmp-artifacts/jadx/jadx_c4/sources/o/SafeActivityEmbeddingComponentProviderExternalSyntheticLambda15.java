package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 IAuthTabCallback;
    private final boolean onExtraCallback;
    private final List<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30> onExtraCallbackWithResult;

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15 IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15 safeActivityEmbeddingComponentProviderExternalSyntheticLambda15, boolean z, List list, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 safeActivityEmbeddingComponentProviderExternalSyntheticLambda17, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 109;
            int i7 = i6 % 128;
            onNavigationEvent = i7;
            int i8 = i6 % 2;
            boolean z2 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda15.onExtraCallback;
            int i9 = i7 + 53;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            z = z2;
        }
        if ((i & 2) != 0) {
            list = safeActivityEmbeddingComponentProviderExternalSyntheticLambda15.onExtraCallbackWithResult;
            int i11 = onNavigationEvent + 17;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
        }
        if ((i & 4) != 0) {
            safeActivityEmbeddingComponentProviderExternalSyntheticLambda17 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda15.IAuthTabCallback;
        }
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda15.onExtraCallbackWithResult(z, list, safeActivityEmbeddingComponentProviderExternalSyntheticLambda17);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 13;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15)) {
            int i6 = i4 + 119;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 != 0;
        }
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15 safeActivityEmbeddingComponentProviderExternalSyntheticLambda15 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15) obj;
        if (this.onExtraCallback != safeActivityEmbeddingComponentProviderExternalSyntheticLambda15.onExtraCallback) {
            int i7 = i2 + 15;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, safeActivityEmbeddingComponentProviderExternalSyntheticLambda15.onExtraCallbackWithResult)) {
            return false;
        }
        if (this.IAuthTabCallback == safeActivityEmbeddingComponentProviderExternalSyntheticLambda15.IAuthTabCallback) {
            return true;
        }
        int i9 = onNavigationEvent + 75;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Boolean.hashCode(this.onExtraCallback);
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 safeActivityEmbeddingComponentProviderExternalSyntheticLambda17 = this.IAuthTabCallback;
        if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda17 == null) {
            int i5 = onWarmupCompleted + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode3 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda17.hashCode();
            int i7 = onNavigationEvent + 9;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15 onExtraCallbackWithResult(boolean z, @NotNull List<? extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30> list, @Nullable SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 safeActivityEmbeddingComponentProviderExternalSyntheticLambda17) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15 safeActivityEmbeddingComponentProviderExternalSyntheticLambda15 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15(z, list, safeActivityEmbeddingComponentProviderExternalSyntheticLambda17);
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda15;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InAppPurchaseHistoryUiState(isLoading=" + this.onExtraCallback + ", items=" + this.onExtraCallbackWithResult + ", error=" + this.IAuthTabCallback + ")";
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15(boolean z, @NotNull List<? extends SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30> list, @Nullable SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 safeActivityEmbeddingComponentProviderExternalSyntheticLambda17) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallback = z;
        this.onExtraCallbackWithResult = list;
        this.IAuthTabCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda17;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SafeActivityEmbeddingComponentProviderExternalSyntheticLambda15(boolean z, List list, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 safeActivityEmbeddingComponentProviderExternalSyntheticLambda17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            z = i2 % 2 == 0;
            int i3 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            list = CollectionsKt.emptyList();
            int i6 = onNavigationEvent + 103;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i9 = onWarmupCompleted + 79;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            safeActivityEmbeddingComponentProviderExternalSyntheticLambda17 = null;
        }
        this(z, list, safeActivityEmbeddingComponentProviderExternalSyntheticLambda17);
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 95;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda17 safeActivityEmbeddingComponentProviderExternalSyntheticLambda17 = this.IAuthTabCallback;
        int i5 = i3 + 81;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return safeActivityEmbeddingComponentProviderExternalSyntheticLambda17;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
