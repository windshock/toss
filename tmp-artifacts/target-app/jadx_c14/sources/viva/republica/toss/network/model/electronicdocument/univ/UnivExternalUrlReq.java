package viva.republica.toss.network.model.electronicdocument.univ;

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
import viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlReq$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UnivExternalUrlReq {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String trxId;

    static {
        int i = onExtraCallbackWithResult + 105;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnivExternalUrlReq)) {
            int i5 = i2 + 105;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.trxId, ((UnivExternalUrlReq) obj).trxId)) {
            return true;
        }
        int i7 = IAuthTabCallback + 43;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 89 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.trxId.hashCode();
            int i3 = 14 / 0;
        } else {
            iHashCode = this.trxId.hashCode();
        }
        int i4 = IAuthTabCallback + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnivExternalUrlReq(trxId=" + this.trxId + ")";
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
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

        public final KSerializer<UnivExternalUrlReq> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            UnivExternalUrlReq$.serializer serializerVar = UnivExternalUrlReq$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ UnivExternalUrlReq(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, UnivExternalUrlReq$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 99;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.trxId = str;
    }

    public UnivExternalUrlReq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.trxId = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(UnivExternalUrlReq univExternalUrlReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, univExternalUrlReq.trxId);
        int i4 = onExtraCallback + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
