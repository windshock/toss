package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.AccountTerminateTransferResultDto$;
import im.toss.features.account_terminator.core.model.AccountTransferResultDto$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountTerminateTransferResultDto {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<AccountTransferResultDto> accountTerminateAndTransferFailInfos;
    private final List<AccountTransferResultDto> accountTerminateAndTransferSuccessInfos;

    /* JADX WARN: Illegal instructions before constructor call */
    public AccountTerminateTransferResultDto() {
        List list = null;
        this(list, list, 3, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        KSerializer kSerializerIAuthTabCallbackDefault;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            int i3 = 24 / 0;
        } else {
            kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        }
        int i4 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackDefault;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AccountTransferResultDto$.serializer.INSTANCE);
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AccountTransferResultDto$.serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder();
        }
        asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountTerminateTransferResultDto)) {
            return false;
        }
        AccountTerminateTransferResultDto accountTerminateTransferResultDto = (AccountTerminateTransferResultDto) obj;
        if (!Intrinsics.areEqual(this.accountTerminateAndTransferSuccessInfos, accountTerminateTransferResultDto.accountTerminateAndTransferSuccessInfos)) {
            int i4 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.accountTerminateAndTransferFailInfos, accountTerminateTransferResultDto.accountTerminateAndTransferFailInfos)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.accountTerminateAndTransferSuccessInfos.hashCode() * 31) + this.accountTerminateAndTransferFailInfos.hashCode();
        int i4 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTerminateTransferResultDto(accountTerminateAndTransferSuccessInfos=" + this.accountTerminateAndTransferSuccessInfos + ", accountTerminateAndTransferFailInfos=" + this.accountTerminateAndTransferFailInfos + ")";
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new AccountTerminateTransferResultDto$.ExternalSyntheticLambda0()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new AccountTerminateTransferResultDto$.ExternalSyntheticLambda1())};
        int i = onWarmupCompleted + 45;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ AccountTerminateTransferResultDto(int i, List list, List list2, okycx okycxVar) {
        if ((i & 1) == 0) {
            list = CollectionsKt.emptyList();
            int i2 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.accountTerminateAndTransferSuccessInfos = list;
        if ((i & 2) == 0) {
            this.accountTerminateAndTransferFailInfos = CollectionsKt.emptyList();
            return;
        }
        this.accountTerminateAndTransferFailInfos = list2;
        int i5 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public AccountTerminateTransferResultDto(@NotNull List<AccountTransferResultDto> list, @NotNull List<AccountTransferResultDto> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.accountTerminateAndTransferSuccessInfos = list;
        this.accountTerminateAndTransferFailInfos = list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[PHI: r1
      0x002d: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001e, B:10:0x002a, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r1
      0x0020: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(AccountTerminateTransferResultDto accountTerminateTransferResultDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            if (vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), accountTerminateTransferResultDto.accountTerminateAndTransferSuccessInfos);
                int i3 = onExtraCallbackWithResult + 53;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            } else if (!Intrinsics.areEqual(accountTerminateTransferResultDto.accountTerminateAndTransferSuccessInfos, CollectionsKt.emptyList())) {
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(accountTerminateTransferResultDto.accountTerminateAndTransferFailInfos, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), accountTerminateTransferResultDto.accountTerminateAndTransferFailInfos);
        }
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 117;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            lazyArr = $childSerializers;
            int i4 = 86 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i2 + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AccountTerminateTransferResultDto(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            list2 = CollectionsKt.emptyList();
            int i7 = 2 % 2;
        }
        this(list, list2);
    }

    public final List<AccountTransferResultDto> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<AccountTransferResultDto> list = this.accountTerminateAndTransferSuccessInfos;
        int i5 = i3 + 117;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<AccountTransferResultDto> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<AccountTransferResultDto> list = this.accountTerminateAndTransferFailInfos;
        int i5 = i3 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
