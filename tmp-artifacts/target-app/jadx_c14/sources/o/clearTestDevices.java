package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class clearTestDevices {
    private final String IAuthTabCallback;
    private final boolean onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clearTestDevices)) {
            return false;
        }
        clearTestDevices cleartestdevices = (clearTestDevices) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, cleartestdevices.onWarmupCompleted) && Intrinsics.areEqual(this.IAuthTabCallback, cleartestdevices.IAuthTabCallback) && this.onNavigationEvent == cleartestdevices.onNavigationEvent && this.onExtraCallbackWithResult == cleartestdevices.onExtraCallbackWithResult;
    }

    public int hashCode() {
        int iHashCode = this.onWarmupCompleted.hashCode();
        String str = this.IAuthTabCallback;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.onNavigationEvent)) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        return "EmojiProfilePanelItem(url=" + this.onWarmupCompleted + ", iconName=" + this.IAuthTabCallback + ", isCamera=" + this.onNavigationEvent + ", isGallery=" + this.onExtraCallbackWithResult + ")";
    }

    public clearTestDevices(@NotNull String str, @Nullable String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
        this.IAuthTabCallback = str2;
        this.onNavigationEvent = z;
        this.onExtraCallbackWithResult = z2;
    }

    public /* synthetic */ clearTestDevices(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final String onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public final String onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final boolean onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final boolean onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }
}
