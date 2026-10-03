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
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocOpenOnceLinkReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocOpenOnceLinkReq {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDocOpenOnceLinkReq$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = EDocOpenOnceLinkReq.onExtraCallback();
            int i4 = onExtraCallback + 101;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
            return kSerializerOnExtraCallback;
        }
    })};
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final List<Long> docIds;

    /* JADX WARN: Illegal instructions before constructor call */
    public EDocOpenOnceLinkReq() {
        List list = null;
        this(list, 1, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(oty1.onExtraCallback);
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (obj instanceof EDocOpenOnceLinkReq) {
            return Intrinsics.areEqual(this.docIds, ((EDocOpenOnceLinkReq) obj).docIds);
        }
        int i3 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        List<Long> list = this.docIds;
        if (list != null) {
            return list.hashCode();
        }
        int i5 = i3 + 7;
        int i6 = i5 % 128;
        onExtraCallbackWithResult = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 103;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocOpenOnceLinkReq(docIds=" + this.docIds + ")";
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocOpenOnceLinkReq> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            EDocOpenOnceLinkReq$.serializer serializerVar = EDocOpenOnceLinkReq$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 63;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 15;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ EDocOpenOnceLinkReq(int i, List list, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) != 0) {
            this.docIds = list;
            int i2 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.docIds = null;
        int i3 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public EDocOpenOnceLinkReq(@Nullable List<Long> list) {
        this.docIds = list;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(EDocOpenOnceLinkReq eDocOpenOnceLinkReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onExtraCallbackWithResult + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (eDocOpenOnceLinkReq.docIds == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), eDocOpenOnceLinkReq.docIds);
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 25;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            lazyArr = $childSerializers;
            int i4 = 85 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i2 + 23;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocOpenOnceLinkReq(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 61;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 11;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            list = null;
        }
        this(list);
    }
}
