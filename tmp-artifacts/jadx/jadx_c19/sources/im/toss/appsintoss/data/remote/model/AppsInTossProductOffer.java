package im.toss.appsintoss.data.remote.model;

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

@liq
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppsInTossProductOffer {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String displayAmount;
    private final String offerId;
    private final String period;
    private final String type;

    static {
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsInTossProductOffer)) {
            int i3 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        AppsInTossProductOffer appsInTossProductOffer = (AppsInTossProductOffer) obj;
        if (!Intrinsics.areEqual(this.offerId, appsInTossProductOffer.offerId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.period, appsInTossProductOffer.period)) {
            if (!Intrinsics.areEqual(this.displayAmount, appsInTossProductOffer.displayAmount)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.type, appsInTossProductOffer.type)) {
                int i5 = onExtraCallbackWithResult + 13;
                int i6 = i5 % 128;
                IAuthTabCallback = i6;
                z = i5 % 2 == 0;
                int i7 = i6 + 93;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
            }
            return z;
        }
        int i9 = onExtraCallbackWithResult + 63;
        int i10 = i9 % 128;
        IAuthTabCallback = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 39;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044 A[PHI: r1 r3 r4
      0x0044: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r4v4 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r1 r3
      0x0033: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        String str;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i3 % 128;
        int iHashCode3 = 0;
        if (i3 % 2 != 0) {
            iHashCode = this.offerId.hashCode();
            iHashCode2 = this.period.hashCode();
            str = this.displayAmount;
            int i4 = 94 / 0;
            if (str == null) {
                int i5 = onExtraCallbackWithResult;
                int i6 = i5 + 123;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 103;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                iHashCode3 = str.hashCode();
            }
        } else {
            iHashCode = this.offerId.hashCode();
            iHashCode2 = this.period.hashCode();
            str = this.displayAmount;
            if (str == null) {
            }
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + this.type.hashCode();
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "AppsInTossProductOffer(offerId=" + this.offerId + ", period=" + this.period + ", displayAmount=" + this.displayAmount + ", type=" + this.type + ")";
        int i3 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppsInTossProductOffer> serializer() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 117;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            AppsInTossProductOffer$$serializer appsInTossProductOffer$$serializer = AppsInTossProductOffer$$serializer.INSTANCE;
            if (i4 != 0) {
                return appsInTossProductOffer$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ AppsInTossProductOffer(int i2, String str, String str2, String str3, String str4, okycx okycxVar) {
        if (11 != (i2 & 11)) {
            int i3 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i2, 11, AppsInTossProductOffer$$serializer.INSTANCE.getDescriptor());
        }
        this.offerId = str;
        this.period = str2;
        if ((i2 & 4) == 0) {
            this.displayAmount = null;
        } else {
            this.displayAmount = str3;
            int i5 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        this.type = str4;
        int i7 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(AppsInTossProductOffer appsInTossProductOffer, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, appsInTossProductOffer.offerId);
        vylVar.onExtraCallback(serialDescriptor, 1, appsInTossProductOffer.period);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i5 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 57 / 0;
                if (appsInTossProductOffer.displayAmount != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, appsInTossProductOffer.displayAmount);
                }
            } else if (appsInTossProductOffer.displayAmount != null) {
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 3, appsInTossProductOffer.type);
        int i7 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        String str = this.offerId;
        int i6 = i3 + 71;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 55;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        String str = this.period;
        int i6 = i4 + 115;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 65 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        String str;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 59;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 != 0) {
            str = this.displayAmount;
            int i5 = 45 / 0;
        } else {
            str = this.displayAmount;
        }
        int i6 = i4 + 85;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return this.type;
        }
        throw null;
    }
}
