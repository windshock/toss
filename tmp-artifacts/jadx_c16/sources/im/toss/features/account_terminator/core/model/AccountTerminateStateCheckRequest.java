package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.AccountTerminateStateCheckRequest$;
import im.toss.features.account_terminator.core.model.StateCheckAccount$;
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
public final class AccountTerminateStateCheckRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String receiveAccountNumber;
    private final String receiveBankCode;
    private final String recipientType;
    private final List<StateCheckAccount> terminateAccounts;
    private final List<StateCheckAccount> transferAccounts;

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(StateCheckAccount$.serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(StateCheckAccount$.serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AccountTerminateStateCheckRequest)) {
            int i4 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        AccountTerminateStateCheckRequest accountTerminateStateCheckRequest = (AccountTerminateStateCheckRequest) obj;
        if (!Intrinsics.areEqual(this.terminateAccounts, accountTerminateStateCheckRequest.terminateAccounts) || !Intrinsics.areEqual(this.transferAccounts, accountTerminateStateCheckRequest.transferAccounts)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.receiveAccountNumber, accountTerminateStateCheckRequest.receiveAccountNumber)) {
            int i6 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.receiveBankCode, accountTerminateStateCheckRequest.receiveBankCode)) {
            return Intrinsics.areEqual(this.recipientType, accountTerminateStateCheckRequest.recipientType);
        }
        int i8 = onExtraCallbackWithResult + 49;
        int i9 = i8 % 128;
        onWarmupCompleted = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 107;
        onExtraCallbackWithResult = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r1 r3 r4
      0x0032: PHI (r1v16 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
      0x0030: PHI (r1v6 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        String str;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        int iHashCode5 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.terminateAccounts.hashCode();
            iHashCode2 = this.transferAccounts.hashCode();
            str = this.receiveAccountNumber;
            iHashCode3 = str == null ? 0 : str.hashCode();
        } else {
            iHashCode = this.terminateAccounts.hashCode();
            iHashCode2 = this.transferAccounts.hashCode();
            str = this.receiveAccountNumber;
            if (str == null) {
            }
        }
        String str2 = this.receiveBankCode;
        if (str2 == null) {
            int i3 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i3 % 128;
            iHashCode4 = i3 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode4 = str2.hashCode();
        }
        String str3 = this.recipientType;
        if (str3 != null) {
            int i4 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode5 = str3.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTerminateStateCheckRequest(terminateAccounts=" + this.terminateAccounts + ", transferAccounts=" + this.transferAccounts + ", receiveAccountNumber=" + this.receiveAccountNumber + ", receiveBankCode=" + this.receiveBankCode + ", recipientType=" + this.recipientType + ")";
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new AccountTerminateStateCheckRequest$.ExternalSyntheticLambda0()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new AccountTerminateStateCheckRequest$.ExternalSyntheticLambda1()), null, null, null};
        int i = onExtraCallback + 89;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ AccountTerminateStateCheckRequest(int i, List list, List list2, String str, String str2, String str3, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 31;
        if (31 != (i & 31)) {
            int i3 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = AccountTerminateStateCheckRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 35;
            } else {
                descriptor = AccountTerminateStateCheckRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 2;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.terminateAccounts = list;
        this.transferAccounts = list2;
        this.receiveAccountNumber = str;
        this.receiveBankCode = str2;
        this.recipientType = str3;
    }

    public AccountTerminateStateCheckRequest(@NotNull List<StateCheckAccount> list, @NotNull List<StateCheckAccount> list2, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.terminateAccounts = list;
        this.transferAccounts = list2;
        this.receiveAccountNumber = str;
        this.receiveBankCode = str2;
        this.recipientType = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(AccountTerminateStateCheckRequest accountTerminateStateCheckRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), accountTerminateStateCheckRequest.terminateAccounts);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), accountTerminateStateCheckRequest.transferAccounts);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, accountTerminateStateCheckRequest.receiveAccountNumber);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, accountTerminateStateCheckRequest.receiveBankCode);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, accountTerminateStateCheckRequest.recipientType);
        int i4 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }
}
