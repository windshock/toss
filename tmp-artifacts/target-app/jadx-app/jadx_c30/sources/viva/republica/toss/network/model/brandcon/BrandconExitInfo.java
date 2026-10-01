package viva.republica.toss.network.model.brandcon;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.sf.scuba.smartcards.BuildConfig;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BrandconExitInfo {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final boolean canExitTossApp;
    private final String checkMessage;
    private final String ctaText;
    private final String ctaUri;
    private final String iconUrl;

    static {
        int i = onNavigationEvent + 111;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public BrandconExitInfo() {
        this(false, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandconExitInfo)) {
            return false;
        }
        BrandconExitInfo brandconExitInfo = (BrandconExitInfo) obj;
        if (this.canExitTossApp != brandconExitInfo.canExitTossApp || !Intrinsics.areEqual(this.iconUrl, brandconExitInfo.iconUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ctaText, brandconExitInfo.ctaText)) {
            int i2 = IAuthTabCallback + 113;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.checkMessage, brandconExitInfo.checkMessage)) {
            return Intrinsics.areEqual(this.ctaUri, brandconExitInfo.ctaUri);
        }
        int i3 = onExtraCallback + 55;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 103;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Boolean.hashCode(this.canExitTossApp);
        int iHashCode4 = this.iconUrl.hashCode();
        String str = this.ctaText;
        int iHashCode5 = 0;
        if (str == null) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 15;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 23;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 4;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.checkMessage;
        if (str2 == null) {
            int i7 = onExtraCallback + 27;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.ctaUri;
        if (str3 != null) {
            int i9 = IAuthTabCallback + 29;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                str3.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode5 = str3.hashCode();
        }
        return (((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BrandconExitInfo(canExitTossApp=" + this.canExitTossApp + ", iconUrl=" + this.iconUrl + ", ctaText=" + this.ctaText + ", checkMessage=" + this.checkMessage + ", ctaUri=" + this.ctaUri + ")";
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BrandconExitInfo> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                BrandconExitInfo$$serializer brandconExitInfo$$serializer = BrandconExitInfo$$serializer.INSTANCE;
                throw null;
            }
            BrandconExitInfo$$serializer brandconExitInfo$$serializer2 = BrandconExitInfo$$serializer.INSTANCE;
            int i3 = onNavigationEvent + 47;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return brandconExitInfo$$serializer2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BrandconExitInfo(int i, boolean z, String str, String str2, String str3, String str4, okycx okycxVar) {
        this.canExitTossApp = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.iconUrl = BuildConfig.FLAVOR;
        } else {
            this.iconUrl = str;
        }
        if ((i & 4) == 0) {
            this.ctaText = null;
            int i2 = IAuthTabCallback + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
            }
            if ((i & 8) != 0) {
                this.checkMessage = null;
                int i3 = IAuthTabCallback + 77;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } else {
                this.checkMessage = str3;
            }
            if ((i & 16) == 0) {
                this.ctaUri = str4;
                return;
            }
            int i6 = onExtraCallback + 77;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            this.ctaUri = null;
            return;
        }
        this.ctaText = str2;
        int i8 = 2 % 2;
        if ((i & 8) != 0) {
        }
        if ((i & 16) == 0) {
        }
    }

    public BrandconExitInfo(boolean z, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.canExitTossApp = z;
        this.iconUrl = str;
        this.ctaText = str2;
        this.checkMessage = str3;
        this.ctaUri = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(BrandconExitInfo brandconExitInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (brandconExitInfo.canExitTossApp) {
                vylVar.onNavigationEvent(serialDescriptor, 0, brandconExitInfo.canExitTossApp);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(brandconExitInfo.iconUrl, BuildConfig.FLAVOR)) {
            vylVar.onExtraCallback(serialDescriptor, 1, brandconExitInfo.iconUrl);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = IAuthTabCallback + 63;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (brandconExitInfo.ctaText != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, brandconExitInfo.ctaText);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i6 = IAuthTabCallback + 63;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (brandconExitInfo.checkMessage != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, brandconExitInfo.checkMessage);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i8 = onExtraCallback + 53;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            String str = brandconExitInfo.ctaUri;
            if (i9 == 0) {
                int i10 = 16 / 0;
                if (str == null) {
                    return;
                }
            } else if (str == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, brandconExitInfo.ctaUri);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BrandconExitInfo(boolean z, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            z = i2 % 2 != 0;
        }
        if ((i & 2) != 0) {
            int i3 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        String str5 = str;
        String str6 = null;
        String str7 = (i & 4) != 0 ? null : str2;
        String str8 = (i & 8) != 0 ? null : str3;
        if ((i & 16) != 0) {
            int i4 = IAuthTabCallback + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                str6.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
        } else {
            str6 = str4;
        }
        this(z, str5, str7, str8, str6);
    }
}
