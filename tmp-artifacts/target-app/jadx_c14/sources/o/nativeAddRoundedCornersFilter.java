package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class nativeAddRoundedCornersFilter {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("body")
    private final String body;

    @SerializedName("bodyColor")
    private final String bodyColor;

    @SerializedName("cashbackOverLimit")
    private final boolean cashbackOverLimit;

    @SerializedName("imageUrl")
    private final String imageUrl;

    @SerializedName("targetUrl")
    private final String targetUrl;

    @SerializedName("title")
    private final String title;

    @SerializedName("titleColor")
    private final String titleColor;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nativeAddRoundedCornersFilter)) {
            return false;
        }
        nativeAddRoundedCornersFilter nativeaddroundedcornersfilter = (nativeAddRoundedCornersFilter) obj;
        if (!Intrinsics.areEqual(this.body, nativeaddroundedcornersfilter.body)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.bodyColor, nativeaddroundedcornersfilter.bodyColor)) {
            int i2 = IAuthTabCallback + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.cashbackOverLimit != nativeaddroundedcornersfilter.cashbackOverLimit) {
            return false;
        }
        if (!Intrinsics.areEqual(this.imageUrl, nativeaddroundedcornersfilter.imageUrl)) {
            int i4 = IAuthTabCallback + 83;
            onExtraCallback = i4 % 128;
            return !(i4 % 2 == 0);
        }
        if (!Intrinsics.areEqual(this.targetUrl, nativeaddroundedcornersfilter.targetUrl)) {
            int i5 = onExtraCallback + 107;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, nativeaddroundedcornersfilter.title)) {
            return false;
        }
        if (Intrinsics.areEqual(this.titleColor, nativeaddroundedcornersfilter.titleColor)) {
            return true;
        }
        int i7 = IAuthTabCallback + 87;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.body.hashCode() * 31) + this.bodyColor.hashCode()) * 31) + Boolean.hashCode(this.cashbackOverLimit)) * 31) + this.imageUrl.hashCode()) * 31) + this.targetUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.titleColor.hashCode();
        int i4 = IAuthTabCallback + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccBanner(body=" + this.body + ", bodyColor=" + this.bodyColor + ", cashbackOverLimit=" + this.cashbackOverLimit + ", imageUrl=" + this.imageUrl + ", targetUrl=" + this.targetUrl + ", title=" + this.title + ", titleColor=" + this.titleColor + ")";
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.body;
        int i5 = i3 + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.bodyColor;
        }
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.cashbackOverLimit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.imageUrl;
        int i4 = i3 + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.targetUrl;
        int i4 = i2 + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.title;
        }
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.titleColor;
        int i4 = i2 + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
