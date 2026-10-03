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
import viva.republica.toss.network.model.electronicdocument.wallet.GetExistDocumentRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetExistDocumentRequest {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final List<Long> docCodes;
    private final boolean includeAwait;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.GetExistDocumentRequest$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = GetExistDocumentRequest.IAuthTabCallback();
            int i4 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 74 / 0;
            }
            return kSerializerIAuthTabCallback;
        }
    }), null};

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return kSerializerOnWarmupCompleted;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(oty1.onExtraCallback);
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
        return checkcanopenlandingpage;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof GetExistDocumentRequest)) {
            return false;
        }
        GetExistDocumentRequest getExistDocumentRequest = (GetExistDocumentRequest) obj;
        if (!Intrinsics.areEqual(this.docCodes, getExistDocumentRequest.docCodes)) {
            return false;
        }
        if (this.includeAwait == getExistDocumentRequest.includeAwait) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.docCodes.hashCode() >>> 53) % Boolean.hashCode(this.includeAwait) : (this.docCodes.hashCode() * 31) + Boolean.hashCode(this.includeAwait);
        int i3 = onExtraCallbackWithResult + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetExistDocumentRequest(docCodes=" + this.docCodes + ", includeAwait=" + this.includeAwait + ")";
        int i2 = onExtraCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetExistDocumentRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            GetExistDocumentRequest$.serializer serializerVar = GetExistDocumentRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 97;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 79 / 0;
        }
    }

    public /* synthetic */ GetExistDocumentRequest(int i, List list, boolean z, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onExtraCallback + 53;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = GetExistDocumentRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 4;
            } else {
                descriptor = GetExistDocumentRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallbackWithResult + 71;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.docCodes = list;
        this.includeAwait = z;
    }

    public GetExistDocumentRequest(@NotNull List<Long> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.docCodes = list;
        this.includeAwait = z;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 85;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(GetExistDocumentRequest getExistDocumentRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), getExistDocumentRequest.docCodes);
        vylVar.onNavigationEvent(serialDescriptor, 1, getExistDocumentRequest.includeAwait);
        int i4 = onExtraCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
