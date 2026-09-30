package im.toss.features.cardissue.event.model.eligibility;

import im.toss.features.cardissue.event.model.eligibility.EligibilityResultImageModel$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EligibilityResultModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final EligibilityResultImageModel image;
    private final String subTitle;
    private final String title;

    static {
        int i = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 68 / 0;
        }
    }

    public EligibilityResultModel() {
        this((String) null, (String) null, (EligibilityResultImageModel) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EligibilityResultModel)) {
            int i4 = i3 + 121;
            onExtraCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        EligibilityResultModel eligibilityResultModel = (EligibilityResultModel) obj;
        if (!Intrinsics.areEqual(this.title, eligibilityResultModel.title)) {
            return false;
        }
        if (Intrinsics.areEqual(this.subTitle, eligibilityResultModel.subTitle)) {
            return Intrinsics.areEqual(this.image, eligibilityResultModel.image);
        }
        int i5 = onNavigationEvent + 99;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.subTitle.hashCode();
        EligibilityResultImageModel eligibilityResultImageModel = this.image;
        if (eligibilityResultImageModel == null) {
            int i4 = onExtraCallback + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = eligibilityResultImageModel.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EligibilityResultModel(title=" + this.title + ", subTitle=" + this.subTitle + ", image=" + this.image + ")";
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ EligibilityResultModel(int i, String str, String str2, EligibilityResultImageModel eligibilityResultImageModel, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
            int i2 = onNavigationEvent + 43;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            this.subTitle = "";
            int i4 = onExtraCallback + 85;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        } else {
            this.subTitle = str2;
        }
        int i6 = 2 % 2;
        if ((i & 4) == 0) {
            int i7 = onExtraCallback + 83;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            this.image = null;
            return;
        }
        this.image = eligibilityResultImageModel;
        int i9 = onNavigationEvent + 43;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
    }

    public EligibilityResultModel(@NotNull String str, @NotNull String str2, @Nullable EligibilityResultImageModel eligibilityResultImageModel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.subTitle = str2;
        this.image = eligibilityResultImageModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(EligibilityResultModel eligibilityResultModel, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallback(serialDescriptor, 0, eligibilityResultModel.title);
            int i4 = onNavigationEvent + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = onNavigationEvent + 111;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (!Intrinsics.areEqual(eligibilityResultModel.title, "")) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(eligibilityResultModel.subTitle, "")) {
            vylVar.onExtraCallback(serialDescriptor, 1, eligibilityResultModel.subTitle);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i8 = onNavigationEvent + 35;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            if (eligibilityResultModel.image == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, EligibilityResultImageModel$.serializer.INSTANCE, eligibilityResultModel.image);
        int i10 = onNavigationEvent + 41;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EligibilityResultModel(String str, String str2, EligibilityResultImageModel eligibilityResultImageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 37;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 87;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = "";
        }
        str2 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i8 = onNavigationEvent + 15;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            eligibilityResultImageModel = null;
        }
        this(str, str2, eligibilityResultImageModel);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subTitle;
        int i5 = i2 + 107;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final EligibilityResultImageModel onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EligibilityResultImageModel eligibilityResultImageModel = this.image;
        int i5 = i3 + 77;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return eligibilityResultImageModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
