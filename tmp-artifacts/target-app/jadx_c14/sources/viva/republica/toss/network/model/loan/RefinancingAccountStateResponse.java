package viva.republica.toss.network.model.loan;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.RefinancingAccountStateResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RefinancingAccountStateResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<LoanAccountResponse> kcbLoanAccounts;
    private final List<LoanAccountInfoResponse> loanAccounts;

    /* JADX WARN: Illegal instructions before constructor call */
    public RefinancingAccountStateResponse() {
        List list = null;
        this(list, list, 3, (DefaultConstructorMarker) list);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanAccountInfoResponse$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanAccountResponse$$serializer.INSTANCE);
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i3 = onWarmupCompleted + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerIAuthTabCallbackDefault;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface();
        }
        asInterface();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 15;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 73;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 59;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        if (!(obj instanceof RefinancingAccountStateResponse)) {
            return false;
        }
        RefinancingAccountStateResponse refinancingAccountStateResponse = (RefinancingAccountStateResponse) obj;
        if (Intrinsics.areEqual(this.kcbLoanAccounts, refinancingAccountStateResponse.kcbLoanAccounts)) {
            return Intrinsics.areEqual(this.loanAccounts, refinancingAccountStateResponse.loanAccounts);
        }
        int i9 = IAuthTabCallback + 91;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.kcbLoanAccounts.hashCode();
        return i3 != 0 ? (iHashCode * 13) - this.loanAccounts.hashCode() : (iHashCode * 31) + this.loanAccounts.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RefinancingAccountStateResponse(kcbLoanAccounts=" + this.kcbLoanAccounts + ", loanAccounts=" + this.loanAccounts + ")";
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RefinancingAccountStateResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            RefinancingAccountStateResponse$.serializer serializerVar = RefinancingAccountStateResponse$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.RefinancingAccountStateResponse$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 9;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = RefinancingAccountStateResponse.onWarmupCompleted();
                int i4 = IAuthTabCallback + 15;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnWarmupCompleted;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.RefinancingAccountStateResponse$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 81;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    kSerializerOnExtraCallback = RefinancingAccountStateResponse.onExtraCallback();
                    int i3 = 0 / 0;
                } else {
                    kSerializerOnExtraCallback = RefinancingAccountStateResponse.onExtraCallback();
                }
                int i4 = IAuthTabCallback + 83;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        })};
        int i = onNavigationEvent + 95;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ RefinancingAccountStateResponse(int i, List list, List list2, okycx okycxVar) {
        if ((i & 1) == 0) {
            list = new ArrayList();
            int i2 = IAuthTabCallback + 53;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this.kcbLoanAccounts = list;
        if ((i & 2) != 0) {
            this.loanAccounts = list2;
            return;
        }
        this.loanAccounts = new ArrayList();
        int i4 = onWarmupCompleted + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public RefinancingAccountStateResponse(@NotNull List<LoanAccountResponse> list, @NotNull List<LoanAccountInfoResponse> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.kcbLoanAccounts = list;
        this.loanAccounts = list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e A[PHI: r1
      0x002e: PHI (r1v10 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:10:0x002c, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v11 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.loan.RefinancingAccountStateResponse r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.RefinancingAccountStateResponse.onWarmupCompleted
            int r1 = r1 + 23
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.RefinancingAccountStateResponse.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L19
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.RefinancingAccountStateResponse.$childSerializers
            boolean r4 = r7.onWarmupCompleted(r8, r3)
            if (r4 != 0) goto L2e
            goto L21
        L19:
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.RefinancingAccountStateResponse.$childSerializers
            boolean r4 = r7.onWarmupCompleted(r8, r2)
            if (r4 != 0) goto L2e
        L21:
            java.util.List<viva.republica.toss.network.model.loan.LoanAccountResponse> r4 = r6.kcbLoanAccounts
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r4 != 0) goto L3b
        L2e:
            r4 = r1[r2]
            java.lang.Object r4 = r4.getValue()
            o.py r4 = (o.py) r4
            java.util.List<viva.republica.toss.network.model.loan.LoanAccountResponse> r5 = r6.kcbLoanAccounts
            r7.onNavigationEvent(r8, r2, r4, r5)
        L3b:
            boolean r2 = r7.onWarmupCompleted(r8, r3)
            if (r2 != 0) goto L4f
            java.util.List<viva.republica.toss.network.model.loan.LoanAccountInfoResponse> r2 = r6.loanAccounts
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            r2 = r2 ^ r3
            if (r2 == 0) goto L65
        L4f:
            r1 = r1[r3]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.loan.LoanAccountInfoResponse> r6 = r6.loanAccounts
            r7.onNavigationEvent(r8, r3, r1, r6)
            int r6 = viva.republica.toss.network.model.loan.RefinancingAccountStateResponse.onWarmupCompleted
            int r6 = r6 + 51
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.RefinancingAccountStateResponse.IAuthTabCallback = r7
            int r6 = r6 % r0
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.RefinancingAccountStateResponse.onExtraCallback(viva.republica.toss.network.model.loan.RefinancingAccountStateResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return lazyArr;
    }

    public /* synthetic */ RefinancingAccountStateResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = new ArrayList();
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            list2 = new ArrayList();
            int i4 = IAuthTabCallback + 59;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this(list, list2);
    }

    public final List<LoanAccountResponse> IAuthTabCallback() {
        List<LoanAccountResponse> list;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            list = this.kcbLoanAccounts;
            int i4 = 3 / 0;
        } else {
            list = this.kcbLoanAccounts;
        }
        int i5 = i3 + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<LoanAccountInfoResponse> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<LoanAccountInfoResponse> list = this.loanAccounts;
        int i5 = i3 + 19;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
