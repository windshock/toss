package o;

import kotlin.jvm.internal.Intrinsics;
import o.generateAesIV;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class generateAesKey extends cryptECDHKeyAgreement implements getFidoInfo {
    @Override // o.cryptECDHKeyAgreement
    public Object onNavigationEvent(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<?> access13800Var) {
        return IAuthTabCallback(this, logicrenewcertgenmgenp, access13800Var);
    }

    @Override // o.cryptECDHKeyAgreement, o.cryptVerifySignatureValue
    public Object onWarmupCompleted(@NotNull logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, @NotNull access13800<?> access13800Var) {
        return onExtraCallbackWithResult(this, logicrenewcertgenmgenp, access13800Var);
    }

    public generateAesKey(@Nullable String str) {
        super(str, certVerifyCertificate.EXCLUSIVE);
    }

    @Override // o.cryptECDHKeyAgreement, o.generateAesIV
    public /* synthetic */ generateAesIV IAuthTabCallback(generateAesIV generateaesiv) {
        return (generateAesIV) onNavigationEvent((generateAesKey) generateaesiv);
    }

    @Override // o.cryptECDHKeyAgreement, o.generateAesIV
    public /* synthetic */ generateAesIV.onExtraCallbackWithResult onExtraCallbackWithResult(generateAesIV.onExtraCallbackWithResult onextracallbackwithresult) {
        return (generateAesIV.onExtraCallbackWithResult) onNavigationEvent((generateAesKey) onextracallbackwithresult);
    }

    @Override // o.cryptECDHKeyAgreement, o.getKMPrikey
    public /* synthetic */ logicIssueCertSendConf onExtraCallbackWithResult(logicIssueCertSendConf logicissuecertsendconf) {
        return (logicIssueCertSendConf) onWarmupCompleted(logicissuecertsendconf);
    }

    static /* synthetic */ Object onExtraCallbackWithResult(generateAesKey generateaeskey, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<?> access13800Var) {
        generateaeskey.extraCallback();
        throw new setWrite();
    }

    static /* synthetic */ Object IAuthTabCallback(generateAesKey generateaeskey, logicRenewCertGenmGenp<?> logicrenewcertgenmgenp, access13800<?> access13800Var) {
        generateaeskey.extraCallback();
        throw new setWrite();
    }

    public <L extends generateAesIV.onExtraCallbackWithResult> Void onNavigationEvent(@NotNull L l) {
        Intrinsics.checkNotNullParameter(l, "");
        throw new UnsupportedOperationException("PseudoState " + this + " can not have listeners");
    }

    public <S extends generateAesIV> Void onNavigationEvent(@NotNull S s) {
        Intrinsics.checkNotNullParameter(s, "");
        throw new UnsupportedOperationException("PseudoState " + this + " can not have child states");
    }

    public <E extends certGetOCSPAddress> Void onWarmupCompleted(@NotNull logicIssueCertSendConf<E> logicissuecertsendconf) {
        Intrinsics.checkNotNullParameter(logicissuecertsendconf, "");
        throw new UnsupportedOperationException("PseudoState " + this + " can not have transitions");
    }

    private final Void extraCallback() {
        throw new IllegalStateException(("Internal error, PseudoState " + this + " can not be entered or exited, looks that machine is purely configured").toString());
    }
}
