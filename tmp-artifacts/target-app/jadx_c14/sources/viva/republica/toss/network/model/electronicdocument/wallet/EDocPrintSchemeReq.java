package viva.republica.toss.network.model.electronicdocument.wallet;

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
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocPrintSchemeReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocPrintSchemeReq {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final List<Long> docIds;
    private final Long placeId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDocPrintSchemeReq$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = EDocPrintSchemeReq.onExtraCallbackWithResult();
            int i4 = onExtraCallback + 117;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }
    }), null};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(oty1.onExtraCallback);
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onNavigationEvent + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerIAuthTabCallback;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 89;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof EDocPrintSchemeReq)) {
            int i3 = IAuthTabCallback + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        EDocPrintSchemeReq eDocPrintSchemeReq = (EDocPrintSchemeReq) obj;
        if (!Intrinsics.areEqual(this.docIds, eDocPrintSchemeReq.docIds)) {
            return false;
        }
        if (Intrinsics.areEqual(this.placeId, eDocPrintSchemeReq.placeId)) {
            return true;
        }
        int i5 = IAuthTabCallback + 65;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            this.docIds.hashCode();
            throw null;
        }
        int iHashCode = this.docIds.hashCode();
        Long l = this.placeId;
        if (l == null) {
            i = 0;
        } else {
            int iHashCode2 = l.hashCode();
            int i4 = IAuthTabCallback + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocPrintSchemeReq(docIds=" + this.docIds + ", placeId=" + this.placeId + ")";
        int i2 = IAuthTabCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocPrintSchemeReq> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EDocPrintSchemeReq$.serializer serializerVar = EDocPrintSchemeReq$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onWarmupCompleted + 61;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ EDocPrintSchemeReq(int i, List list, Long l, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onNavigationEvent + 103;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = EDocPrintSchemeReq$.serializer.INSTANCE.getDescriptor();
                i2 = 5;
            } else {
                descriptor = EDocPrintSchemeReq$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.docIds = list;
        this.placeId = l;
    }

    public EDocPrintSchemeReq(@NotNull List<Long> list, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(list, "");
        this.docIds = list;
        this.placeId = l;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 77;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(EDocPrintSchemeReq eDocPrintSchemeReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        oty1 oty1Var;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), eDocPrintSchemeReq.docIds);
            oty1Var = oty1.onExtraCallback;
        } else {
            vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), eDocPrintSchemeReq.docIds);
            oty1Var = oty1.onExtraCallback;
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, oty1Var, eDocPrintSchemeReq.placeId);
        int i3 = IAuthTabCallback + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
