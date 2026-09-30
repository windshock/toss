package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReactRootViewExternalSyntheticApiModelOutline0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("description")
    private final String description;

    @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_ID)
    private final String id;

    @SerializedName("imageUrl")
    private final String imageUrl;

    @SerializedName("openLink")
    private final String openLink;

    @SerializedName("title")
    private final String title;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ReactRootViewExternalSyntheticApiModelOutline0)) {
            return false;
        }
        ReactRootViewExternalSyntheticApiModelOutline0 reactRootViewExternalSyntheticApiModelOutline0 = (ReactRootViewExternalSyntheticApiModelOutline0) obj;
        if (!Intrinsics.areEqual(this.id, reactRootViewExternalSyntheticApiModelOutline0.id) || !Intrinsics.areEqual(this.title, reactRootViewExternalSyntheticApiModelOutline0.title) || !Intrinsics.areEqual(this.description, reactRootViewExternalSyntheticApiModelOutline0.description)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.imageUrl, reactRootViewExternalSyntheticApiModelOutline0.imageUrl)) {
            int i4 = onExtraCallback + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.openLink, reactRootViewExternalSyntheticApiModelOutline0.openLink)) {
            return true;
        }
        int i6 = IAuthTabCallback + 123;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.description.hashCode();
        String str = this.imageUrl;
        if (str == null) {
            int i5 = onExtraCallback + 105;
            IAuthTabCallback = i5 % 128;
            i = i5 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode4 = str.hashCode();
            int i6 = IAuthTabCallback + 119;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i = iHashCode4;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i) * 31) + this.openLink.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetTossFeedContentsResponse(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", openLink=" + this.openLink + ")";
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 57;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 93;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 85;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.imageUrl;
        int i5 = i3 + 29;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            str = this.openLink;
            int i4 = 21 / 0;
        } else {
            str = this.openLink;
        }
        int i5 = i3 + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return str;
    }
}
