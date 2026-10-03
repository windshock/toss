package viva.republica.toss.network.model.teens;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.DebugCorePackageExternalSyntheticLambda2;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.TeensCardTermsCheckResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TeensCardTermsCheckResponse {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final DebugCorePackageExternalSyntheticLambda2 status;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.teens.TeensCardTermsCheckResponse$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnNavigationEvent = TeensCardTermsCheckResponse.onNavigationEvent();
            int i4 = onWarmupCompleted + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnNavigationEvent;
        }
    })};

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnWarmupCompleted = onWarmupCompleted();
        int i4 = onNavigationEvent + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.teens.TeensCardTermsCheckStatus", DebugCorePackageExternalSyntheticLambda2.values());
        int i4 = onNavigationEvent + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof TeensCardTermsCheckResponse)) {
            int i4 = onExtraCallback + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.status != ((TeensCardTermsCheckResponse) obj).status) {
            int i6 = onExtraCallback;
            int i7 = i6 + 65;
            onNavigationEvent = i7 % 128;
            z = i7 % 2 != 0;
            int i8 = i6 + 123;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        return z;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.status.hashCode();
            int i3 = 64 / 0;
        } else {
            iHashCode = this.status.hashCode();
        }
        int i4 = onNavigationEvent + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardTermsCheckResponse(status=" + this.status + ")";
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TeensCardTermsCheckResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TeensCardTermsCheckResponse$.serializer serializerVar = TeensCardTermsCheckResponse$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ TeensCardTermsCheckResponse(int i, DebugCorePackageExternalSyntheticLambda2 debugCorePackageExternalSyntheticLambda2, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 89;
            onNavigationEvent = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 1, (i2 % 2 != 0 ? TeensCardTermsCheckResponse$.serializer.INSTANCE : TeensCardTermsCheckResponse$.serializer.INSTANCE).getDescriptor());
            int i3 = 2 % 2;
        }
        this.status = debugCorePackageExternalSyntheticLambda2;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(TeensCardTermsCheckResponse teensCardTermsCheckResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        vylVar.onNavigationEvent(serialDescriptor, 0, i2 % 2 != 0 ? (py) $childSerializers[0].getValue() : (py) $childSerializers[0].getValue(), teensCardTermsCheckResponse.status);
    }
}
