package viva.republica.toss.tosscert.tosscacert.api.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.sf.scuba.smartcards.BuildConfig;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DebugCertificateExpireTsRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String expireTs;
    private final long serialNumber;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugCertificateExpireTsRequest)) {
            return false;
        }
        DebugCertificateExpireTsRequest debugCertificateExpireTsRequest = (DebugCertificateExpireTsRequest) obj;
        return this.serialNumber == debugCertificateExpireTsRequest.serialNumber && Intrinsics.areEqual(this.expireTs, debugCertificateExpireTsRequest.expireTs);
    }

    public int hashCode() {
        return (Long.hashCode(this.serialNumber) * 31) + this.expireTs.hashCode();
    }

    public String toString() {
        return "DebugCertificateExpireTsRequest(serialNumber=" + this.serialNumber + ", expireTs=" + this.expireTs + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DebugCertificateExpireTsRequest> serializer() {
            return DebugCertificateExpireTsRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DebugCertificateExpireTsRequest(int i, long j, String str, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, DebugCertificateExpireTsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.serialNumber = j;
        this.expireTs = str;
    }

    public DebugCertificateExpireTsRequest(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.serialNumber = j;
        this.expireTs = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(DebugCertificateExpireTsRequest debugCertificateExpireTsRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        vylVar.onExtraCallback(serialDescriptor, 0, debugCertificateExpireTsRequest.serialNumber);
        vylVar.onExtraCallback(serialDescriptor, 1, debugCertificateExpireTsRequest.expireTs);
    }
}
