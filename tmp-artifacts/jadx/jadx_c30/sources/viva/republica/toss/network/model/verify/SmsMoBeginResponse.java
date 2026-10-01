package viva.republica.toss.network.model.verify;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class SmsMoBeginResponse {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String message;
    private final String targetPhone;
    private final List<String> targetPhones;
    private final long verifyId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.SmsMoBeginResponse$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return SmsMoBeginResponse.onWarmupCompleted();
            }
            SmsMoBeginResponse.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i3 = onExtraCallback + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 119;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof SmsMoBeginResponse)) {
            int i7 = onExtraCallback + 77;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        SmsMoBeginResponse smsMoBeginResponse = (SmsMoBeginResponse) obj;
        if (!Intrinsics.areEqual(this.message, smsMoBeginResponse.message)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.targetPhone, smsMoBeginResponse.targetPhone)) {
            int i9 = onExtraCallbackWithResult + 45;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.targetPhones, smsMoBeginResponse.targetPhones)) {
            int i11 = onExtraCallbackWithResult + 53;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (this.verifyId == smsMoBeginResponse.verifyId) {
            return true;
        }
        int i13 = onExtraCallback + 57;
        onExtraCallbackWithResult = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((((this.message.hashCode() * 8) >> this.targetPhone.hashCode()) - 101) << this.targetPhones.hashCode()) << 33) / Long.hashCode(this.verifyId) : (((((this.message.hashCode() * 31) + this.targetPhone.hashCode()) * 31) + this.targetPhones.hashCode()) * 31) + Long.hashCode(this.verifyId);
        int i3 = onExtraCallback + 83;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SmsMoBeginResponse(message=" + this.message + ", targetPhone=" + this.targetPhone + ", targetPhones=" + this.targetPhones + ", verifyId=" + this.verifyId + ")";
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SmsMoBeginResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                SmsMoBeginResponse$$serializer smsMoBeginResponse$$serializer = SmsMoBeginResponse$$serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SmsMoBeginResponse$$serializer smsMoBeginResponse$$serializer2 = SmsMoBeginResponse$$serializer.INSTANCE;
            int i3 = onExtraCallbackWithResult + 115;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return smsMoBeginResponse$$serializer2;
        }
    }

    static {
        int i = onWarmupCompleted + 21;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
    }

    public /* synthetic */ SmsMoBeginResponse(int i, String str, String str2, List list, long j, okycx okycxVar) {
        if (11 != (i & 11)) {
            htf31.onExtraCallbackWithResult(i, 11, SmsMoBeginResponse$$serializer.INSTANCE.getDescriptor());
            int i2 = onExtraCallbackWithResult + 63;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this.message = str;
        this.targetPhone = str2;
        if ((i & 4) == 0) {
            this.targetPhones = CollectionsKt.emptyList();
            int i4 = onExtraCallback + 125;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } else {
            this.targetPhones = list;
        }
        this.verifyId = j;
        int i6 = onExtraCallback + 107;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 92 / 0;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(SmsMoBeginResponse smsMoBeginResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, smsMoBeginResponse.message);
        vylVar.onExtraCallback(serialDescriptor, 1, smsMoBeginResponse.targetPhone);
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(smsMoBeginResponse.targetPhones, CollectionsKt.emptyList())) {
            vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), smsMoBeginResponse.targetPhones);
        }
        vylVar.onExtraCallback(serialDescriptor, 3, smsMoBeginResponse.verifyId);
        int i4 = onExtraCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 27;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 81;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        throw null;
    }
}
