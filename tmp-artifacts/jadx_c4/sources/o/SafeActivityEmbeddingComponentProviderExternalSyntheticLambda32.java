package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda32 implements SafeActivityEmbeddingComponentProviderExternalSyntheticLambda30 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final String onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 21;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof SafeActivityEmbeddingComponentProviderExternalSyntheticLambda32)) {
            int i7 = i2 + 67;
            onExtraCallback = i7 % 128;
            return !(i7 % 2 == 0);
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda32) obj).onExtraCallbackWithResult)) {
            return true;
        }
        int i8 = onNavigationEvent + 47;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int i4 = onNavigationEvent + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DateHeaderUiModel(date=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public SafeActivityEmbeddingComponentProviderExternalSyntheticLambda32(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i3 + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
