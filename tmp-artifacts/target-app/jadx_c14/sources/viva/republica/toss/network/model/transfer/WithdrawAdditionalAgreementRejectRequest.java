package viva.republica.toss.network.model.transfer;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.accessgetValueMapcp;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementRejectRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class WithdrawAdditionalAgreementRejectRequest {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final accessgetValueMapcp agreementType;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementRejectRequest$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = WithdrawAdditionalAgreementRejectRequest.IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = IAuthTabCallback + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnWarmupCompleted;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = updateRenderInfoForVideo.onNavigationEvent("viva.republica.toss.network.model.transfer.WithdrawAgreementType", accessgetValueMapcp.values(), new String[]{"ADDITIONAL_OB", "ADDITIONAL_FB"}, new Annotation[][]{null, null}, (Annotation[]) null);
        int i4 = IAuthTabCallback + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return kSerializerOnNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof WithdrawAdditionalAgreementRejectRequest)) {
            int i4 = onWarmupCompleted + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.agreementType == ((WithdrawAdditionalAgreementRejectRequest) obj).agreementType) {
            return true;
        }
        int i6 = IAuthTabCallback + 71;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        accessgetValueMapcp accessgetvaluemapcp = this.agreementType;
        if (i3 != 0) {
            return accessgetvaluemapcp.hashCode();
        }
        accessgetvaluemapcp.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WithdrawAdditionalAgreementRejectRequest(agreementType=" + this.agreementType + ")";
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WithdrawAdditionalAgreementRejectRequest> serializer() {
            WithdrawAdditionalAgreementRejectRequest$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                serializerVar = WithdrawAdditionalAgreementRejectRequest$.serializer.INSTANCE;
                int i3 = 45 / 0;
            } else {
                serializerVar = WithdrawAdditionalAgreementRejectRequest$.serializer.INSTANCE;
            }
            int i4 = onNavigationEvent + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 25;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 51 / 0;
        }
    }

    public /* synthetic */ WithdrawAdditionalAgreementRejectRequest(int i, accessgetValueMapcp accessgetvaluemapcp, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, WithdrawAdditionalAgreementRejectRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 43;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.agreementType = accessgetvaluemapcp;
    }

    public WithdrawAdditionalAgreementRejectRequest(@NotNull accessgetValueMapcp accessgetvaluemapcp) {
        Intrinsics.checkNotNullParameter(accessgetvaluemapcp, "");
        this.agreementType = accessgetvaluemapcp;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(WithdrawAdditionalAgreementRejectRequest withdrawAdditionalAgreementRejectRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), withdrawAdditionalAgreementRejectRequest.agreementType);
        int i4 = onWarmupCompleted + 89;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }
}
