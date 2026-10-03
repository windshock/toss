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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanRefinancingPrimeRateInfo {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final float maxPrimeRate;
    private final List<PrimeRateConditions> primeRateConditions;
    private final String subtitle;
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                LoanRefinancingPrimeRateInfo.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallback = LoanRefinancingPrimeRateInfo.onExtraCallback();
            int i3 = IAuthTabCallback + 31;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return kSerializerOnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }
    })};

    public LoanRefinancingPrimeRateInfo() {
        this((String) null, (String) null, 0.0f, (List) null, 15, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer asInterface() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(PrimeRateConditions$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAsInterface = asInterface();
        int i4 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerAsInterface;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 113;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof LoanRefinancingPrimeRateInfo)) {
            return false;
        }
        LoanRefinancingPrimeRateInfo loanRefinancingPrimeRateInfo = (LoanRefinancingPrimeRateInfo) obj;
        if (!Intrinsics.areEqual(this.title, loanRefinancingPrimeRateInfo.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subtitle, loanRefinancingPrimeRateInfo.subtitle)) {
            int i6 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Float.compare(this.maxPrimeRate, loanRefinancingPrimeRateInfo.maxPrimeRate) != 0) {
            int i8 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.primeRateConditions, loanRefinancingPrimeRateInfo.primeRateConditions))) {
            return true;
        }
        int i10 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Float.hashCode(this.maxPrimeRate)) * 31) + this.primeRateConditions.hashCode();
        int i4 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanRefinancingPrimeRateInfo(title=" + this.title + ", subtitle=" + this.subtitle + ", maxPrimeRate=" + this.maxPrimeRate + ", primeRateConditions=" + this.primeRateConditions + ")";
        int i2 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanRefinancingPrimeRateInfo> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingPrimeRateInfo$.serializer serializerVar = LoanRefinancingPrimeRateInfo$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 24 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = IAuthTabCallback + 29;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 21 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LoanRefinancingPrimeRateInfo(int r3, java.lang.String r4, java.lang.String r5, float r6, java.util.List r7, o.okycx r8) {
        /*
            r2 = this;
            r2.<init>()
            r8 = r3 & 1
            java.lang.String r0 = ""
            r1 = 2
            if (r8 != 0) goto Ld
            r2.title = r0
            goto L1d
        Ld:
            r2.title = r4
            int r4 = viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onExtraCallbackWithResult
            int r4 = r4 + 75
            int r8 = r4 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onWarmupCompleted = r8
            int r4 = r4 % r1
            if (r4 != 0) goto L1b
            goto L1d
        L1b:
            int r4 = r1 % r1
        L1d:
            r4 = r3 & 2
            if (r4 != 0) goto L33
            int r4 = viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onWarmupCompleted
            int r4 = r4 + 73
            int r5 = r4 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onExtraCallbackWithResult = r5
            int r4 = r4 % r1
            r2.subtitle = r0
            if (r4 == 0) goto L35
            r4 = 12
            int r4 = r4 / 0
            goto L35
        L33:
            r2.subtitle = r5
        L35:
            r4 = r3 & 4
            if (r4 != 0) goto L4d
            r4 = 0
            r2.maxPrimeRate = r4
            int r4 = viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onExtraCallbackWithResult
            int r4 = r4 + 97
            int r5 = r4 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onWarmupCompleted = r5
            int r4 = r4 % r1
            if (r4 != 0) goto L4b
            r4 = 4
            int r4 = r4 / 3
            goto L59
        L4b:
            int r1 = r1 % r1
            goto L59
        L4d:
            r2.maxPrimeRate = r6
            int r4 = viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onExtraCallbackWithResult
            int r4 = r4 + 73
            int r5 = r4 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onWarmupCompleted = r5
            int r4 = r4 % r1
            goto L4b
        L59:
            r3 = r3 & 8
            if (r3 != 0) goto L64
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            r2.primeRateConditions = r3
            return
        L64:
            r2.primeRateConditions = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.<init>(int, java.lang.String, java.lang.String, float, java.util.List, o.okycx):void");
    }

    public LoanRefinancingPrimeRateInfo(@NotNull String str, @NotNull String str2, float f, @NotNull List<PrimeRateConditions> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.subtitle = str2;
        this.maxPrimeRate = f;
        this.primeRateConditions = list;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 57;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return lazyArr;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.$childSerializers
            r2 = 0
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            java.lang.String r4 = ""
            r5 = 1
            if (r3 != 0) goto L19
            java.lang.String r3 = r6.title
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            r3 = r3 ^ r5
            if (r3 == r5) goto L19
            goto L1e
        L19:
            java.lang.String r3 = r6.title
            r7.onExtraCallback(r8, r2, r3)
        L1e:
            boolean r2 = r7.onWarmupCompleted(r8, r5)
            if (r2 != 0) goto L35
            int r2 = viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onExtraCallbackWithResult
            int r2 = r2 + 73
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onWarmupCompleted = r3
            int r2 = r2 % r0
            java.lang.String r2 = r6.subtitle
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 != 0) goto L3a
        L35:
            java.lang.String r2 = r6.subtitle
            r7.onExtraCallback(r8, r5, r2)
        L3a:
            boolean r2 = r7.onWarmupCompleted(r8, r0)
            if (r2 != 0) goto L5f
            int r2 = viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onWarmupCompleted
            int r2 = r2 + 27
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L56
            float r2 = r6.maxPrimeRate
            r3 = 1073741824(0x40000000, float:2.0)
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L64
            goto L5f
        L56:
            float r2 = r6.maxPrimeRate
            r3 = 0
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L64
        L5f:
            float r2 = r6.maxPrimeRate
            r7.onExtraCallback(r8, r0, r2)
        L64:
            r2 = 3
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            if (r3 != 0) goto L81
            int r3 = viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onExtraCallbackWithResult
            int r3 = r3 + 41
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onWarmupCompleted = r4
            int r3 = r3 % r0
            java.util.List<viva.republica.toss.network.model.loan.PrimeRateConditions> r3 = r6.primeRateConditions
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            r3 = r3 ^ r5
            if (r3 == 0) goto L8e
        L81:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.loan.PrimeRateConditions> r6 = r6.primeRateConditions
            r7.onNavigationEvent(r8, r2, r1, r6)
        L8e:
            int r6 = viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onWarmupCompleted
            int r6 = r6 + 119
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onExtraCallbackWithResult = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L9a
            return
        L9a:
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo.onWarmupCompleted(viva.republica.toss.network.model.loan.LoanRefinancingPrimeRateInfo, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanRefinancingPrimeRateInfo(String str, String str2, float f, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = 2 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i6 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            list = CollectionsKt.emptyList();
            int i8 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        }
        this(str, str2, f, list);
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 121;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subtitle;
        int i5 = i2 + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float f = this.maxPrimeRate;
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return f;
    }

    public final List<PrimeRateConditions> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 125;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<PrimeRateConditions> list = this.primeRateConditions;
        int i5 = i2 + 21;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
