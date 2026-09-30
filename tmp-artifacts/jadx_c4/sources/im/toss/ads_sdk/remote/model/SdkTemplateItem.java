package im.toss.ads_sdk.remote.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.encryptType4;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SdkTemplateItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String catalogFeedId;
    private final SdkTemplateCta cta;
    private final JsonObject data;
    private final SspSdkEventTracker eventTracker;
    private final String imageUrl;
    private final String productId;
    private final String subtitle;
    private final String title;

    static {
        int i = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public SdkTemplateItem() {
        this((String) null, (String) null, (String) null, (SdkTemplateCta) null, (SspSdkEventTracker) null, (JsonObject) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 29;
            onNavigationEvent = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof SdkTemplateItem)) {
            return false;
        }
        SdkTemplateItem sdkTemplateItem = (SdkTemplateItem) obj;
        if (Intrinsics.areEqual(this.title, sdkTemplateItem.title)) {
            return Intrinsics.areEqual(this.subtitle, sdkTemplateItem.subtitle) && Intrinsics.areEqual(this.imageUrl, sdkTemplateItem.imageUrl) && !(Intrinsics.areEqual(this.cta, sdkTemplateItem.cta) ^ true) && !(Intrinsics.areEqual(this.eventTracker, sdkTemplateItem.eventTracker) ^ true) && Intrinsics.areEqual(this.data, sdkTemplateItem.data) && Intrinsics.areEqual(this.catalogFeedId, sdkTemplateItem.catalogFeedId) && Intrinsics.areEqual(this.productId, sdkTemplateItem.productId);
        }
        int i6 = onNavigationEvent + 75;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[PHI: r1 r3 r4 r5 r6
      0x0040: PHI (r1v22 int) = (r1v5 int), (r1v24 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r5v3 im.toss.ads_sdk.remote.model.SdkTemplateCta) = (r5v0 im.toss.ads_sdk.remote.model.SdkTemplateCta), (r5v5 im.toss.ads_sdk.remote.model.SdkTemplateCta) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r6v5 int) = (r6v0 int), (r6v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[PHI: r1 r3 r4 r6
      0x003e: PHI (r1v6 int) = (r1v5 int), (r1v24 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003e: PHI (r6v1 int) = (r6v0 int), (r6v6 int) binds: [B:8:0x003c, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        SdkTemplateCta sdkTemplateCta;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int iHashCode7 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.title.hashCode();
            iHashCode2 = this.subtitle.hashCode();
            iHashCode3 = this.imageUrl.hashCode();
            sdkTemplateCta = this.cta;
            iHashCode4 = 1;
            iHashCode5 = sdkTemplateCta == null ? 0 : sdkTemplateCta.hashCode();
        } else {
            iHashCode = this.title.hashCode();
            iHashCode2 = this.subtitle.hashCode();
            iHashCode3 = this.imageUrl.hashCode();
            sdkTemplateCta = this.cta;
            iHashCode4 = 0;
            if (sdkTemplateCta == null) {
            }
        }
        SspSdkEventTracker sspSdkEventTracker = this.eventTracker;
        if (sspSdkEventTracker == null) {
            int i3 = onExtraCallback + 51;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = sspSdkEventTracker.hashCode();
        }
        JsonObject jsonObject = this.data;
        int iHashCode8 = jsonObject == null ? 0 : jsonObject.hashCode();
        String str = this.catalogFeedId;
        if (str == null) {
            int i5 = onExtraCallback + 49;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            iHashCode7 = str.hashCode();
        }
        String str2 = this.productId;
        if (str2 != null) {
            iHashCode4 = str2.hashCode();
        }
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode8) * 31) + iHashCode7) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SdkTemplateItem(title=" + this.title + ", subtitle=" + this.subtitle + ", imageUrl=" + this.imageUrl + ", cta=" + this.cta + ", eventTracker=" + this.eventTracker + ", data=" + this.data + ", catalogFeedId=" + this.catalogFeedId + ", productId=" + this.productId + ")";
        int i2 = onExtraCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SdkTemplateItem> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            SdkTemplateItem$$serializer sdkTemplateItem$$serializer = SdkTemplateItem$$serializer.INSTANCE;
            int i4 = onExtraCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 31 / 0;
            }
            return sdkTemplateItem$$serializer;
        }
    }

    public /* synthetic */ SdkTemplateItem(int i, String str, String str2, String str3, SdkTemplateCta sdkTemplateCta, SspSdkEventTracker sspSdkEventTracker, JsonObject jsonObject, String str4, String str5, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
            int i2 = 2 % 2;
        }
        Object obj = null;
        if ((i & 2) == 0) {
            int i3 = onNavigationEvent + 107;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.subtitle = "";
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str3;
        }
        if ((i & 8) == 0) {
            this.cta = null;
        } else {
            this.cta = sdkTemplateCta;
        }
        if ((i & 16) == 0) {
            int i5 = onExtraCallback + 55;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            this.eventTracker = null;
            if (i6 == 0) {
                int i7 = 90 / 0;
            }
        } else {
            this.eventTracker = sspSdkEventTracker;
        }
        if ((i & 32) == 0) {
            this.data = null;
        } else {
            this.data = jsonObject;
        }
        if ((i & 64) == 0) {
            this.catalogFeedId = null;
        } else {
            this.catalogFeedId = str4;
        }
        if ((i & 128) != 0) {
            this.productId = str5;
            return;
        }
        int i8 = onExtraCallback + 31;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        this.productId = null;
    }

    public SdkTemplateItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable SdkTemplateCta sdkTemplateCta, @Nullable SspSdkEventTracker sspSdkEventTracker, @Nullable JsonObject jsonObject, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.subtitle = str2;
        this.imageUrl = str3;
        this.cta = sdkTemplateCta;
        this.eventTracker = sspSdkEventTracker;
        this.data = jsonObject;
        this.catalogFeedId = str4;
        this.productId = str5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(SdkTemplateItem sdkTemplateItem, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.areEqual(sdkTemplateItem.title, "");
                throw null;
            }
            if (!Intrinsics.areEqual(sdkTemplateItem.title, "")) {
                vylVar.onExtraCallback(serialDescriptor, 0, sdkTemplateItem.title);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = onExtraCallback + 15;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.areEqual(sdkTemplateItem.subtitle, "");
                throw null;
            }
            if (!Intrinsics.areEqual(sdkTemplateItem.subtitle, "")) {
                vylVar.onExtraCallback(serialDescriptor, 1, sdkTemplateItem.subtitle);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = onExtraCallback + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (!Intrinsics.areEqual(sdkTemplateItem.imageUrl, "")) {
                vylVar.onExtraCallback(serialDescriptor, 2, sdkTemplateItem.imageUrl);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || sdkTemplateItem.cta != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, SdkTemplateCta$$serializer.INSTANCE, sdkTemplateItem.cta);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i6 = onExtraCallback + 81;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 61 / 0;
                if (sdkTemplateItem.eventTracker != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 4, SspSdkEventTracker$$serializer.INSTANCE, sdkTemplateItem.eventTracker);
                }
            } else if (sdkTemplateItem.eventTracker != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || sdkTemplateItem.data != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, encryptType4.IAuthTabCallback, sdkTemplateItem.data);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 6)) {
            int i8 = onNavigationEvent + 9;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            if (sdkTemplateItem.catalogFeedId != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, sdkTemplateItem.catalogFeedId);
                int i10 = onNavigationEvent + 75;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || sdkTemplateItem.productId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, sdkTemplateItem.productId);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SdkTemplateItem(String str, String str2, String str3, SdkTemplateCta sdkTemplateCta, SspSdkEventTracker sspSdkEventTracker, JsonObject jsonObject, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        SdkTemplateCta sdkTemplateCta2;
        SspSdkEventTracker sspSdkEventTracker2;
        JsonObject jsonObject2;
        String str7;
        String str8 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        String str9 = (i & 4) == 0 ? str3 : "";
        String str10 = null;
        if ((i & 8) != 0) {
            int i5 = onNavigationEvent + 17;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 15 / 0;
            }
            sdkTemplateCta2 = null;
        } else {
            sdkTemplateCta2 = sdkTemplateCta;
        }
        if ((i & 16) != 0) {
            int i7 = onNavigationEvent + 65;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            sspSdkEventTracker2 = null;
        } else {
            sspSdkEventTracker2 = sspSdkEventTracker;
        }
        if ((i & 32) != 0) {
            int i9 = onExtraCallback + 23;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            jsonObject2 = null;
        } else {
            jsonObject2 = jsonObject;
        }
        if ((i & 64) != 0) {
            int i11 = onNavigationEvent + 79;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i & 128) != 0) {
            int i13 = onExtraCallback + 99;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
        } else {
            str10 = str5;
        }
        this(str8, str6, str9, sdkTemplateCta2, sspSdkEventTracker2, jsonObject2, str7, str10);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 61;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 31;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.subtitle;
        int i5 = i3 + 29;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.imageUrl;
            int i4 = 27 / 0;
        } else {
            str = this.imageUrl;
        }
        int i5 = i2 + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SdkTemplateCta onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SdkTemplateCta sdkTemplateCta = this.cta;
        int i5 = i3 + 37;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return sdkTemplateCta;
    }

    public final SspSdkEventTracker onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.eventTracker;
        }
        throw null;
    }
}
