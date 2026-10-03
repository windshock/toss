package viva.republica.toss.network.model.loan;

import im.toss.observability.instrumentation.memory.PssReader$;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
import viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanComparisonLoadingGroup {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final List<LoanComparisonLoadingItem> failedItems;
    private final List<LoanComparisonLoadingItem> loadingItems;
    private final List<LoanComparisonLoadingItem> preScreenDoneItems;

    public LoanComparisonLoadingGroup() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanComparisonLoadingItem$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanComparisonLoadingItem$$serializer.INSTANCE);
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer access000() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanComparisonLoadingItem$$serializer.INSTANCE);
        int i2 = onExtraCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            access000();
            throw null;
        }
        KSerializer kSerializerAccess000 = access000();
        int i3 = onExtraCallback + 9;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerAccess000;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer = (KSerializer) onWarmupCompleted(new Object[0], PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1718237283, -1718237282, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
        int i4 = onExtraCallbackWithResult + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializer;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i4) | i7 | i);
        int i9 = (~i) | i7;
        int i10 = i8 | (~(i9 | i4)) | (~(i3 | i4 | i));
        int i11 = ~i9;
        int i12 = (~(i | i3)) | i4 | i11;
        int i13 = (~(i7 | i4)) | i11;
        int i14 = i3 + i4 + i5 + (933655473 * i2) + ((-1037598838) * i6);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i3) - 925892608) + (470833381 * i4) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i5) + ((-1691877376) * i2) + ((-393216000) * i6) + ((-1633878016) * i15);
        int i17 = ((i3 * (-727610197)) - 1081761860) + (i4 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i5 * (-727609241)) + (i2 * 1532828727) + (i6 * (-747900794)) + (i15 * 556466176);
        return i16 + ((i17 * i17) * (-1911357440)) != 1 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = onExtraCallbackWithResult + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallbackStub;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 37;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof LoanComparisonLoadingGroup)) {
            return false;
        }
        LoanComparisonLoadingGroup loanComparisonLoadingGroup = (LoanComparisonLoadingGroup) obj;
        if (!Intrinsics.areEqual(this.preScreenDoneItems, loanComparisonLoadingGroup.preScreenDoneItems) || !Intrinsics.areEqual(this.loadingItems, loanComparisonLoadingGroup.loadingItems)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.failedItems, loanComparisonLoadingGroup.failedItems))) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 65;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.preScreenDoneItems.hashCode();
        return i3 != 0 ? (((iHashCode >> 33) * this.loadingItems.hashCode()) * 59) << this.failedItems.hashCode() : (((iHashCode * 31) + this.loadingItems.hashCode()) * 31) + this.failedItems.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonLoadingGroup(preScreenDoneItems=" + this.preScreenDoneItems + ", loadingItems=" + this.loadingItems + ", failedItems=" + this.failedItems + ")";
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanComparisonLoadingGroup> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            LoanComparisonLoadingGroup$.serializer serializerVar = LoanComparisonLoadingGroup$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 28 / 0;
            }
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 57;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = LoanComparisonLoadingGroup.onWarmupCompleted();
                int i4 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnWarmupCompleted;
                }
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                onExtraCallbackWithResult = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    LoanComparisonLoadingGroup.onNavigationEvent();
                    throw null;
                }
                KSerializer kSerializerOnNavigationEvent = LoanComparisonLoadingGroup.onNavigationEvent();
                int i3 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return kSerializerOnNavigationEvent;
                }
                obj.hashCode();
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 33;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return LoanComparisonLoadingGroup.onExtraCallbackWithResult();
                }
                LoanComparisonLoadingGroup.onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        })};
        int i = IAuthTabCallback + 15;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ LoanComparisonLoadingGroup(int i, List list, List list2, List list3, okycx okycxVar) {
        this.preScreenDoneItems = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        Object obj = null;
        if ((i & 2) == 0) {
            int i2 = onExtraCallbackWithResult + 91;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.loadingItems = CollectionsKt.emptyList();
                throw null;
            }
            this.loadingItems = CollectionsKt.emptyList();
        } else {
            this.loadingItems = list2;
            int i3 = onExtraCallbackWithResult + 111;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        }
        if ((i & 4) != 0) {
            this.failedItems = list3;
            int i5 = onExtraCallbackWithResult + 105;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i6 = onExtraCallback + 1;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            this.failedItems = CollectionsKt.emptyList();
        } else {
            this.failedItems = CollectionsKt.emptyList();
            int i7 = 47 / 0;
        }
    }

    public LoanComparisonLoadingGroup(@NotNull List<LoanComparisonLoadingItem> list, @NotNull List<LoanComparisonLoadingItem> list2, @NotNull List<LoanComparisonLoadingItem> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.preScreenDoneItems = list;
        this.loadingItems = list2;
        this.failedItems = list3;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 103;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup.onExtraCallbackWithResult
            int r1 = r1 + 3
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup.onExtraCallback = r2
            int r1 = r1 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup.$childSerializers
            r2 = 0
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L21
            java.util.List<viva.republica.toss.network.model.loan.LoanComparisonLoadingItem> r3 = r5.preScreenDoneItems
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L2e
        L21:
            r3 = r1[r2]
            java.lang.Object r3 = r3.getValue()
            o.py r3 = (o.py) r3
            java.util.List<viva.republica.toss.network.model.loan.LoanComparisonLoadingItem> r4 = r5.preScreenDoneItems
            r6.onNavigationEvent(r7, r2, r3, r4)
        L2e:
            r2 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L4a
            int r3 = viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup.onExtraCallback
            int r3 = r3 + 71
            int r4 = r3 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup.onExtraCallbackWithResult = r4
            int r3 = r3 % r0
            java.util.List<viva.republica.toss.network.model.loan.LoanComparisonLoadingItem> r3 = r5.loadingItems
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == r2) goto L60
        L4a:
            r3 = r1[r2]
            java.lang.Object r3 = r3.getValue()
            o.py r3 = (o.py) r3
            java.util.List<viva.republica.toss.network.model.loan.LoanComparisonLoadingItem> r4 = r5.loadingItems
            r6.onNavigationEvent(r7, r2, r3, r4)
            int r2 = viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup.onExtraCallbackWithResult
            int r2 = r2 + 89
            int r3 = r2 % 128
            viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup.onExtraCallback = r3
            int r2 = r2 % r0
        L60:
            boolean r2 = r6.onWarmupCompleted(r7, r0)
            if (r2 != 0) goto L72
            java.util.List<viva.republica.toss.network.model.loan.LoanComparisonLoadingItem> r2 = r5.failedItems
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L7f
        L72:
            r1 = r1[r0]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.loan.LoanComparisonLoadingItem> r5 = r5.failedItems
            r6.onNavigationEvent(r7, r0, r1, r5)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.LoanComparisonLoadingGroup, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanComparisonLoadingGroup(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
            int i2 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 57;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            list2 = CollectionsKt.emptyList();
            int i5 = onExtraCallbackWithResult + 93;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        }
        this(list, list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3);
    }

    public final List<LoanComparisonLoadingItem> onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.preScreenDoneItems;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<LoanComparisonLoadingItem> asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.loadingItems;
        }
        throw null;
    }

    public final List<LoanComparisonLoadingItem> asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 61;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        List<LoanComparisonLoadingItem> list = this.failedItems;
        int i5 = i2 + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        List<LoanComparisonLoadingItem> list = ((LoanComparisonLoadingGroup) objArr[0]).loadingItems;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = onExtraCallbackWithResult + 1;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                hashSet.add(((LoanComparisonLoadingItem) it.next()).onNavigationEvent());
                throw null;
            }
            Object next = it.next();
            if (hashSet.add(((LoanComparisonLoadingItem) next).onNavigationEvent())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        return (KSerializer) onWarmupCompleted(new Object[0], PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1718237283, -1718237282, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }

    public final List<LoanComparisonLoadingItem> onExtraCallback() {
        return (List) onWarmupCompleted(new Object[]{this}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 769646175, -769646175, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted());
    }
}
