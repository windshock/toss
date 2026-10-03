package viva.republica.toss.network.model.bank;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import o.encryptType4;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.bank.TossBankIdCardValidationRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TossBankIdCardValidationRequest {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final JsonObject encryptedImageData;
    private final long flag;

    static {
        int i = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 77;
        onExtraCallback = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 1;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof TossBankIdCardValidationRequest)) {
            return false;
        }
        TossBankIdCardValidationRequest tossBankIdCardValidationRequest = (TossBankIdCardValidationRequest) obj;
        if (!Intrinsics.areEqual(this.encryptedImageData, tossBankIdCardValidationRequest.encryptedImageData)) {
            return false;
        }
        if (this.flag == tossBankIdCardValidationRequest.flag) {
            return true;
        }
        int i5 = onExtraCallback + 35;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.encryptedImageData.hashCode();
        return i3 == 0 ? (iHashCode % 47) / Long.hashCode(this.flag) : (iHashCode * 31) + Long.hashCode(this.flag);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossBankIdCardValidationRequest(encryptedImageData=" + this.encryptedImageData + ", flag=" + this.flag + ")";
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TossBankIdCardValidationRequest> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                TossBankIdCardValidationRequest$.serializer serializerVar = TossBankIdCardValidationRequest$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TossBankIdCardValidationRequest$.serializer serializerVar2 = TossBankIdCardValidationRequest$.serializer.INSTANCE;
            int i3 = IAuthTabCallback + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    public /* synthetic */ TossBankIdCardValidationRequest(int i, JsonObject jsonObject, long j, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onNavigationEvent + 15;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = TossBankIdCardValidationRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 5;
            } else {
                descriptor = TossBankIdCardValidationRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.encryptedImageData = jsonObject;
        this.flag = j;
    }

    public TossBankIdCardValidationRequest(@NotNull JsonObject jsonObject, long j) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.encryptedImageData = jsonObject;
        this.flag = j;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(TossBankIdCardValidationRequest tossBankIdCardValidationRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onNavigationEvent(serialDescriptor, 1, encryptType4.IAuthTabCallback, tossBankIdCardValidationRequest.encryptedImageData);
            vylVar.onExtraCallback(serialDescriptor, 0, tossBankIdCardValidationRequest.flag);
        } else {
            vylVar.onNavigationEvent(serialDescriptor, 0, encryptType4.IAuthTabCallback, tossBankIdCardValidationRequest.encryptedImageData);
            vylVar.onExtraCallback(serialDescriptor, 1, tossBankIdCardValidationRequest.flag);
        }
        int i3 = onNavigationEvent + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
    }
}
