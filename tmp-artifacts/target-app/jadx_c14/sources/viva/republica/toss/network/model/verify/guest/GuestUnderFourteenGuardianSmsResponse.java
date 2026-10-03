package viva.republica.toss.network.model.verify.guest;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.GuestUnderFourteenGuardianSmsResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuestUnderFourteenGuardianSmsResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final String text;

    static {
        int i = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 81 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GuestUnderFourteenGuardianSmsResponse() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof GuestUnderFourteenGuardianSmsResponse)) {
            int i4 = onWarmupCompleted + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.text, ((GuestUnderFourteenGuardianSmsResponse) obj).text)) {
            return true;
        }
        int i6 = onExtraCallback + 61;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.text;
        if (str != null) {
            return str.hashCode();
        }
        int i2 = onWarmupCompleted;
        int i3 = i2 + 55;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuestUnderFourteenGuardianSmsResponse(text=" + this.text + ")";
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GuestUnderFourteenGuardianSmsResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                GuestUnderFourteenGuardianSmsResponse$.serializer serializerVar = GuestUnderFourteenGuardianSmsResponse$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            GuestUnderFourteenGuardianSmsResponse$.serializer serializerVar2 = GuestUnderFourteenGuardianSmsResponse$.serializer.INSTANCE;
            int i3 = onExtraCallback + 87;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    public /* synthetic */ GuestUnderFourteenGuardianSmsResponse(int i, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.text = "";
            int i2 = onWarmupCompleted + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.text = str;
        int i4 = onWarmupCompleted + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public GuestUnderFourteenGuardianSmsResponse(@Nullable String str) {
        this.text = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(GuestUnderFourteenGuardianSmsResponse guestUnderFourteenGuardianSmsResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onWarmupCompleted + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(guestUnderFourteenGuardianSmsResponse.text, "")) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, guestUnderFourteenGuardianSmsResponse.text);
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GuestUnderFourteenGuardianSmsResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = "";
        }
        this(str);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.text;
        int i5 = i3 + 77;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
