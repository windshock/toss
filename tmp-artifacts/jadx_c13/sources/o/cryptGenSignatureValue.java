package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class cryptGenSignatureValue extends cryptECDHKeyAgreement implements getInfo {
    /* JADX WARN: Multi-variable type inference failed */
    public cryptGenSignatureValue() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ cryptGenSignatureValue(String str, certVerifyCertificate certverifycertificate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? certVerifyCertificate.EXCLUSIVE : certverifycertificate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cryptGenSignatureValue(@Nullable String str, @NotNull certVerifyCertificate certverifycertificate) {
        super(str, certverifycertificate);
        Intrinsics.checkNotNullParameter(certverifycertificate, "");
    }
}
