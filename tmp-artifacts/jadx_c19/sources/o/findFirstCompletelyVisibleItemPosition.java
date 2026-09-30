package o;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class findFirstCompletelyVisibleItemPosition {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private final String platform;
    private final String url;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findFirstCompletelyVisibleItemPosition)) {
            return false;
        }
        findFirstCompletelyVisibleItemPosition findfirstcompletelyvisibleitemposition = (findFirstCompletelyVisibleItemPosition) obj;
        return Intrinsics.areEqual(this.platform, findfirstcompletelyvisibleitemposition.platform) && Intrinsics.areEqual(this.url, findfirstcompletelyvisibleitemposition.url);
    }

    public int hashCode() {
        return (this.platform.hashCode() * 31) + this.url.hashCode();
    }

    public String toString() {
        return "Funding(platform=" + this.platform + ", url=" + this.url + ")";
    }

    public static final class onExtraCallbackWithResult {
        private onExtraCallbackWithResult() {
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<findFirstCompletelyVisibleItemPosition> serializer() {
            return onNavigationEvent.onNavigationEvent;
        }
    }

    public /* synthetic */ findFirstCompletelyVisibleItemPosition(int i2, String str, String str2, okycx okycxVar) {
        if (3 != (i2 & 3)) {
            htf31.onExtraCallbackWithResult(i2, 3, onNavigationEvent.onNavigationEvent.getDescriptor());
        }
        this.platform = str;
        this.url = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(findFirstCompletelyVisibleItemPosition findfirstcompletelyvisibleitemposition, vyl vylVar, SerialDescriptor serialDescriptor) {
        vylVar.onExtraCallback(serialDescriptor, 0, findfirstcompletelyvisibleitemposition.platform);
        vylVar.onExtraCallback(serialDescriptor, 1, findfirstcompletelyvisibleitemposition.url);
    }

    public findFirstCompletelyVisibleItemPosition(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.platform = str;
        this.url = str2;
    }
}
