package viva.republica.toss.network.model.transfer;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.nSetPosition;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.ResolveTermIdsResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResolveTermIdsResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<String> commonTermIds;
    private final List<BankTermIds> openBankingInquiryAgreementBankTermIdsList;
    private final List<BankTermIds> withdrawAgreementBankTermIdsList;

    public ResolveTermIdsResponse() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~((~i6) | i7);
        int i9 = ~(i2 | i7);
        int i10 = i8 | i9;
        int i11 = i9 | i6;
        int i12 = ~(i7 | i6);
        int i13 = i + i6 + i3 + (1577873432 * i5) + (977123338 * i4);
        int i14 = i13 * i13;
        int i15 = (((-1026819430) * i) - 865599488) + ((-647756440) * i6) + (i10 * 189531495) + ((-189531495) * i11) + (189531495 * i12) + ((-837287936) * i3) + ((-767557632) * i5) + (1290797056 * i4) + ((-539361280) * i14);
        int i16 = (i * (-1177406726)) + 1326046462 + (i6 * (-1177405720)) + (i10 * 503) + (i11 * (-503)) + (i12 * 503) + (i3 * (-1177406223)) + (i5 * 1546282648) + (i4 * (-1884272278)) + (i14 * 70909952);
        return i15 + ((i16 * i16) * 451280896) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        int i4 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAsInterface;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(BankTermIds$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
        }
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(BankTermIds$$serializer.INSTANCE);
        int i2 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackDefault;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerAsBinder = asBinder();
        int i3 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerAsBinder;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveTermIdsResponse)) {
            int i5 = i3 + 93;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        ResolveTermIdsResponse resolveTermIdsResponse = (ResolveTermIdsResponse) obj;
        if (Intrinsics.areEqual(this.commonTermIds, resolveTermIdsResponse.commonTermIds)) {
            return Intrinsics.areEqual(this.withdrawAgreementBankTermIdsList, resolveTermIdsResponse.withdrawAgreementBankTermIdsList) && Intrinsics.areEqual(this.openBankingInquiryAgreementBankTermIdsList, resolveTermIdsResponse.openBankingInquiryAgreementBankTermIdsList);
        }
        int i7 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 == 0 ? (((r0 / 39) % this.withdrawAgreementBankTermIdsList.hashCode()) - 25) << this.openBankingInquiryAgreementBankTermIdsList.hashCode() : (((this.commonTermIds.hashCode() * 31) + this.withdrawAgreementBankTermIdsList.hashCode()) * 31) + this.openBankingInquiryAgreementBankTermIdsList.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ResolveTermIdsResponse(commonTermIds=" + this.commonTermIds + ", withdrawAgreementBankTermIdsList=" + this.withdrawAgreementBankTermIdsList + ", openBankingInquiryAgreementBankTermIdsList=" + this.openBankingInquiryAgreementBankTermIdsList + ")";
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ResolveTermIdsResponse> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResolveTermIdsResponse$.serializer serializerVar = ResolveTermIdsResponse$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.ResolveTermIdsResponse$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 81;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = ResolveTermIdsResponse.onExtraCallback();
                if (i3 == 0) {
                    int i4 = 70 / 0;
                }
                return kSerializerOnExtraCallback;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.ResolveTermIdsResponse$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                KSerializer kSerializerOnNavigationEvent;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 99;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerOnNavigationEvent = ResolveTermIdsResponse.onNavigationEvent();
                    int i3 = 89 / 0;
                } else {
                    kSerializerOnNavigationEvent = ResolveTermIdsResponse.onNavigationEvent();
                }
                int i4 = onExtraCallback + 69;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerOnNavigationEvent;
                }
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.ResolveTermIdsResponse$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = ResolveTermIdsResponse.IAuthTabCallback();
                int i4 = onWarmupCompleted + 89;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return kSerializerIAuthTabCallback;
                }
                throw null;
            }
        })};
        int i = onNavigationEvent + 53;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ ResolveTermIdsResponse(int i, List list, List list2, List list3, okycx okycxVar) {
        if ((i & 1) == 0) {
            list = CollectionsKt.emptyList();
            int i2 = 2 % 2;
        }
        this.commonTermIds = list;
        if ((i & 2) == 0) {
            this.withdrawAgreementBankTermIdsList = CollectionsKt.emptyList();
        } else {
            this.withdrawAgreementBankTermIdsList = list2;
            int i3 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = 2 % 2;
        if ((i & 4) != 0) {
            this.openBankingInquiryAgreementBankTermIdsList = list3;
            int i6 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        int i8 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            this.openBankingInquiryAgreementBankTermIdsList = CollectionsKt.emptyList();
            return;
        }
        this.openBankingInquiryAgreementBankTermIdsList = CollectionsKt.emptyList();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ResolveTermIdsResponse(@NotNull List<String> list, @NotNull List<BankTermIds> list2, @NotNull List<BankTermIds> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.commonTermIds = list;
        this.withdrawAgreementBankTermIdsList = list2;
        this.openBankingInquiryAgreementBankTermIdsList = list3;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(ResolveTermIdsResponse resolveTermIdsResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || (!Intrinsics.areEqual(resolveTermIdsResponse.commonTermIds, CollectionsKt.emptyList()))) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), resolveTermIdsResponse.commonTermIds);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(resolveTermIdsResponse.withdrawAgreementBankTermIdsList, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), resolveTermIdsResponse.withdrawAgreementBankTermIdsList);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(resolveTermIdsResponse.openBankingInquiryAgreementBankTermIdsList, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), resolveTermIdsResponse.openBankingInquiryAgreementBankTermIdsList);
        }
        int i4 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResolveTermIdsResponse(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
            int i2 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            list2 = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            int i5 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            list3 = CollectionsKt.emptyList();
            int i6 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        }
        this(list, list2, list3);
    }

    public final List<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.commonTermIds;
        int i5 = i2 + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ResolveTermIdsResponse resolveTermIdsResponse = (ResolveTermIdsResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<BankTermIds> list = resolveTermIdsResponse.withdrawAgreementBankTermIdsList;
        int i5 = i3 + 113;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ResolveTermIdsResponse resolveTermIdsResponse = (ResolveTermIdsResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<BankTermIds> list = resolveTermIdsResponse.openBankingInquiryAgreementBankTermIdsList;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 73;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return list;
    }

    public final List<BankTermIds> onTransact() {
        return (List) IAuthTabCallback(new Object[]{this}, 1983471334, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1983471333);
    }

    public final List<BankTermIds> IAuthTabCallbackStub() {
        return (List) IAuthTabCallback(new Object[]{this}, 659282793, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -659282793);
    }
}
