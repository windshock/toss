package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UST_CERT_GetCertValidityNotAfter {

    @SerializedName("account")
    private final UST_CERT_GetAuthorityKeyIdentifierInfo IAuthTabCallback;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UST_CERT_GetCertValidityNotAfter) && Intrinsics.areEqual(this.IAuthTabCallback, ((UST_CERT_GetCertValidityNotAfter) obj).IAuthTabCallback);
    }

    public int hashCode() {
        return this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        return "PrimaryAccountModel(account=" + this.IAuthTabCallback + ")";
    }

    public UST_CERT_GetCertValidityNotAfter(@NotNull UST_CERT_GetAuthorityKeyIdentifierInfo uST_CERT_GetAuthorityKeyIdentifierInfo) {
        Intrinsics.checkNotNullParameter(uST_CERT_GetAuthorityKeyIdentifierInfo, BuildConfig.FLAVOR);
        this.IAuthTabCallback = uST_CERT_GetAuthorityKeyIdentifierInfo;
    }
}
