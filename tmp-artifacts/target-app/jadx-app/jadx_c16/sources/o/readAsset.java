package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class readAsset {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final RVManifestLazyProxyManifest onNavigationEvent;
    private final Function0<Boolean> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readAsset)) {
            return false;
        }
        readAsset readasset = (readAsset) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, readasset.onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, readasset.onWarmupCompleted)) {
            return true;
        }
        int i3 = onExtraCallbackWithResult + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onNavigationEvent.hashCode() * 31) + this.onWarmupCompleted.hashCode();
        int i4 = onExtraCallback + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final Function0<Boolean> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Function0<Boolean> function0 = this.onWarmupCompleted;
        int i5 = i2 + 25;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return function0;
    }

    public final RVManifestLazyProxyManifest onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RVManifestLazyProxyManifest rVManifestLazyProxyManifest = this.onNavigationEvent;
        int i4 = i2 + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return rVManifestLazyProxyManifest;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NaviBarImpressionContainer(loggable=" + this.onNavigationEvent + ", predicate=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallbackWithResult + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public readAsset(@NotNull RVManifestLazyProxyManifest rVManifestLazyProxyManifest, @NotNull Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(rVManifestLazyProxyManifest, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onNavigationEvent = rVManifestLazyProxyManifest;
        this.onWarmupCompleted = function0;
    }
}
