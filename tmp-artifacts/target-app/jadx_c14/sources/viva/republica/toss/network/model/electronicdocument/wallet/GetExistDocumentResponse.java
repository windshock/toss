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
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.GetExistDocumentResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetExistDocumentResponse {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<ExistDocument> existDocuments;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.GetExistDocumentResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = GetExistDocumentResponse.onExtraCallbackWithResult();
            int i4 = onNavigationEvent + 79;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    })};

    private static final /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(ExistDocument$$serializer.INSTANCE);
        int i2 = onExtraCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallback = onExtraCallback();
        int i4 = onExtraCallbackWithResult + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetExistDocumentResponse)) {
            int i5 = i2 + 15;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.existDocuments, ((GetExistDocumentResponse) obj).existDocuments)) {
            return true;
        }
        int i7 = onExtraCallback + 31;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.existDocuments.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.existDocuments.hashCode();
        int i3 = onExtraCallbackWithResult + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetExistDocumentResponse(existDocuments=" + this.existDocuments + ")";
        int i2 = onExtraCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 51 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetExistDocumentResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            GetExistDocumentResponse$.serializer serializerVar = GetExistDocumentResponse$.serializer.INSTANCE;
            int i4 = onExtraCallback + 73;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 83 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onNavigationEvent + 97;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ GetExistDocumentResponse(int i, List list, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 1, (i2 % 2 != 0 ? GetExistDocumentResponse$.serializer.INSTANCE : GetExistDocumentResponse$.serializer.INSTANCE).getDescriptor());
            int i3 = onExtraCallback + 35;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.existDocuments = list;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(GetExistDocumentResponse getExistDocumentResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, (py) $childSerializers[0].getValue(), getExistDocumentResponse.existDocuments);
        int i4 = onExtraCallbackWithResult + 115;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    public final List<ExistDocument> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<ExistDocument> list = this.existDocuments;
        int i5 = i3 + 37;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }
}
