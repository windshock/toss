package viva.republica.toss.network.model.transfer.periodic;

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
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferListResponse {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final List<PeriodicTransferModel> items;
    private final TossBankSummary tossBank;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                PeriodicTransferListResponse.onExtraCallbackWithResult();
                throw null;
            }
            KSerializer kSerializerOnExtraCallbackWithResult = PeriodicTransferListResponse.onExtraCallbackWithResult();
            int i3 = onExtraCallbackWithResult + 97;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            throw null;
        }
    }), null};

    /* JADX WARN: Multi-variable type inference failed */
    public PeriodicTransferListResponse() {
        this((List) null, (TossBankSummary) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(PeriodicTransferModel$$serializer.INSTANCE);
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodicTransferListResponse)) {
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PeriodicTransferListResponse periodicTransferListResponse = (PeriodicTransferListResponse) obj;
        if (!(!Intrinsics.areEqual(this.items, periodicTransferListResponse.items))) {
            return Intrinsics.areEqual(this.tossBank, periodicTransferListResponse.tossBank);
        }
        int i4 = onNavigationEvent + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            this.items.hashCode();
            throw null;
        }
        int iHashCode2 = this.items.hashCode();
        TossBankSummary tossBankSummary = this.tossBank;
        if (tossBankSummary == null) {
            int i3 = onNavigationEvent + 119;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = tossBankSummary.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PeriodicTransferListResponse(items=" + this.items + ", tossBank=" + this.tossBank + ")";
        int i2 = onExtraCallback + 83;
        onNavigationEvent = i2 % 128;
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

        public final KSerializer<PeriodicTransferListResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                PeriodicTransferListResponse$.serializer serializerVar = PeriodicTransferListResponse$.serializer.INSTANCE;
                throw null;
            }
            PeriodicTransferListResponse$.serializer serializerVar2 = PeriodicTransferListResponse$.serializer.INSTANCE;
            int i3 = onNavigationEvent + 121;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ PeriodicTransferListResponse(int i, List list, TossBankSummary tossBankSummary, okycx okycxVar) {
        if ((i & 1) == 0) {
            list = CollectionsKt.emptyList();
            int i2 = onNavigationEvent + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 4;
            } else {
                int i4 = 2 % 2;
            }
        }
        this.items = list;
        if ((i & 2) != 0) {
            this.tossBank = tossBankSummary;
            return;
        }
        int i5 = onExtraCallback + 107;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.tossBank = null;
    }

    public PeriodicTransferListResponse(@NotNull List<PeriodicTransferModel> list, @Nullable TossBankSummary tossBankSummary) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
        this.tossBank = tossBankSummary;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse.onExtraCallback
            int r1 = r1 + 75
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse.onNavigationEvent = r2
            int r1 = r1 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse.$childSerializers
            r2 = 0
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L21
            java.util.List<viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel> r3 = r5.items
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L2e
        L21:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel> r3 = r5.items
            r6.onNavigationEvent(r7, r2, r1, r3)
        L2e:
            r1 = 1
            boolean r2 = r6.onWarmupCompleted(r7, r1)
            if (r2 != 0) goto L42
            int r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse.onExtraCallback
            int r2 = r2 + 93
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse.onNavigationEvent = r3
            int r2 = r2 % r0
            viva.republica.toss.network.model.transfer.periodic.TossBankSummary r2 = r5.tossBank
            if (r2 == 0) goto L56
        L42:
            viva.republica.toss.network.model.transfer.periodic.TossBankSummary$$serializer r2 = viva.republica.toss.network.model.transfer.periodic.TossBankSummary$.serializer.INSTANCE
            viva.republica.toss.network.model.transfer.periodic.TossBankSummary r5 = r5.tossBank
            r6.onExtraCallbackWithResult(r7, r1, r2, r5)
            int r5 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse.onNavigationEvent
            int r5 = r5 + 61
            int r6 = r5 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse.onExtraCallback = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L56
            r5 = 5
            int r5 = r5 % r0
        L56:
            int r5 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse.onExtraCallback
            int r5 = r5 + 31
            int r6 = r5 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse.onNavigationEvent = r6
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse.onExtraCallback(viva.republica.toss.network.model.transfer.periodic.PeriodicTransferListResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            lazyArr = $childSerializers;
            int i4 = 87 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i2 + 29;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PeriodicTransferListResponse(List list, TossBankSummary tossBankSummary, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 61;
            int i5 = i4 % 128;
            onNavigationEvent = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 113;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            tossBankSummary = null;
        }
        this(list, tossBankSummary);
    }

    public final List<PeriodicTransferModel> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<PeriodicTransferModel> list = this.items;
        int i5 = i3 + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TossBankSummary IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tossBank;
        }
        throw null;
    }
}
