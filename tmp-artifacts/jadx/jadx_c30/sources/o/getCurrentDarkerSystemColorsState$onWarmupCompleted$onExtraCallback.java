package o;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getCurrentDarkerSystemColorsState$onWarmupCompleted$onExtraCallback implements Serializable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("absolute_url")
    private final String absolute_url;

    @SerializedName("featured")
    private final boolean featured;

    @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_ID)
    private final long id;

    @SerializedName("title")
    private final String title;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentDarkerSystemColorsState$onWarmupCompleted$onExtraCallback)) {
            int i5 = i2 + 19;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 == 0;
        }
        getCurrentDarkerSystemColorsState$onWarmupCompleted$onExtraCallback getcurrentdarkersystemcolorsstate_onwarmupcompleted_onextracallback = (getCurrentDarkerSystemColorsState$onWarmupCompleted$onExtraCallback) obj;
        if (this.featured != getcurrentdarkersystemcolorsstate_onwarmupcompleted_onextracallback.featured) {
            int i6 = i2 + 77;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, getcurrentdarkersystemcolorsstate_onwarmupcompleted_onextracallback.title)) {
            return false;
        }
        if (this.id != getcurrentdarkersystemcolorsstate_onwarmupcompleted_onextracallback.id) {
            int i8 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.absolute_url, getcurrentdarkersystemcolorsstate_onwarmupcompleted_onextracallback.absolute_url)) {
            int i10 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((((Boolean.hashCode(this.featured) >> 19) + this.title.hashCode()) >>> 97) % Long.hashCode(this.id)) << 74) << this.absolute_url.hashCode() : (((((Boolean.hashCode(this.featured) * 31) + this.title.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + this.absolute_url.hashCode();
        int i3 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FAQ(featured=" + this.featured + ", title=" + this.title + ", id=" + this.id + ", absolute_url=" + this.absolute_url + ")";
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
