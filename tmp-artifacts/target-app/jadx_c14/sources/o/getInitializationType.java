package o;

import com.google.gson.annotations.SerializedName;
import im.toss.core.tracker.entry.TrackLog;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getInitializationType implements getOther {
    public static final int $stable = 8;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private TrackLog clickLog;

    @SerializedName("description")
    private String description;

    @SerializedName("iconUri")
    private String iconUri;
    private TrackLog impressionLog;

    @SerializedName("links")
    private List<startOperationBatch> links;

    @SerializedName("style")
    private AdViewParentApi style;

    @SerializedName("title")
    private String title;

    public getInitializationType() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getInitializationType)) {
            int i4 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        getInitializationType getinitializationtype = (getInitializationType) obj;
        if (!Intrinsics.areEqual(this.title, getinitializationtype.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.description, getinitializationtype.description)) {
            int i5 = onExtraCallbackWithResult + 11;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.style, getinitializationtype.style) || !Intrinsics.areEqual(this.iconUri, getinitializationtype.iconUri)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.links, getinitializationtype.links))) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.description.hashCode();
        AdViewParentApi adViewParentApi = this.style;
        int iHashCode4 = 0;
        if (adViewParentApi == null) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 123;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 41;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = adViewParentApi.hashCode();
        }
        String str = this.iconUri;
        if (str != null) {
            int i7 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            iHashCode4 = str.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + this.links.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardBanner(title=" + this.title + ", description=" + this.description + ", style=" + this.style + ", iconUri=" + this.iconUri + ", links=" + this.links + ")";
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getInitializationType(@NotNull String str, @NotNull String str2, @Nullable AdViewParentApi adViewParentApi, @Nullable String str3, @NotNull List<startOperationBatch> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.description = str2;
        this.style = adViewParentApi;
        this.iconUri = str3;
        this.links = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getInitializationType(String str, String str2, AdViewParentApi adViewParentApi, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        AdViewParentApi adViewParentApi2;
        String str4;
        String str5 = "";
        String str6 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            int i3 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            adViewParentApi2 = null;
        } else {
            adViewParentApi2 = adViewParentApi;
        }
        if ((i & 8) != 0) {
            int i5 = 2 % 2;
            str4 = null;
        } else {
            str4 = str3;
        }
        if ((i & 16) != 0) {
            int i6 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i7 = 4 / 0;
            } else {
                list = CollectionsKt.emptyList();
            }
        }
        this(str6, str5, adViewParentApi2, str4, list);
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 111;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 23;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AdViewParentApi IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 67;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AdViewParentApi adViewParentApi = this.style;
        int i4 = i2 + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return adViewParentApi;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.iconUri;
        int i5 = i3 + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<startOperationBatch> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<startOperationBatch> list = this.links;
        int i5 = i2 + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final TrackLog onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        TrackLog trackLog = this.clickLog;
        int i5 = i2 + 11;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return trackLog;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        toASN1EncodableVector toasn1encodablevector = toASN1EncodableVector.CARD_BILL_BANNER;
        int i4 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return toasn1encodablevector;
    }
}
