package viva.republica.toss.network.model.verify;

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
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.BankAccountHolderResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BankAccountHolderResponse {
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("holderName")
    private final String holderName;

    @SerializedName("matchType")
    private final String matchType;

    @SerializedName("matched")
    private final boolean matched;

    @SerializedName("regTs")
    private final String regTs;

    @SerializedName("txId")
    private final String txId;

    @SerializedName("userName")
    private final String userName;

    @SerializedName("verifyId")
    private final long verifyId;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof BankAccountHolderResponse)) {
            return false;
        }
        BankAccountHolderResponse bankAccountHolderResponse = (BankAccountHolderResponse) obj;
        if (this.verifyId != bankAccountHolderResponse.verifyId) {
            return false;
        }
        if (this.matched != bankAccountHolderResponse.matched) {
            int i3 = onExtraCallback + 33;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.holderName, bankAccountHolderResponse.holderName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.matchType, bankAccountHolderResponse.matchType)) {
            int i4 = IAuthTabCallback + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.regTs, bankAccountHolderResponse.regTs) || !Intrinsics.areEqual(this.txId, bankAccountHolderResponse.txId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.userName, bankAccountHolderResponse.userName)) {
            return true;
        }
        int i6 = onExtraCallback + 97;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((Long.hashCode(this.verifyId) * 31) + Boolean.hashCode(this.matched)) * 31) + this.holderName.hashCode()) * 31) + this.matchType.hashCode()) * 31) + this.regTs.hashCode()) * 31) + this.txId.hashCode()) * 31) + this.userName.hashCode();
        int i4 = onExtraCallback + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankAccountHolderResponse(verifyId=" + this.verifyId + ", matched=" + this.matched + ", holderName=" + this.holderName + ", matchType=" + this.matchType + ", regTs=" + this.regTs + ", txId=" + this.txId + ", userName=" + this.userName + ")";
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BankAccountHolderResponse> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            BankAccountHolderResponse$.serializer serializerVar = BankAccountHolderResponse$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ BankAccountHolderResponse(int i, long j, boolean z, String str, String str2, String str3, String str4, String str5, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 127;
        if (127 != (i & 127)) {
            int i3 = onExtraCallback + 125;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = BankAccountHolderResponse$.serializer.INSTANCE.getDescriptor();
                i2 = 100;
            } else {
                descriptor = BankAccountHolderResponse$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallback + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 5;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.verifyId = j;
        this.matched = z;
        this.holderName = str;
        this.matchType = str2;
        this.regTs = str3;
        this.txId = str4;
        this.userName = str5;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(BankAccountHolderResponse bankAccountHolderResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, bankAccountHolderResponse.verifyId);
        vylVar.onNavigationEvent(serialDescriptor, 1, bankAccountHolderResponse.matched);
        vylVar.onExtraCallback(serialDescriptor, 2, bankAccountHolderResponse.holderName);
        vylVar.onExtraCallback(serialDescriptor, 3, bankAccountHolderResponse.matchType);
        vylVar.onExtraCallback(serialDescriptor, 4, bankAccountHolderResponse.regTs);
        vylVar.onExtraCallback(serialDescriptor, 5, bankAccountHolderResponse.txId);
        vylVar.onExtraCallback(serialDescriptor, 6, bankAccountHolderResponse.userName);
        int i4 = onExtraCallback + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        long j = this.verifyId;
        int i5 = i3 + 83;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
