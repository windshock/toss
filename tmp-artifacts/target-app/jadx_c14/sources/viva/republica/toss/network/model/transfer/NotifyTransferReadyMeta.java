package viva.republica.toss.network.model.transfer;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.NotifyTransferReadyMeta$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NotifyTransferReadyMeta {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String depositTargetInputMethod;
    private final String sessionKey;

    static {
        int i = onExtraCallback + 121;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotifyTransferReadyMeta)) {
            int i5 = i2 + 35;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        NotifyTransferReadyMeta notifyTransferReadyMeta = (NotifyTransferReadyMeta) obj;
        if (!Intrinsics.areEqual(this.sessionKey, notifyTransferReadyMeta.sessionKey)) {
            return false;
        }
        if (Intrinsics.areEqual(this.depositTargetInputMethod, notifyTransferReadyMeta.depositTargetInputMethod)) {
            return true;
        }
        int i7 = IAuthTabCallback + 53;
        onWarmupCompleted = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.sessionKey;
        int iHashCode2 = 0;
        if (str == null) {
            int i5 = i3 + 65;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.depositTargetInputMethod;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
            int i7 = IAuthTabCallback + 49;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NotifyTransferReadyMeta(sessionKey=" + this.sessionKey + ", depositTargetInputMethod=" + this.depositTargetInputMethod + ")";
        int i2 = onWarmupCompleted + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NotifyTransferReadyMeta> serializer() {
            NotifyTransferReadyMeta$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                serializerVar = NotifyTransferReadyMeta$.serializer.INSTANCE;
                int i3 = 74 / 0;
            } else {
                serializerVar = NotifyTransferReadyMeta$.serializer.INSTANCE;
            }
            int i4 = IAuthTabCallback + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 30 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ NotifyTransferReadyMeta(int i, String str, String str2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onWarmupCompleted + 29;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = NotifyTransferReadyMeta$.serializer.INSTANCE.getDescriptor();
                i2 = 4;
            } else {
                descriptor = NotifyTransferReadyMeta$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = IAuthTabCallback + 91;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.sessionKey = str;
        this.depositTargetInputMethod = str2;
    }

    public NotifyTransferReadyMeta(@Nullable String str, @Nullable String str2) {
        this.sessionKey = str;
        this.depositTargetInputMethod = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(NotifyTransferReadyMeta notifyTransferReadyMeta, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, notifyTransferReadyMeta.sessionKey);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, notifyTransferReadyMeta.depositTargetInputMethod);
        int i4 = IAuthTabCallback + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
