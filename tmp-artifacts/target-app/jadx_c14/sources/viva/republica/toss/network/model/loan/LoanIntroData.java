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
import viva.republica.toss.network.model.loan.LoanIntroData$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanIntroData {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<BottomContent> bottomContents;
    private final CreditInfo creditInfo;
    private final List<DisbursementContent> disbursementContents;
    private final String introABTestType;

    public LoanIntroData() {
        this((CreditInfo) null, (String) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onNavigationEvent + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackDefault;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(DisbursementContent$$serializer.INSTANCE);
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(BottomContent$$serializer.INSTANCE);
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = onExtraCallback + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return kSerializerIAuthTabCallbackStub;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof LoanIntroData)) {
            int i3 = onExtraCallback + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        LoanIntroData loanIntroData = (LoanIntroData) obj;
        if (!Intrinsics.areEqual(this.creditInfo, loanIntroData.creditInfo)) {
            int i5 = onNavigationEvent + 1;
            onExtraCallback = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.introABTestType, loanIntroData.introABTestType) || !Intrinsics.areEqual(this.bottomContents, loanIntroData.bottomContents)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.disbursementContents, loanIntroData.disbursementContents))) {
            return true;
        }
        int i6 = onExtraCallback + 3;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.creditInfo.hashCode();
        String str = this.introABTestType;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = onExtraCallback + 9;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (((((iHashCode * 31) + i) * 31) + this.bottomContents.hashCode()) * 31) + this.disbursementContents.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanIntroData(creditInfo=" + this.creditInfo + ", introABTestType=" + this.introABTestType + ", bottomContents=" + this.bottomContents + ", disbursementContents=" + this.disbursementContents + ")";
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanIntroData> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LoanIntroData$.serializer serializerVar = LoanIntroData$.serializer.INSTANCE;
            int i4 = onExtraCallback + 47;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 72 / 0;
            }
            return serializerVar;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanIntroData$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 97;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = LoanIntroData.onExtraCallbackWithResult();
                int i4 = onNavigationEvent + 67;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanIntroData$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = LoanIntroData.IAuthTabCallback();
                int i4 = onExtraCallbackWithResult + 65;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerIAuthTabCallback;
            }
        })};
        int i = onWarmupCompleted + 57;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ LoanIntroData(int i, CreditInfo creditInfo, String str, List list, List list2, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            creditInfo = new CreditInfo(0, 0, 3, (DefaultConstructorMarker) null);
            int i2 = 2 % 2;
        }
        this.creditInfo = creditInfo;
        if ((i & 2) == 0) {
            int i3 = onNavigationEvent + 97;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            this.introABTestType = null;
        } else {
            this.introABTestType = str;
            int i5 = onExtraCallback + 23;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 4;
            } else {
                int i7 = 2 % 2;
            }
        }
        if ((i & 4) == 0) {
            int i8 = onNavigationEvent + 87;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                this.bottomContents = CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            this.bottomContents = CollectionsKt.emptyList();
        } else {
            this.bottomContents = list;
            int i9 = onNavigationEvent + 21;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        }
        if ((i & 8) != 0) {
            this.disbursementContents = list2;
            return;
        }
        int i12 = onExtraCallback + 21;
        onNavigationEvent = i12 % 128;
        int i13 = i12 % 2;
        this.disbursementContents = CollectionsKt.emptyList();
    }

    public LoanIntroData(@NotNull CreditInfo creditInfo, @Nullable String str, @NotNull List<BottomContent> list, @NotNull List<DisbursementContent> list2) {
        Intrinsics.checkNotNullParameter(creditInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.creditInfo = creditInfo;
        this.introABTestType = str;
        this.bottomContents = list;
        this.disbursementContents = list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.loan.LoanIntroData r8, o.vyl r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanIntroData.onExtraCallback
            int r1 = r1 + 83
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanIntroData.onNavigationEvent = r2
            int r1 = r1 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanIntroData.$childSerializers
            r2 = 0
            boolean r3 = r9.onWarmupCompleted(r10, r2)
            r4 = 0
            r5 = 3
            r6 = 1
            if (r3 != 0) goto L25
            viva.republica.toss.network.model.loan.CreditInfo r3 = r8.creditInfo
            viva.republica.toss.network.model.loan.CreditInfo r7 = new viva.republica.toss.network.model.loan.CreditInfo
            r7.<init>(r2, r2, r5, r4)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r7)
            if (r3 == r6) goto L2c
        L25:
            viva.republica.toss.network.model.loan.CreditInfo$$serializer r3 = viva.republica.toss.network.model.loan.CreditInfo$.serializer.INSTANCE
            viva.republica.toss.network.model.loan.CreditInfo r7 = r8.creditInfo
            r9.onNavigationEvent(r10, r2, r3, r7)
        L2c:
            boolean r2 = r9.onWarmupCompleted(r10, r6)
            r2 = r2 ^ r6
            if (r2 == r6) goto L34
            goto L38
        L34:
            java.lang.String r2 = r8.introABTestType
            if (r2 == 0) goto L48
        L38:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r8.introABTestType
            r9.onExtraCallbackWithResult(r10, r6, r2, r3)
            int r2 = viva.republica.toss.network.model.loan.LoanIntroData.onNavigationEvent
            int r2 = r2 + 113
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanIntroData.onExtraCallback = r3
            int r2 = r2 % r0
        L48:
            boolean r2 = r9.onWarmupCompleted(r10, r0)
            if (r2 != 0) goto L63
            int r2 = viva.republica.toss.network.model.loan.LoanIntroData.onExtraCallback
            int r2 = r2 + 59
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanIntroData.onNavigationEvent = r3
            int r2 = r2 % r0
            java.util.List<viva.republica.toss.network.model.loan.BottomContent> r2 = r8.bottomContents
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L70
        L63:
            r2 = r1[r0]
            java.lang.Object r2 = r2.getValue()
            o.py r2 = (o.py) r2
            java.util.List<viva.republica.toss.network.model.loan.BottomContent> r3 = r8.bottomContents
            r9.onNavigationEvent(r10, r0, r2, r3)
        L70:
            boolean r2 = r9.onWarmupCompleted(r10, r5)
            if (r2 != 0) goto L9b
            int r2 = viva.republica.toss.network.model.loan.LoanIntroData.onExtraCallback
            int r2 = r2 + 57
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanIntroData.onNavigationEvent = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L8e
            java.util.List<viva.republica.toss.network.model.loan.DisbursementContent> r2 = r8.disbursementContents
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto La8
            goto L9b
        L8e:
            java.util.List<viva.republica.toss.network.model.loan.DisbursementContent> r8 = r8.disbursementContents
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
            kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            r4.hashCode()
            throw r4
        L9b:
            r1 = r1[r5]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.loan.DisbursementContent> r8 = r8.disbursementContents
            r9.onNavigationEvent(r10, r5, r1, r8)
        La8:
            int r8 = viva.republica.toss.network.model.loan.LoanIntroData.onNavigationEvent
            int r8 = r8 + 99
            int r9 = r8 % 128
            viva.republica.toss.network.model.loan.LoanIntroData.onExtraCallback = r9
            int r8 = r8 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanIntroData.IAuthTabCallback(viva.republica.toss.network.model.loan.LoanIntroData, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            lazyArr = $childSerializers;
            int i4 = 59 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i2 + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    public /* synthetic */ LoanIntroData(CreditInfo creditInfo, String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            creditInfo = new CreditInfo(0, 0, 3, (DefaultConstructorMarker) null);
            int i2 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 87;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str = null;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
            int i6 = onNavigationEvent + 89;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        if ((i & 8) != 0) {
            int i9 = onNavigationEvent + 15;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                list2 = CollectionsKt.emptyList();
                int i10 = 57 / 0;
            } else {
                list2 = CollectionsKt.emptyList();
            }
        }
        this(creditInfo, str, list, list2);
    }

    public final CreditInfo onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        CreditInfo creditInfo = this.creditInfo;
        int i5 = i3 + 21;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return creditInfo;
    }

    public final List<BottomContent> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 21;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<BottomContent> list = this.bottomContents;
        int i5 = i2 + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
