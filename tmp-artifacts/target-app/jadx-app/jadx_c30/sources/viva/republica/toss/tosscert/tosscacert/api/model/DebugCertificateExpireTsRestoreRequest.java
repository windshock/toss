package viva.republica.toss.tosscert.tosscacert.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DebugCertificateExpireTsRestoreRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long serialNumber;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DebugCertificateExpireTsRestoreRequest) && this.serialNumber == ((DebugCertificateExpireTsRestoreRequest) obj).serialNumber;
    }

    public int hashCode() {
        return Long.hashCode(this.serialNumber);
    }

    public String toString() {
        return "DebugCertificateExpireTsRestoreRequest(serialNumber=" + this.serialNumber + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DebugCertificateExpireTsRestoreRequest> serializer() {
            return DebugCertificateExpireTsRestoreRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DebugCertificateExpireTsRestoreRequest(int i, long j, okycx okycxVar) {
        if (1 != (i & 1)) {
            htf31.onExtraCallbackWithResult(i, 1, DebugCertificateExpireTsRestoreRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.serialNumber = j;
    }

    public DebugCertificateExpireTsRestoreRequest(long j) {
        this.serialNumber = j;
    }
}
