package viva.republica.toss.network.model.verify.guest;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.DevSupportSuperLoginRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DevSupportSuperLoginRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String payload;

    static {
        int i = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof DevSupportSuperLoginRequest) {
            return Intrinsics.areEqual(this.payload, ((DevSupportSuperLoginRequest) obj).payload);
        }
        int i4 = IAuthTabCallback + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.payload.hashCode();
        int i4 = onExtraCallback + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DevSupportSuperLoginRequest(payload=" + this.payload + ")";
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DevSupportSuperLoginRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            DevSupportSuperLoginRequest$.serializer serializerVar = DevSupportSuperLoginRequest$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 81;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ DevSupportSuperLoginRequest(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, DevSupportSuperLoginRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.payload = str;
    }

    public DevSupportSuperLoginRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payload = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(DevSupportSuperLoginRequest devSupportSuperLoginRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, devSupportSuperLoginRequest.payload);
        int i4 = onExtraCallback + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
