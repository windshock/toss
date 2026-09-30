package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.AccountTerminateTransferRequest$;
import im.toss.features.account_terminator.core.model.AccountTerminateTransferRequest$TerminateAndTransferRequestInfo$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountTerminateTransferRequest {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<TerminateAndTransferRequestInfo> accountTerminateAndTransferRequestInfos;
    private final String apiTxId;
    private final String certTxId;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new AccountTerminateTransferRequest$.ExternalSyntheticLambda0())};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AccountTerminateTransferRequest$TerminateAndTransferRequestInfo$.serializer.INSTANCE);
        int i2 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof AccountTerminateTransferRequest)) {
            return false;
        }
        AccountTerminateTransferRequest accountTerminateTransferRequest = (AccountTerminateTransferRequest) obj;
        if (!Intrinsics.areEqual(this.certTxId, accountTerminateTransferRequest.certTxId)) {
            int i3 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.apiTxId, accountTerminateTransferRequest.apiTxId)) {
            int i5 = onExtraCallbackWithResult + 17;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.accountTerminateAndTransferRequestInfos, accountTerminateTransferRequest.accountTerminateAndTransferRequestInfos)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.certTxId.hashCode() - 47) / this.apiTxId.hashCode()) / 31) - this.accountTerminateAndTransferRequestInfos.hashCode() : (((this.certTxId.hashCode() * 31) + this.apiTxId.hashCode()) * 31) + this.accountTerminateAndTransferRequestInfos.hashCode();
        int i3 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTerminateTransferRequest(certTxId=" + this.certTxId + ", apiTxId=" + this.apiTxId + ", accountTerminateAndTransferRequestInfos=" + this.accountTerminateAndTransferRequestInfos + ")";
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = onWarmupCompleted + 5;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ AccountTerminateTransferRequest(int i, String str, String str2, List list, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = AccountTerminateTransferRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 116;
            } else {
                descriptor = AccountTerminateTransferRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onNavigationEvent + 71;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.certTxId = str;
        this.apiTxId = str2;
        this.accountTerminateAndTransferRequestInfos = list;
    }

    public AccountTerminateTransferRequest(@NotNull String str, @NotNull String str2, @NotNull List<TerminateAndTransferRequestInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.certTxId = str;
        this.apiTxId = str2;
        this.accountTerminateAndTransferRequestInfos = list;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(AccountTerminateTransferRequest accountTerminateTransferRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, accountTerminateTransferRequest.certTxId);
        vylVar.onExtraCallback(serialDescriptor, 1, accountTerminateTransferRequest.apiTxId);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), accountTerminateTransferRequest.accountTerminateAndTransferRequestInfos);
        int i4 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 33;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return lazyArr;
    }

    @liq
    public static final class TerminateAndTransferRequestInfo {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String accountNumber;
        private final String accountType;
        private final String bankCode;
        private final String depositSequence;
        private final boolean receiptYn;
        private final String recipientType;
        private final String terminationId;
        private final String transferType;

        static {
            Object obj = null;
            int i = onNavigationEvent + 75;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TerminateAndTransferRequestInfo)) {
                return false;
            }
            TerminateAndTransferRequestInfo terminateAndTransferRequestInfo = (TerminateAndTransferRequestInfo) obj;
            if (!Intrinsics.areEqual(this.transferType, terminateAndTransferRequestInfo.transferType) || !Intrinsics.areEqual(this.bankCode, terminateAndTransferRequestInfo.bankCode)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.accountNumber, terminateAndTransferRequestInfo.accountNumber)) {
                int i2 = onWarmupCompleted;
                int i3 = i2 + 55;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 89;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.depositSequence, terminateAndTransferRequestInfo.depositSequence) || !Intrinsics.areEqual(this.accountType, terminateAndTransferRequestInfo.accountType)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.terminationId, terminateAndTransferRequestInfo.terminationId)) {
                int i7 = onExtraCallback + 113;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.recipientType, terminateAndTransferRequestInfo.recipientType)) {
                return false;
            }
            if (this.receiptYn == terminateAndTransferRequestInfo.receiptYn) {
                return true;
            }
            int i9 = onWarmupCompleted + 101;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.transferType.hashCode();
            int iHashCode3 = this.bankCode.hashCode();
            int iHashCode4 = this.accountNumber.hashCode();
            String str = this.depositSequence;
            int iHashCode5 = 0;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i2 = onWarmupCompleted + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
            }
            int iHashCode6 = this.accountType.hashCode();
            int iHashCode7 = this.terminationId.hashCode();
            String str2 = this.recipientType;
            if (str2 != null) {
                int i4 = onExtraCallback + 71;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    str2.hashCode();
                    throw null;
                }
                iHashCode5 = str2.hashCode();
            }
            int iHashCode8 = (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode5) * 31) + Boolean.hashCode(this.receiptYn);
            int i5 = onExtraCallback + 89;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return iHashCode8;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TerminateAndTransferRequestInfo(transferType=" + this.transferType + ", bankCode=" + this.bankCode + ", accountNumber=" + this.accountNumber + ", depositSequence=" + this.depositSequence + ", accountType=" + this.accountType + ", terminationId=" + this.terminationId + ", recipientType=" + this.recipientType + ", receiptYn=" + this.receiptYn + ")";
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ TerminateAndTransferRequestInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, okycx okycxVar) {
            if (255 != (i & 255)) {
                int i2 = onExtraCallback + 35;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                htf31.onExtraCallbackWithResult(i, 255, AccountTerminateTransferRequest$TerminateAndTransferRequestInfo$.serializer.INSTANCE.getDescriptor());
                int i4 = onExtraCallback + 49;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this.transferType = str;
            this.bankCode = str2;
            this.accountNumber = str3;
            this.depositSequence = str4;
            this.accountType = str5;
            this.terminationId = str6;
            this.recipientType = str7;
            this.receiptYn = z;
        }

        public TerminateAndTransferRequestInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull String str5, @NotNull String str6, @Nullable String str7, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.transferType = str;
            this.bankCode = str2;
            this.accountNumber = str3;
            this.depositSequence = str4;
            this.accountType = str5;
            this.terminationId = str6;
            this.recipientType = str7;
            this.receiptYn = z;
        }

        @JvmStatic
        public static final /* synthetic */ void onNavigationEvent(TerminateAndTransferRequestInfo terminateAndTransferRequestInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            vylVar.onExtraCallback(serialDescriptor, 0, terminateAndTransferRequestInfo.transferType);
            vylVar.onExtraCallback(serialDescriptor, 1, terminateAndTransferRequestInfo.bankCode);
            vylVar.onExtraCallback(serialDescriptor, 2, terminateAndTransferRequestInfo.accountNumber);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, terminateAndTransferRequestInfo.depositSequence);
            vylVar.onExtraCallback(serialDescriptor, 4, terminateAndTransferRequestInfo.accountType);
            vylVar.onExtraCallback(serialDescriptor, 5, terminateAndTransferRequestInfo.terminationId);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, terminateAndTransferRequestInfo.recipientType);
            vylVar.onNavigationEvent(serialDescriptor, 7, terminateAndTransferRequestInfo.receiptYn);
            int i4 = onExtraCallback + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }
}
