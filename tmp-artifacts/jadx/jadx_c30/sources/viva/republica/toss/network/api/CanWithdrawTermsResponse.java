package viva.republica.toss.network.api;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CanWithdrawTermsResponse {
    public static final Companion Companion = new Companion(null);
    private final boolean canWithdrawTerms;
    private final String scheme;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CanWithdrawTermsResponse)) {
            return false;
        }
        CanWithdrawTermsResponse canWithdrawTermsResponse = (CanWithdrawTermsResponse) obj;
        return this.canWithdrawTerms == canWithdrawTermsResponse.canWithdrawTerms && Intrinsics.areEqual(this.scheme, canWithdrawTermsResponse.scheme);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.canWithdrawTerms) * 31) + this.scheme.hashCode();
    }

    public String toString() {
        return "CanWithdrawTermsResponse(canWithdrawTerms=" + this.canWithdrawTerms + ", scheme=" + this.scheme + ")";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CanWithdrawTermsResponse> serializer() {
            return CanWithdrawTermsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CanWithdrawTermsResponse(int i, boolean z, String str, okycx okycxVar) {
        if (3 != (i & 3)) {
            htf31.onExtraCallbackWithResult(i, 3, CanWithdrawTermsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.canWithdrawTerms = z;
        this.scheme = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(CanWithdrawTermsResponse canWithdrawTermsResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        vylVar.onNavigationEvent(serialDescriptor, 0, canWithdrawTermsResponse.canWithdrawTerms);
        vylVar.onExtraCallback(serialDescriptor, 1, canWithdrawTermsResponse.scheme);
    }
}
