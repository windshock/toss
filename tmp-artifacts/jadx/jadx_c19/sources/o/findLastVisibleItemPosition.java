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
public final class findLastVisibleItemPosition {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private final String name;
    private final String url;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findLastVisibleItemPosition)) {
            return false;
        }
        findLastVisibleItemPosition findlastvisibleitemposition = (findLastVisibleItemPosition) obj;
        return Intrinsics.areEqual(this.name, findlastvisibleitemposition.name) && Intrinsics.areEqual(this.url, findlastvisibleitemposition.url);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode();
        String str = this.url;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Organization(name=" + this.name + ", url=" + this.url + ")";
    }

    public static final class onWarmupCompleted {
        private onWarmupCompleted() {
        }

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<findLastVisibleItemPosition> serializer() {
            return onExtraCallback.onExtraCallbackWithResult;
        }
    }

    public /* synthetic */ findLastVisibleItemPosition(int i2, String str, String str2, okycx okycxVar) {
        if (3 != (i2 & 3)) {
            htf31.onExtraCallbackWithResult(i2, 3, onExtraCallback.onExtraCallbackWithResult.getDescriptor());
        }
        this.name = str;
        this.url = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(findLastVisibleItemPosition findlastvisibleitemposition, vyl vylVar, SerialDescriptor serialDescriptor) {
        vylVar.onExtraCallback(serialDescriptor, 0, findlastvisibleitemposition.name);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, findlastvisibleitemposition.url);
    }

    public findLastVisibleItemPosition(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.url = str2;
    }
}
