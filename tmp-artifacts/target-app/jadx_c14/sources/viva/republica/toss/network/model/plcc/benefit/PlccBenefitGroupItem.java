package viva.republica.toss.network.model.plcc.benefit;

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
public final class PlccBenefitGroupItem {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String detail;
    private final String iconUrl;
    private final String subTitle;
    private final String title;

    static {
        int i = IAuthTabCallback + 77;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlccBenefitGroupItem)) {
            int i2 = onWarmupCompleted + 87;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0;
        }
        PlccBenefitGroupItem plccBenefitGroupItem = (PlccBenefitGroupItem) obj;
        if (!Intrinsics.areEqual(this.title, plccBenefitGroupItem.title)) {
            int i3 = onNavigationEvent + 83;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.subTitle, plccBenefitGroupItem.subTitle)) {
            return Intrinsics.areEqual(this.detail, plccBenefitGroupItem.detail) && Intrinsics.areEqual(this.iconUrl, plccBenefitGroupItem.iconUrl);
        }
        int i5 = onNavigationEvent + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int iHashCode = (i2 % 2 != 0 ? ((((this.title.hashCode() + 86) - this.subTitle.hashCode()) << 33) - this.detail.hashCode()) % 18 : ((((this.title.hashCode() * 31) + this.subTitle.hashCode()) * 31) + this.detail.hashCode()) * 31) + this.iconUrl.hashCode();
        int i3 = onNavigationEvent + 93;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 37 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccBenefitGroupItem(title=" + this.title + ", subTitle=" + this.subTitle + ", detail=" + this.detail + ", iconUrl=" + this.iconUrl + ")";
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 14 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlccBenefitGroupItem> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            PlccBenefitGroupItem$$serializer plccBenefitGroupItem$$serializer = PlccBenefitGroupItem$$serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 66 / 0;
            }
            return plccBenefitGroupItem$$serializer;
        }
    }

    public /* synthetic */ PlccBenefitGroupItem(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i2 = onWarmupCompleted + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 15, PlccBenefitGroupItem$$serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 121;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.title = str;
        this.subTitle = str2;
        this.detail = str3;
        this.iconUrl = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(PlccBenefitGroupItem plccBenefitGroupItem, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, plccBenefitGroupItem.title);
        vylVar.onExtraCallback(serialDescriptor, 1, plccBenefitGroupItem.subTitle);
        vylVar.onExtraCallback(serialDescriptor, 2, plccBenefitGroupItem.detail);
        vylVar.onExtraCallback(serialDescriptor, 3, plccBenefitGroupItem.iconUrl);
        int i4 = onNavigationEvent + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 65;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subTitle;
        int i5 = i2 + 111;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.detail;
        int i5 = i3 + 11;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.iconUrl;
        int i5 = i3 + 125;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
