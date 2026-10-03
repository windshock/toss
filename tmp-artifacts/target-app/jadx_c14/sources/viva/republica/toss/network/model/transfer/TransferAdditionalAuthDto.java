package viva.republica.toss.network.model.transfer;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferAdditionalAuthDto$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferAdditionalAuthDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final Long authenticationId;
    private final String otp;
    private final String otpType;
    private final String transactionAuthKey;

    static {
        int i = IAuthTabCallback + 111;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 38 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 39;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 43;
            int i6 = i5 % 128;
            onExtraCallbackWithResult = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 81;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof TransferAdditionalAuthDto)) {
            int i9 = i2 + 109;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        TransferAdditionalAuthDto transferAdditionalAuthDto = (TransferAdditionalAuthDto) obj;
        if (!Intrinsics.areEqual(this.transactionAuthKey, transferAdditionalAuthDto.transactionAuthKey) || !Intrinsics.areEqual(this.authenticationId, transferAdditionalAuthDto.authenticationId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.otp, transferAdditionalAuthDto.otp)) {
            return Intrinsics.areEqual(this.otpType, transferAdditionalAuthDto.otpType);
        }
        int i11 = onExtraCallback + 113;
        onExtraCallbackWithResult = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[PHI: r1 r2
      0x001b: PHI (r1v13 java.lang.String) = (r1v4 java.lang.String), (r1v15 java.lang.String) binds: [B:8:0x0017, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]
      0x001b: PHI (r2v6 int) = (r2v1 int), (r2v0 int) binds: [B:8:0x0017, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[PHI: r2
      0x0019: PHI (r2v2 int) = (r2v1 int), (r2v0 int) binds: [B:8:0x0017, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.TransferAdditionalAuthDto.onExtraCallbackWithResult
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            viva.republica.toss.network.model.transfer.TransferAdditionalAuthDto.onExtraCallback = r3
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L14
            java.lang.String r1 = r7.transactionAuthKey
            if (r1 != 0) goto L1b
            goto L19
        L14:
            java.lang.String r1 = r7.transactionAuthKey
            r2 = r3
            if (r1 != 0) goto L1b
        L19:
            r1 = r3
            goto L28
        L1b:
            int r1 = r1.hashCode()
            int r4 = viva.republica.toss.network.model.transfer.TransferAdditionalAuthDto.onExtraCallbackWithResult
            int r4 = r4 + 125
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.TransferAdditionalAuthDto.onExtraCallback = r5
            int r4 = r4 % r0
        L28:
            java.lang.Long r4 = r7.authenticationId
            if (r4 != 0) goto L37
            int r4 = viva.republica.toss.network.model.transfer.TransferAdditionalAuthDto.onExtraCallbackWithResult
            int r4 = r4 + 37
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.TransferAdditionalAuthDto.onExtraCallback = r5
            int r4 = r4 % r0
            r4 = r3
            goto L3b
        L37:
            int r4 = r4.hashCode()
        L3b:
            java.lang.String r5 = r7.otp
            if (r5 != 0) goto L40
            goto L51
        L40:
            int r3 = r5.hashCode()
            int r5 = viva.republica.toss.network.model.transfer.TransferAdditionalAuthDto.onExtraCallback
            int r5 = r5 + 121
            int r6 = r5 % 128
            viva.republica.toss.network.model.transfer.TransferAdditionalAuthDto.onExtraCallbackWithResult = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L51
            int r0 = r0 % 5
        L51:
            java.lang.String r0 = r7.otpType
            if (r0 == 0) goto L59
            int r2 = r0.hashCode()
        L59:
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferAdditionalAuthDto.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferAdditionalAuthDto(transactionAuthKey=" + this.transactionAuthKey + ", authenticationId=" + this.authenticationId + ", otp=" + this.otp + ", otpType=" + this.otpType + ")";
        int i2 = onExtraCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferAdditionalAuthDto> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TransferAdditionalAuthDto$.serializer serializerVar = TransferAdditionalAuthDto$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ TransferAdditionalAuthDto(int i, String str, Long l, String str2, String str3, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 15;
        if (15 != (i & 15)) {
            int i3 = onExtraCallback + 13;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = TransferAdditionalAuthDto$.serializer.INSTANCE.getDescriptor();
                i2 = 34;
            } else {
                descriptor = TransferAdditionalAuthDto$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.transactionAuthKey = str;
        this.authenticationId = l;
        this.otp = str2;
        this.otpType = str3;
    }

    public TransferAdditionalAuthDto(@Nullable String str, @Nullable Long l, @Nullable String str2, @Nullable String str3) {
        this.transactionAuthKey = str;
        this.authenticationId = l;
        this.otp = str2;
        this.otpType = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(TransferAdditionalAuthDto transferAdditionalAuthDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, transferAdditionalAuthDto.transactionAuthKey);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, transferAdditionalAuthDto.authenticationId);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, transferAdditionalAuthDto.otp);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, transferAdditionalAuthDto.otpType);
        int i4 = onExtraCallback + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
