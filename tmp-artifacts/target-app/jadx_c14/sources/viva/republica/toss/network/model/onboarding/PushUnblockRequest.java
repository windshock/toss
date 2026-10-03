package viva.republica.toss.network.model.onboarding;

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
import viva.republica.toss.network.model.onboarding.PushUnblockRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PushUnblockRequest {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String contentId;

    static {
        int i = onExtraCallback + 51;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PushUnblockRequest)) {
            int i4 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.contentId, ((PushUnblockRequest) obj).contentId)) {
            int i6 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 != 0;
        }
        int i7 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.contentId.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.contentId.hashCode();
        int i3 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PushUnblockRequest(contentId=" + this.contentId + ")";
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PushUnblockRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            PushUnblockRequest$.serializer serializerVar = PushUnblockRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 26 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ PushUnblockRequest(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, PushUnblockRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.contentId = str;
    }

    public PushUnblockRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contentId = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(PushUnblockRequest pushUnblockRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, pushUnblockRequest.contentId);
        int i4 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
