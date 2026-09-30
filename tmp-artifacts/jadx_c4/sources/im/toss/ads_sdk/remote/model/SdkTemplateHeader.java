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
public final class SdkTemplateHeader {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String subtitle;
    private final String title;

    static {
        int i = onWarmupCompleted + 61;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SdkTemplateHeader() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkTemplateHeader)) {
            int i2 = onExtraCallback + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SdkTemplateHeader sdkTemplateHeader = (SdkTemplateHeader) obj;
        if (!Intrinsics.areEqual(this.title, sdkTemplateHeader.title)) {
            return false;
        }
        if (Intrinsics.areEqual(this.subtitle, sdkTemplateHeader.subtitle)) {
            return true;
        }
        int i4 = onExtraCallback + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.title.hashCode();
        String str = this.subtitle;
        if (str == null) {
            int i5 = onExtraCallback + 81;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i7 = onNavigationEvent + 103;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SdkTemplateHeader(title=" + this.title + ", subtitle=" + this.subtitle + ")";
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SdkTemplateHeader> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SdkTemplateHeader$$serializer sdkTemplateHeader$$serializer = SdkTemplateHeader$$serializer.INSTANCE;
            if (i3 == 0) {
                return sdkTemplateHeader$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ SdkTemplateHeader(int i, String str, String str2, okycx okycxVar) {
        this.title = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            int i2 = onExtraCallback + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.subtitle = null;
            return;
        }
        this.subtitle = str2;
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    public SdkTemplateHeader(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.subtitle = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(SdkTemplateHeader sdkTemplateHeader, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(sdkTemplateHeader.title, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, sdkTemplateHeader.title);
            int i2 = onExtraCallback + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallback + 91;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                String str = sdkTemplateHeader.subtitle;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (sdkTemplateHeader.subtitle != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, sdkTemplateHeader.subtitle);
            }
        }
        int i5 = onExtraCallback + 19;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SdkTemplateHeader(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 91;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 26 / 0;
            }
            int i5 = i2 + 57;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 4;
            } else {
                int i7 = 2 % 2;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i8 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 79;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.subtitle;
        int i5 = i3 + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
