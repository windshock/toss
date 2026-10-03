package viva.republica.toss.network.model.transfer;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getDynamicHeight;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.ResolveTermIdsRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResolveTermIdsRequest {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<Integer> bankCodes;
    private final boolean isOpenBankingInquiryAgreed;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.ResolveTermIdsRequest$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                ResolveTermIdsRequest.onExtraCallback();
                throw null;
            }
            KSerializer kSerializerOnExtraCallback = ResolveTermIdsRequest.onExtraCallback();
            int i3 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 82 / 0;
            }
            return kSerializerOnExtraCallback;
        }
    }), null};

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i3 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getDynamicHeight.onWarmupCompleted);
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 29;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 37;
            onExtraCallbackWithResult = i5 % 128;
            boolean z = i5 % 2 == 0;
            int i6 = i2 + 71;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return z;
            }
            throw null;
        }
        if (!(obj instanceof ResolveTermIdsRequest)) {
            int i7 = i2 + 21;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        ResolveTermIdsRequest resolveTermIdsRequest = (ResolveTermIdsRequest) obj;
        if (!Intrinsics.areEqual(this.bankCodes, resolveTermIdsRequest.bankCodes)) {
            return false;
        }
        if (this.isOpenBankingInquiryAgreed == resolveTermIdsRequest.isOpenBankingInquiryAgreed) {
            return true;
        }
        int i9 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.bankCodes.hashCode();
        return i3 == 0 ? (iHashCode - 89) - Boolean.hashCode(this.isOpenBankingInquiryAgreed) : (iHashCode * 31) + Boolean.hashCode(this.isOpenBankingInquiryAgreed);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ResolveTermIdsRequest(bankCodes=" + this.bankCodes + ", isOpenBankingInquiryAgreed=" + this.isOpenBankingInquiryAgreed + ")";
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ResolveTermIdsRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ResolveTermIdsRequest$.serializer serializerVar = ResolveTermIdsRequest$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onNavigationEvent + 53;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ ResolveTermIdsRequest(int i, List list, boolean z, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                htf31.onExtraCallbackWithResult(i, 4, ResolveTermIdsRequest$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, ResolveTermIdsRequest$.serializer.INSTANCE.getDescriptor());
            }
            int i3 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 3;
            } else {
                int i5 = 2 % 2;
            }
        }
        this.bankCodes = list;
        this.isOpenBankingInquiryAgreed = z;
    }

    public ResolveTermIdsRequest(@NotNull List<Integer> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.bankCodes = list;
        this.isOpenBankingInquiryAgreed = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(ResolveTermIdsRequest resolveTermIdsRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), resolveTermIdsRequest.bankCodes);
        vylVar.onNavigationEvent(serialDescriptor, 1, resolveTermIdsRequest.isOpenBankingInquiryAgreed);
        int i4 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 67;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }
}
