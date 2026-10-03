package viva.republica.toss.network.model.loan;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.DERSet;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanRefinancingIntro$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanRefinancingIntro {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final List<LoanPartnerCategory> categories;
    private LoanDisclaimer disclaimer;
    private final String endDateTime;
    private final long openedCompaniesCount;
    private final String startDateTime;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanRefinancingIntro$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                LoanRefinancingIntro.onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = LoanRefinancingIntro.onExtraCallbackWithResult();
            int i3 = onExtraCallback + 23;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }
    }), null, null, null, null};

    public LoanRefinancingIntro() {
        this((List) null, 0L, (String) null, (String) null, (LoanDisclaimer) null, 31, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanPartnerCategory$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return kSerializerIAuthTabCallbackDefault;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoanRefinancingIntro) {
            LoanRefinancingIntro loanRefinancingIntro = (LoanRefinancingIntro) obj;
            if (Intrinsics.areEqual(this.categories, loanRefinancingIntro.categories)) {
                if (this.openedCompaniesCount != loanRefinancingIntro.openedCompaniesCount) {
                    int i2 = onExtraCallbackWithResult + 117;
                    onExtraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.startDateTime, loanRefinancingIntro.startDateTime)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.endDateTime, loanRefinancingIntro.endDateTime)) {
                    return Intrinsics.areEqual(this.disclaimer, loanRefinancingIntro.disclaimer);
                }
                int i4 = onExtraCallback + 35;
                int i5 = i4 % 128;
                onExtraCallbackWithResult = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 25;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i8 = onExtraCallbackWithResult + 15;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r1 r3 r4
      0x0032: PHI (r1v16 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
      0x0030: PHI (r1v6 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanRefinancingIntro.onExtraCallback
            int r1 = r1 + 55
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingIntro.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L20
            java.util.List<viva.republica.toss.network.model.loan.LoanPartnerCategory> r1 = r8.categories
            int r1 = r1.hashCode()
            long r3 = r8.openedCompaniesCount
            int r3 = java.lang.Long.hashCode(r3)
            java.lang.String r4 = r8.startDateTime
            if (r4 != 0) goto L32
            goto L30
        L20:
            java.util.List<viva.republica.toss.network.model.loan.LoanPartnerCategory> r1 = r8.categories
            int r1 = r1.hashCode()
            long r3 = r8.openedCompaniesCount
            int r3 = java.lang.Long.hashCode(r3)
            java.lang.String r4 = r8.startDateTime
            if (r4 != 0) goto L32
        L30:
            r4 = r2
            goto L36
        L32:
            int r4 = r4.hashCode()
        L36:
            java.lang.String r5 = r8.endDateTime
            if (r5 != 0) goto L45
            int r5 = viva.republica.toss.network.model.loan.LoanRefinancingIntro.onExtraCallbackWithResult
            int r5 = r5 + 25
            int r6 = r5 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingIntro.onExtraCallback = r6
            int r5 = r5 % r0
            r5 = r2
            goto L52
        L45:
            int r5 = r5.hashCode()
            int r6 = viva.republica.toss.network.model.loan.LoanRefinancingIntro.onExtraCallback
            int r6 = r6 + 21
            int r7 = r6 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingIntro.onExtraCallbackWithResult = r7
            int r6 = r6 % r0
        L52:
            viva.republica.toss.network.model.loan.LoanDisclaimer r0 = r8.disclaimer
            if (r0 == 0) goto L5a
            int r2 = r0.hashCode()
        L5a:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanRefinancingIntro.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanRefinancingIntro(categories=" + this.categories + ", openedCompaniesCount=" + this.openedCompaniesCount + ", startDateTime=" + this.startDateTime + ", endDateTime=" + this.endDateTime + ", disclaimer=" + this.disclaimer + ")";
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
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

        public final KSerializer<LoanRefinancingIntro> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            LoanRefinancingIntro$.serializer serializerVar = LoanRefinancingIntro$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 90 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = IAuthTabCallback + 75;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ LoanRefinancingIntro(int i, List list, long j, String str, String str2, LoanDisclaimer loanDisclaimer, okycx okycxVar) {
        this.categories = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        this.openedCompaniesCount = (i & 2) == 0 ? DERSet.onExtraCallback.MediaDescriptionCompat() : j;
        if ((i & 4) == 0) {
            int i2 = onExtraCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.startDateTime = null;
            if (i3 == 0) {
                int i4 = 9 / 0;
            }
        } else {
            this.startDateTime = str;
            int i5 = onExtraCallbackWithResult + 7;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.endDateTime = null;
        } else {
            this.endDateTime = str2;
        }
        if ((i & 16) == 0) {
            this.disclaimer = null;
        } else {
            this.disclaimer = loanDisclaimer;
        }
    }

    public LoanRefinancingIntro(@NotNull List<LoanPartnerCategory> list, long j, @Nullable String str, @Nullable String str2, @Nullable LoanDisclaimer loanDisclaimer) {
        Intrinsics.checkNotNullParameter(list, "");
        this.categories = list;
        this.openedCompaniesCount = j;
        this.startDateTime = str;
        this.endDateTime = str2;
        this.disclaimer = loanDisclaimer;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 15;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 7;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanRefinancingIntro r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanRefinancingIntro.$childSerializers
            r2 = 0
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            if (r3 != 0) goto L21
            int r3 = viva.republica.toss.network.model.loan.LoanRefinancingIntro.onExtraCallbackWithResult
            int r3 = r3 + 53
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingIntro.onExtraCallback = r4
            int r3 = r3 % r0
            java.util.List<viva.republica.toss.network.model.loan.LoanPartnerCategory> r3 = r6.categories
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L2e
        L21:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.loan.LoanPartnerCategory> r3 = r6.categories
            r7.onNavigationEvent(r8, r2, r1, r3)
        L2e:
            r1 = 1
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            if (r2 != 0) goto L4b
            int r2 = viva.republica.toss.network.model.loan.LoanRefinancingIntro.onExtraCallback
            int r2 = r2 + 83
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanRefinancingIntro.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            long r2 = r6.openedCompaniesCount
            o.DERSet r4 = o.DERSet.onExtraCallback
            int r4 = r4.MediaDescriptionCompat()
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L50
        L4b:
            long r2 = r6.openedCompaniesCount
            r7.onExtraCallback(r8, r1, r2)
        L50:
            boolean r2 = r7.onWarmupCompleted(r8, r0)
            if (r2 != 0) goto L5a
            java.lang.String r2 = r6.startDateTime
            if (r2 == 0) goto L61
        L5a:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r6.startDateTime
            r7.onExtraCallbackWithResult(r8, r0, r2, r3)
        L61:
            r0 = 3
            boolean r2 = r7.onWarmupCompleted(r8, r0)
            if (r2 != 0) goto L6c
            java.lang.String r2 = r6.endDateTime
            if (r2 == 0) goto L73
        L6c:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r6.endDateTime
            r7.onExtraCallbackWithResult(r8, r0, r2, r3)
        L73:
            r0 = 4
            boolean r2 = r7.onWarmupCompleted(r8, r0)
            r2 = r2 ^ r1
            if (r2 == r1) goto L7c
            goto L80
        L7c:
            viva.republica.toss.network.model.loan.LoanDisclaimer r1 = r6.disclaimer
            if (r1 == 0) goto L87
        L80:
            viva.republica.toss.network.model.loan.LoanDisclaimer$$serializer r1 = viva.republica.toss.network.model.loan.LoanDisclaimer$.serializer.INSTANCE
            viva.republica.toss.network.model.loan.LoanDisclaimer r6 = r6.disclaimer
            r7.onExtraCallbackWithResult(r8, r0, r1, r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanRefinancingIntro.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanRefinancingIntro, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanRefinancingIntro(List list, long j, String str, String str2, LoanDisclaimer loanDisclaimer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
        }
        long jMediaDescriptionCompat = (i & 2) != 0 ? DERSet.onExtraCallback.MediaDescriptionCompat() : j;
        if ((i & 4) != 0) {
            int i4 = onExtraCallback + 121;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str3 = null;
        } else {
            str3 = str;
        }
        this(list, jMediaDescriptionCompat, str3, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : loanDisclaimer);
    }

    public final List<LoanPartnerCategory> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        List<LoanPartnerCategory> list = this.categories;
        int i5 = i2 + 9;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.startDateTime;
        int i4 = i3 + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.endDateTime;
            int i4 = 62 / 0;
        } else {
            str = this.endDateTime;
        }
        int i5 = i3 + 69;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
