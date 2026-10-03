package viva.republica.toss.network.model.loan;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
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
import viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BusinessRefinanceAccountsResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<BusinessRefinanceAccount> refinanceableAccounts;
    private final IntroErrorReason screenInfo;
    private final List<BusinessRefinanceAccount> unrefinanceableAccounts;

    public BusinessRefinanceAccountsResponse() {
        this((List) null, (List) null, (IntroErrorReason) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(BusinessRefinanceAccount$$serializer.INSTANCE);
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(BusinessRefinanceAccount$$serializer.INSTANCE);
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackStub;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        KSerializer kSerializerAsBinder;
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerAsBinder = asBinder();
            int i3 = 5 / 0;
        } else {
            kSerializerAsBinder = asBinder();
        }
        int i4 = onExtraCallback + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAsBinder;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessRefinanceAccountsResponse)) {
            return false;
        }
        BusinessRefinanceAccountsResponse businessRefinanceAccountsResponse = (BusinessRefinanceAccountsResponse) obj;
        if (!Intrinsics.areEqual(this.refinanceableAccounts, businessRefinanceAccountsResponse.refinanceableAccounts)) {
            int i3 = IAuthTabCallback + 67;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.unrefinanceableAccounts, businessRefinanceAccountsResponse.unrefinanceableAccounts)) {
            return false;
        }
        if (Intrinsics.areEqual(this.screenInfo, businessRefinanceAccountsResponse.screenInfo)) {
            return true;
        }
        int i5 = onExtraCallback + 87;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.refinanceableAccounts.hashCode();
        int iHashCode3 = this.unrefinanceableAccounts.hashCode();
        IntroErrorReason introErrorReason = this.screenInfo;
        if (introErrorReason == null) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 19;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = introErrorReason.hashCode();
        }
        int i9 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        int i10 = onExtraCallback + 9;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        return i9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BusinessRefinanceAccountsResponse(refinanceableAccounts=" + this.refinanceableAccounts + ", unrefinanceableAccounts=" + this.unrefinanceableAccounts + ", screenInfo=" + this.screenInfo + ")";
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BusinessRefinanceAccountsResponse> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            BusinessRefinanceAccountsResponse$.serializer serializerVar = BusinessRefinanceAccountsResponse$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 41;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 12 / 0;
            }
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 75;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = BusinessRefinanceAccountsResponse.onExtraCallbackWithResult();
                int i4 = onNavigationEvent + 93;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 73;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = BusinessRefinanceAccountsResponse.onExtraCallback();
                int i4 = onWarmupCompleted + 45;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null};
        int i = onNavigationEvent + 15;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ BusinessRefinanceAccountsResponse(int i, List list, List list2, IntroErrorReason introErrorReason, okycx okycxVar) {
        this.refinanceableAccounts = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) == 0) {
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.unrefinanceableAccounts = CollectionsKt.emptyList();
        } else {
            this.unrefinanceableAccounts = list2;
        }
        if ((i & 4) == 0) {
            int i4 = IAuthTabCallback + 99;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            this.screenInfo = null;
            return;
        }
        this.screenInfo = introErrorReason;
        int i6 = IAuthTabCallback + 57;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public BusinessRefinanceAccountsResponse(@NotNull List<BusinessRefinanceAccount> list, @NotNull List<BusinessRefinanceAccount> list2, @Nullable IntroErrorReason introErrorReason) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.refinanceableAccounts = list;
        this.unrefinanceableAccounts = list2;
        this.screenInfo = introErrorReason;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse.$childSerializers
            r2 = 0
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L33
            int r3 = viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse.onExtraCallback
            int r3 = r3 + 53
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse.IAuthTabCallback = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L27
            java.util.List<viva.republica.toss.network.model.loan.BusinessRefinanceAccount> r3 = r5.refinanceableAccounts
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            r4 = 67
            int r4 = r4 / r2
            if (r3 != 0) goto L40
            goto L33
        L27:
            java.util.List<viva.republica.toss.network.model.loan.BusinessRefinanceAccount> r3 = r5.refinanceableAccounts
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L40
        L33:
            r3 = r1[r2]
            java.lang.Object r3 = r3.getValue()
            o.py r3 = (o.py) r3
            java.util.List<viva.republica.toss.network.model.loan.BusinessRefinanceAccount> r4 = r5.refinanceableAccounts
            r6.onNavigationEvent(r7, r2, r3, r4)
        L40:
            r2 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L53
            java.util.List<viva.republica.toss.network.model.loan.BusinessRefinanceAccount> r3 = r5.unrefinanceableAccounts
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L69
        L53:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.loan.BusinessRefinanceAccount> r3 = r5.unrefinanceableAccounts
            r6.onNavigationEvent(r7, r2, r1, r3)
            int r1 = viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse.onExtraCallback
            int r1 = r1 + 63
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse.IAuthTabCallback = r2
            int r1 = r1 % r0
        L69:
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            if (r1 != 0) goto L73
            viva.republica.toss.network.model.loan.IntroErrorReason r1 = r5.screenInfo
            if (r1 == 0) goto L7a
        L73:
            viva.republica.toss.network.model.loan.IntroErrorReason$$serializer r1 = viva.republica.toss.network.model.loan.IntroErrorReason$$serializer.INSTANCE
            viva.republica.toss.network.model.loan.IntroErrorReason r5 = r5.screenInfo
            r6.onExtraCallbackWithResult(r7, r0, r1, r5)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse.onWarmupCompleted(viva.republica.toss.network.model.loan.BusinessRefinanceAccountsResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 97;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    public final List<BusinessRefinanceAccount> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<BusinessRefinanceAccount> list = this.refinanceableAccounts;
        int i5 = i3 + 39;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BusinessRefinanceAccountsResponse(List list, List list2, IntroErrorReason introErrorReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 105;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                list2 = CollectionsKt.emptyList();
                int i6 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        this(list, list2, (i & 4) != 0 ? null : introErrorReason);
    }

    public final List<BusinessRefinanceAccount> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<BusinessRefinanceAccount> list = this.unrefinanceableAccounts;
        int i5 = i2 + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IntroErrorReason IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.screenInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
