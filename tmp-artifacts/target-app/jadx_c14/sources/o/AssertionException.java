package o;

import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AssertionException {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("props")
    private Map<String, Object> props;

    @SerializedName("useHistory")
    private boolean useHistory;

    /* JADX WARN: Illegal instructions before constructor call */
    public AssertionException() {
        Map map = null;
        this(map, false, 3, map);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof AssertionException) {
            AssertionException assertionException = (AssertionException) obj;
            return Intrinsics.areEqual(this.props, assertionException.props) && this.useHistory == assertionException.useHistory;
        }
        int i4 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.props.hashCode() * 31) + Boolean.hashCode(this.useHistory);
        int i4 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UpdatePropertiesReq(props=" + this.props + ", useHistory=" + this.useHistory + ")";
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AssertionException(@NotNull Map<String, Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "");
        this.props = map;
        this.useHistory = z;
    }

    public /* synthetic */ AssertionException(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            map = new LinkedHashMap();
            int i2 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 55;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 121;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            z = false;
        }
        this(map, z);
    }

    public final AssertionException onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.props.put(str, str2);
            return this;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.props.put(str, str2);
        throw null;
    }
}
