package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.RightComponent;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ImagePipelineExperimentsBuilderExternalSyntheticLambda4 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("availableAppVersion")
    private final String availableAppVersion;

    @SerializedName("eventLog")
    private final onExtraCallback eventLog;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName("menuEntryId")
    private final long menuEntryId;

    @SerializedName("rightComponent")
    private final RightComponent rightComponent;

    @SerializedName("scheme")
    private final String scheme;

    @SerializedName("subtitle")
    private final BufferedDiskCacheExternalSyntheticLambda4 subtitle;

    @SerializedName("title")
    private final String title;

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda4() {
        this(null, null, null, null, 0L, null, null, null, GF2Field.MASK, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r8 instanceof o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 35;
        o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onExtraCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r8 = (o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.iconUrl, r8.iconUrl) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r8 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onWarmupCompleted + 63;
        o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onExtraCallback = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if ((r8 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.title, r8.title) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        r8 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onWarmupCompleted + 11;
        o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onExtraCallback = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.subtitle, r8.subtitle) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onExtraCallback + 13;
        o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onWarmupCompleted = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if ((r8 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.rightComponent, r8.rightComponent) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        r8 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onExtraCallback + 9;
        o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onWarmupCompleted = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r7.menuEntryId == r8.menuEntryId) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.scheme, r8.scheme) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.eventLog, r8.eventLog) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.availableAppVersion, r8.availableAppVersion) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        r8 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onExtraCallback + 107;
        o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onWarmupCompleted = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        r8 = o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onWarmupCompleted + 3;
        o.ImagePipelineExperimentsBuilderExternalSyntheticLambda4.onExtraCallback = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bc, code lost:
    
        if ((r8 % 2) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        r8 = null;
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 29;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 83 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.iconUrl.hashCode();
        int iHashCode3 = this.title.hashCode();
        int iHashCode4 = this.subtitle.hashCode();
        int iHashCode5 = this.rightComponent.hashCode();
        int iHashCode6 = Long.hashCode(this.menuEntryId);
        String str = this.scheme;
        if (str == null) {
            int i4 = onExtraCallback + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + this.eventLog.hashCode()) * 31) + this.availableAppVersion.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanServiceCategory(iconUrl=" + this.iconUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", rightComponent=" + this.rightComponent + ", menuEntryId=" + this.menuEntryId + ", scheme=" + this.scheme + ", eventLog=" + this.eventLog + ", availableAppVersion=" + this.availableAppVersion + ")";
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public ImagePipelineExperimentsBuilderExternalSyntheticLambda4(@NotNull String str, @NotNull String str2, @NotNull BufferedDiskCacheExternalSyntheticLambda4 bufferedDiskCacheExternalSyntheticLambda4, @NotNull RightComponent rightComponent, long j, @Nullable String str3, @NotNull onExtraCallback onextracallback, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(bufferedDiskCacheExternalSyntheticLambda4, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(rightComponent, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(onextracallback, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        this.iconUrl = str;
        this.title = str2;
        this.subtitle = bufferedDiskCacheExternalSyntheticLambda4;
        this.rightComponent = rightComponent;
        this.menuEntryId = j;
        this.scheme = str3;
        this.eventLog = onextracallback;
        this.availableAppVersion = str4;
    }

    public /* synthetic */ ImagePipelineExperimentsBuilderExternalSyntheticLambda4(String str, String str2, BufferedDiskCacheExternalSyntheticLambda4 bufferedDiskCacheExternalSyntheticLambda4, RightComponent rightComponent, long j, String str3, onExtraCallback onextracallback, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        RightComponent rightComponent2;
        long j2;
        int i2 = i & 1;
        String str7 = BuildConfig.FLAVOR;
        if (i2 != 0) {
            int i3 = 2 % 2;
            str5 = BuildConfig.FLAVOR;
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            int i4 = 2 % 2;
            str6 = BuildConfig.FLAVOR;
        } else {
            str6 = str2;
        }
        String str8 = null;
        BufferedDiskCacheExternalSyntheticLambda4 bufferedDiskCacheExternalSyntheticLambda42 = (i & 4) != 0 ? new BufferedDiskCacheExternalSyntheticLambda4(null, null, 3, null) : bufferedDiskCacheExternalSyntheticLambda4;
        if ((i & 8) != 0) {
            rightComponent2 = new RightComponent(null, null, null, null, null, 31, null);
            int i5 = 2 % 2;
        } else {
            rightComponent2 = rightComponent;
        }
        if ((i & 16) != 0) {
            int i6 = onExtraCallback + 3;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            j2 = -1;
        } else {
            j2 = j;
        }
        if ((i & 32) != 0) {
            int i9 = onExtraCallback + 7;
            int i10 = i9 % 128;
            onWarmupCompleted = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 59;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } else {
            str8 = str3;
        }
        this(str5, str6, bufferedDiskCacheExternalSyntheticLambda42, rightComponent2, j2, str8, (i & 64) != 0 ? new onExtraCallback(0L, null, 3, null) : onextracallback, (i & 128) == 0 ? str4 : str7);
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @SerializedName(verifySignatureValue_NoAlgorithmInfo.EXTRA_KEY_ID)
        private final long id;

        @SerializedName("type")
        private final String type;

        public onExtraCallback() {
            this(0L, null, 3, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (this.id != onextracallback.id) {
                return false;
            }
            if (Intrinsics.areEqual(this.type, onextracallback.type)) {
                return true;
            }
            int i4 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 12 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0 ? (Long.hashCode(this.id) + 81) >>> this.type.hashCode() : (Long.hashCode(this.id) * 31) + this.type.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "CategoryEventLog(id=" + this.id + ", type=" + this.type + ")";
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(long j, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
            this.id = j;
            this.type = str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 17;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 75 / 0;
                }
                int i4 = 2 % 2;
                j = -1;
            }
            if ((i & 2) != 0) {
                int i5 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 62 / 0;
                }
                str = BuildConfig.FLAVOR;
            }
            this(j, str);
        }
    }
}
