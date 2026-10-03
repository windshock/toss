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
import viva.republica.toss.network.model.transfer.NotifyTransferResultReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NotifyTransferResultReq {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String sessionKey;

    static {
        int i = onExtraCallback + 55;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 107;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof NotifyTransferResultReq)) {
            return false;
        }
        if (Intrinsics.areEqual(this.sessionKey, ((NotifyTransferResultReq) obj).sessionKey)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sessionKey;
        if (str != null) {
            return str.hashCode();
        }
        int i5 = i2 + 17;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NotifyTransferResultReq(sessionKey=" + this.sessionKey + ")";
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
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

        public final KSerializer<NotifyTransferResultReq> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            NotifyTransferResultReq$.serializer serializerVar = NotifyTransferResultReq$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 45;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 82 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ NotifyTransferResultReq(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, NotifyTransferResultReq$.serializer.INSTANCE.getDescriptor());
            int i4 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.sessionKey = str;
    }

    public NotifyTransferResultReq(@Nullable String str) {
        this.sessionKey = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(NotifyTransferResultReq notifyTransferResultReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallbackWithResult = i2 % 128;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, i2 % 2 != 0 ? getWriggleLayout.onNavigationEvent : getWriggleLayout.onNavigationEvent, notifyTransferResultReq.sessionKey);
    }
}
