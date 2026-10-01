package im.toss.ads_sdk.remote.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SdkTemplateCta {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String landingUrl;
    private final String text;

    static {
        int i = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SdkTemplateCta() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SdkTemplateCta)) {
            return false;
        }
        SdkTemplateCta sdkTemplateCta = (SdkTemplateCta) obj;
        if (!Intrinsics.areEqual(this.text, sdkTemplateCta.text)) {
            int i4 = onNavigationEvent + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.landingUrl, sdkTemplateCta.landingUrl)) {
            return true;
        }
        int i6 = onNavigationEvent + 27;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.text.hashCode() >> 109) * this.landingUrl.hashCode() : (this.text.hashCode() * 31) + this.landingUrl.hashCode();
        int i3 = onNavigationEvent + 87;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SdkTemplateCta(text=" + this.text + ", landingUrl=" + this.landingUrl + ")";
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
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

        public final KSerializer<SdkTemplateCta> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SdkTemplateCta$$serializer sdkTemplateCta$$serializer = SdkTemplateCta$$serializer.INSTANCE;
            if (i3 != 0) {
                return sdkTemplateCta$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ SdkTemplateCta(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            int i2 = onNavigationEvent + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.landingUrl = "";
            return;
        }
        this.landingUrl = str2;
        int i4 = onExtraCallback + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }

    public SdkTemplateCta(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.text = str;
        this.landingUrl = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(SdkTemplateCta sdkTemplateCta, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(sdkTemplateCta.text, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, sdkTemplateCta.text);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onNavigationEvent + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 67 / 0;
                if (!Intrinsics.areEqual(sdkTemplateCta.landingUrl, "")) {
                    vylVar.onExtraCallback(serialDescriptor, 1, sdkTemplateCta.landingUrl);
                }
            } else if (!Intrinsics.areEqual(sdkTemplateCta.landingUrl, "")) {
            }
        }
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SdkTemplateCta(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallback + 49;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 49;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.text;
        int i4 = i2 + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.landingUrl;
        int i4 = i3 + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
