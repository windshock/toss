package viva.republica.toss.network.model.transfer;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferAccountDto$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferAccountDto {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("accountNo")
    private final String accountNo;

    @SerializedName("bankCode")
    private final int bankCode;

    static {
        int i = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof TransferAccountDto)) {
            return false;
        }
        TransferAccountDto transferAccountDto = (TransferAccountDto) obj;
        if (this.bankCode != transferAccountDto.bankCode) {
            int i4 = onExtraCallback + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.accountNo, transferAccountDto.accountNo)) {
            return true;
        }
        int i6 = IAuthTabCallback + 63;
        onExtraCallback = i6 % 128;
        return !(i6 % 2 == 0);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.bankCode) * 31) + this.accountNo.hashCode();
        int i4 = IAuthTabCallback + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferAccountDto(bankCode=" + this.bankCode + ", accountNo=" + this.accountNo + ")";
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferAccountDto> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TransferAccountDto$.serializer serializerVar = TransferAccountDto$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ TransferAccountDto(int i, int i2, String str, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i3 = 3;
        if (3 != (i & 3)) {
            int i4 = IAuthTabCallback + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                descriptor = TransferAccountDto$.serializer.INSTANCE.getDescriptor();
                i3 = 4;
            } else {
                descriptor = TransferAccountDto$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i3, descriptor);
            int i5 = IAuthTabCallback + 63;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        this.bankCode = i2;
        this.accountNo = str;
    }

    public TransferAccountDto(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankCode = i;
        this.accountNo = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(TransferAccountDto transferAccountDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, transferAccountDto.bankCode);
        vylVar.onExtraCallback(serialDescriptor, 1, transferAccountDto.accountNo);
        int i4 = IAuthTabCallback + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 57;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.bankCode;
        int i5 = i2 + 113;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountNo;
        }
        throw null;
    }
}
