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
import viva.republica.toss.network.model.onboarding.PushBlockRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PushBlockRequest {
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String contentId;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 3;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PushBlockRequest)) {
            return false;
        }
        if (Intrinsics.areEqual(this.contentId, ((PushBlockRequest) obj).contentId)) {
            return true;
        }
        int i4 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.contentId.hashCode();
        int i4 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PushBlockRequest(contentId=" + this.contentId + ")";
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PushBlockRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            PushBlockRequest$.serializer serializerVar = PushBlockRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 55 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ PushBlockRequest(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, PushBlockRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.contentId = str;
    }

    public PushBlockRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contentId = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(PushBlockRequest pushBlockRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i;
        String str;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            str = pushBlockRequest.contentId;
            i = 1;
        } else {
            i = 0;
            str = pushBlockRequest.contentId;
        }
        vylVar.onExtraCallback(serialDescriptor, i, str);
    }
}
