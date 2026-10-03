package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class replaceFilenameWithoutExtension {
    private final Integer IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;

    public replaceFilenameWithoutExtension() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof replaceFilenameWithoutExtension)) {
            return false;
        }
        replaceFilenameWithoutExtension replacefilenamewithoutextension = (replaceFilenameWithoutExtension) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, replacefilenamewithoutextension.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, replacefilenamewithoutextension.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, replacefilenamewithoutextension.onExtraCallback);
    }

    public int hashCode() {
        String str = this.onExtraCallbackWithResult;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.IAuthTabCallback;
        return (((iHashCode * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.onExtraCallback.hashCode();
    }

    public String toString() {
        return "TossMoneyNoticeBannerRow(title=" + this.onExtraCallbackWithResult + ", titleResId=" + this.IAuthTabCallback + ", scheme=" + this.onExtraCallback + ")";
    }

    public replaceFilenameWithoutExtension(@Nullable String str, @Nullable Integer num, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = num;
        this.onExtraCallback = str2;
    }

    public final String onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final Integer IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public /* synthetic */ replaceFilenameWithoutExtension(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str2);
    }

    public final String onExtraCallback() {
        return this.onExtraCallback;
    }
}
