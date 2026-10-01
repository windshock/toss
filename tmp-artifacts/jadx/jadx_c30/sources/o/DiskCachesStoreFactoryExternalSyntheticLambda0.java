package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DiskCachesStoreFactoryExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("description")
    private final String description;

    @SerializedName("dotDescription")
    private final String dotDescription;

    @SerializedName("dotValue")
    private final Double dotValue;

    @SerializedName("graphState")
    private final DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1 graphState;

    @SerializedName("title")
    private final String title;

    @SerializedName("value")
    private final double value;

    public DiskCachesStoreFactoryExternalSyntheticLambda0() {
        this(null, null, 0.0d, null, null, null, 63, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r8 instanceof o.DiskCachesStoreFactoryExternalSyntheticLambda0) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r1 = r1 + 49;
        o.DiskCachesStoreFactoryExternalSyntheticLambda0.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r8 = (o.DiskCachesStoreFactoryExternalSyntheticLambda0) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.title, r8.title) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r8 = o.DiskCachesStoreFactoryExternalSyntheticLambda0.onExtraCallback + 71;
        o.DiskCachesStoreFactoryExternalSyntheticLambda0.onNavigationEvent = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.description, r8.description) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r8 = o.DiskCachesStoreFactoryExternalSyntheticLambda0.onExtraCallback + 7;
        o.DiskCachesStoreFactoryExternalSyntheticLambda0.onNavigationEvent = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (java.lang.Double.compare(r7.value, r8.value) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.dotValue, r8.dotValue) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.dotDescription, r8.dotDescription) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        r8 = o.DiskCachesStoreFactoryExternalSyntheticLambda0.onNavigationEvent + 83;
        o.DiskCachesStoreFactoryExternalSyntheticLambda0.onExtraCallback = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r7.graphState == r8.graphState) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r8 = o.DiskCachesStoreFactoryExternalSyntheticLambda0.onNavigationEvent + 85;
        o.DiskCachesStoreFactoryExternalSyntheticLambda0.onExtraCallback = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if ((r8 % 2) != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.description.hashCode();
        int iHashCode3 = Double.hashCode(this.value);
        Double d = this.dotValue;
        int iHashCode4 = 0;
        int iHashCode5 = d == null ? 0 : d.hashCode();
        String str = this.dotDescription;
        if (str != null) {
            iHashCode4 = str.hashCode();
            int i4 = onExtraCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode4) * 31) + this.graphState.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GraphItem(title=" + this.title + ", description=" + this.description + ", value=" + this.value + ", dotValue=" + this.dotValue + ", dotDescription=" + this.dotDescription + ", graphState=" + this.graphState + ")";
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return str;
    }

    public DiskCachesStoreFactoryExternalSyntheticLambda0(@NotNull String str, @NotNull String str2, double d, @Nullable Double d2, @Nullable String str3, @NotNull DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1 diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1, BuildConfig.FLAVOR);
        this.title = str;
        this.description = str2;
        this.value = d;
        this.dotValue = d2;
        this.dotDescription = str3;
        this.graphState = diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DiskCachesStoreFactoryExternalSyntheticLambda0(String str, String str2, double d, Double d2, String str3, DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1 diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Double d3;
        int i2 = i & 1;
        String str4 = BuildConfig.FLAVOR;
        if (i2 != 0) {
            int i3 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        str4 = (i & 2) == 0 ? str2 : str4;
        if ((i & 4) != 0) {
            int i4 = onExtraCallback + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            d = 0.0d;
        }
        double d4 = d;
        if ((i & 8) != 0) {
            int i6 = onExtraCallback + 29;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            d3 = null;
        } else {
            d3 = d2;
        }
        String str5 = (i & 16) != 0 ? null : str3;
        if ((i & 32) != 0) {
            diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1 = DiskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1.COMMON;
            int i9 = onNavigationEvent + 121;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
        }
        this(str, str4, d4, d3, str5, diskCachesStoreFactorydiskCachesStore21ExternalSyntheticLambda1);
    }
}
