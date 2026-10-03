package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DisbursementContent {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String iconUrl;
    private final String mainText;
    private final String timeText;

    static {
        int i = onNavigationEvent + 101;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof DisbursementContent)) {
            int i3 = onWarmupCompleted + 111;
            onExtraCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        DisbursementContent disbursementContent = (DisbursementContent) obj;
        if ((!Intrinsics.areEqual(this.iconUrl, disbursementContent.iconUrl)) || !Intrinsics.areEqual(this.mainText, disbursementContent.mainText) || !Intrinsics.areEqual(this.timeText, disbursementContent.timeText)) {
            return false;
        }
        int i4 = onExtraCallback + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.iconUrl.hashCode() * 31) + this.mainText.hashCode()) * 31) + this.timeText.hashCode();
        int i4 = onWarmupCompleted + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DisbursementContent(iconUrl=" + this.iconUrl + ", mainText=" + this.mainText + ", timeText=" + this.timeText + ")";
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DisbursementContent> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            DisbursementContent$$serializer disbursementContent$$serializer = DisbursementContent$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return disbursementContent$$serializer;
        }
    }

    public /* synthetic */ DisbursementContent(int i, String str, String str2, String str3, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onExtraCallback + 39;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = DisbursementContent$$serializer.INSTANCE.getDescriptor();
                i2 = 105;
            } else {
                descriptor = DisbursementContent$$serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallback + 115;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.iconUrl = str;
        this.mainText = str2;
        this.timeText = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(DisbursementContent disbursementContent, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, disbursementContent.iconUrl);
        vylVar.onExtraCallback(serialDescriptor, 1, disbursementContent.mainText);
        vylVar.onExtraCallback(serialDescriptor, 2, disbursementContent.timeText);
        int i4 = onExtraCallback + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
