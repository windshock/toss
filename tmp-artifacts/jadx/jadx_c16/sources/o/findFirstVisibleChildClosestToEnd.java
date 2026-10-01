package o;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class findFirstVisibleChildClosestToEnd {
    public static final onWarmupCompleted Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
    private final String hash;
    private final String licenseContent;
    private final String name;
    private final String spdxId;
    private final String url;
    private final String year;

    public String toString() {
        return "License(name=" + this.name + ", url=" + this.url + ", year=" + this.year + ", spdxId=" + this.spdxId + ", licenseContent=" + this.licenseContent + ", hash=" + this.hash + ")";
    }

    public /* synthetic */ findFirstVisibleChildClosestToEnd(int i, String str, String str2, String str3, String str4, String str5, String str6, okycx okycxVar) {
        if (35 != (i & 35)) {
            htf31.onExtraCallbackWithResult(i, 35, IAuthTabCallback.onExtraCallbackWithResult.getDescriptor());
        }
        this.name = str;
        this.url = str2;
        if ((i & 4) == 0) {
            this.year = null;
        } else {
            this.year = str3;
        }
        if ((i & 8) == 0) {
            this.spdxId = null;
        } else {
            this.spdxId = str4;
        }
        if ((i & 16) == 0) {
            this.licenseContent = null;
        } else {
            this.licenseContent = str5;
        }
        this.hash = str6;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(findFirstVisibleChildClosestToEnd findfirstvisiblechildclosesttoend, vyl vylVar, SerialDescriptor serialDescriptor) {
        vylVar.onExtraCallback(serialDescriptor, 0, findfirstvisiblechildclosesttoend.name);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, findfirstvisiblechildclosesttoend.url);
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || findfirstvisiblechildclosesttoend.year != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, findfirstvisiblechildclosesttoend.year);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || findfirstvisiblechildclosesttoend.spdxId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, findfirstvisiblechildclosesttoend.spdxId);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || findfirstvisiblechildclosesttoend.licenseContent != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, findfirstvisiblechildclosesttoend.licenseContent);
        }
        vylVar.onExtraCallback(serialDescriptor, 5, findfirstvisiblechildclosesttoend.hash);
    }

    public findFirstVisibleChildClosestToEnd(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.name = str;
        this.url = str2;
        this.year = str3;
        this.spdxId = str4;
        this.licenseContent = str5;
        this.hash = str6;
    }

    public final String onExtraCallbackWithResult() {
        return this.name;
    }

    public final String onExtraCallback() {
        return this.url;
    }

    public final String IAuthTabCallback() {
        return this.spdxId;
    }

    public final String onNavigationEvent() {
        return this.licenseContent;
    }

    public final String onWarmupCompleted() {
        return this.hash;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && findFirstVisibleChildClosestToEnd.class == obj.getClass() && Intrinsics.areEqual(this.hash, ((findFirstVisibleChildClosestToEnd) obj).hash);
    }

    public int hashCode() {
        return this.hash.hashCode();
    }
}
