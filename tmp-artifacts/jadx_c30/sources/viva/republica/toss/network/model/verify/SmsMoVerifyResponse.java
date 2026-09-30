package viva.republica.toss.network.model.verify;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.PhotoBrowseView;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class SmsMoVerifyResponse {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.SmsMoVerifyResponse$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnWarmupCompleted = SmsMoVerifyResponse.onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return kSerializerOnWarmupCompleted;
            }
            throw null;
        }
    }), null};
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final PhotoBrowseView status;
    private final String statusTs;
    private final long verifyId;

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.verify.model.CertifyStatus", PhotoBrowseView.values());
        int i4 = onWarmupCompleted + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallback + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SmsMoVerifyResponse)) {
            return false;
        }
        SmsMoVerifyResponse smsMoVerifyResponse = (SmsMoVerifyResponse) obj;
        if (this.verifyId != smsMoVerifyResponse.verifyId || this.status != smsMoVerifyResponse.status) {
            return false;
        }
        if (Intrinsics.areEqual(this.statusTs, smsMoVerifyResponse.statusTs)) {
            return true;
        }
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Long.hashCode(this.verifyId) * 31) + this.status.hashCode()) * 31) + this.statusTs.hashCode();
        int i4 = onExtraCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SmsMoVerifyResponse(verifyId=" + this.verifyId + ", status=" + this.status + ", statusTs=" + this.statusTs + ")";
        int i2 = onExtraCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SmsMoVerifyResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SmsMoVerifyResponse$$serializer smsMoVerifyResponse$$serializer = SmsMoVerifyResponse$$serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 85 / 0;
            }
            return smsMoVerifyResponse$$serializer;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onNavigationEvent + 27;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ SmsMoVerifyResponse(int i, long j, PhotoBrowseView photoBrowseView, String str, okycx okycxVar) {
        if (5 != (i & 5)) {
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 5, SmsMoVerifyResponse$$serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.verifyId = j;
        if ((i & 2) == 0) {
            photoBrowseView = PhotoBrowseView.FAIL;
            int i6 = 2 % 2;
        }
        this.status = photoBrowseView;
        this.statusTs = str;
        int i7 = onWarmupCompleted + 43;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(SmsMoVerifyResponse smsMoVerifyResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, smsMoVerifyResponse.verifyId);
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1))) {
            vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), smsMoVerifyResponse.status);
        } else {
            int i4 = onExtraCallback + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                if (smsMoVerifyResponse.status != PhotoBrowseView.FAIL) {
                }
            } else {
                PhotoBrowseView photoBrowseView = smsMoVerifyResponse.status;
                PhotoBrowseView photoBrowseView2 = PhotoBrowseView.FAIL;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 2, smsMoVerifyResponse.statusTs);
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return lazyArr;
    }
}
