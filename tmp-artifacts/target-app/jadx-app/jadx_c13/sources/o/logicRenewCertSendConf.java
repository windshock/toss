package o;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class logicRenewCertSendConf implements pkcs12GetCertWithPFXEncPKCS8 {
    private final Set<generateAesIV> onExtraCallback = new LinkedHashSet();
    private final boolean onNavigationEvent;
    private generateAesIV onWarmupCompleted;

    @Override // o.pkcs12GetCertWithPFXEncPKCS8
    public <E extends certGetOCSPAddress> void onExtraCallbackWithResult(@NotNull logicIssueCertSendConf<E> logicissuecertsendconf) {
        Intrinsics.checkNotNullParameter(logicissuecertsendconf, "");
    }

    public logicRenewCertSendConf(boolean z) {
        this.onNavigationEvent = z;
    }

    public final Set<generateAesIV> onNavigationEvent() {
        return this.onExtraCallback;
    }

    @Override // o.pkcs12GetCertWithPFXEncPKCS8
    public void IAuthTabCallback(@NotNull logicDisuseCertRr logicdisusecertrr) {
        Intrinsics.checkNotNullParameter(logicdisusecertrr, "");
        onExtraCallbackWithResult(logicdisusecertrr);
    }

    @Override // o.pkcs12GetCertWithPFXEncPKCS8
    public void onExtraCallbackWithResult(@NotNull generateAesIV generateaesiv) {
        Intrinsics.checkNotNullParameter(generateaesiv, "");
        cryptVerifySignatureValue cryptverifysignaturevalue = (cryptVerifySignatureValue) generateaesiv;
        if (generateaesiv.access100()) {
            if (this.onWarmupCompleted == null) {
                this.onWarmupCompleted = generateaesiv;
                if (this.onNavigationEvent) {
                    this.onExtraCallback.add(generateaesiv);
                }
            } else {
                this.onExtraCallback.add(generateaesiv);
            }
            for (cryptVerifySignatureValue cryptverifysignaturevalue2 : cryptverifysignaturevalue.onNavigationEvent()) {
                if (cryptverifysignaturevalue2 instanceof logicDisuseCertRr) {
                    this.onExtraCallback.add(cryptverifysignaturevalue2);
                } else {
                    onExtraCallbackWithResult(cryptverifysignaturevalue2);
                }
            }
        }
    }
}
