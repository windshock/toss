package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class getSupportedFeatures {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String onExtraCallback;
    private final boolean onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public getSupportedFeatures() {
        String str = null;
        this(false, str, 3, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 1;
            onNavigationEvent = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof getSupportedFeatures)) {
            return false;
        }
        getSupportedFeatures getsupportedfeatures = (getSupportedFeatures) obj;
        if (this.onWarmupCompleted == getsupportedfeatures.onWarmupCompleted) {
            return Intrinsics.areEqual(this.onExtraCallback, getsupportedfeatures.onExtraCallback);
        }
        int i6 = i3 + 81;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Boolean.hashCode(this.onWarmupCompleted) * 31) + this.onExtraCallback.hashCode();
        int i4 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final getSupportedFeatures onExtraCallbackWithResult(boolean z, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        getSupportedFeatures getsupportedfeatures = new getSupportedFeatures(z, str);
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return getsupportedfeatures;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdMobVideoState(isPlaying=" + this.onWarmupCompleted + ", guideText=" + this.onExtraCallback + ")";
        int i2 = onExtraCallbackWithResult + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public getSupportedFeatures(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = z;
        this.onExtraCallback = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getSupportedFeatures(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            z = false;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 75;
            int i5 = i4 % 128;
            onNavigationEvent = i5;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i5 + 23;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            str = "";
        }
        this(z, str);
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.onWarmupCompleted;
        int i4 = i3 + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            str = this.onExtraCallback;
            int i4 = 62 / 0;
        } else {
            str = this.onExtraCallback;
        }
        int i5 = i3 + 81;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
