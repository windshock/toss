package o;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class findLastCompletelyVisibleItemPosition {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private final String connection;
    private final String developerConnection;
    private final String url;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findLastCompletelyVisibleItemPosition)) {
            return false;
        }
        findLastCompletelyVisibleItemPosition findlastcompletelyvisibleitemposition = (findLastCompletelyVisibleItemPosition) obj;
        return Intrinsics.areEqual(this.connection, findlastcompletelyvisibleitemposition.connection) && Intrinsics.areEqual(this.developerConnection, findlastcompletelyvisibleitemposition.developerConnection) && Intrinsics.areEqual(this.url, findlastcompletelyvisibleitemposition.url);
    }

    public int hashCode() {
        String str = this.connection;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.developerConnection;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.url;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "Scm(connection=" + this.connection + ", developerConnection=" + this.developerConnection + ", url=" + this.url + ")";
    }

    public static final class onExtraCallbackWithResult {
        private onExtraCallbackWithResult() {
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<findLastCompletelyVisibleItemPosition> serializer() {
            return IAuthTabCallback.onExtraCallback;
        }
    }

    public /* synthetic */ findLastCompletelyVisibleItemPosition(int i2, String str, String str2, String str3, okycx okycxVar) {
        if (7 != (i2 & 7)) {
            htf31.onExtraCallbackWithResult(i2, 7, IAuthTabCallback.onExtraCallback.getDescriptor());
        }
        this.connection = str;
        this.developerConnection = str2;
        this.url = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(findLastCompletelyVisibleItemPosition findlastcompletelyvisibleitemposition, vyl vylVar, SerialDescriptor serialDescriptor) {
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, findlastcompletelyvisibleitemposition.connection);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, findlastcompletelyvisibleitemposition.developerConnection);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, findlastcompletelyvisibleitemposition.url);
    }

    public findLastCompletelyVisibleItemPosition(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.connection = str;
        this.developerConnection = str2;
        this.url = str3;
    }
}
