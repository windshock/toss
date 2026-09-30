package o;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class fill {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private final String name;
    private final String organisationUrl;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fill)) {
            return false;
        }
        fill fillVar = (fill) obj;
        return Intrinsics.areEqual(this.name, fillVar.name) && Intrinsics.areEqual(this.organisationUrl, fillVar.organisationUrl);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.organisationUrl;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Developer(name=" + this.name + ", organisationUrl=" + this.organisationUrl + ")";
    }

    public static final class IAuthTabCallback {
        private IAuthTabCallback() {
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<fill> serializer() {
            return onNavigationEvent.onWarmupCompleted;
        }
    }

    public /* synthetic */ fill(int i2, String str, String str2, okycx okycxVar) {
        if (3 != (i2 & 3)) {
            htf31.onExtraCallbackWithResult(i2, 3, onNavigationEvent.onWarmupCompleted.getDescriptor());
        }
        this.name = str;
        this.organisationUrl = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(fill fillVar, vyl vylVar, SerialDescriptor serialDescriptor) {
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, fillVar.name);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, fillVar.organisationUrl);
    }

    public fill(@Nullable String str, @Nullable String str2) {
        this.name = str;
        this.organisationUrl = str2;
    }
}
