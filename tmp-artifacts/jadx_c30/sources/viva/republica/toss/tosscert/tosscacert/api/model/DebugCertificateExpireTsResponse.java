package viva.republica.toss.tosscert.tosscacert.api.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.sf.scuba.smartcards.BuildConfig;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class DebugCertificateExpireTsResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String expireTs;

    /* JADX WARN: Illegal instructions before constructor call */
    public DebugCertificateExpireTsResponse() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DebugCertificateExpireTsResponse) && Intrinsics.areEqual(this.expireTs, ((DebugCertificateExpireTsResponse) obj).expireTs);
    }

    public int hashCode() {
        return this.expireTs.hashCode();
    }

    public String toString() {
        return "DebugCertificateExpireTsResponse(expireTs=" + this.expireTs + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DebugCertificateExpireTsResponse> serializer() {
            return DebugCertificateExpireTsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DebugCertificateExpireTsResponse(int i, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.expireTs = BuildConfig.FLAVOR;
        } else {
            this.expireTs = str;
        }
    }

    public DebugCertificateExpireTsResponse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.expireTs = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(DebugCertificateExpireTsResponse debugCertificateExpireTsResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(debugCertificateExpireTsResponse.expireTs, BuildConfig.FLAVOR)) {
            vylVar.onExtraCallback(serialDescriptor, 0, debugCertificateExpireTsResponse.expireTs);
        }
    }

    public /* synthetic */ DebugCertificateExpireTsResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str);
    }

    public final String onNavigationEvent() {
        return this.expireTs;
    }
}
