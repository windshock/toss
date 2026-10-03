package viva.republica.toss.network.model.loan;

import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
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
import o.DERSet;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonLoadingConfig {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final long elapsedMilliSeconds;
    private final boolean isMidnightReserved;
    private final List<LoadingMessage> loadingMessages;
    private final long queueMilliSeconds;
    private final boolean skipLoading;
    private final long totalLoadingMilliSeconds;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = LoanComparisonLoadingConfig.onExtraCallback();
            int i4 = onExtraCallbackWithResult + 23;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null, null};

    public LoanComparisonLoadingConfig() {
        this(0L, 0L, 0L, (List) null, false, false, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            return (KSerializer) onNavigationEvent(iIAuthTabCallback2, iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1151629594, new Object[0], 1151629595, iIAuthTabCallback3);
        }
        int iIAuthTabCallback4 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback5 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback6 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = (~((~i5) | i4)) | (~(i4 | i2));
        int i8 = (~i4) | (~i2);
        int i9 = i7 | (~(i8 | i5));
        int i10 = (~i8) | i5;
        int i11 = ~(i2 | i5);
        int i12 = i5 + i4 + i + ((-417414852) * i6) + (1247522396 * i3);
        int i13 = i12 * i12;
        int i14 = (i5 * (-1219797419)) + 1526988800 + ((-1219797419) * i4) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i) + ((-2135949312) * i6) + ((-953155584) * i3) + ((-430374912) * i13);
        int i15 = ((i5 * 184508743) - 476012450) + (i4 * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i * 184509739) + (i6 * (-953474796)) + (i3 * (-288057996)) + (i13 * (-839712768));
        return i14 + ((i15 * i15) * 1709113344) != 1 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoadingMessage$$serializer.INSTANCE);
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanComparisonLoadingConfig)) {
            return false;
        }
        LoanComparisonLoadingConfig loanComparisonLoadingConfig = (LoanComparisonLoadingConfig) obj;
        if (this.totalLoadingMilliSeconds != loanComparisonLoadingConfig.totalLoadingMilliSeconds || this.queueMilliSeconds != loanComparisonLoadingConfig.queueMilliSeconds || this.elapsedMilliSeconds != loanComparisonLoadingConfig.elapsedMilliSeconds || !Intrinsics.areEqual(this.loadingMessages, loanComparisonLoadingConfig.loadingMessages)) {
            return false;
        }
        if (this.isMidnightReserved != loanComparisonLoadingConfig.isMidnightReserved) {
            int i2 = onExtraCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.skipLoading == loanComparisonLoadingConfig.skipLoading) {
            return true;
        }
        int i4 = onWarmupCompleted + 61;
        onExtraCallback = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Long.hashCode(this.totalLoadingMilliSeconds) * 31) + Long.hashCode(this.queueMilliSeconds)) * 31) + Long.hashCode(this.elapsedMilliSeconds)) * 31) + this.loadingMessages.hashCode()) * 31) + Boolean.hashCode(this.isMidnightReserved)) * 31) + Boolean.hashCode(this.skipLoading);
        int i4 = onExtraCallback + 9;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonLoadingConfig(totalLoadingMilliSeconds=" + this.totalLoadingMilliSeconds + ", queueMilliSeconds=" + this.queueMilliSeconds + ", elapsedMilliSeconds=" + this.elapsedMilliSeconds + ", loadingMessages=" + this.loadingMessages + ", isMidnightReserved=" + this.isMidnightReserved + ", skipLoading=" + this.skipLoading + ")";
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonLoadingConfig> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonLoadingConfig$.serializer serializerVar = LoanComparisonLoadingConfig$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 97;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ LoanComparisonLoadingConfig(int i, long j, long j2, long j3, List list, boolean z, boolean z2, okycx okycxVar) {
        this.totalLoadingMilliSeconds = (i & 1) == 0 ? DERSet.onExtraCallback.AudioAttributesImplApi21Parcelizer() : j;
        if ((i & 2) == 0) {
            this.queueMilliSeconds = 0L;
            int i2 = 2 % 2;
        } else {
            this.queueMilliSeconds = j2;
        }
        if ((i & 4) == 0) {
            int i3 = onWarmupCompleted;
            int i4 = i3 + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            this.elapsedMilliSeconds = -1L;
            int i6 = i3 + 117;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            this.elapsedMilliSeconds = j3;
        }
        this.loadingMessages = (i & 8) == 0 ? CollectionsKt.emptyList() : list;
        if ((i & 16) == 0) {
            int i9 = onExtraCallback + 59;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            this.isMidnightReserved = false;
        } else {
            this.isMidnightReserved = z;
            int i11 = onExtraCallback + 89;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        }
        if ((i & 32) != 0) {
            this.skipLoading = z2;
            return;
        }
        int i14 = onWarmupCompleted + 45;
        onExtraCallback = i14 % 128;
        if (i14 % 2 != 0) {
            this.skipLoading = true;
        } else {
            this.skipLoading = false;
        }
    }

    public LoanComparisonLoadingConfig(long j, long j2, long j3, @NotNull List<LoadingMessage> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.totalLoadingMilliSeconds = j;
        this.queueMilliSeconds = j2;
        this.elapsedMilliSeconds = j3;
        this.loadingMessages = list;
        this.isMidnightReserved = z;
        this.skipLoading = z2;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r10) {
        /*
            r0 = 0
            r1 = r10[r0]
            viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig r1 = (viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig) r1
            r2 = 1
            r3 = r10[r2]
            o.vyl r3 = (o.vyl) r3
            r4 = 2
            r10 = r10[r4]
            kotlinx.serialization.descriptors.SerialDescriptor r10 = (kotlinx.serialization.descriptors.SerialDescriptor) r10
            int r5 = r4 % r4
            int r5 = viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig.onWarmupCompleted
            int r5 = r5 + 31
            int r6 = r5 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig.onExtraCallback = r6
            int r5 = r5 % r4
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r5 = viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig.$childSerializers
            boolean r6 = r3.onWarmupCompleted(r10, r0)
            if (r6 != 0) goto L37
            int r6 = viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig.onExtraCallback
            int r6 = r6 + 29
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig.onWarmupCompleted = r7
            int r6 = r6 % r4
            long r6 = r1.totalLoadingMilliSeconds
            o.DERSet r8 = o.DERSet.onExtraCallback
            long r8 = r8.AudioAttributesImplApi21Parcelizer()
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L45
        L37:
            long r6 = r1.totalLoadingMilliSeconds
            r3.onExtraCallback(r10, r0, r6)
            int r0 = viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig.onWarmupCompleted
            int r0 = r0 + 91
            int r6 = r0 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig.onExtraCallback = r6
            int r0 = r0 % r4
        L45:
            boolean r0 = r3.onWarmupCompleted(r10, r2)
            if (r0 != 0) goto L53
            long r6 = r1.queueMilliSeconds
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L58
        L53:
            long r6 = r1.queueMilliSeconds
            r3.onExtraCallback(r10, r2, r6)
        L58:
            boolean r0 = r3.onWarmupCompleted(r10, r4)
            if (r0 != 0) goto L6f
            int r0 = viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig.onWarmupCompleted
            int r0 = r0 + 115
            int r2 = r0 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig.onExtraCallback = r2
            int r0 = r0 % r4
            long r6 = r1.elapsedMilliSeconds
            r8 = -1
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L74
        L6f:
            long r6 = r1.elapsedMilliSeconds
            r3.onExtraCallback(r10, r4, r6)
        L74:
            r0 = 3
            boolean r2 = r3.onWarmupCompleted(r10, r0)
            if (r2 != 0) goto L87
            java.util.List<viva.republica.toss.network.model.loan.LoadingMessage> r2 = r1.loadingMessages
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r6)
            if (r2 != 0) goto L94
        L87:
            r2 = r5[r0]
            java.lang.Object r2 = r2.getValue()
            o.py r2 = (o.py) r2
            java.util.List<viva.republica.toss.network.model.loan.LoadingMessage> r5 = r1.loadingMessages
            r3.onNavigationEvent(r10, r0, r2, r5)
        L94:
            r0 = 4
            boolean r2 = r3.onWarmupCompleted(r10, r0)
            if (r2 != 0) goto L9f
            boolean r2 = r1.isMidnightReserved
            if (r2 == 0) goto La4
        L9f:
            boolean r2 = r1.isMidnightReserved
            r3.onNavigationEvent(r10, r0, r2)
        La4:
            r0 = 5
            boolean r2 = r3.onWarmupCompleted(r10, r0)
            if (r2 != 0) goto Lb8
            int r2 = viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig.onExtraCallback
            int r2 = r2 + 41
            int r5 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig.onWarmupCompleted = r5
            int r2 = r2 % r4
            boolean r2 = r1.skipLoading
            if (r2 == 0) goto Lbd
        Lb8:
            boolean r1 = r1.skipLoading
            r3.onNavigationEvent(r10, r0, r1)
        Lbd:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonLoadingConfig.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanComparisonLoadingConfig(long j, long j2, long j3, List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j4;
        List listEmptyList;
        boolean z3;
        long jAudioAttributesImplApi21Parcelizer = (i & 1) != 0 ? DERSet.onExtraCallback.AudioAttributesImplApi21Parcelizer() : j;
        long j5 = (i & 2) != 0 ? 0L : j2;
        if ((i & 4) != 0) {
            int i2 = onWarmupCompleted + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            j4 = -1;
        } else {
            j4 = j3;
        }
        if ((i & 8) != 0) {
            int i4 = onWarmupCompleted + 121;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                listEmptyList = CollectionsKt.emptyList();
                int i5 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            listEmptyList = list;
        }
        boolean z4 = false;
        if ((i & 16) != 0) {
            int i6 = onExtraCallback + 7;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 32) != 0) {
            int i8 = 2 % 2;
        } else {
            z4 = z2;
        }
        this(jAudioAttributesImplApi21Parcelizer, j5, j4, listEmptyList, z3, z4);
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j = this.totalLoadingMilliSeconds;
        int i4 = i2 + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.queueMilliSeconds;
        int i5 = i2 + 99;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.elapsedMilliSeconds;
        if (i4 == 0) {
            int i5 = 26 / 0;
        }
        int i6 = i3 + 111;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 31 / 0;
        }
        return j;
    }

    public final List<LoadingMessage> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        List<LoadingMessage> list = this.loadingMessages;
        int i5 = i3 + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return list;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.isMidnightReserved;
        int i5 = i3 + 47;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.skipLoading;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer asBinder() {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (KSerializer) onNavigationEvent(iIAuthTabCallback2, iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1151629594, new Object[0], 1151629595, iIAuthTabCallback3);
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(LoanComparisonLoadingConfig loanComparisonLoadingConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        onNavigationEvent(iIAuthTabCallback2, iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1258125018, new Object[]{loanComparisonLoadingConfig, vylVar, serialDescriptor}, -1258125018, iIAuthTabCallback3);
    }
}
