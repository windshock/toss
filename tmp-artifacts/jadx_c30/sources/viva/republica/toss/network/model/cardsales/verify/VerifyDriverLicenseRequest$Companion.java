package viva.republica.toss.network.model.cardsales.verify;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class VerifyDriverLicenseRequest$Companion {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public /* synthetic */ VerifyDriverLicenseRequest$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VerifyDriverLicenseRequest$Companion() {
    }

    public final KSerializer<VerifyDriverLicenseRequest> serializer() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            VerifyDriverLicenseRequest$$serializer verifyDriverLicenseRequest$$serializer = VerifyDriverLicenseRequest$$serializer.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VerifyDriverLicenseRequest$$serializer verifyDriverLicenseRequest$$serializer2 = VerifyDriverLicenseRequest$$serializer.INSTANCE;
        int i3 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 85 / 0;
        }
        return verifyDriverLicenseRequest$$serializer2;
    }
}
