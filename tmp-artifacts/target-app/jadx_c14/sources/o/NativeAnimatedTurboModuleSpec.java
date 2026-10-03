package o;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAnimatedTurboModuleSpec implements Serializable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final String schemeUri;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof NativeAnimatedTurboModuleSpec) {
            if (!Intrinsics.areEqual(this.schemeUri, ((NativeAnimatedTurboModuleSpec) obj).schemeUri)) {
                return false;
            }
            int i4 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = IAuthTabCallback + 11;
        int i7 = i6 % 128;
        onExtraCallbackWithResult = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 51;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 68 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.schemeUri.hashCode();
        int i4 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensUssCardOnboarding(schemeUri=" + this.schemeUri + ")";
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public NativeAnimatedTurboModuleSpec(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.schemeUri = str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.schemeUri;
        int i5 = i3 + 65;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return str;
    }
}
