package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.getLastDebugError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getVIDRandom extends cryptGenSignatureValue implements getLastDebugError {
    public abstract logicCMSSignedDataWithSign extraCallback();

    public abstract boolean extraCallbackWithResult();

    public abstract void onExtraCallback(@NotNull Exception exc);

    @Override // o.cryptVerifySignatureValue
    public Object onExtraCallback(@NotNull logicVerifyCMSSignedData logicverifycmssigneddata, @NotNull access13800<? super Unit> access13800Var) {
        return getLastDebugError.onWarmupCompleted.onExtraCallbackWithResult(this, logicverifycmssigneddata, access13800Var);
    }

    @Override // o.cryptVerifySignatureValue, o.generateAesIV
    public void onExtraCallback(@NotNull pkcs12GetCertWithPFXEncPKCS8 pkcs12getcertwithpfxencpkcs8) {
        getLastDebugError.onWarmupCompleted.onExtraCallback(this, pkcs12getcertwithpfxencpkcs8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getVIDRandom(@Nullable String str, @NotNull certVerifyCertificate certverifycertificate) {
        super(str, certverifycertificate);
        Intrinsics.checkNotNullParameter(certverifycertificate, "");
    }
}
