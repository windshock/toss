package viva.republica.toss.network.model.teens;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.TeensCardEventApplyResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TeensCardEventApplyResponse {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean canUseFreeChance;

    static {
        int i = onExtraCallbackWithResult + 19;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof TeensCardEventApplyResponse) || this.canUseFreeChance != ((TeensCardEventApplyResponse) obj).canUseFreeChance) {
            return false;
        }
        int i4 = onWarmupCompleted + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.canUseFreeChance);
        int i4 = onWarmupCompleted + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardEventApplyResponse(canUseFreeChance=" + this.canUseFreeChance + ")";
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TeensCardEventApplyResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            TeensCardEventApplyResponse$.serializer serializerVar = TeensCardEventApplyResponse$.serializer.INSTANCE;
            int i4 = onExtraCallback + 57;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ TeensCardEventApplyResponse(int i, boolean z, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onWarmupCompleted + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, TeensCardEventApplyResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.canUseFreeChance = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(TeensCardEventApplyResponse teensCardEventApplyResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, teensCardEventApplyResponse.canUseFreeChance);
        int i4 = onNavigationEvent + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        boolean z = this.canUseFreeChance;
        int i5 = i3 + 7;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
