package viva.republica.toss.network.model.bank;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.bank.TossBankIdCardValidationResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TossBankIdCardValidationResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String idCardType;

    static {
        int i = onExtraCallback + 57;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TossBankIdCardValidationResponse)) {
            return false;
        }
        if (Intrinsics.areEqual(this.idCardType, ((TossBankIdCardValidationResponse) obj).idCardType)) {
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.idCardType.hashCode();
            throw null;
        }
        int iHashCode = this.idCardType.hashCode();
        int i3 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 71 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossBankIdCardValidationResponse(idCardType=" + this.idCardType + ")";
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TossBankIdCardValidationResponse> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TossBankIdCardValidationResponse$.serializer serializerVar = TossBankIdCardValidationResponse$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ TossBankIdCardValidationResponse(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, TossBankIdCardValidationResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.idCardType = str;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(TossBankIdCardValidationResponse tossBankIdCardValidationResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, tossBankIdCardValidationResponse.idCardType);
        int i4 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
