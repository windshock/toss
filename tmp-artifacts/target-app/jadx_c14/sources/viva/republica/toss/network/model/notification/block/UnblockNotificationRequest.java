package viva.republica.toss.network.model.notification.block;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.notification.block.UnblockNotificationRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UnblockNotificationRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String contentId;

    static {
        int i = onExtraCallbackWithResult + 105;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 77 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UnblockNotificationRequest() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnblockNotificationRequest)) {
            int i5 = i2 + 57;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.contentId, ((UnblockNotificationRequest) obj).contentId)) {
            int i7 = IAuthTabCallback + 87;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = onExtraCallback + 63;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 17 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.contentId.hashCode();
        int i4 = IAuthTabCallback + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnblockNotificationRequest(contentId=" + this.contentId + ")";
        int i2 = onExtraCallback + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
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

        public final KSerializer<UnblockNotificationRequest> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            UnblockNotificationRequest$.serializer serializerVar = UnblockNotificationRequest$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 55 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ UnblockNotificationRequest(int i, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.contentId = "";
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.contentId = str;
        int i4 = IAuthTabCallback + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public UnblockNotificationRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contentId = str;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(UnblockNotificationRequest unblockNotificationRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0 ? !vylVar.onWarmupCompleted(serialDescriptor, 0) : !vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            if (Intrinsics.areEqual(unblockNotificationRequest.contentId, "")) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 0, unblockNotificationRequest.contentId);
        int i3 = onExtraCallback + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UnblockNotificationRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 105;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 18 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        this(str);
    }
}
