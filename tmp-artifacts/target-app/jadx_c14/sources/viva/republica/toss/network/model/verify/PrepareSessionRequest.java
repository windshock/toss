package viva.republica.toss.network.model.verify;

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
import viva.republica.toss.network.model.verify.PrepareSessionRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PrepareSessionRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String sessionType;

    static {
        int i = IAuthTabCallback + 107;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PrepareSessionRequest() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PrepareSessionRequest)) {
            int i4 = onNavigationEvent + 111;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.sessionType, ((PrepareSessionRequest) obj).sessionType)) {
            return false;
        }
        int i5 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.sessionType;
        if (i3 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepareSessionRequest(sessionType=" + this.sessionType + ")";
        int i2 = onExtraCallbackWithResult + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PrepareSessionRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                PrepareSessionRequest$.serializer serializerVar = PrepareSessionRequest$.serializer.INSTANCE;
                throw null;
            }
            PrepareSessionRequest$.serializer serializerVar2 = PrepareSessionRequest$.serializer.INSTANCE;
            int i3 = onWarmupCompleted + 9;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return serializerVar2;
            }
            throw null;
        }
    }

    public /* synthetic */ PrepareSessionRequest(int i, String str, okycx okycxVar) {
        if ((i & 1) != 0) {
            this.sessionType = str;
            int i2 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.sessionType = "";
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PrepareSessionRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sessionType = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(PrepareSessionRequest prepareSessionRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0 ? (!vylVar.onWarmupCompleted(serialDescriptor, 0)) : !vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            if (Intrinsics.areEqual(prepareSessionRequest.sessionType, "")) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 0, prepareSessionRequest.sessionType);
        int i3 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PrepareSessionRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 97;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 105;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            str = "";
        }
        this(str);
    }
}
