package viva.republica.toss.network.model.transfer;

import java.lang.annotation.Annotation;
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
import o.accessgetValueMapcp;
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class WithdrawAdditionalAgreementAcceptRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<WithdrawAgreementAccount> accounts;
    private final accessgetValueMapcp agreementType;

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(WithdrawAgreementAccount$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onNavigationEvent("viva.republica.toss.network.model.transfer.WithdrawAgreementType", accessgetValueMapcp.values(), new String[]{"ADDITIONAL_OB", "ADDITIONAL_FB"}, new Annotation[][]{null, null}, (Annotation[]) null);
        }
        accessgetValueMapcp[] accessgetvaluemapcpArrValues = accessgetValueMapcp.values();
        String[] strArr = new String[5];
        strArr[1] = "ADDITIONAL_OB";
        strArr[1] = "ADDITIONAL_FB";
        return updateRenderInfoForVideo.onNavigationEvent("viva.republica.toss.network.model.transfer.WithdrawAgreementType", accessgetvaluemapcpArrValues, strArr, new Annotation[][]{null, null}, (Annotation[]) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r7 instanceof viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest)) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        r7 = (viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r6.agreementType == r7.agreementType) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r2 = r2 + 37;
        viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest.onExtraCallbackWithResult = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.accounts, r7.accounts) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r7 = viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest.onNavigationEvent + 23;
        viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest.onExtraCallbackWithResult = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if ((r7 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest.onExtraCallbackWithResult
            int r1 = r1 + 109
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest.onNavigationEvent = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 39
            int r1 = r1 / r4
            if (r6 != r7) goto L19
            goto L18
        L16:
            if (r6 != r7) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r7 instanceof viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest
            r1 = r1 ^ r3
            if (r1 == 0) goto L1f
            return r4
        L1f:
            viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest r7 = (viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest) r7
            o.accessgetValueMapcp r1 = r6.agreementType
            o.accessgetValueMapcp r5 = r7.agreementType
            if (r1 == r5) goto L2f
            int r2 = r2 + 37
            int r7 = r2 % 128
            viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest.onExtraCallbackWithResult = r7
            int r2 = r2 % r0
            return r4
        L2f:
            java.util.List<viva.republica.toss.network.model.transfer.WithdrawAgreementAccount> r1 = r6.accounts
            java.util.List<viva.republica.toss.network.model.transfer.WithdrawAgreementAccount> r7 = r7.accounts
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)
            if (r7 != 0) goto L3a
            return r4
        L3a:
            int r7 = viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest.onNavigationEvent
            int r7 = r7 + 23
            int r1 = r7 % 128
            viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest.onExtraCallbackWithResult = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L46
            return r3
        L46:
            r7 = 0
            r7.hashCode()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.agreementType.hashCode();
        return i3 == 0 ? (iHashCode >>> 106) / this.accounts.hashCode() : (iHashCode * 31) + this.accounts.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WithdrawAdditionalAgreementAcceptRequest(agreementType=" + this.agreementType + ", accounts=" + this.accounts + ")";
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
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

        public final KSerializer<WithdrawAdditionalAgreementAcceptRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            WithdrawAdditionalAgreementAcceptRequest$.serializer serializerVar = WithdrawAdditionalAgreementAcceptRequest$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 115;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = WithdrawAdditionalAgreementAcceptRequest.IAuthTabCallback();
                if (i3 != 0) {
                    int i4 = 55 / 0;
                }
                return kSerializerIAuthTabCallback;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 53;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return WithdrawAdditionalAgreementAcceptRequest.onNavigationEvent();
                }
                WithdrawAdditionalAgreementAcceptRequest.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        })};
        int i = onWarmupCompleted + 81;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ WithdrawAdditionalAgreementAcceptRequest(int i, accessgetValueMapcp accessgetvaluemapcp, List list, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                htf31.onExtraCallbackWithResult(i, 2, WithdrawAdditionalAgreementAcceptRequest$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, WithdrawAdditionalAgreementAcceptRequest$.serializer.INSTANCE.getDescriptor());
            }
            int i3 = 2 % 2;
        }
        this.agreementType = accessgetvaluemapcp;
        this.accounts = list;
    }

    public WithdrawAdditionalAgreementAcceptRequest(@NotNull accessgetValueMapcp accessgetvaluemapcp, @NotNull List<WithdrawAgreementAccount> list) {
        Intrinsics.checkNotNullParameter(accessgetvaluemapcp, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.agreementType = accessgetvaluemapcp;
        this.accounts = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(WithdrawAdditionalAgreementAcceptRequest withdrawAdditionalAgreementAcceptRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) lazyArr[0].getValue(), withdrawAdditionalAgreementAcceptRequest.agreementType);
        vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), withdrawAdditionalAgreementAcceptRequest.accounts);
        int i4 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
    }
}
