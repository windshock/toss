package viva.republica.toss.network.model.transfer.periodic;

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
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDepositTarget$;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDraftRequest$;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferWithdrawAccount$;
import viva.republica.toss.send.periodic.view.PeriodicTransferPicker;
import viva.republica.toss.send.v3.ReceiverType;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferDraftRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final Long amount;
    private final PeriodicTransferDepositTarget depositTarget;
    private final String depositTargetName;
    private final String dueDateType;
    private final String referrer;
    private final String title;
    private final String transferDueDate;
    private final String transferDueDay;
    private final String transferEndDueDate;
    private final String uniqueId;
    private final String userMemo;
    private final PeriodicTransferWithdrawAccount withdrawAccount;

    static {
        int i = onExtraCallback + 37;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodicTransferDraftRequest)) {
            int i4 = i2 + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        PeriodicTransferDraftRequest periodicTransferDraftRequest = (PeriodicTransferDraftRequest) obj;
        if (!Intrinsics.areEqual(this.uniqueId, periodicTransferDraftRequest.uniqueId) || !Intrinsics.areEqual(this.title, periodicTransferDraftRequest.title) || !Intrinsics.areEqual(this.amount, periodicTransferDraftRequest.amount) || !Intrinsics.areEqual(this.withdrawAccount, periodicTransferDraftRequest.withdrawAccount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.depositTarget, periodicTransferDraftRequest.depositTarget)) {
            int i6 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.depositTargetName, periodicTransferDraftRequest.depositTargetName)) {
            int i7 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.userMemo, periodicTransferDraftRequest.userMemo) || !Intrinsics.areEqual(this.dueDateType, periodicTransferDraftRequest.dueDateType)) {
            return false;
        }
        if (Intrinsics.areEqual(this.transferDueDate, periodicTransferDraftRequest.transferDueDate)) {
            return Intrinsics.areEqual(this.transferDueDay, periodicTransferDraftRequest.transferDueDay) && Intrinsics.areEqual(this.transferEndDueDate, periodicTransferDraftRequest.transferEndDueDate) && Intrinsics.areEqual(this.referrer, periodicTransferDraftRequest.referrer);
        }
        int i8 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        String str = this.uniqueId;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode7 = 1;
        if (str2 == null) {
            int i2 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str2.hashCode();
        }
        Long l = this.amount;
        if (l == null) {
            int i3 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = l.hashCode();
        }
        PeriodicTransferWithdrawAccount periodicTransferWithdrawAccount = this.withdrawAccount;
        int iHashCode8 = periodicTransferWithdrawAccount == null ? 0 : periodicTransferWithdrawAccount.hashCode();
        PeriodicTransferDepositTarget periodicTransferDepositTarget = this.depositTarget;
        int iHashCode9 = periodicTransferDepositTarget == null ? 0 : periodicTransferDepositTarget.hashCode();
        String str3 = this.depositTargetName;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.userMemo;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.dueDateType;
        if (str5 == null) {
            int i5 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.transferDueDate;
        if (str6 == null) {
            int i7 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                iHashCode7 = 0;
            }
        } else {
            iHashCode7 = str6.hashCode();
        }
        String str7 = this.transferDueDay;
        if (str7 == null) {
            int i8 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str7.hashCode();
        }
        String str8 = this.transferEndDueDate;
        if (str8 == null) {
            int i10 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str8.hashCode();
        }
        String str9 = this.referrer;
        return (((((((((((((((((((((iHashCode6 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode3) * 31) + iHashCode7) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PeriodicTransferDraftRequest(uniqueId=" + this.uniqueId + ", title=" + this.title + ", amount=" + this.amount + ", withdrawAccount=" + this.withdrawAccount + ", depositTarget=" + this.depositTarget + ", depositTargetName=" + this.depositTargetName + ", userMemo=" + this.userMemo + ", dueDateType=" + this.dueDateType + ", transferDueDate=" + this.transferDueDate + ", transferDueDay=" + this.transferDueDay + ", transferEndDueDate=" + this.transferEndDueDate + ", referrer=" + this.referrer + ")";
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
        return str;
    }

    public /* synthetic */ PeriodicTransferDraftRequest(int i, String str, String str2, Long l, PeriodicTransferWithdrawAccount periodicTransferWithdrawAccount, PeriodicTransferDepositTarget periodicTransferDepositTarget, String str3, String str4, String str5, String str6, String str7, String str8, String str9, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 4095;
        if (4095 != (i & 4095)) {
            int i3 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = PeriodicTransferDraftRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 32028;
            } else {
                descriptor = PeriodicTransferDraftRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.uniqueId = str;
        this.title = str2;
        this.amount = l;
        this.withdrawAccount = periodicTransferWithdrawAccount;
        this.depositTarget = periodicTransferDepositTarget;
        this.depositTargetName = str3;
        this.userMemo = str4;
        this.dueDateType = str5;
        this.transferDueDate = str6;
        this.transferDueDay = str7;
        this.transferEndDueDate = str8;
        this.referrer = str9;
    }

    public PeriodicTransferDraftRequest(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable PeriodicTransferWithdrawAccount periodicTransferWithdrawAccount, @Nullable PeriodicTransferDepositTarget periodicTransferDepositTarget, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.uniqueId = str;
        this.title = str2;
        this.amount = l;
        this.withdrawAccount = periodicTransferWithdrawAccount;
        this.depositTarget = periodicTransferDepositTarget;
        this.depositTargetName = str3;
        this.userMemo = str4;
        this.dueDateType = str5;
        this.transferDueDate = str6;
        this.transferDueDay = str7;
        this.transferEndDueDate = str8;
        this.referrer = str9;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(PeriodicTransferDraftRequest periodicTransferDraftRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, periodicTransferDraftRequest.uniqueId);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, periodicTransferDraftRequest.title);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, periodicTransferDraftRequest.amount);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, PeriodicTransferWithdrawAccount$.serializer.INSTANCE, periodicTransferDraftRequest.withdrawAccount);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, PeriodicTransferDepositTarget$.serializer.INSTANCE, periodicTransferDraftRequest.depositTarget);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, periodicTransferDraftRequest.depositTargetName);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, periodicTransferDraftRequest.userMemo);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, periodicTransferDraftRequest.dueDateType);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, periodicTransferDraftRequest.transferDueDate);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, periodicTransferDraftRequest.transferDueDay);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 10, getwrigglelayout, periodicTransferDraftRequest.transferEndDueDate);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 11, getwrigglelayout, periodicTransferDraftRequest.referrer);
        int i4 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public static final /* synthetic */ class onExtraCallback {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            static {
                int[] iArr = new int[ReceiverType.values().length];
                try {
                    iArr[ReceiverType.SMS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReceiverType.MEMBER.ordinal()] = 2;
                    int i = IAuthTabCallback + 47;
                    onExtraCallbackWithResult = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 5 % 5;
                    } else {
                        int i3 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ReceiverType.ACCOUNT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ReceiverType.MY_TOSS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[PeriodicTransferPicker.IAuthTabCallback.values().length];
                try {
                    iArr2[PeriodicTransferPicker.IAuthTabCallback.MONTHLY.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[PeriodicTransferPicker.IAuthTabCallback.WEEKLY.ordinal()] = 2;
                    int i4 = IAuthTabCallback + 1;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[PeriodicTransferPicker.IAuthTabCallback.DAILY.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[PeriodicTransferPicker.IAuthTabCallback.ONE_TIME.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int i7 = IAuthTabCallback + 67;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PeriodicTransferDraftRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                PeriodicTransferDraftRequest$.serializer serializerVar = PeriodicTransferDraftRequest$.serializer.INSTANCE;
                throw null;
            }
            PeriodicTransferDraftRequest$.serializer serializerVar2 = PeriodicTransferDraftRequest$.serializer.INSTANCE;
            int i3 = onWarmupCompleted + 31;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x010b A[PHI: r6
          0x010b: PHI (r6v7 viva.republica.toss.send.periodic.view.PeriodicTransferPicker$IAuthTabCallback) = 
          (r6v6 viva.republica.toss.send.periodic.view.PeriodicTransferPicker$IAuthTabCallback)
          (r6v12 viva.republica.toss.send.periodic.view.PeriodicTransferPicker$IAuthTabCallback)
         binds: [B:60:0x0109, B:57:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x017b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDraftRequest onExtraCallback(@org.jetbrains.annotations.Nullable java.lang.String r20, long r21, @org.jetbrains.annotations.Nullable viva.republica.toss.network.model.transfer.MyAccountInfo r23, @org.jetbrains.annotations.Nullable viva.republica.toss.send.v4.receiver.ReceiverParam r24, @org.jetbrains.annotations.Nullable o.moduleName r25, @org.jetbrains.annotations.Nullable java.lang.String r26, @org.jetbrains.annotations.Nullable java.lang.String r27, @org.jetbrains.annotations.Nullable java.lang.String r28, @org.jetbrains.annotations.Nullable java.lang.String r29, @org.jetbrains.annotations.Nullable java.lang.String r30) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instructions count: 406
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDraftRequest.Companion.onExtraCallback(java.lang.String, long, viva.republica.toss.network.model.transfer.MyAccountInfo, viva.republica.toss.send.v4.receiver.ReceiverParam, o.moduleName, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):viva.republica.toss.network.model.transfer.periodic.PeriodicTransferDraftRequest");
        }
    }
}
