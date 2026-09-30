package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.AccountStateCheckResultDto$;
import im.toss.features.account_terminator.core.model.AccountTerminateStateCheckResultDto$;
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
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountTerminateStateCheckResultDto {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<AccountStateCheckResultDto> accountTerminateStateFailInfos;
    private final List<AccountStateCheckResultDto> accountTerminateStateSuccessInfos;
    private final String terminateTxId;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = IAuthTabCallback + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackDefault;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AccountStateCheckResultDto$.serializer.INSTANCE);
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(AccountStateCheckResultDto$.serializer.INSTANCE);
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            asBinder();
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAsBinder = asBinder();
        int i3 = IAuthTabCallback + 79;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerAsBinder;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountTerminateStateCheckResultDto)) {
            return false;
        }
        AccountTerminateStateCheckResultDto accountTerminateStateCheckResultDto = (AccountTerminateStateCheckResultDto) obj;
        if (Intrinsics.areEqual(this.terminateTxId, accountTerminateStateCheckResultDto.terminateTxId)) {
            if (!Intrinsics.areEqual(this.accountTerminateStateSuccessInfos, accountTerminateStateCheckResultDto.accountTerminateStateSuccessInfos)) {
                return false;
            }
            if (Intrinsics.areEqual(this.accountTerminateStateFailInfos, accountTerminateStateCheckResultDto.accountTerminateStateFailInfos)) {
                return true;
            }
            int i2 = onNavigationEvent + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onNavigationEvent;
        int i5 = i4 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 37;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 78 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.terminateTxId.hashCode() * 31) + this.accountTerminateStateSuccessInfos.hashCode()) * 31) + this.accountTerminateStateFailInfos.hashCode();
        int i4 = IAuthTabCallback + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTerminateStateCheckResultDto(terminateTxId=" + this.terminateTxId + ", accountTerminateStateSuccessInfos=" + this.accountTerminateStateSuccessInfos + ", accountTerminateStateFailInfos=" + this.accountTerminateStateFailInfos + ")";
        int i2 = IAuthTabCallback + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new AccountTerminateStateCheckResultDto$.ExternalSyntheticLambda0()), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new AccountTerminateStateCheckResultDto$.ExternalSyntheticLambda1())};
        int i = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ AccountTerminateStateCheckResultDto(int i, String str, List list, List list2, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AccountTerminateStateCheckResultDto$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 123;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.terminateTxId = str;
        if ((i & 2) == 0) {
            this.accountTerminateStateSuccessInfos = CollectionsKt.emptyList();
        } else {
            this.accountTerminateStateSuccessInfos = list;
        }
        if ((i & 4) == 0) {
            int i6 = onNavigationEvent + 3;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            this.accountTerminateStateFailInfos = CollectionsKt.emptyList();
            return;
        }
        this.accountTerminateStateFailInfos = list2;
        int i8 = IAuthTabCallback + 11;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[PHI: r1
      0x0037: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0029, B:10:0x0035, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r1
      0x002b: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0029, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(AccountTerminateStateCheckResultDto accountTerminateStateCheckResultDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, accountTerminateStateCheckResultDto.terminateTxId);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
                if (!Intrinsics.areEqual(accountTerminateStateCheckResultDto.accountTerminateStateSuccessInfos, CollectionsKt.emptyList())) {
                    vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), accountTerminateStateCheckResultDto.accountTerminateStateSuccessInfos);
                }
            }
        } else {
            lazyArr = $childSerializers;
            vylVar.onExtraCallback(serialDescriptor, 0, accountTerminateStateCheckResultDto.terminateTxId);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            }
        }
        if ((!vylVar.onWarmupCompleted(serialDescriptor, 2)) && Intrinsics.areEqual(accountTerminateStateCheckResultDto.accountTerminateStateFailInfos, CollectionsKt.emptyList())) {
            return;
        }
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), accountTerminateStateCheckResultDto.accountTerminateStateFailInfos);
        int i3 = IAuthTabCallback + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return lazyArr;
    }

    public final List<AccountStateCheckResultDto> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<AccountStateCheckResultDto> list = this.accountTerminateStateSuccessInfos;
        int i4 = i2 + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final List<AccountStateCheckResultDto> onExtraCallbackWithResult() {
        List<AccountStateCheckResultDto> list;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 119;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.accountTerminateStateFailInfos;
            int i4 = 41 / 0;
        } else {
            list = this.accountTerminateStateFailInfos;
        }
        int i5 = i2 + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
