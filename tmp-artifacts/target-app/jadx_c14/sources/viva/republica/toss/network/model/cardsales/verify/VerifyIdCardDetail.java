package viva.republica.toss.network.model.cardsales.verify;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.cardsales.verify.VerifyIdCardDetail$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VerifyIdCardDetail {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final boolean isValid;
    private final String message;
    private final String vendor;

    static {
        int i = onWarmupCompleted + 13;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyIdCardDetail)) {
            return false;
        }
        VerifyIdCardDetail verifyIdCardDetail = (VerifyIdCardDetail) obj;
        if (this.isValid == verifyIdCardDetail.isValid) {
            return Intrinsics.areEqual(this.message, verifyIdCardDetail.message) && Intrinsics.areEqual(this.vendor, verifyIdCardDetail.vendor);
        }
        int i5 = i2 + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.isValid);
        int iHashCode3 = this.message.hashCode();
        String str = this.vendor;
        if (str == null) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 93;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 23;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyIdCardDetail(isValid=" + this.isValid + ", message=" + this.message + ", vendor=" + this.vendor + ")";
        int i2 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VerifyIdCardDetail> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            VerifyIdCardDetail$.serializer serializerVar = VerifyIdCardDetail$.serializer.INSTANCE;
            int i4 = onExtraCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ VerifyIdCardDetail(int i, boolean z, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, VerifyIdCardDetail$.serializer.INSTANCE.getDescriptor());
        }
        this.isValid = z;
        this.message = str;
        if ((i & 4) == 0) {
            this.vendor = null;
            return;
        }
        this.vendor = str2;
        int i4 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(VerifyIdCardDetail verifyIdCardDetail, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, verifyIdCardDetail.isValid);
        vylVar.onExtraCallback(serialDescriptor, 1, verifyIdCardDetail.message);
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 2)) || verifyIdCardDetail.vendor != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, verifyIdCardDetail.vendor);
        }
        int i4 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.isValid;
        int i5 = i3 + 75;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 9;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.message;
        int i4 = i2 + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.vendor;
        int i5 = i3 + 69;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
