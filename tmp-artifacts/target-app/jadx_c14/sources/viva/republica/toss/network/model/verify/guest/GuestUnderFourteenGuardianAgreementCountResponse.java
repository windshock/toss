package viva.republica.toss.network.model.verify.guest;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuestUnderFourteenGuardianAgreementCountResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int maxCancelCount;
    private final int maxResendCount;
    private final int remainingCancelCount;
    private final int remainingResendCount;

    static {
        int i = onNavigationEvent + 49;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public GuestUnderFourteenGuardianAgreementCountResponse() {
        this(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestUnderFourteenGuardianAgreementCountResponse)) {
            return false;
        }
        GuestUnderFourteenGuardianAgreementCountResponse guestUnderFourteenGuardianAgreementCountResponse = (GuestUnderFourteenGuardianAgreementCountResponse) obj;
        if (this.remainingCancelCount != guestUnderFourteenGuardianAgreementCountResponse.remainingCancelCount) {
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.remainingResendCount == guestUnderFourteenGuardianAgreementCountResponse.remainingResendCount) {
            return this.maxCancelCount == guestUnderFourteenGuardianAgreementCountResponse.maxCancelCount && this.maxResendCount == guestUnderFourteenGuardianAgreementCountResponse.maxResendCount;
        }
        int i4 = onWarmupCompleted + 17;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        boolean z = i4 % 2 == 0;
        int i6 = i5 + 75;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Integer.hashCode(this.remainingCancelCount) * 31) + Integer.hashCode(this.remainingResendCount)) * 31) + Integer.hashCode(this.maxCancelCount)) * 31) + Integer.hashCode(this.maxResendCount);
        int i4 = onWarmupCompleted + 11;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestUnderFourteenGuardianAgreementCountResponse(remainingCancelCount=" + this.remainingCancelCount + ", remainingResendCount=" + this.remainingResendCount + ", maxCancelCount=" + this.maxCancelCount + ", maxResendCount=" + this.maxResendCount + ")";
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuestUnderFourteenGuardianAgreementCountResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            GuestUnderFourteenGuardianAgreementCountResponse$.serializer serializerVar = GuestUnderFourteenGuardianAgreementCountResponse$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public GuestUnderFourteenGuardianAgreementCountResponse(int i, int i2, int i3, int i4) {
        this.remainingCancelCount = i;
        this.remainingResendCount = i2;
        this.maxCancelCount = i3;
        this.maxResendCount = i4;
    }

    public /* synthetic */ GuestUnderFourteenGuardianAgreementCountResponse(int i, int i2, int i3, int i4, int i5, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.remainingCancelCount = 0;
        } else {
            this.remainingCancelCount = i2;
            int i6 = IAuthTabCallback + 111;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i9 = IAuthTabCallback + 95;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            this.remainingResendCount = 0;
        } else {
            this.remainingResendCount = i3;
            int i11 = IAuthTabCallback + 89;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        }
        if ((i & 4) == 0) {
            int i14 = onWarmupCompleted + 29;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            this.maxCancelCount = 0;
        } else {
            this.maxCancelCount = i4;
        }
        if ((i & 8) == 0) {
            this.maxResendCount = 0;
        } else {
            this.maxResendCount = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto Le
            int r2 = r4.remainingCancelCount
            if (r2 == 0) goto L13
        Le:
            int r2 = r4.remainingCancelCount
            r5.onExtraCallback(r6, r1, r2)
        L13:
            r1 = 1
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 == r1) goto L27
            int r2 = viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse.onWarmupCompleted
            int r2 = r2 + 81
            int r3 = r2 % 128
            viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse.IAuthTabCallback = r3
            int r2 = r2 % r0
            int r2 = r4.remainingResendCount
            if (r2 == 0) goto L35
        L27:
            int r2 = r4.remainingResendCount
            r5.onExtraCallback(r6, r1, r2)
            int r1 = viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse.onWarmupCompleted
            int r1 = r1 + 97
            int r2 = r1 % 128
            viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse.IAuthTabCallback = r2
            int r1 = r1 % r0
        L35:
            boolean r1 = r5.onWarmupCompleted(r6, r0)
            if (r1 != 0) goto L48
            int r1 = viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse.onWarmupCompleted
            int r1 = r1 + 125
            int r2 = r1 % 128
            viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse.IAuthTabCallback = r2
            int r1 = r1 % r0
            int r1 = r4.maxCancelCount
            if (r1 == 0) goto L4d
        L48:
            int r1 = r4.maxCancelCount
            r5.onExtraCallback(r6, r0, r1)
        L4d:
            r1 = 3
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 != 0) goto L58
            int r2 = r4.maxResendCount
            if (r2 == 0) goto L5d
        L58:
            int r4 = r4.maxResendCount
            r5.onExtraCallback(r6, r1, r4)
        L5d:
            int r4 = viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse.onWarmupCompleted
            int r4 = r4 + 11
            int r5 = r4 % 128
            viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse.IAuthTabCallback = r5
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse.IAuthTabCallback(viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianAgreementCountResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GuestUnderFourteenGuardianAgreementCountResponse(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        i = (i5 & 1) != 0 ? 0 : i;
        if ((i5 & 2) != 0) {
            int i6 = 2 % 2;
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            int i7 = IAuthTabCallback;
            int i8 = i7 + 7;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 13;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            int i13 = 2 % 2;
            i4 = 0;
        }
        this(i, i2, i3, i4);
    }

    public final int IAuthTabCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.remainingCancelCount;
            int i5 = 33 / 0;
        } else {
            i = this.remainingCancelCount;
        }
        int i6 = i3 + 105;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = this.remainingResendCount;
        int i6 = i3 + 13;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 125;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.maxCancelCount;
        int i6 = i2 + 47;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.maxResendCount;
        int i6 = i3 + 119;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }
}
