package viva.republica.toss.network.model.teens;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.TeensCardTemporalAllowanceResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TeensCardTemporalAllowanceResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final boolean isTemporaryAllowance;

    static {
        int i = onExtraCallbackWithResult + 69;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public TeensCardTemporalAllowanceResponse() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeensCardTemporalAllowanceResponse)) {
            return false;
        }
        if (this.isTemporaryAllowance != ((TeensCardTemporalAllowanceResponse) obj).isTemporaryAllowance) {
            int i2 = onNavigationEvent + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onNavigationEvent + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isTemporaryAllowance);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardTemporalAllowanceResponse(isTemporaryAllowance=" + this.isTemporaryAllowance + ")";
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TeensCardTemporalAllowanceResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TeensCardTemporalAllowanceResponse$.serializer serializerVar = TeensCardTemporalAllowanceResponse$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ TeensCardTemporalAllowanceResponse(int i, boolean z, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) != 0) {
            this.isTemporaryAllowance = z;
            int i2 = onNavigationEvent + 85;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.isTemporaryAllowance = false;
        int i3 = onNavigationEvent + 39;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public TeensCardTemporalAllowanceResponse(boolean z) {
        this.isTemporaryAllowance = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(TeensCardTemporalAllowanceResponse teensCardTemporalAllowanceResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = IAuthTabCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!teensCardTemporalAllowanceResponse.isTemporaryAllowance) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 0, teensCardTemporalAllowanceResponse.isTemporaryAllowance);
        int i4 = IAuthTabCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TeensCardTemporalAllowanceResponse(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 1;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        }
        this(z);
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isTemporaryAllowance;
        int i5 = i2 + 95;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return z;
    }
}
