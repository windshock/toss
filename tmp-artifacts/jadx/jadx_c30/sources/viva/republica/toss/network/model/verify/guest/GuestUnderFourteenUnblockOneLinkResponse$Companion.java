package viva.republica.toss.network.model.verify.guest;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GuestUnderFourteenUnblockOneLinkResponse$Companion {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public /* synthetic */ GuestUnderFourteenUnblockOneLinkResponse$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GuestUnderFourteenUnblockOneLinkResponse$Companion() {
    }

    public final KSerializer<GuestUnderFourteenUnblockOneLinkResponse> serializer() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        GuestUnderFourteenUnblockOneLinkResponse$$serializer guestUnderFourteenUnblockOneLinkResponse$$serializer = GuestUnderFourteenUnblockOneLinkResponse$$serializer.INSTANCE;
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return guestUnderFourteenUnblockOneLinkResponse$$serializer;
    }
}
