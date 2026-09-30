package im.toss.features.cardissue.event.model.eligibility;

import im.toss.features.cardissue.event.model.eligibility.EligibilityResultImageModel$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EligibilityResultImageModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long height;
    private final String url;
    private final long width;

    static {
        int i = onWarmupCompleted + 59;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EligibilityResultImageModel)) {
            int i5 = i2 + 65;
            int i6 = i5 % 128;
            IAuthTabCallback = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 55;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        EligibilityResultImageModel eligibilityResultImageModel = (EligibilityResultImageModel) obj;
        if (!Intrinsics.areEqual(this.url, eligibilityResultImageModel.url)) {
            int i10 = onExtraCallback + 89;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.width != eligibilityResultImageModel.width) {
            int i12 = onExtraCallback + 87;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (this.height == eligibilityResultImageModel.height) {
            return true;
        }
        int i14 = onExtraCallback;
        int i15 = i14 + 101;
        IAuthTabCallback = i15 % 128;
        int i16 = i15 % 2;
        int i17 = i14 + 1;
        IAuthTabCallback = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 35 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.url.hashCode() * 31) + Long.hashCode(this.width)) * 31) + Long.hashCode(this.height);
        int i4 = onExtraCallback + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EligibilityResultImageModel(url=" + this.url + ", width=" + this.width + ", height=" + this.height + ")";
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ EligibilityResultImageModel(int i, String str, long j, long j2, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onExtraCallback + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, EligibilityResultImageModel$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.url = str;
        this.width = j;
        this.height = j2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(EligibilityResultImageModel eligibilityResultImageModel, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, eligibilityResultImageModel.url);
        vylVar.onExtraCallback(serialDescriptor, 1, eligibilityResultImageModel.width);
        vylVar.onExtraCallback(serialDescriptor, 2, eligibilityResultImageModel.height);
        int i4 = IAuthTabCallback + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.url;
        int i5 = i3 + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.width;
        }
        int i3 = 65 / 0;
        return this.width;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        long j = this.height;
        int i5 = i3 + 21;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
