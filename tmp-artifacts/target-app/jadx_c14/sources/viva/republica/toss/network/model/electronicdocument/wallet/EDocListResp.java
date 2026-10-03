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
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocListResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocListResp {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDocListResp$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                EDocListResp.onExtraCallback();
                throw null;
            }
            KSerializer kSerializerOnExtraCallback = EDocListResp.onExtraCallback();
            int i3 = onWarmupCompleted + 33;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 90 / 0;
            }
            return kSerializerOnExtraCallback;
        }
    })};
    public static final Companion Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final int docCnt;
    private final List<EDoc> previews;

    /* JADX WARN: Illegal instructions before constructor call */
    public EDocListResp() {
        List list = null;
        this(0, list, 3, (DefaultConstructorMarker) list);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(EDoc$$serializer.INSTANCE);
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDocListResp)) {
            int i5 = i2 + 71;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        EDocListResp eDocListResp = (EDocListResp) obj;
        if (this.docCnt != eDocListResp.docCnt) {
            return false;
        }
        if (Intrinsics.areEqual(this.previews, eDocListResp.previews)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Integer.hashCode(this.docCnt);
        List<EDoc> list = this.previews;
        if (list == null) {
            int i4 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i4 % 128;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = list.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocListResp(docCnt=" + this.docCnt + ", previews=" + this.previews + ")";
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocListResp> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            EDocListResp$.serializer serializerVar = EDocListResp$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 77;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ EDocListResp(int i, int i2, List list, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i3 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            i2 = 0;
        }
        this.docCnt = i2;
        if ((i & 2) != 0) {
            this.previews = list;
            return;
        }
        int i6 = onNavigationEvent;
        int i7 = i6 + 3;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        this.previews = null;
        if (i8 != 0) {
            throw null;
        }
        int i9 = i6 + 105;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
    }

    public EDocListResp(int i, @Nullable List<EDoc> list) {
        this.docCnt = i;
        this.previews = list;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(EDocListResp eDocListResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || eDocListResp.docCnt != 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, eDocListResp.docCnt);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (eDocListResp.previews == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, (py) lazyArr[1].getValue(), eDocListResp.previews);
        int i4 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 19;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocListResp(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            i = 0;
        }
        if ((i2 & 2) != 0) {
            int i6 = onExtraCallbackWithResult;
            int i7 = i6 + 43;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 45 / 0;
            }
            int i9 = i6 + 105;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            list = null;
        }
        this(i, list);
    }

    public final int onExtraCallbackWithResult() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.docCnt;
            int i5 = 0 / 0;
        } else {
            i = this.docCnt;
        }
        int i6 = i3 + 21;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 0;
        }
        return i;
    }

    public final List<EDoc> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.previews;
        }
        throw null;
    }
}
