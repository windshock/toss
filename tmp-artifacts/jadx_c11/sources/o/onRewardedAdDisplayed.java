package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class onRewardedAdDisplayed {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 33;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof onRewardedAdDisplayed)) {
            int i4 = IAuthTabCallback + 9;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        onRewardedAdDisplayed onrewardedaddisplayed = (onRewardedAdDisplayed) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onrewardedaddisplayed.onExtraCallbackWithResult)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, onrewardedaddisplayed.onWarmupCompleted)) {
            return Intrinsics.areEqual(this.onExtraCallback, onrewardedaddisplayed.onExtraCallback) && !(Intrinsics.areEqual(this.onNavigationEvent, onrewardedaddisplayed.onNavigationEvent) ^ true);
        }
        int i6 = IAuthTabCallback + 51;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        return i3 == 0 ? (((((iHashCode >>> 37) / this.onWarmupCompleted.hashCode()) >>> 104) % this.onExtraCallback.hashCode()) + 89) / this.onNavigationEvent.hashCode() : (((((iHashCode * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ParsedReactSchemeActivityFallbackUri(originalUri=" + this.onExtraCallbackWithResult + ", reactSchemeActivityUri=" + this.onWarmupCompleted + ", bundlePath=" + this.onExtraCallback + ", company=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallbackStub + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public onRewardedAdDisplayed(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onExtraCallbackWithResult = str;
        this.onWarmupCompleted = str2;
        this.onExtraCallback = str3;
        this.onNavigationEvent = str4;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 11;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.onWarmupCompleted;
        int i4 = i2 + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallback;
        int i5 = i3 + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 99;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
