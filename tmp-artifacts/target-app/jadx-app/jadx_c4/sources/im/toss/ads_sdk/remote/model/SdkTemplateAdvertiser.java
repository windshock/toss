package im.toss.ads_sdk.remote.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SdkTemplateAdvertiser {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String iconUrl;
    private final String name;

    static {
        int i = onNavigationEvent + 81;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SdkTemplateAdvertiser() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.ads_sdk.remote.model.SdkTemplateAdvertiser) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (im.toss.ads_sdk.remote.model.SdkTemplateAdvertiser) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.name, r6.name) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.iconUrl, r6.iconUrl) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r6 = im.toss.ads_sdk.remote.model.SdkTemplateAdvertiser.IAuthTabCallback + 17;
        im.toss.ads_sdk.remote.model.SdkTemplateAdvertiser.onExtraCallback = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if ((r6 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.name.hashCode();
            throw null;
        }
        int iHashCode2 = this.name.hashCode();
        String str = this.iconUrl;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i3 = IAuthTabCallback + 23;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = (iHashCode2 * 31) + iHashCode;
        int i6 = IAuthTabCallback + 93;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SdkTemplateAdvertiser(name=" + this.name + ", iconUrl=" + this.iconUrl + ")";
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SdkTemplateAdvertiser> serializer() {
            SdkTemplateAdvertiser$$serializer sdkTemplateAdvertiser$$serializer;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                sdkTemplateAdvertiser$$serializer = SdkTemplateAdvertiser$$serializer.INSTANCE;
                int i3 = 9 / 0;
            } else {
                sdkTemplateAdvertiser$$serializer = SdkTemplateAdvertiser$$serializer.INSTANCE;
            }
            int i4 = IAuthTabCallback + 57;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return sdkTemplateAdvertiser$$serializer;
        }
    }

    public /* synthetic */ SdkTemplateAdvertiser(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = IAuthTabCallback + 13;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        this.name = str;
        if ((i & 2) != 0) {
            this.iconUrl = str2;
            return;
        }
        this.iconUrl = null;
        int i4 = onExtraCallback + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public SdkTemplateAdvertiser(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.iconUrl = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(SdkTemplateAdvertiser sdkTemplateAdvertiser, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(sdkTemplateAdvertiser.name, "")) {
                vylVar.onExtraCallback(serialDescriptor, 0, sdkTemplateAdvertiser.name);
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1)) || sdkTemplateAdvertiser.iconUrl != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, sdkTemplateAdvertiser.iconUrl);
            int i4 = IAuthTabCallback + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = IAuthTabCallback + 83;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SdkTemplateAdvertiser(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 57;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 3;
            } else {
                int i6 = 2 % 2;
            }
            str2 = null;
        }
        this(str, str2);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 85;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
