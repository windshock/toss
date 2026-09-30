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
public final class SdkTemplateReviewed {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String text;

    static {
        int i = IAuthTabCallback + 91;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SdkTemplateReviewed() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof SdkTemplateReviewed) {
            if (!(!Intrinsics.areEqual(this.text, ((SdkTemplateReviewed) obj).text))) {
                return true;
            }
            int i2 = onExtraCallback + 91;
            onWarmupCompleted = i2 % 128;
            return !(i2 % 2 == 0);
        }
        int i3 = onExtraCallback + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.text.hashCode();
        int i4 = onExtraCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SdkTemplateReviewed(text=" + this.text + ")";
        int i2 = onExtraCallback + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SdkTemplateReviewed> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            SdkTemplateReviewed$$serializer sdkTemplateReviewed$$serializer = SdkTemplateReviewed$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return sdkTemplateReviewed$$serializer;
        }
    }

    public /* synthetic */ SdkTemplateReviewed(int i, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.text = "";
            int i2 = onWarmupCompleted + 57;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.text = str;
        int i4 = onExtraCallback + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public SdkTemplateReviewed(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(SdkTemplateReviewed sdkTemplateReviewed, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || (!Intrinsics.areEqual(sdkTemplateReviewed.text, ""))) {
            vylVar.onExtraCallback(serialDescriptor, 0, sdkTemplateReviewed.text);
            int i4 = onExtraCallback + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SdkTemplateReviewed(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str = "";
            int i3 = 2 % 2;
        }
        this(str);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 29;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.text;
        int i5 = i2 + 117;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
